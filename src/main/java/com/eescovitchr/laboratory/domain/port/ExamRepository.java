package com.eescovitchr.laboratory.domain.port;

import com.eescovitchr.laboratory.domain.model.Exam;

import java.util.List;

public interface ExamRepository {
    Exam save(Exam exam);
    Exam findById(Integer id);
    List<Exam> findAll();
    void delete(Integer id);
    boolean existsById(Integer id);

}
