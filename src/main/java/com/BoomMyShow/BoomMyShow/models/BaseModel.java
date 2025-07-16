package com.BoomMyShow.BoomMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

//Using lombok getter and setter annotation it will add getter setter in compiled code
//even if the original code does not have making it look clean
//@MappedSuperclass makes this class as superclass of all other class and we will not create individual table of it
//after extending this class the columns will be added in child class. Same configuration will go in all the child classes
@Getter
@Setter
@MappedSuperclass
public class BaseModel {
//    @Id annotation is taken from jakarta persistence which is JPA
//    it will analyse the class and create the table from the class. No SQL required
//    It tell JPA that it is going to be a primary key
//    @GeneratedValue(strategy = GenerationType.AUTO) this helps create the id by self and user need to not provide it
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    below annotation helps in adding the date/timestamp automatically from the system and no need to add it
    @CreatedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;

    @LastModifiedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedAt;


}
