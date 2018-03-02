package com.containerplay.designerrestservices.project;

import java.sql.Clob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
//Documentation for swagger
@ApiModel(description="All details about the user.")
@Entity
public class Project {
	
	@Id
	@GeneratedValue
	private Long id;
	@Size(min=2, message="description should have atleast 2 characters")
	@ApiModelProperty(notes="description should have atleast 2 characters")
	@Column(nullable=false)
	private String description;
	@Size(min=2, message="projectName should have atleast 2 characters")
	@ApiModelProperty(notes="projectName should have atleast 2 characters")
	@Column(nullable=false)
	private String projectName;
	@Size(min=2, message="projectBlob should have atleast 2 characters")
	@ApiModelProperty(notes="projectBlob should have atleast 2 characters")
	//@Column(nullable=false)
	@Lob
	private String projectBlob;
	
//	@UpdateTimestamp
//	private LocalDateTime lastUpdatedDate;
//	@CreationTimestamp
//	private LocalDateTime createdDate;
	
	public Project() {
		super();
	}


	public Project( String description, String projectName, String projectBlob) {
		super();
		
		this.description = description;
		this.projectName = projectName;
		this.projectBlob = projectBlob;
	}
	
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", description=" + description + ", projectName=" + projectName + ", projectBlob="
				+ projectBlob + "]";
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectBlob() {
		return projectBlob;
	}
	public void setProjectBlob(String projectBlob) {
		this.projectBlob = projectBlob;
	}
	
}
