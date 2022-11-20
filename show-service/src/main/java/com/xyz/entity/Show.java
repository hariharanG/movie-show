/**
 * 
 */
package com.xyz.entity;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Hari G
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="show")
public class Show implements Serializable {

	@ManyToOne
    @JoinColumn(name="cinemaHall_id", nullable=true)
	private CinemaHall cinemaHallId;//F
	

	@ManyToOne
    @JoinColumn(name="movie_id", nullable=true)
	private Movie movieId;//F
	
	private Instant startTime;
	private Instant showDate;
	private Instant endTime;
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column( name = "show_id")
	private Long showId;//P
}
