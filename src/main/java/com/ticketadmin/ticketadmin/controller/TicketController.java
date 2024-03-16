package com.ticketadmin.ticketadmin.controller;

import com.ticketadmin.ticketadmin.entity.TicketDetail;
import com.ticketadmin.ticketadmin.model.TicketAdminRequest;
import com.ticketadmin.ticketadmin.service.TicketAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class TicketController {
    @Autowired
    private TicketAdminService service;


    @PostMapping
    public TicketDetail createUser(@RequestBody TicketAdminRequest request) {
        TicketDetail detail= service.createUser(request) ;
        return ResponseEntity.status(HttpStatus.CREATED).body(detail).getBody();

    }

    @GetMapping("/{userID}")
    public Optional<TicketDetail> getUser(@PathVariable String userID) {
        return service.getUser(userID);

    }
    @GetMapping
    List<TicketDetail> getallUser(){
        return service.getallUser();
    }

    @DeleteMapping
     String  deleteAllUser (){
        service.deleteallUser();
        return "all users are deleted";
    }

    @DeleteMapping("/{userID}")
    String deleteUserById (@PathVariable String userID){
        service.deleteUser(userID);
        return userID +"this user has been deleted";
    }


    @PutMapping("/{userID}")
    public TicketDetail updateUserDeatail(@PathVariable String userID ,@RequestBody TicketAdminRequest request){
        return service.updateUserDetail(request,userID );

    }

    @PatchMapping("/{userID}")
    public TicketDetail updateUserDetail(@PathVariable String userID , @RequestBody HashMap<String ,String> map){
      return service.updatePartialUser(map , userID);

    }
}












