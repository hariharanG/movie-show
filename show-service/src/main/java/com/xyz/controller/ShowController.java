package com.xyz.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.exception.CustomException;
import com.xyz.model.City;
import com.xyz.service.ShowService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ShowController {
	private static Logger log = (Logger) LoggerFactory.getLogger(ShowController.class);

	@Autowired
	private ShowService showServices;

	public ShowController() {
		log.info("Show controller is on ....");
	}
	
	@GetMapping("/")
	public ResponseEntity<String> greet() {
		return ResponseEntity.status(HttpStatus.OK).body("Book your favourite show here..");
	}

	@PostMapping("/cities")
	public ResponseEntity<List<?>> getCities() throws CustomException {
		return prepareResponse(showServices.getCities());
	}
	
	@PostMapping("/bookings")
	public ResponseEntity<List<?>> getBookings() throws CustomException {
		return prepareResponse(showServices.getBookings());
	}
	
	@PostMapping("/cinemas")
	public ResponseEntity<List<?>> getCinemas() throws CustomException {
		return prepareResponse(showServices.getCinema());
	}
	
	@PostMapping("/cineHall")
	public ResponseEntity<List<?>> getCineHalls() throws CustomException {
		return prepareResponse(showServices.getCinemaHall());
	}
	
	@PostMapping("/cineSeat")
	public ResponseEntity<List<?>> getCineSeats() throws CustomException {
		return prepareResponse(showServices.getCinemaSeat());
	}
	
	@PostMapping("/movies")
	public ResponseEntity<List<?>> getMovies() throws CustomException {
		return prepareResponse(showServices.getMovies());
	}
	
	@PostMapping("/payments")
	public ResponseEntity<List<?>> getPayments() throws CustomException {
		return prepareResponse(showServices.getPayments());
	}
	
	@PostMapping("/shows")
	public ResponseEntity<List<?>> getShows() throws CustomException {
		return prepareResponse(showServices.getShows());
	}
	
	@PostMapping("/showSeats")
	public ResponseEntity<List<?>> getShowSeats() throws CustomException {
		return prepareResponse(showServices.getShowSeats());
	}

	@PostMapping("/users")
	public ResponseEntity<List<?>> getUsers() throws CustomException {
		return prepareResponse(showServices.getUsers());
	}


	private ResponseEntity<List<?>> prepareResponse(List<?> items) throws CustomException {
		try {
			return new ResponseEntity(items, HttpStatus.OK);
		}catch(Exception e) {
			return prepareResponse(Arrays.asList(e.getSuppressed()));
			//throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST.toString());
		}
	}
}
