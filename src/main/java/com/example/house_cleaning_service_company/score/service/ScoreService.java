package com.example.house_cleaning_service_company.score.service;

import com.example.house_cleaning_service_company.mapStructMapper.MapStructMapper;
import com.example.house_cleaning_service_company.score.dao.ScoreDao;
import com.example.house_cleaning_service_company.score.domain.Score;
import com.example.house_cleaning_service_company.score.model.ScoreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    @Autowired
    private MapStructMapper mapStructMapper;


    public ScoreModel save(ScoreModel scoreModel){
      return mapStructMapper.convertScoreDomainToScoreModel( scoreDao.save(mapStructMapper.convertScoreModelToScoreDomain(scoreModel)) );
    }

    public ScoreModel view(Long id){
       return  mapStructMapper.convertScoreDomainToScoreModel(scoreDao.findById(id).get());
    }


    //todo don't need that
    private void update(ScoreModel scoreModel){
        scoreDao.update(scoreModel.getEmployerId(),scoreModel.getOrderId(),scoreModel.getWorkerScore(),scoreModel.getId());
    }



}
