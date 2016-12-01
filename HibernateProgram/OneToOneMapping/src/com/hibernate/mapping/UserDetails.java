package com.hibernate.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	
	private String name;
	@Id 
	
	private int UserId;
	//@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userId")
	@OneToOne(targetEntity=Vechicle.class,cascade=CascadeType.ALL)
	@JoinColumn(name="vechicleId",referencedColumnName="VECHICLEID")
	private Vechicle vechicle;
	
	public Vechicle getVechicle() {
		return vechicle;
	}
	public void setVechicle(Vechicle vechicle) {
		this.vechicle = vechicle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	

}
