package com.BoomMyShow.BoomMyShow.models;

import com.BoomMyShow.BoomMyShow.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    @ManyToOne
    private Show show;

    @OneToMany
    private List<Payment> payments;

    @ManyToOne
    private User user;

//    ticket can be either booked or cancelled. a ticket is having the status
//    but 2 ticket can refer to same seat one being cancelled and one being booked
//    so seat can belong to multiple tickets
//    one ticket can also have many seats
//    so relationship will be many to many

    @ManyToMany
    private List<ShowSeat> showSeats;
    private Date bookedAt;
    private int amount;
}
