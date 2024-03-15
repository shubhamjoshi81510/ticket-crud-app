package com.ticketadmin.ticketadmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ticket_detail")
public class TicketDetail {
    @Id
    @Column(name ="user_id")
    private String userID;

    @Column(name ="userName")
    private String userName;

    @Column(name ="email")
    private String email;

    @Column(name ="age")
    private String age;


}
