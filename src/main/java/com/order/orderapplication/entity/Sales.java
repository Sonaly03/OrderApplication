package com.order.orderapplication.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "Sales")
@Data
@Entity(name="sales")
@RequiredArgsConstructor

public class Sales {
    @Id
    @Column(name="customer_id")
    private String customer_id;
    @Column(name="order_date")
    private Date orderDate;
    @Column(name="product_id")
    private int product_id;
    private char member;
    private int ranking;
}
