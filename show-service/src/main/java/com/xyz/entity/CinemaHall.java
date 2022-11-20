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
@Table(name="cinemaHall")
public class CinemaHall {
	@Column(name = "cinemaHall_id")
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	private Long cinemaHallId;//P
	private String name;
	private Integer totalSeats;
	@ManyToOne
    @JoinColumn(name="cinema_id", nullable=true)
	private Cinema cinemaId;//F
}
