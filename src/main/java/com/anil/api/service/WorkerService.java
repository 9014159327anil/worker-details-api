package com.anil.api.service;

import com.anil.api.model.WorkerDetails;

public interface WorkerService {
	
	String insertWorkerDetails(WorkerDetails workerDetails);

	public WorkerDetails getWorkerDetailsByWorkerName(String workerName);



	

}
