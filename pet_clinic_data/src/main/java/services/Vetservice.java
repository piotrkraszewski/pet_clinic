package services;

import piotr.pet_clinic.model.Vet;

import java.util.Set;

public interface Vetservice {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
