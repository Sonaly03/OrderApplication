package com.order.orderapplication.service;

import com.order.orderapplication.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Qualifier
@Component
public class SalesServiceImpl implements SalesService{
    @Autowired
    private SalesRepository repo;

    public List<Object> getMostPurchasedItem()
    {
        return repo.getAllDetails();
    }
    public List<Object> getRank()
    {

        return repo.getRank();
    }





    }

