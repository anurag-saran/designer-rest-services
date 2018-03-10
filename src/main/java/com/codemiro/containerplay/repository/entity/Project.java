package com.codemiro.containerplay.repository.entity;

import javax.persistence.Entity;


/**
 * @author dvsingh
 * @category persistence
 *
 */

@Entity
public class Project extends BaseEntityAudit{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String description;
	private String remarks;
	
	
	
}
