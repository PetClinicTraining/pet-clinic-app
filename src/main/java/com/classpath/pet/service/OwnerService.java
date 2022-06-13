package com.classpath.pet.service;

import java.util.Set;

import com.classpath.pet.model.Owner;
import com.classpath.pet.repository.OwnerRepository;

public class OwnerService {
	
	private final OwnerRepository ownerRepository;
	
	public OwnerService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	
	public Owner saveOwner(Owner owner) {
		return this.ownerRepository.saveOwner(owner);
	}
	
	public Set<Owner> getAllOwners(){
		return this.ownerRepository.getAllOwners();
	}
	
	public Owner fetchOwnerByOwnerId(long ownerId){
		return this.ownerRepository.fetchOwnerByOwnerId(ownerId)
								.orElseThrow(() -> new IllegalArgumentException("Invalid owner id"));
	}
	
	public void deleteOwnerById(long ownerId) {
		this.ownerRepository.deleteOwnerById(ownerId);
	}

}
