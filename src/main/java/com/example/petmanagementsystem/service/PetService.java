package com.example.petmanagementsystem.service;

import java.util.List;
import com.example.petmanagementsystem.model.Pet;

public interface PetService {
    List<Pet> getAllPets();
    Pet getPetById(Long id);
    void savePet(Pet pet);
    void deletePet(Long id);
}
