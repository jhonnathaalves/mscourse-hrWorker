package com.jhonnatha.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonnatha.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	

}
