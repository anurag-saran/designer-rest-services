package com.containerplay.designerrestservices;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.containerplay.designerrestservices.project.Project;
import com.containerplay.designerrestservices.project.ProjectRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DesignerRestServicesApplication.class)
public interface ProjectControllerTest {
	
//	@Autowired 
//	ProjectRepository repository;
//	
//	@Test
//	public static void findprojectById() {
//		Optional<Project> proj = projectRepositry.findById(1L);
//		assertEquals("abc",proj.getProjectName());
//	}
	

}
