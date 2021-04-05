package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dto.FruitsDTO;
import com.wolken.wolkenapp.service.FruitsService;
import com.wolken.wolkenapp.service.FruitsServiceImpl;

public class FruitsUtil {
	public static void main(String[] args) {
		FruitsDTO fruitsDTO=new FruitsDTO();
		fruitsDTO.setFruitId(8);
		fruitsDTO.setFruitName("mango");
		
		FruitsService fruitsService=new FruitsServiceImpl();
		fruitsService.validateAndSave(fruitsDTO);
		
		fruitsService.validateAndUpdate(3);
		
		
		fruitsService.validateAndDelete(7);
	}

}
