package com.cybage.messaging.platform.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Delegate;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_dummy_user")
@JsonIgnoreProperties({"is_pwd_changed"})
public class Users {
	public static final int ID_LENGTH = 11;
	@Id
	@Column(name = "id", updatable = false, unique= true, nullable=false)
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "identity")
	protected Integer id;

	@NotNull
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull
	@Column(name = "email_address")
	private String emailAddr;

	@Column(name = "is_pwd_changed",columnDefinition="TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isPwdChanged;

	@Column(name = "role_id")
	@Type(type = "org.hibernate.type.IntegerType")
	private Integer roleId;

	@Embedded
	@JsonIgnore
	@Delegate(types= CommonDomainProperties.class)
	private CommonDomainProperties commonDomainProperties = new CommonDomainProperties();
}
