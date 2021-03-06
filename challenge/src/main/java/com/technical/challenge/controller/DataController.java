package com.technical.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technical.challenge.model.Data;
import com.technical.challenge.services.DataService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class DataController {
	@Autowired
	DataService service;
	
	@GetMapping(value = "/getPossibleCombinations")
	public Data getPossibleCombinations(@RequestParam("number") Long number,
			@RequestParam(defaultValue = "1") Integer pageNo, 
            @RequestParam(defaultValue = "20") Integer pageSize){
		return service.combinations(number, pageNo, pageSize);
	}
}
