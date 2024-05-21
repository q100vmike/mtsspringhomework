package ru.mtshomework.mkustov.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "animals", name = "animal")
public class Animal {

    @Override
    public String toString() {
        return "Animal{" +
                "animalType=" + animalType +
                ", name='" + name + '\'' +
                ", Id=" + Id +
                ", breed='" + breed + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", secretInfo='" + secretInfo + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String name;
    private String breed;
    private Double cost;
    private String character;
    private String secretInfo;

    @ManyToOne()
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
