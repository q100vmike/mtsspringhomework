package ru.mtshomework.mkustov.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    public Animal(String name, String breed, Double cost, String character, String secretInfo) {
        this.name = name;
        this.breed = breed;
        this.cost = cost;
        this.character = character;
        this.secretInfo = secretInfo;
    }
}
