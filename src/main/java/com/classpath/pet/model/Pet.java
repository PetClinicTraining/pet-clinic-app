package com.classpath.pet.model;

public class Pet {
	
	private int id;
	
	private String name;
	
	private PetType pet;
	
	private Owner owner;
	
	private Pet() {
		
	}

	public Pet(String name, PetType pet) {
		super();
		this.name = name;
		this.pet = pet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PetType getPet() {
		return pet;
	}

	public void setPet(PetType pet) {
		this.pet = pet;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pet == null) ? 0 : pet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pet != other.pet)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", pet=" + pet + "]";
	}
}
