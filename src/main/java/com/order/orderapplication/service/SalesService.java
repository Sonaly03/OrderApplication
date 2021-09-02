package com.order.orderapplication.service;


import com.order.orderapplication.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.order.orderapplication.repository.SalesRepository;

import java.util.List;

@Service

public interface SalesService {



        public List<Object> getMostPurchasedItem();
        public List<Object> getRank();
    }








