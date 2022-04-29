package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "school_table")
public class SchoolEntity {
	
	@Id
	@Column(name = "school_Id")
	private int schoolId;
	@Column(name = "school_Name")
	private String schoolNameString;

}
