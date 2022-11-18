/**
 * 
 */
package com.xyz.model;

import java.time.Instant;

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
@EqualsAndHashCode
public class Payment {
	private Long paymentId;//P
	private Long amount;
	private Instant paymentTimestamp;
	private Integer discountCouponId;
	private Integer paymentMethod; // enum
	private Long bookingId;//F
}
