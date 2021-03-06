package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobTitleService;
import com.example.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitlesControllers {

	private JobTitleService jobService;
		
	@Autowired
	public JobTitlesControllers(JobTitleService jobService) {
		super();
		this.jobService = jobService;
	}


	@GetMapping("/getAll")
	public List<JobTitle> getAll(){
		return this.jobService.getAll();
		
	}
	
}
