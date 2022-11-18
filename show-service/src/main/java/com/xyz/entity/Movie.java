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
@Table(name="movie")
public class Movie {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column(name = "movie_id")
	private Long movieId;//P
	
	private String title;
	private String description;
	private Instant duration;
	private String language;
	private Instant releaseDate;
	private String country;
	private String genre;
}
