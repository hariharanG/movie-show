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
import com.xyz.model.*;
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

	//add new
	@PostMapping("/addCity")
	public ResponseEntity<?> addCity(City city) throws CustomException {
		return prepareSingleResponse(showServices.addCity(city));
	}
	
	@PostMapping("/addBooking")
	public ResponseEntity<?> addBookings(Booking book) throws CustomException {
		return prepareSingleResponse(showServices.addBooking(book));
	}
	
	@PostMapping("/addCinema")
	public ResponseEntity<?> addCinemas(Cinema cine) throws CustomException {
		return prepareSingleResponse(showServices.addCinema(cine));
	}
	
	@PostMapping("/addCineHall")
	public ResponseEntity<?> addCineHalls(CinemaHall cineHall) throws CustomException {
		return prepareSingleResponse(showServices.addCinemaHall(cineHall));
	}
	
	@PostMapping("/addCineSeat")
	public ResponseEntity<?> addCineSeats(CinemaSeat cineSeat) throws CustomException {
		return prepareSingleResponse(showServices.addCinemaSeat(cineSeat));
	}
	
	@PostMapping("/addMovie")
	public ResponseEntity<?> addMovies(Movie mv) throws CustomException {
		return prepareSingleResponse(showServices.addMovie(mv));
	}
	
	@PostMapping("/addPayment")
	public ResponseEntity<?> addPayments(Payment pay) throws CustomException {
		return prepareSingleResponse(showServices.addPayment(pay));
	}
	
	@PostMapping("/addShow")
	public ResponseEntity<?> addShows(Show show) throws CustomException {
		return prepareSingleResponse(showServices.addShow(show));
	}
	
	@PostMapping("/addShowSeat")
	public ResponseEntity<?> addShowSeats(ShowSeat seat) throws CustomException {
		return prepareSingleResponse(showServices.addShowSeat(seat));
	}

	@PostMapping("/addUser")
	public ResponseEntity<?> addUsers(User usr) throws CustomException {
		return prepareSingleResponse(showServices.addUser(usr));
	}
	
	// to remove
	@PostMapping("/deleteCity")
	public void deleteCity(Long city) throws CustomException {
		showServices.removeCity(city);
	}
	
	@PostMapping("/deleteBooking")
	public void deleteBookings(Long book) throws CustomException {
		showServices.removeBooking(book);
	}
	
	@PostMapping("/deleteCinema")
	public void deleteCinemas(Long cine) throws CustomException {
		showServices.removeCinema(cine);
	}
	
	@PostMapping("/deleteCineHall")
	public void deleteCineHalls(Long cineHall) throws CustomException {
		showServices.removeCinemaHall(cineHall);
	}
	
	@PostMapping("/deleteCineSeat")
	public void deleteCineSeats(Long cineSeat) throws CustomException {
		showServices.removeCinemaSeat(cineSeat);
	}
	
	@PostMapping("/deleteMovie")
	public void deleteMovies(Long mv) throws CustomException {
		showServices.removeMovie(mv);
	}
	
	@PostMapping("/deletePayment")
	public void deletePayments(Long pay) throws CustomException {
		showServices.removePay(pay);
	}
	
	@PostMapping("/deleteShow")
	public void deleteShows(Long show) throws CustomException {
		showServices.removeShow(show);
	}
	
	@PostMapping("/deleteShowSeat")
	public void deleteShowSeats(Long seat) throws CustomException {
		showServices.removeShowSeat(seat);
	}

	@PostMapping("/deleteUser")
	public void deleteUsers(Long usr) throws CustomException {
		showServices.removeUser(usr);
	}
	
	// to update existing
	@PostMapping("/updateCity")
	public ResponseEntity<?> updateCity(Long id, City city) throws Throwable {
		return prepareSingleResponse(showServices.updateCity(id, city));
	}
	
	@PostMapping("/updateBooking")
	public ResponseEntity<?> updateBookings(Long id, Booking book) throws Throwable {
		return prepareSingleResponse(showServices.updateBooking(id, book));
	}
	
	@PostMapping("/updateCinema")
	public ResponseEntity<?> updateCinemas(Long id, Cinema cine) throws Throwable {
		return prepareSingleResponse(showServices.updateCinema(id, cine));
	}
	
	@PostMapping("/updateCineHall")
	public ResponseEntity<?> updateCineHalls(Long id, CinemaHall cineHall) throws Throwable {
		return prepareSingleResponse(showServices.updateCinemaHall(id, cineHall));
	}
	
	@PostMapping("/updateCineSeat")
	public ResponseEntity<?> updateCineSeats(Long id, CinemaSeat cineSeat) throws Throwable {
		return prepareSingleResponse(showServices.updateCinemaSeat(id, cineSeat));
	}
	
	@PostMapping("/updateMovie")
	public ResponseEntity<?> updateMovies(Long id, Movie mv) throws Throwable {
		return prepareSingleResponse(showServices.updateMovie(id, mv));
	}
	
	@PostMapping("/updatePayment")
	public ResponseEntity<?> updatePayments(Long id, Payment pay) throws Throwable {
		return prepareSingleResponse(showServices.updatePayment(id, pay));
	}
	
	@PostMapping("/updateShow")
	public ResponseEntity<?> updateShows(Long id, Show show) throws Throwable {
		return prepareSingleResponse(showServices.updateShow(id, show));
	}
	
	@PostMapping("/updateShowSeat")
	public ResponseEntity<?> updateShowSeats(Long id, ShowSeat seat) throws Throwable {
		return prepareSingleResponse(showServices.updateShowSeat(id, seat));
	}

	@PostMapping("/updateUser")
	public ResponseEntity<?> updateUsers(Long id, User usr) throws Throwable {
		return prepareSingleResponse(showServices.updateUser(id, usr));
	}
	
	private ResponseEntity<List<?>> prepareResponse(List<?> items) throws CustomException {
		try {
			return new ResponseEntity(items, HttpStatus.OK);
		}catch(Exception e) {
			return prepareResponse(Arrays.asList(e.getSuppressed()));
			//throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST.toString());
		}
	}
	private ResponseEntity<?> prepareSingleResponse(Object items) throws CustomException {
		try {
			return new ResponseEntity(items, HttpStatus.OK);
		}catch(Exception e) {
			return prepareResponse(Arrays.asList(e.getSuppressed()));
		}
	}
}
