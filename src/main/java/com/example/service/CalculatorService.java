package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.NumberDTO;

@Service
public class CalculatorService implements ICalculatorService {
	@Override
	public int calculate(NumberDTO numberDTO) {
		System.out.println("CalculatorService.calculate()");
		int baseValue = numberDTO.getBaseValue();
		int exponentValue = numberDTO.getExponentValue();

		System.out.println(baseValue);
		System.out.println(exponentValue);

		int resultValue = 1;

		for (int i = 1; i <= exponentValue; i++) {
			resultValue = resultValue * baseValue;
		}
		// TODO Auto-generated method stub
		System.out.println(resultValue);
		return resultValue;
	}

}
