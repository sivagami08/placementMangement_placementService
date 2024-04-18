package com.example.demo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Placement_table")
public class Placement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String companyName;
	private String jobTitle;
	private Date placementDate;
	private Long studentId;
	
	
	public Placement() {
		
	}
	
	public Placement(Long id, String companyName, String jobTitle, Date placementDate, Long studentId) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.placementDate = placementDate;
		this.studentId = studentId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Date getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(Date placementDate) {
		this.placementDate = placementDate;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", placementDate="
				+ placementDate + ", studentId=" + studentId + "]";
	}
	
	
	
	


}
