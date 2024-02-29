package com.example.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.FlightService;
import com.example.flight.model.FlightBooking;

@RestController
@RequestMapping("/flightticketbooking")

public class FlightController {
    @Autowired
    FlightService service;

    public FlightController(FlightService service) {
        this.service = service;
    }

    @PostMapping("/signup")
    public FlightBooking SavingData(@RequestBody FlightBooking Flight) {
        return service.creation(Flight);
    }

    @GetMapping("/profile")
    public List<FlightBooking> detailsprinting() {
        return service.DataPrinting();
    }

    @PutMapping("/profileupdate/{userid}")
    public FlightBooking dataupdating(@PathVariable int userid, @RequestBody FlightBooking flight) {
        return service.update(userid, flight);
    }

    @DeleteMapping("/profiledelete/{userid}")
    public Boolean delete(@PathVariable int userid) {
        return service.delete(userid);
    }

    @GetMapping("/profilespage/{pageno}/{pagesize}")
    public List<FlightBooking> getpage(@PathVariable int pageno, @PathVariable int pagesize) {
        return service.pagination(pageno, pagesize);
    }

    @GetMapping("/sorting/{username}")
    public List<FlightBooking> sortedlist(@PathVariable String username) {
        return service.sortingbyname(username);
    }

}