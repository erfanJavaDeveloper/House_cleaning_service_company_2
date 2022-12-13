package com.example.house_cleaning_service_company.worker.service;

import com.example.house_cleaning_service_company.mapStructMapper.MapStructMapper;
import com.example.house_cleaning_service_company.worker.dao.WorkerDao;
import com.example.house_cleaning_service_company.worker.domain.Worker;
import com.example.house_cleaning_service_company.worker.model.WorkerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
    @Autowired
    private WorkerDao workerDao;

    @Autowired
    private MapStructMapper mapStructMapper;

    public WorkerModel save(WorkerModel workerModel) {
        workerDao.save(mapStructMapper.convertWorkerModelToDomain(workerModel));
        return workerModel;
    }

    public WorkerModel findById(Long id) {
        return mapStructMapper.convertWorkerDomainToWorkerModel(workerDao.findById(id).orElseThrow(RuntimeException::new));
    }

    public WorkerModel update(WorkerModel workerModel) {
        return workerDao.update(workerModel.getFirstName(), workerModel.getLastName(), workerModel.getNumber(), workerModel.getPassword(), workerModel.getPhoto(), workerModel.getId());
    }

    public void delete(Long id){
        Worker worker = mapStructMapper.convertWorkerModelToDomain(findById(id));
        workerDao.deleteAndUpdate(worker.getIsActive(),worker.getId());
    }


}