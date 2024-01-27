package com.parkinglot.repository;

import com.parkinglot.modal.Gate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GateRepository extends JpaRepository<Gate,Long> {
    Optional<Gate> findByGateNumber(String gateNumber);
}
