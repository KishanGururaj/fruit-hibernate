package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.FruitsDTO;

public interface FruitsDAO {
	public void  createFruit(FruitsDTO fruitsDTO);
	public void updateFruit(int id);
	public void deleteFruit(int id);

}
