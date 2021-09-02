package com.order.orderapplication.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Table(name = "Members")
@Data
@Entity(name = "members")
@RequiredArgsConstructor


public class Members {
    @Id
    @Column(name="customer_id")
    private  String customer_id;
    private String customer_name;
    @Column(name="join_date")
    private Timestamp join_date;
}
