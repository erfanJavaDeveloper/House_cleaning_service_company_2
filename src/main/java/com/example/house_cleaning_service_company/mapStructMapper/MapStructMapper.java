package com.example.house_cleaning_service_company.mapStructMapper;

import com.example.house_cleaning_service_company.TypeOfService.domain.ServiceOfCompany;
import com.example.house_cleaning_service_company.TypeOfService.model.ServiceOfCompanyModel;
import com.example.house_cleaning_service_company.employer.domain.Employer;
import com.example.house_cleaning_service_company.employer.model.EmployerModel;
import com.example.house_cleaning_service_company.groupType.domain.GroupType;
import com.example.house_cleaning_service_company.groupType.model.GroupModel;
import com.example.house_cleaning_service_company.orderType.domain.OrderType;
import com.example.house_cleaning_service_company.orderType.model.OrderModel;
import com.example.house_cleaning_service_company.score.domain.Score;
import com.example.house_cleaning_service_company.score.model.ScoreModel;
import com.example.house_cleaning_service_company.worker.domain.Worker;
import com.example.house_cleaning_service_company.worker.model.WorkerModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    EmployerModel convertEmployerDomainToEmployerModel(Employer employer);
    Employer convertEmployerModelToEmployerDomain(EmployerModel employerModel);

    GroupType convertGroupModelToGroupTypeDomain(GroupModel groupModel);
    GroupModel convertGroupTypeDomainToGroupModel(GroupType groupType);

    OrderModel convertOrderTypeDomainToOrderModel(OrderType orderType);
    OrderType convertOrderModelToOrderTypeDomain(OrderModel orderModel);

    Score convertScoreModelToScoreDomain(ScoreModel scoreModel);
    ScoreModel convertScoreDomainToScoreModel(Score score);

    ServiceOfCompanyModel convertServiceDomainToServiceModel(ServiceOfCompany typeOfService);
    ServiceOfCompany convertServiceModelToServiceDomain(ServiceOfCompanyModel ServiceOfCompany);

    WorkerModel convertWorkerDomainToWorkerModel(Worker worker);
    Worker convertWorkerModelToDomain(WorkerModel workerModel);

}