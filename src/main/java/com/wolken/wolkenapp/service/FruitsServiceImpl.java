package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dao.FruitsDAO;
import com.wolken.wolkenapp.dao.FruitsDAOImpl;
import com.wolken.wolkenapp.dto.FruitsDTO;

public class FruitsServiceImpl implements FruitsService {
	FruitsDAO fruitsDAO=new FruitsDAOImpl();
	@Override
	public void validateAndSave(FruitsDTO fruitsDTO) {
		// TODO Auto-generated method stub
		if(fruitsDTO.getFruitId()>0) {
			if(fruitsDTO.getFruitName()!=null) {
				fruitsDAO.createFruit(fruitsDTO);
			}
		}
	}
	@Override
	public void validateAndUpdate(int id) {
		// TODO Auto-generated method stub
		if(id>0) {
			
				fruitsDAO.updateFruit(id);
			
		}
		
	}
	@Override
	public void validateAndDelete(int id) {
		// TODO Auto-generated method stub
		if(id>0) {
			
				fruitsDAO.deleteFruit(id);
			}
		}
		
	}


