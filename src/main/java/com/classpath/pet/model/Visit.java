package com.classpath.pet.model;

import java.util.Objects;

public class Visit {
	private long id;
	private Owner owner;
	private Pet pet;
	private Vet vet;
	private String prescription;
	
	private Visit() {}
	
	public Visit(Owner owner, Pet pet, Vet vet) {
		super();
		this.owner = owner;
		this.pet = pet;
		this.vet = vet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Vet getVet() {
		return vet;
	}

	public void setVet(Vet vet) {
		this.vet = vet;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, owner, pet, prescription, vet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visit other = (Visit) obj;
		return id == other.id && Objects.equals(owner, other.owner) && Objects.equals(pet, other.pet)
				&& Objects.equals(prescription, other.prescription) && Objects.equals(vet, other.vet);
	}
	
	

}
