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
public class Show {
	private Long cinemaHallId;//F
	private Long movieId;//F
	private Instant startTime;
	private Instant showDate;
	private Instant endTime;
	private Long showId;//P
}
