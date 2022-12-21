package com.example.house_cleaning_service_company.score.dao;

import com.example.house_cleaning_service_company.score.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDao extends JpaRepository<Score, Long> {

//    @Modifying
//    @Query(value = "update Score set employerId=:employerId  ,orderId=:orderId , workerScore=:workerScore   where id=:id")
//    void update(Long employerId,Long orderId,Integer workerScore ,Long id);


   @Modifying
    @Query(name = "Score.update")
    void update(Long employerId,Long orderId,Integer workerScore ,Long id);

}
