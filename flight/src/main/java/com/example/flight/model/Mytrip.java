package com.example.flight.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Mytrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int arrivalid;
    private String arrival;
    private String destination;
    private String travelfare;
    private String traveltime;

}
