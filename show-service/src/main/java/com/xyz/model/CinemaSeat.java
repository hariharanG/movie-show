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
public class CinemaSeat {
	private Long cinemaSeatId;//P
	private Integer seatNumber;
	private Integer type;//enum
	private Long cinemaHallId;//F
}
