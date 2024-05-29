package ru.mtshomework.mkustov.services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ru.mtshomework.mkustov.entity.Animal;
import ru.mtshomework.mkustov.repo.AnimalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    public void save(Animal animal) {
        animalRepository.save(animal);
    }

    public void deleteById(Long id){
        animalRepository.deleteById(id);
    }

    public List<Animal> findByName(String name) {
        return animalRepository.findAnimalsByName(name);
    }

    public String findMostExpensiveAnimal(String type) {
        return animalRepository.findMostExpensiveAnimal(type);
    }

    public Optional<Animal> findMostPoorAnimal(String type) {
        return animalRepository.findMostPoorAnimal(type);
    }

}
