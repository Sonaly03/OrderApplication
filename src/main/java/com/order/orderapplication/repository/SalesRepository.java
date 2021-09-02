package com.order.orderapplication.repository;

import com.order.orderapplication.entity.Menu;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Pageable;
import java.util.List;

@Qualifier("sales")
@Repository
public interface SalesRepository extends CrudRepository<Menu,Integer> {

@Query("SELECT m.product_id, COUNT(s.product_id) "
        + "FROM menu m, sales s "
        + "where m.product_id = s.product_id GROUP BY m.product_name")
    public List<Object> getAllDetails();


//    @Query("SELECT sales.customerId,sales.orderDate,menu.product_name,menu.price, members.join_date " +
//            "from menu  " +
//            " JOIN sales  On menu.product_id=sales.product_id " +
//            "JOIN menu on menu.product_name=sales.customerId" )
//    public List<Object[]> getRanking();


    @Query(value = "SELECT sales.customer_id, sales.order_date, menu.product_name,menu.price, "+
            " DENSE_RANK() over (PARTITION BY sales.customer_id ORDER BY sales.order_date )order_value_rank," +
            "CASE WHEN DATEDIFF(sales.order_date, (select join_date from members where members.customer_id = sales.customer_id)) <0 THEN 'N'" +
            "WHEN DATEDIFF(sales.order_date, (select join_date from members where members.customer_id = sales.customer_id)) >0 THEN 'Y'"
           + " ELSE 'N' END Mem " +
            "FROM sales  " +
            "LEFT JOIN menu ON sales.product_id = menu.product_id"
            ,nativeQuery = true)
    public List<Object> getRank();



}



////    @Query(value ="Select product_name, count(product_name)\n" +
////            "           from sales,menu\n" +
////            "           where sales.product_id=menu.product_id\n" +
////            "           group by product_name\n" +
////            "           order by count(product_name) desc ")
////    public List<Sales> getMostPurchasedItem();
//
////        @Query(value="SELECT m.product_name FROM menu m JOIN sales s ON m.product_id = s.product_id group by m.product_name order by count (m.product_name) desc ",
////            countQuery = "select count (s.product_id) FROM sales s",
////                nativeQuery = true)
////            public List<Menu> getAllDetails(Pageable page);
////
////        @Query(value="SELECT m.product_name FROM menu m JOIN sales s ON m.product_id = s.product_id group by m.product_name order by count (m.product_name) desc ")
////    public long count();
////
////}
//    List<Menu> l = em.createQuery(
//                    "SELECT d.name, COUNT(e), AVG(e.salary) "
//                            + "FROM Department d JOIN d.employees e GROUP BY d.name")
//            .getResultList();
//    for (Object p : l) {
//            printResult(p);
//            }
//            }


