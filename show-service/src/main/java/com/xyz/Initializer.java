package com.xyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

import com.xyz.repository.*;
import com.xyz.model.*;

@Component
public class Initializer implements CommandLineRunner {

	@Autowired
	ShowRepository showRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Stream.of( Data initialize here ).forEach(e ->
		 *  Repo  --> to save( e ) 
		 * showRepository.save(Show.name(e).build()) );
		 */

	}
}
