package com.example.house_cleaning_service_company.employer.dao;

import com.example.house_cleaning_service_company.employer.domain.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface EmployerDao extends JpaRepository<Employer, Long> {

    //    @Query(value = "update employer em set em.first_name=:firstName  ,em.last_name=:lastName ,em.number=:number ,em.password=:password ,em.username=:username  where em .id  =:id ", nativeQuery = true)
//    @Query(value = "update Employer set firstName=?1  ,lastName=?2  ,number=?3  ,password=?4  ,username=?5  where id=?6 ")
    @Modifying
    @Query(value = "update Employer  set firstName=:firstName  ,lastName=:lastName  ,number=:number  ,password=:password  ,username=:username  where id=:id " )
    void update(String firstName, String lastName, String number, String password, String username, Long id);
//    void update(@Param("firstName") String firstName ,@Param("lastName")  String lastName ,@Param("number")  String number ,@Param("password")  String password ,@Param("username")  String username ,@Param("id")  Long id );


}

