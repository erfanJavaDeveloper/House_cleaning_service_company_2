package com.example.house_cleaning_service_company.mapStructMapper;

import com.example.house_cleaning_service_company.TypeOfService.domain.ServiceOfCompany;
import com.example.house_cleaning_service_company.TypeOfService.model.ServiceOfCompanyModel;
import com.example.house_cleaning_service_company.TypeOfService.model.ServiceOfCompanyModel.ServiceOfCompanyModelBuilder;
import com.example.house_cleaning_service_company.employer.domain.Employer;
import com.example.house_cleaning_service_company.employer.domain.Employer.EmployerBuilder;
import com.example.house_cleaning_service_company.employer.model.EmployerModel;
import com.example.house_cleaning_service_company.groupType.domain.GroupType;
import com.example.house_cleaning_service_company.groupType.domain.GroupType.GroupTypeBuilder;
import com.example.house_cleaning_service_company.groupType.model.GroupModel;
import com.example.house_cleaning_service_company.orderType.domain.OrderType;
import com.example.house_cleaning_service_company.orderType.domain.OrderType.OrderTypeBuilder;
import com.example.house_cleaning_service_company.orderType.model.OrderModel;
import com.example.house_cleaning_service_company.orderType.model.OrderModel.OrderModelBuilder;
import com.example.house_cleaning_service_company.score.domain.Score;
import com.example.house_cleaning_service_company.score.domain.Score.ScoreBuilder;
import com.example.house_cleaning_service_company.score.model.ScoreModel;
import com.example.house_cleaning_service_company.worker.domain.Worker;
import com.example.house_cleaning_service_company.worker.domain.Worker.WorkerBuilder;
import com.example.house_cleaning_service_company.worker.model.WorkerModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-19T17:01:58+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public EmployerModel convertEmployerDomainToEmployerModel(Employer employer) {
        if ( employer == null ) {
            return null;
        }

        EmployerModel employerModel = new EmployerModel();

        employerModel.setId( employer.getId() );
        employerModel.setFirstName( employer.getFirstName() );
        employerModel.setLastName( employer.getLastName() );
        employerModel.setNumber( employer.getNumber() );
        employerModel.setPassword( employer.getPassword() );
        employerModel.setUsername( employer.getUsername() );
        employerModel.setBirthDayDate( employer.getBirthDayDate() );
        employerModel.setRegisterDate( employer.getRegisterDate() );
        employerModel.setRegisterTime( employer.getRegisterTime() );

        return employerModel;
    }

    @Override
    public Employer convertEmployerModelToEmployerDomain(EmployerModel employerModel) {
        if ( employerModel == null ) {
            return null;
        }

        EmployerBuilder employer = Employer.builder();

        employer.id( employerModel.getId() );
        employer.firstName( employerModel.getFirstName() );
        employer.lastName( employerModel.getLastName() );
        employer.number( employerModel.getNumber() );
        employer.password( employerModel.getPassword() );
        employer.username( employerModel.getUsername() );
        employer.birthDayDate( employerModel.getBirthDayDate() );
        employer.registerDate( employerModel.getRegisterDate() );
        employer.registerTime( employerModel.getRegisterTime() );

        return employer.build();
    }

    @Override
    public GroupType convertGroupModelToGroupTypeDomain(GroupModel groupModel) {
        if ( groupModel == null ) {
            return null;
        }

        GroupTypeBuilder groupType = GroupType.builder();

        groupType.id( groupModel.getId() );
        groupType.title( groupModel.getTitle() );
        groupType.code( groupModel.getCode() );

        return groupType.build();
    }

    @Override
    public GroupModel convertGroupTypeDomainToGroupModel(GroupType groupType) {
        if ( groupType == null ) {
            return null;
        }

        GroupModel groupModel = new GroupModel();

        groupModel.setId( groupType.getId() );
        groupModel.setTitle( groupType.getTitle() );
        groupModel.setCode( groupType.getCode() );

        return groupModel;
    }

    @Override
    public OrderModel convertOrderTypeDomainToOrderModel(OrderType orderType) {
        if ( orderType == null ) {
            return null;
        }

        OrderModelBuilder orderModel = OrderModel.builder();

        orderModel.id( orderType.getId() );
        orderModel.typeOfServiceId( orderType.getTypeOfServiceId() );
        orderModel.employerId( orderType.getEmployerId() );
        orderModel.sumOfAmount( orderType.getSumOfAmount() );
        orderModel.timeDelivery( orderType.getTimeDelivery() );
        orderModel.dateDelivery( orderType.getDateDelivery() );
        orderModel.timeOfOrder( orderType.getTimeOfOrder() );
        orderModel.dateOfOrder( orderType.getDateOfOrder() );
        orderModel.stateOfOrder( orderType.getStateOfOrder() );

        return orderModel.build();
    }

    @Override
    public OrderType convertOrderModelToOrderTypeDomain(OrderModel orderModel) {
        if ( orderModel == null ) {
            return null;
        }

        OrderTypeBuilder orderType = OrderType.builder();

        orderType.id( orderModel.getId() );
        orderType.typeOfServiceId( orderModel.getTypeOfServiceId() );
        orderType.employerId( orderModel.getEmployerId() );
        orderType.sumOfAmount( orderModel.getSumOfAmount() );
        orderType.stateOfOrder( orderModel.getStateOfOrder() );
        orderType.timeOfOrder( orderModel.getTimeOfOrder() );
        orderType.dateOfOrder( orderModel.getDateOfOrder() );
        orderType.timeDelivery( orderModel.getTimeDelivery() );
        orderType.dateDelivery( orderModel.getDateDelivery() );

        return orderType.build();
    }

    @Override
    public Score convertScoreModelToScoreDomain(ScoreModel scoreModel) {
        if ( scoreModel == null ) {
            return null;
        }

        ScoreBuilder score = Score.builder();

        score.id( scoreModel.getId() );
        score.orderId( scoreModel.getOrderId() );
        score.employerId( scoreModel.getEmployerId() );
        score.workerScore( scoreModel.getWorkerScore() );

        return score.build();
    }

    @Override
    public ScoreModel convertScoreDomainToScoreModel(Score score) {
        if ( score == null ) {
            return null;
        }

        ScoreModel scoreModel = new ScoreModel();

        scoreModel.setId( score.getId() );
        scoreModel.setOrderId( score.getOrderId() );
        scoreModel.setEmployerId( score.getEmployerId() );
        scoreModel.setWorkerScore( score.getWorkerScore() );

        return scoreModel;
    }

    @Override
    public ServiceOfCompanyModel convertServiceDomainToServiceModel(ServiceOfCompany typeOfService) {
        if ( typeOfService == null ) {
            return null;
        }

        ServiceOfCompanyModelBuilder serviceOfCompanyModel = ServiceOfCompanyModel.builder();

        serviceOfCompanyModel.id( typeOfService.getId() );
        serviceOfCompanyModel.description( typeOfService.getDescription() );
        serviceOfCompanyModel.groupId( typeOfService.getGroupId() );

        return serviceOfCompanyModel.build();
    }

    @Override
    public ServiceOfCompany convertServiceModelToServiceDomain(ServiceOfCompanyModel ServiceOfCompany) {
        if ( ServiceOfCompany == null ) {
            return null;
        }

        ServiceOfCompany serviceOfCompany = new ServiceOfCompany();

        serviceOfCompany.setId( ServiceOfCompany.getId() );
        serviceOfCompany.setServiceName( ServiceOfCompany.getServiceName() );
        serviceOfCompany.setDescription( ServiceOfCompany.getDescription() );
        serviceOfCompany.setGroupId( ServiceOfCompany.getGroupId() );

        return serviceOfCompany;
    }

    @Override
    public WorkerModel convertWorkerDomainToWorkerModel(Worker worker) {
        if ( worker == null ) {
            return null;
        }

        WorkerModel workerModel = new WorkerModel();

        workerModel.setId( worker.getId() );
        workerModel.setFirstName( worker.getFirstName() );
        workerModel.setLastName( worker.getLastName() );
        workerModel.setPhoto( worker.getPhoto() );
        workerModel.setNumber( worker.getNumber() );
        workerModel.setPassword( worker.getPassword() );
        workerModel.setUsername( worker.getUsername() );

        return workerModel;
    }

    @Override
    public Worker convertWorkerModelToDomain(WorkerModel workerModel) {
        if ( workerModel == null ) {
            return null;
        }

        WorkerBuilder worker = Worker.builder();

        worker.id( workerModel.getId() );
        worker.firstName( workerModel.getFirstName() );
        worker.lastName( workerModel.getLastName() );
        worker.photo( workerModel.getPhoto() );
        worker.number( workerModel.getNumber() );
        worker.password( workerModel.getPassword() );
        worker.username( workerModel.getUsername() );

        return worker.build();
    }
}
