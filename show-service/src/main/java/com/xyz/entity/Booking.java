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
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column(name="booking_id")
	private Long bookingId;//P
	private Integer numberOfSeats;
	private Instant showTimestamp;
	private Integer status;//enum
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=true)
	private User userId;//F

	@ManyToOne
    @JoinColumn(name="show_id", nullable=true)
	private Show showId;//F	
}
