package com.classpath.pet.repository;

import java.util.Optional;
import java.util.Set;

import com.classpath.pet.model.Owner;

public class OwnerRepository {
	
	public Owner saveOwner(Owner owner) {
		System.out.println("Inside the repository method of saveOwner");
		return owner;
	}
	
	public Set<Owner> getAllOwners(){
		return null;
	}
	
	public Optional<Owner> fetchOwnerByOwnerId(long ownerId){
		return null;
	}
	
	public void deleteOwnerById(long ownerId) {
		
	}

}
