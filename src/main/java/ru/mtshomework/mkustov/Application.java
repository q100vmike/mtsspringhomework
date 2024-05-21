package ru.mtshomework.mkustov;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.mtshomework.mkustov.entity.Animal;
import ru.mtshomework.mkustov.entity.AnimalType;
import ru.mtshomework.mkustov.services.AnimalService;
import ru.mtshomework.mkustov.services.AnimalTypeService;

import java.util.List;


@SpringBootApplication
public class Application {

    @Autowired
    private AnimalService animalService;
    @Autowired
    private AnimalTypeService animalTypeService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            Animal animal1 = new Animal("Kit", "White kit", 10D, "good", "secret1");
            Animal animal2 = new Animal("Wolf", "Gray", 20D, "bad", "secret2");
            Animal animal3 = new Animal("Iguana", "Igi", 30D, "norm", "secret3");
            Animal animal4 = new Animal("Crocodile", "Croco", 40D, "good", "secret4");
            animal1.setAnimalType(animalTypeService.findById(3L));
            animal2.setAnimalType(animalTypeService.findById(1L));
            animal3.setAnimalType(animalTypeService.findById(4L));
            animal4.setAnimalType(animalTypeService.findById(1L));

            animalService.save(animal1);
            animalService.save(animal2);
            animalService.save(animal3);
            animalService.save(animal4);

            List<Animal> list = animalService.findAll();
        };

    }
}
