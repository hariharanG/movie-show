/**
 * 
 */
package com.xyz.entity;

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
@Table(name="cinemaSeat")
public class CinemaSeat {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column(name= "cinemaSeat_id")
	private Long cinemaSeatId;//P
	
	private Integer seatNumber;
	private Integer type;//enum

	@ManyToOne
    @JoinColumn(name="cinemaHallid", nullable=true)
	private CinemaHall cinemaHallId;//F
}
