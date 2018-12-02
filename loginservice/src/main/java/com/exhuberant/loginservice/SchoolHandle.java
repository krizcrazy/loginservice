package com.exhuberant.loginservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "school-service",url  ="http://localhost:8080")
public interface SchoolHandle {
	@RequestMapping("/schools/schoolmap")
	public void getAllSchool();

}
