package com.xyz.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.controller.ShowController;
import com.xyz.exception.CustomException;
import com.xyz.model.Booking;
import com.xyz.model.Cinema;
import com.xyz.model.CinemaHall;
import com.xyz.model.CinemaSeat;
import com.xyz.model.City;
import com.xyz.model.Movie;
import com.xyz.model.Payment;
import com.xyz.model.Show;
import com.xyz.model.*;
import com.xyz.repository.*;
import com.xyz.service.ShowService;

@Service
public class ShowServiceImpl implements ShowService {
	
	private static Logger log = (Logger) LoggerFactory.getLogger(ShowController.class);
	
	@Autowired
	private BookingRepository bookingsRepo;
	@Autowired
	private CinemaRepository cineRepo;
	@Autowired
	private CinemaHallRepository cineHallsRepo;
	@Autowired
	private CinemaSeatRepository cineSeatsRepo;
	@Autowired
	private CityRepository citiesRepo;
	@Autowired
	private MovieRepository moviesRepo;
	@Autowired
	private PaymentRepository payRepo;
	@Autowired
	private ShowRepository showsRepo;
	@Autowired
	private UserRepository usersRepo;
	@Autowired
	private ShowSeatRepository showSeatsRepo;
	
	public ShowServiceImpl() {
		log.info("Show service is up! now !");
	}

	@Override
	public List<CinemaHall> getCinemaHall() {
		log.debug("Inside getCinemaHalls");
		return cineHallsRepo.findAll();
	}

	@Override
	public List<Cinema> getCinema() {
		log.debug("Inside getCinemas");
		return cineRepo.findAll();
	}

	@Override
	public List<City> getCities() {
		log.debug("Inside getCities");
		return citiesRepo.findAll();
	}

	@Override
	public List<CinemaSeat> getCinemaSeat() {
		log.debug("Inside getCinemaSeats");
		return cineSeatsRepo.findAll();
	}

	@Override
	public List<Movie> getMovies() {
		log.debug("Inside getMovies");
		return moviesRepo.findAll();
	}

	@Override
	public List<Show> getShows() {
		log.debug("Inside getShows");
		return showsRepo.findAll();
	}

	@Override
	public List<Payment> getPayments() {
		log.debug("Inside getPayments");
		return payRepo.findAll();
	}

	@Override
	public List<User> getUsers() {
		log.debug("Inside getUsers");
		return usersRepo.findAll();
	}
	
	public List<Booking> getBookings(){
		log.debug("Inside getBookings");
		return bookingsRepo.findAll();
	}
	
	public List<ShowSeat> getShowSeats(){
		log.debug("Inside getShowSeats");
		return showSeatsRepo.findAll();
	}
	
	public Booking addBooking(Booking booking) {
		log.debug("Inside addBooking");
		return bookingsRepo.save(booking);
	}
	
