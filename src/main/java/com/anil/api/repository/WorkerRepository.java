package com.anil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anil.api.model.WorkerDetails; 

@Repository
public interface WorkerRepository extends JpaRepository<WorkerDetails, Integer> {

	///JPQL(Java Persistence query language)
	@Query(value = "select * from worker c where c.worker_name = :workerLocation", nativeQuery = true )
	WorkerDetails findByWorkerName(@Param("workerLocation") String workerLocation);
	
	

	

	

}
