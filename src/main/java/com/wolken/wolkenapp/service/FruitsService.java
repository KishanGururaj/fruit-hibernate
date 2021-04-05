package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.FruitsDTO;

public interface FruitsService {
	public void validateAndSave(FruitsDTO fruitsDTO);
	public void validateAndUpdate(int id);
	public void validateAndDelete(int id);

}
