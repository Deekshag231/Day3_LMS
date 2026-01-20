package com.example.day3_sms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="student_data")
public class studentmodel {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;

}
