package com.xyz.service;

import java.util.List;

import com.xyz.model.*;

/**
 * 
 * @author Hari G SVS
 * @param <CinemaHall>
 *
 */
public interface ShowService {
	
	List<CinemaHall> getCinemaHall();

	List<Cinema> getCinema();
	
	List<City> getCities();
	
	List<CinemaSeat> getCinemaSeat();
	
	List<Movie> getMovies();
	
	List<Show> getShows();
	
	List<Payment> getPayments();
	
	List<User> getUsers();

	List<Booking> getBookings();
	
}
