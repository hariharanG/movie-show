/**
 * 
 */
package com.xyz.entity;

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
@Table(name="city")
public class City {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column( name = "city_id")
	private Long cityId;//P
	
	private String name;
	private String state;
	private String zipcode;
}
