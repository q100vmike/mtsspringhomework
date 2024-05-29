package ru.mtshomework.mkustov.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mtshomework.mkustov.entity.Animal;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findAnimalsByName(String name);

    @Query(value = "select a.name from animals.animal a " +
            "join animals.animal_type t on a.type_id = t.id where t.type=:Type order " +
            "by a.cost desc limit 1", nativeQuery = true)
    String findMostExpensiveAnimal(
            @Param("Type") String type
    );

    @Query("select a from Animal a " +
            "join AnimalType t on a.animalType.Id = t.Id where t.type=:Type order " +
            "by a.cost asc limit 1")
    Optional<Animal> findMostPoorAnimal(
            @Param("Type") String type
    );

}
