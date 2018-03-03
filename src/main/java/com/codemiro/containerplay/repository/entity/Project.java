package com.codemiro.containerplay.repository.entity;

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
public class Project {

	private Long id;
	private String name;
	private String description;
	private String remarks;
	
}
