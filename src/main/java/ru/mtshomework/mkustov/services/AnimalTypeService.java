package ru.mtshomework.mkustov.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mtshomework.mkustov.entity.AnimalType;
import ru.mtshomework.mkustov.repo.AnimalTypeRepository;

@Service
@RequiredArgsConstructor
public class AnimalTypeService {
    private final AnimalTypeRepository animalTypeRepository;

    public AnimalType save(AnimalType animalType) {
        return animalTypeRepository.save(animalType);
    }

    public AnimalType findById(Long id) {
        return animalTypeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("***Not found animal type with id %s", id)));
    }
}
