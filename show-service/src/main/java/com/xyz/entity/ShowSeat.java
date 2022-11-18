/**
 * 
 */
package com.xyz.entity;

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
@Table(name="showSeat")
public class ShowSeat {
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column(name = "showSeat_id")
	private Long showSeatId;//P
	
	private Integer status;//enum
	private Double price;

	@ManyToOne
    @JoinColumn(name="cinemaSeat_id", nullable=true)
	private CinemaSeat cinemaSeatId;//F

	@ManyToOne
    @JoinColumn(name="show_id", nullable=true)
	private Show showId;//F
	

	@ManyToOne
    @JoinColumn(name="booking_id", nullable=true)
	private Booking bookingId;//F	
}
