package com.company.spring.repository;

import com.company.spring.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// A principal utilidade java.util.Optional  é indicar se um valor está presente ou ausente.

public interface BookingRepository extends JpaRepository<BookingModel, String> {
    Optional<BookingModel> findByReserveName(String name);
}
