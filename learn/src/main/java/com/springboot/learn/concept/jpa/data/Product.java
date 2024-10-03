package com.springboot.learn.concept.jpa.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

//When dealing with JPA repositories, we need make sure getters and setters are present in the Entity class. Or else the values will be saved as null.
//If we are storing particular class as entity then it should have a primary which is annotated with @ID
//@Entity cannot be mentioned with @NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "prodId", nullable = false)
    private Long prodId;

    private String prodName;

    private int prize;

    //This will convert the date to our convenient format
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
//    private Date date;
}
