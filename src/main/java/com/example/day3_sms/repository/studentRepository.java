package com.example.day3_sms.repository;

import com.example.day3_sms.model.studentmodel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends MongoRepository<studentmodel, String>{

}
