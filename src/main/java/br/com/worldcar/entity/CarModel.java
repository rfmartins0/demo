package br.com.worldcar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="car")
public class CarModel {
	
	@Id
	@GeneratedValue
	private Long id;

	
}
