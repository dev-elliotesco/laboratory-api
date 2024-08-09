package com.eescovitchr.laboratory.domain.port;

import com.eescovitchr.laboratory.domain.model.Appointment;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentRepository {
    Appointment save(Appointment appointment);
    Appointment findById(Integer id);
    List<Appointment> findAll();
    void delete(Integer id);
    boolean existsById(Integer id);
    List<Appointment> findByDate(LocalDate date);
}
