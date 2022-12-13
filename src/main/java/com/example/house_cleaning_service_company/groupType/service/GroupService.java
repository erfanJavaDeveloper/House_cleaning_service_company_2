package com.example.house_cleaning_service_company.groupType.service;

import com.example.house_cleaning_service_company.groupType.dao.GroupDao;
import com.example.house_cleaning_service_company.groupType.domain.GroupType;
import com.example.house_cleaning_service_company.groupType.model.GroupModel;
import com.example.house_cleaning_service_company.mapStructMapper.MapStructMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GroupService {
    @Autowired
    private GroupDao groupDao;

    @Autowired
    private MapStructMapper mapStructMapper;


    public GroupModel save(GroupModel groupModel){
        GroupType save = groupDao.save(mapStructMapper.convertGroupModelToGroupTypeDomain(groupModel));
        return mapStructMapper.convertGroupTypeDomainToGroupModel(save);
    }

    public GroupModel view(Long id){
        GroupType groupType = groupDao.findById(id).get();
        return mapStructMapper.convertGroupTypeDomainToGroupModel(groupType);
    }

    public GroupModel delete(Long id){
        GroupType groupType = groupDao.findById(id).get();
        groupDao.delete(groupType);
        return mapStructMapper.convertGroupTypeDomainToGroupModel(groupType);

    }

    public GroupModel update(GroupModel groupModel){
        groupDao.update(groupModel.getCode(),groupModel.getTitle(),groupModel.getId());
        return groupModel;
    }

}
