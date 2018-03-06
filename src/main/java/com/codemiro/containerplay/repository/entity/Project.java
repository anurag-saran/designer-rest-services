package com.codemiro.containerplay.repository.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * @author dvsingh
 * @category persistence
 *
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
