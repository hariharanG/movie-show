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
public class Booking {
	private Long bookingId;//P
	private Integer numberOfSeats;
	private Instant showTimestamp;
	private Integer status;//enum
	private Long userId;//F
	private Long showId;//F	
}
