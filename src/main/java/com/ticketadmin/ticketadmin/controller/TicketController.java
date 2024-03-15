package com.ticketadmin.ticketadmin.controller;

import com.ticketadmin.ticketadmin.entity.TicketDetail;
import com.ticketadmin.ticketadmin.model.TicketAdminRequest;
import com.ticketadmin.ticketadmin.service.TicketAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketController {
    @Autowired
    private TicketAdminService service;


    @PostMapping
    public TicketDetail createUser(@RequestBody TicketAdminRequest request) {
        TicketDetail detail= service.createUser(request) ;
        return ResponseEntity.status(HttpStatus.CREATED).body(detail).getBody();

    }

    @GetMapping
    public Optional<TicketDetail> getUser(@PathVariable String userID) {
        return service.getUser(userID);

    }
    @GetMapping("/list")
    List<TicketDetail> getallUser(){
        return service.getallUser();
    }

    @DeleteMapping
     void delete



}












