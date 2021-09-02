package com.order.orderapplication.controller;

import com.order.orderapplication.entity.Menu;
import com.order.orderapplication.entity.Sales;
import com.order.orderapplication.service.SalesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.order.orderapplication.service.SalesServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;

@Controller

public class SalesController {
    @Autowired
  //  @Qualifier("service")
 private SalesServiceImpl service;
    @Autowired
    EntityManager entityManager;

    @GetMapping("/sales")
    ResponseEntity<List<Object>> getMostPurchasedItem(){
       // return new ResponseEntity<List<Object>>((List<Menu>) service.getMostPurchasedItem(), HttpStatus.OK);
        return new ResponseEntity<List<Object>>( service.getMostPurchasedItem(), HttpStatus.OK);
    }

    @GetMapping("/rank")
    ResponseEntity<List<Object>> getRank( ){
        // return new ResponseEntity<List<Object>>((List<Menu>) service.getMostPurchasedItem(), HttpStatus.OK);
        return new ResponseEntity<List<Object>>(service.getRank(), HttpStatus.OK);
    }




//    @GetMapping("/demo")
//    public String getData() {
//        Query sqlQuery= entityManager.createNativeQuery("select product_id from sales");
//        List<String> result= sqlQuery.getResultList();
//        StringBuilder sb=new StringBuilder();
//        Iterator itr= result.iterator();
//        while(itr.hasNext()) {
//            sb.append(itr.next()+" ");
//        }
//        return sb.toString();
//    }
}









