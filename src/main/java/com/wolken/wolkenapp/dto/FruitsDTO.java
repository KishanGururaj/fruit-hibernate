package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="fruits_table")
@NoArgsConstructor
@Getter
@Setter

public class FruitsDTO {
	@Id
	@Column(name="fruit_id")
	private int fruitId;
	@Column(name="fruit_name")
	private String fruitName;

	/*
	 * public FruitsDTO() { // TODO Auto-generated constructor stub }
	 */
	/*
	 * public int getFruitId() { return fruitId; } public void setFruitId(int
	 * fruitId) { this.fruitId = fruitId; } public String getFruitName() { return
	 * fruitName; } public void setFruitName(String fruitName) { this.fruitName =
	 * fruitName; }
	 */

}
