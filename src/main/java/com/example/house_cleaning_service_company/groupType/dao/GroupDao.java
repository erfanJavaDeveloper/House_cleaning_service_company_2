package com.example.house_cleaning_service_company.groupType.dao;

import com.example.house_cleaning_service_company.groupType.domain.GroupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GroupDao extends JpaRepository<GroupType,Long> {

//    @Modifying
//    @Query(value = "update GroupType  set code=:code  ,title=:title  where id=:id " )
//    void update(Long code, String title, Long id);

    @Modifying
    @Query(name = "GroupType.update" )
    void update(Long code, String title, Long id);
}