	public Booking updateBooking(Long bookingId, Booking booking) throws Throwable {
		log.debug("Inside updateBooking");
		if(Objects.nonNull(bookingId)) {
			Optional<Booking> book = bookingsRepo.findById(bookingId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+booking);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return bookingsRepo.save(booking);
	}
	
	public void removeBooking(Long bookingId) {
		log.debug("Inside removeBooking");
		bookingsRepo.deleteById(bookingId);
	}
	
	public User addUser(User user) {
		log.debug("Inside addUser");
		return usersRepo.save(user);
	}
	
	public User updateUser(Long userId, User user) throws Throwable {
		log.debug("Inside updateUser");
		if(Objects.nonNull(userId)) {
			Optional<User> book = usersRepo.findById(userId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+user);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return usersRepo.save(user);
	}
	
	public void removeUser(Long userId) {
		log.debug("Inside removeUser");
		usersRepo.deleteById(userId);
	}
	
	public ShowSeat addShowSeat(ShowSeat showSeat) {
		log.debug("Inside addShowSeat");
		return showSeatsRepo.save(showSeat);
	}
	
	public ShowSeat updateShowSeat(Long showSeatId, ShowSeat showSeat) throws Throwable {
		log.debug("Inside updateShowSeat");
		if(Objects.nonNull(showSeatId)) {
			Optional<ShowSeat> book = showSeatsRepo.findById(showSeatId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+showSeat);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return showSeatsRepo.save(showSeat);
	}
	
	public void removeShowSeat(Long showSeatId) {
		log.debug("Inside removeShowSeat");
		showSeatsRepo.deleteById(showSeatId);
	}
	
	public Show addShow(Show show) {
		log.debug("Inside addShow");
		return showsRepo.save(show);
	}
	
	public Show updateShow(Long showId, Show show) throws Throwable {
		log.debug("Inside updateShow");
		if(Objects.nonNull(showId)) {
			Optional<Show> book = showsRepo.findById(showId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+show);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return showsRepo.save(show);
	}
	
	public void removeShow(Long showId) {
		log.debug("Inside removeShow");
		showsRepo.deleteById(showId);
	}
	
	public Payment addPayment(Payment payment) {
		log.debug("Inside addPayment");
		return payRepo.save(payment);
	}
	
	public Payment updatePayment(Long paymentId, Payment payment) {
		log.debug("Inside updatePayment");
		if(Objects.nonNull(paymentId)) {
			Optional<Payment> book = payRepo.findById(paymentId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+payment);
			}
		}
		return payRepo.save(payment);
	}
	
	public void removePay(Long paymentId) {
		log.debug("Inside removePayment");
		payRepo.deleteById(paymentId);
	}
	
	public Movie addMovie(Movie movie) {
		log.debug("Inside addMovie");
		return moviesRepo.save(movie);
	}
	
	public Movie updateMovie(Long movieId, Movie movie) throws Throwable {
		log.debug("Inside updateMovie");
		if(Objects.nonNull(movieId)) {
			Optional<Movie> book = moviesRepo.findById(movieId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+movie);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return moviesRepo.save(movie);
	}
	
	public void removeMovie(Long movieId) {
		log.debug("Inside removeMovie");
		moviesRepo.deleteById(movieId);
	}
	
	public City addCity(City city) {
		log.debug("Inside addCity");
		return citiesRepo.save(city);
	}
	
	public City updateCity(Long cityId, City city) throws Throwable {
		log.debug("Inside updateCity");
		if(Objects.nonNull(cityId)) {
			Optional<City> book = citiesRepo.findById(cityId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+city);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return citiesRepo.save(city);
	}
	
	public void removeCity(Long cityId) {
		log.debug("Inside removeCity");
		citiesRepo.deleteById(cityId);
	}
	
	public CinemaSeat addCinemaSeat(CinemaSeat cinemaSeat) {
		log.debug("Inside addCinemaSeat");
		return cineSeatsRepo.save(cinemaSeat);
	}
	
	public CinemaSeat updateCinemaSeat(Long cinemaSeatId, CinemaSeat cinemaSeat) throws Throwable {
		log.debug("Inside updateCinemaSeat");
		if(Objects.nonNull(cinemaSeatId)) {
			Optional<CinemaSeat> book = cineSeatsRepo.findById(cinemaSeatId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+cinemaSeat);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return cineSeatsRepo.save(cinemaSeat);
	}
	
	public void removeCinemaSeat(Long cinemaSeatId) {
		log.debug("Inside removeCinemaSeat");
		cineSeatsRepo.deleteById(cinemaSeatId);
	}
	
	public CinemaHall addCinemaHall(CinemaHall cinemaHall) {
		log.debug("Inside addCinemaHall");
		return cineHallsRepo.save(cinemaHall);
	}
	
	public CinemaHall updateCinemaHall(Long cinemaHallId, CinemaHall cinemaHall) throws Throwable {
		log.debug("Inside updateCinemaHall");
		if(Objects.nonNull(cinemaHallId)) {
			Optional<CinemaHall> book = cineHallsRepo.findById(cinemaHallId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+cinemaHall);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return cineHallsRepo.save(cinemaHall);
	}
	
	public void removeCinemaHall(Long cinemaHallId) {
		log.debug("Inside removeCinemaHall");
		cineHallsRepo.deleteById(cinemaHallId);
	}
	
	public Cinema addCinema(Cinema cinema) {
		log.debug("Inside addCinema");
		return cineRepo.save(cinema);
	}
	
	public Cinema updateCinema(Long cinemaId, Cinema cinema) throws Throwable {
		log.debug("Inside updateCinema");
		if(Objects.nonNull(cinemaId)) {
			Optional<Cinema> book = cineRepo.findById(cinemaId);
			if(book.isPresent()) {
				log.info("Old value="+book +" & New value="+cinema);
			}
			if(book.isEmpty()) {
				throw new CustomException();
			}
		}
		return cineRepo.save(cinema);
	}
	
	public void removeCinema(Long cinemaId) {
		log.debug("Inside removeCinema");
		cineRepo.deleteById(cinemaId);
	}

}
