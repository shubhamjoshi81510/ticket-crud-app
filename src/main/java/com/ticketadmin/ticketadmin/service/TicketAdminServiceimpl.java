package com.ticketadmin.ticketadmin.service;

import com.ticketadmin.ticketadmin.entity.TicketDetail;
import com.ticketadmin.ticketadmin.model.TicketAdminRequest;
import com.ticketadmin.ticketadmin.repository.TicketAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TicketAdminServiceimpl implements TicketAdminService {
    @Autowired
    TicketAdminRepository ticketAdminRepository;


    @Override
    public TicketDetail createUser(TicketAdminRequest request) {
        TicketDetail detail = new TicketDetail();
        detail.setUserID(UUID.randomUUID().toString());
        detail.setAge(request.getAge());
        detail.setEmail(request.getEmail());
        detail.setUserName(request.getUsername());
        return ticketAdminRepository.save(detail);
    }

    @Override
    public List<TicketDetail> getallUser() {
        return ticketAdminRepository.findAll();
    }

    @Override
    public Optional<TicketDetail> getUser(String userID) {
        return ticketAdminRepository.findById(userID);
    }

    @Override
    public TicketDetail updateUserDetail(String userID) {
        return null;
    }

    @Override
    public void deleteUser(String userID) {
       ticketAdminRepository.deleteById(userID);
    }

    @Override
    public void deleteallUser() {
        ticketAdminRepository.deleteAll();

    }



}

