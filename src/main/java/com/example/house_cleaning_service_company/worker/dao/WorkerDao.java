package com.example.house_cleaning_service_company.worker.dao;

import com.example.house_cleaning_service_company.worker.domain.IsActive;
import com.example.house_cleaning_service_company.worker.domain.Worker;
import com.example.house_cleaning_service_company.worker.model.WorkerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerDao extends JpaRepository<Worker,Long> {

    @Modifying
    @Query(value = "update Worker SET firstName=:firstName , lastName=:lastName , number=:number , password=:password , photo=:photo where id=:id")
    WorkerModel update(String firstName, String lastName, String number, String password, String photo ,Long id);

    @Modifying
    @Query(value = "update Worker set isActive=:isActive  where id=:id ")
    void deleteAndUpdate(IsActive isActive,Long id);

    //todo this way is not true must make pagination
    @Query("select w from Worker w where w.isActive = ?1")
    List<Worker> findAllByIsActive(IsActive isActive);


}
