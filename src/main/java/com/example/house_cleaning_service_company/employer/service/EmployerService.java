package com.example.house_cleaning_service_company.employer.service;

import com.example.house_cleaning_service_company.employer.dao.EmployerDao;
import com.example.house_cleaning_service_company.employer.domain.Employer;
import com.example.house_cleaning_service_company.employer.model.EmployerModel;
import com.example.house_cleaning_service_company.mapStructMapper.MapStructMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class EmployerService {

    @Autowired
    private EmployerDao employerDao;

    @Autowired
    private MapStructMapper mapStructMapper;

    public Employer save(EmployerModel employerModel) {
        employerModel.setRegisterDate(LocalDate.now());
        employerModel.setRegisterTime(LocalDate.now());
       return employerDao.save(mapStructMapper.convertEmployerModelToEmployerDomain(employerModel));
    }


    public void delete(Long id) {
        employerDao.delete(view(id));
    }


    public void update(EmployerModel employerModel) {
        employerDao.update(employerModel.getFirstName(),employerModel.getLastName(),
                employerModel.getNumber(),employerModel.getPassword(),
                employerModel.getUsername(),employerModel.getId());
    }

    public Employer view(Long id) {
       return employerDao.findById(id).get();
    }

    public List<Employer> findAll() {
        return employerDao.findAll();
    }
}

//        employerDao.save(convertModelToDomain(employerModel));
//    private Employer convertModelToDomain(EmployerModel employerModel) {
//        Employer employer = new Employer();
//        employer.setNumber(employerModel.getNumber());
//        employer.setFirstName(employerModel.getFirstName());
//        employer.setLastName(employerModel.getLastName());
//        employer.setPassword(employerModel.getPassword());
//        employer.setUsername(employerModel.getUsername());
//
//        return employer;
//    }

