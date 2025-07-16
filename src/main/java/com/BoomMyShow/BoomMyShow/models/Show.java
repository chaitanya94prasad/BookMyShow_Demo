package com.BoomMyShow.BoomMyShow.models;

import com.BoomMyShow.BoomMyShow.enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;
    private List<ShowSeat> showSeats;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
