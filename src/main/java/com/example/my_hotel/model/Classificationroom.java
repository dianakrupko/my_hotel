package com.example.my_hotel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Classificationroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_classification;
    @NotNull
    @Size(max = 45)
    private String classification_room;
    @NotNull
    @Min(100)
    private float cost;
    @NotNull
    @Min(1)
    private int number_beds;

    public Classificationroom(String classification_room, float cost, int number_beds) {
        this.classification_room=classification_room;
        this.cost=cost;
        this.number_beds=number_beds;
    }
    public String toString() {
        return  this.classification_room + "', Cost: '" + this.cost + "', Number beds: '" + this.number_beds + "'";
    }
}



