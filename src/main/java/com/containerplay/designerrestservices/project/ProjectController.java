package com.containerplay.designerrestservices.project;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;





@RestController
public class ProjectController {
	
	@Autowired
	private ProjectRepository projectRepositry;
	


	@GetMapping("/v1/projects")
	public List<Project> getAllProjects() {
		return projectRepositry.findAll();
	}
	@GetMapping("/v1/projects/{id}")
	public Optional<Project> getAllProjects(@PathVariable Long id) {
		 Optional<Project> proj = projectRepositry.findById(id);
		 if (!proj.isPresent())
				throw new ProjectNotFoundException("id-" + id);
		 return proj;
	}
	@DeleteMapping("/v1/projects/{id}")
	public void deleteProject(@PathVariable Long id) {
		 projectRepositry.deleteById(id);;
	}
	@PostMapping("/v1/projects")
	public ResponseEntity<Object> createProject(@Valid @RequestBody Project proj) {
		Project savedProj = projectRepositry.save(proj);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedProj.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
