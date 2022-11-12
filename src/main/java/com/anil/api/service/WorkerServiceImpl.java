package com.anil.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.api.model.WorkerDetails;
import com.anil.api.repository.WorkerRepository;



@Service
public class WorkerServiceImpl implements WorkerService {

	private static final Logger logger = LoggerFactory.getLogger(WorkerServiceImpl.class);
	
	
	
	  @Autowired
	  private WorkerRepository workerRepository;
	  
	  
	 
	  @Override
		public String insertWorkerDetails(WorkerDetails workerDetails) {
		logger.info("Worker Details in Service Layer :: "+ workerDetails);
		workerRepository.save(workerDetails);
			return "Worker data sucessfully inserted";
		}
	  
	  
	  
	@Override
	public WorkerDetails getWorkerDetailsByWorkerName(String workerName) {
		logger.info("Worker Name in Service Layer :: "+workerName);
		WorkerDetails response = workerRepository.findByWorkerName(workerName);
		
		return response; 
	}


	
	


	
}
