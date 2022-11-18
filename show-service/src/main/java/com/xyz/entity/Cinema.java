/**
 * 
 */
package com.xyz.entity;

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
@Table(name="cinema")
public class Cinema {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column(name="cinema_id")
	private Long cinemaId;//P
	private String name;
	private Integer totalCinemaHalls;

	@ManyToOne
    @JoinColumn(name="city_id", nullable=true)
	private City cityId;//F
}
