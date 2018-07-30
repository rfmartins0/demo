package br.com.worldcar.repository;

import br.com.worldcar.entity.CarModel;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarModel, Long> {

}