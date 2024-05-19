package ru.mtshomework.mkustov.services;

import org.springframework.stereotype.Service;
import ru.mtshomework.mkustov.entity.Animal;
import ru.mtshomework.mkustov.repo.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    public void save(Animal animal){
        animalRepository.save(animal);
    }
}
