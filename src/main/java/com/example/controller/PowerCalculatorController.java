package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.NumberDTO;
import com.example.service.CalculatorService;

@RequestMapping("/calculator")
@RestController
public class PowerCalculatorController {
	@Autowired
	CalculatorService service;

	@PostMapping("/compute")
	public int registration(@RequestBody NumberDTO numberDTO) {
		System.out.println("in controller");

		int response = service.calculate(numberDTO);
		return response;
	}
}
