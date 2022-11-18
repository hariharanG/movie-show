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
public class Movie {
	private Long movieId;//P
	private String title;
	private String description;
	private Instant duration;
	private String language;
	private Instant releaseDate;
	private String country;
	private String genre;
}
