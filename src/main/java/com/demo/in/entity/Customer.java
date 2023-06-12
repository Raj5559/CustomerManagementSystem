package com.demo.in.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	@Column
	@NotEmpty(message = "Customer name cannot be empty")
	private String cname;
	@Column
	@NotEmpty(message = "Customer city cannot be empty")
	private String ccity;
	@Column
	@Pattern(regexp = "[789][0-9]{9}",message ="Please enter valid mobile number" )
	private String cmobile;

}
