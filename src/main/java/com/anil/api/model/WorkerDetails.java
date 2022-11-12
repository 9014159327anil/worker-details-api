package com.anil.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "worker")
public class WorkerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int workerId; 
	
	
	private String workerName;
	
	
	private String workerAddress;
	
	
	private String mobile;
	
	
	private String workerLocation;
	
	
	
	private String email;
	
	
	private String workerCategiry;
	
	//no argument constructor
	public WorkerDetails() {
		
	}

	//creating the parameterized constructor
	public WorkerDetails(int workerId, String workerName, String workerAddress, String mobile, String workerLocation,
			String email, String workerCategiry) {
		
		this.workerId = workerId;
		this.workerName = workerName;
		this.workerAddress = workerAddress;
		this.mobile = mobile;
		this.workerLocation = workerLocation;
		this.email = email;
		this.workerCategiry = workerCategiry;
	}

	//generated getter and setter method 
	
	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getWorkerAddress() {
		return workerAddress;
	}

	public void setWorkerAddress(String workerAddress) {
		this.workerAddress = workerAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWorkerLocation() {
		return workerLocation;
	}

	public void setWorkerLocation(String workerLocation) {
		this.workerLocation = workerLocation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkerCategiry() {
		return workerCategiry;
	}

	public void setWorkerCategiry(String workerCategiry) {
		this.workerCategiry = workerCategiry;
	}

	//generate toString method
	@Override
	public String toString() {
		return "WorkerDetails [workerId=" + workerId + ", workerName=" + workerName + ", workerAddress=" + workerAddress
				+ ", mobile=" + mobile + ", workerLocation=" + workerLocation + ", email=" + email + ", workerCategiry="
				+ workerCategiry + "]";
	}
	
	

}
