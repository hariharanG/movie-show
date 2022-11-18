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
@Table(name="payment")
public class Payment {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column(name = "payment_id")
	private Long paymentId;//P
	
	private Long amount;
	private Instant paymentTimestamp;
	private Integer discountCouponId;
	private Integer paymentMethod; // enum

	@ManyToOne
    @JoinColumn(name="booking_id", nullable=true)
	private Booking bookingId;//F
}
