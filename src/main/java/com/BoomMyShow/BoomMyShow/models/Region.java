package com.BoomMyShow.BoomMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//the classes which have Entity annotation, the table will be created only for that, if we add table name then it will take that
//else it will take the class name as table name
@Entity
@Getter
@Setter
public class Region extends BaseModel{
    private String name;

    @OneToMany
    private List<Theatre> theatreList;
}
