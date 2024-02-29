package com.example.flight.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
@Entity
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    private String Username;
    private String Email;
    private String Password;
    private String Phonenumber;
    @OneToMany(targetEntity = Mytrip.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "travelid", referencedColumnName = "userid")
    private List<Mytrip> travellist;

}