package com.ticketadmin.ticketadmin.repository;

import com.ticketadmin.ticketadmin.entity.TicketDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketAdminRepository extends JpaRepository<TicketDetail ,String> {
}
