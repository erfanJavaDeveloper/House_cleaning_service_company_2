package com.example.house_cleaning_service_company.orderType.dao;

import com.example.house_cleaning_service_company.orderType.domain.OrderType;
import com.example.house_cleaning_service_company.orderType.model.FindWalletByOrderIdModel;
import com.example.house_cleaning_service_company.wallet.domain.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface OrderDao extends JpaRepository<OrderType, Long> {

    @Modifying
    @Query(value = "update OrderType  set dateDelivery=:dateDelivery  ,timeDelivery=:timeDelivery , dateOfOrder=:dateOfOrder , timeOfOrder=:timeOfOrder , employerId=:employerId ,  sumOfAmount=:sumOfAmount , typeOfServiceId=:typeOfServiceId  where id=:id ")
    void update(Date dateDelivery, Date timeDelivery, Date dateOfOrder, Date timeOfOrder, Long employerId, Long sumOfAmount, Long typeOfServiceId, Long id);

//    @Query(value = "select o.fk_employer\n" +
//            "   , o.date_delivery\n" +
//            "   , o.date_of_order\n" +
//            "   , o.fk_type_of_service\n" +
//            "   , o.time_of_order\n" +
//            "   , o.state_of_order\n" +
//            "   , o.sum_of_amount\n" +
//            "   , o.time_delivery\n" +
//            "   , o.unique_identifier_order\n" +
//            "   , e.first_name\n" +
//            "   , e.last_name\n" +
//            "   , e.number\n" +
//            "   , e.password\n" +
//            "   , e.username\n" +
//            "   , w.amount\n" +
//            "   , w.fk_employer\n" +
//            "from order_type o\n" +
//            "         INNER join employer e on o.fk_employer = e.id\n" +
//            "         INNER join wallet w on e.id = w.fk_employer\n" +
//            "where o.id = :id", nativeQuery = true)
//    FindWalletByOrderIdModel findWalletByOrderId(Long orderId);

    @Query(value = "select w.id id,w.fk_employer fk_employer ,w.amount amount\n" +
            "from order_type o\n" +
            "         INNER join employer e on o.fk_employer = e.id\n" +
            "         INNER join wallet w on e.id = w.fk_employer\n" +
            "where o.id = :orderId",nativeQuery = true)
    WalletInt findWalletByOrderId(Long orderId);

}