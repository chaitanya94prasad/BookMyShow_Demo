package com.BoomMyShow.BoomMyShow.models;

import com.BoomMyShow.BoomMyShow.enums.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
    private Seat seat;
    private Double price;
}
