package com.containerplay.designerrestservices.project;

import org.springframework.data.jpa.repository.JpaRepository;

// Pass the Bean and the datatype of the PrimaryKey
public interface ProjectRepository  extends JpaRepository<Project, Long>{

}
