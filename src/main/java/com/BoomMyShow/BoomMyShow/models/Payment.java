package com.BoomMyShow.BoomMyShow.models;

import com.BoomMyShow.BoomMyShow.enums.PaymentStatus;
import com.BoomMyShow.BoomMyShow.enums.PaymentType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.ORDINAL)
    private PaymentType paymentType;
}
