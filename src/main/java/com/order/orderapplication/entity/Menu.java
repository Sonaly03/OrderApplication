package com.order.orderapplication.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Menu")
@RequiredArgsConstructor
@Entity(name="menu")
@Data
public class Menu {
    @Id
    @Column(name="product_id")
    private int product_id;
    @Column(name="product_name")
    private String product_name;
    @Column(name="price")
    private int price;
}
