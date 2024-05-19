package ru.mtshomework.mkustov.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtshomework.mkustov.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
