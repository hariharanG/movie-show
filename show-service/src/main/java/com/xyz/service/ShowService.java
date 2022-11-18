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
	
	List<ShowSeat> getShowSeats();
	
	void removeCinemaHall(Long cinemaHallId);
	void removeCinemaSeat(Long cinemaSeatId);
	void removeCinema(Long cinemaId);
	void removeCity(Long cityId);
	void removeMovie(Long movieId);
	void removePay(Long payId);
	void removeShow(Long showId);
	void removeShowSeat(Long showSeatId);
	void removeUser(Long userId);
	void removeBooking(Long cinemaHallId);
	
	CinemaHall addCinemaHall(CinemaHall cinemaHallId);
	CinemaSeat addCinemaSeat(CinemaSeat cinemaSeatId);
	Cinema addCinema(Cinema cinemaId);
	City addCity(City cityId);
	Movie addMovie(Movie movieId);
	Payment addPayment(Payment payId);
	Show addShow(Show showId);
	ShowSeat addShowSeat(ShowSeat showSeatId);
	User addUser(User userId);
	Booking addBooking(Booking cinemaHallId);
	
	CinemaHall updateCinemaHall(Long cinemaHallId, CinemaHall ch) throws Throwable;
	CinemaSeat updateCinemaSeat(Long cinemaSeatId, CinemaSeat cs) throws Throwable;
	Cinema updateCinema(Long cinemaId,Cinema c) throws Throwable;
	City updateCity(Long cityId, City c) throws Throwable;
	Movie updateMovie(Long movieId, Movie m) throws Throwable;
	Payment updatePayment(Long payId,Payment p) throws Throwable;
	Show updateShow(Long showId,Show s) throws Throwable;
	ShowSeat updateShowSeat(Long showSeatId, ShowSeat ss) throws Throwable;
	User updateUser(Long userId,User u) throws Throwable;
	Booking updateBooking(Long cinemaHallId, Booking b) throws Throwable;
	
}
