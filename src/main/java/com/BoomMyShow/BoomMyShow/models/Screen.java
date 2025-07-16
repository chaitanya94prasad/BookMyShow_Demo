package com.BoomMyShow.BoomMyShow.models;

import com.BoomMyShow.BoomMyShow.enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel{
    private String name;

    @OneToMany
    private List<Seat> seats;

//    @ElementCollection will create a mapping table for screen to features
//    @Enumerated(EnumType.ORDINAL) will be used to create enum as object
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
