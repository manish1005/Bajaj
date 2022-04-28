package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_alphabet")
public class Alphabet {

	@Id
	private int apha_id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="roll_Number")
	private String roll_N;

	@Column
	private String alpha;
	public Alphabet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alphabet(int apha_id, String roll_N) {
		super();
		this.apha_id = apha_id;
		this.roll_N = roll_N;
	}

	public int getApha_id() {
		return apha_id;
	}

	public void setApha_id(int apha_id) {
		this.apha_id = apha_id;
	}

	public String getRoll_Number() {
		return roll_N;
	}

	public void setRoll_Number(String roll_N) {
		this.roll_N = roll_N;
	}

	
}
