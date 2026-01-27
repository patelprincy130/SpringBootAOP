package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.models.Alien;

@Repository
public interface AlienRepository extends JpaRepository<Alien, Integer> {

//	@Query("from Alien where aname=:aname")
	public Alien findByAname(String aname);
}
