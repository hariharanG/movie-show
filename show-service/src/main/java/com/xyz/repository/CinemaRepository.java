package com.xyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.model.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
	// data abstraction
}