package com.anil.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anil.api.model.WorkerDetails;
import com.anil.api.service.WorkerService;

/**
 * this call is using for worker details data
 */

@RestController
@RequestMapping("/api")
public class WorkerController {

	// log4j to print the logs in the console
	private static final Logger logger = LoggerFactory.getLogger(WorkerDetails.class);

	@Autowired
	private WorkerService workerService;

	/**
	 * insert the worker details
	 * 
	 * @return response
	 */

	@PostMapping("/worker-details")
	public String addWorkerDetails(@RequestBody WorkerDetails workerDetails) {

		logger.info("Worker Details :: " + workerDetails);
		String response = "Worker data sucessfully inserted";
		return response;

	}

	/**
	 * get the company details based on worker Id
	 * 
	 * @param workerId
	 * @return string
	 */

	@GetMapping("/get-worker-details/{workerId}")
	public String getWorkerDetails(@PathVariable int workerId) {

		logger.info("Worker Id = " + workerId);
		String response = "MY Worker Id :: " + workerId;
		return response;

	}

	@GetMapping("/worker-details")
	public String getWorkerDataByWorkerId(@RequestParam int workerId) {

		logger.info("Worker Id :: " + workerId);

		String response = "Worker Id :: " + workerId;
		return response;
	}

	/**
	 * this method is going to update the worker details.
	 * 
	 * @param workerDetails
	 * @param workerId
	 * @return response message
	 */

	@PutMapping("/update-worker-details/{workerId}")
	public String updateWorkerDetailsByWorkerId(@RequestBody WorkerDetails workerDetails, @PathVariable int workerId) {
		logger.info("Worker Details :: " + workerDetails);

		String response = "Worker Data sucessfully updated with Worker Id = " + workerDetails.getWorkerId();
		return response;

	}

	/**
	 * this method is using to delete the company data by worker id
	 * 
	 * @param workerId
	 * @return success response
	 */

	@DeleteMapping("/delete-worker-data")

	public String deleteWorkerDataWorkerId(@RequestParam int workerId) {
		logger.info("Worker Id :: " + workerId);

		String response = "Data sucessfully deleted by Worker Id = " + workerId;

		return response;

	}

	@PatchMapping("/partial-update-worker-data/{email}")

	public String partialUpdateByEmail(@PathVariable String email) {

		logger.info("Worker Email :: " + email);
		String response = "Worker Data is sucessfully updated with email =  " + email;
		return response;

	}

	//
	@PostMapping("/add-worker-details")

	public String insertWorkerDetails(@RequestBody WorkerDetails workerDetails) {

		logger.info("Worker Details :: " + workerDetails);

		String response = workerService.insertWorkerDetails(workerDetails);

		return response;

	}

	@GetMapping("/worker-details/{workerName}")
	public WorkerDetails getWorkerDetailsByWorkerworkerName(@PathVariable() String workerName) {
		logger.info("Worker Id in Controller Layer :: " + workerName);
		WorkerDetails response = workerService.getWorkerDetailsByWorkerName(workerName);
		return response;

	}

}
