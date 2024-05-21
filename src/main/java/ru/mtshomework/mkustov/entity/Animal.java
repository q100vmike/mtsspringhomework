package ru.mtshomework.mkustov.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String name;
    private String breed;
    private Double cost;
    private String character;
    private String secretInfo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private AnimalType animalType;

    public Animal(String name, String breed, Double cost, String character, String secretInfo) {
        this.name = name;
        this.breed = breed;
        this.cost = cost;
        this.character = character;
        this.secretInfo = secretInfo;
    }
}
