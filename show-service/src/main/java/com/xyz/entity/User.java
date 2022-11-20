/**
 * 
 */
package com.xyz.entity;

import java.io.Serializable;
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
@Entity
@Table(name="user")
public class User implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	@Column(name = "user_id")
	private Long userId;//P
	
	private String name;
	private String password;
	private String email;
	private String phone;
}
