package com.xyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
	// data abstraction
}