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
public class ShowSeat {
	private Long showSeatId;//P
	private Integer status;//enum
	private Double price;
	private Long cinemaSeatId;//F
	private Long showId;//F
	private Long bookingId;//F	
}
