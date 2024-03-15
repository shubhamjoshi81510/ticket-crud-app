package com.ticketadmin.ticketadmin.service;

import com.ticketadmin.ticketadmin.entity.TicketDetail;
import com.ticketadmin.ticketadmin.model.TicketAdminRequest;

import java.util.List;
import java.util.Optional;

public interface TicketAdminService {

    TicketDetail createUser (TicketAdminRequest request);

    List<TicketDetail> getallUser();

    Optional<TicketDetail> getUser (String userID);

    TicketDetail updateUserDetail (String userID);

    void  deleteUser (String userID);


    void  deleteallUser();
}
