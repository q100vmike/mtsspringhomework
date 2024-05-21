package ru.mtshomework.mkustov.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtshomework.mkustov.entity.AnimalType;

public interface AnimalTypeRepository extends JpaRepository<AnimalType, Long> {
}
