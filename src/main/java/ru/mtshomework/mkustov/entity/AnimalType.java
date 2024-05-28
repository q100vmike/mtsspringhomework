package ru.mtshomework.mkustov.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "animals", name = "animal_type")
public class  AnimalType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "type")
    private String type;

    @Column(name = "extra_info")
    private String extraInfo;

    @OneToMany(mappedBy = "animalType", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Animal> animalList;
}
