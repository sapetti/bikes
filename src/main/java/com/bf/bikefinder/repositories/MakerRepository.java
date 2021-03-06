package com.bf.bikefinder.repositories;

import com.bf.bikefinder.model.Bike;
import com.bf.bikefinder.model.Maker;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface MakerRepository extends PagingAndSortingRepository<Maker, Long> {

	Maker findByName(String name);
	
}
