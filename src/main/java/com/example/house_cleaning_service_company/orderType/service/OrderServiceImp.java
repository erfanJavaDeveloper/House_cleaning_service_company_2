package com.example.house_cleaning_service_company.orderType.service;

import com.example.house_cleaning_service_company.Worker2Order.model.Worker2OrderModel;
import com.example.house_cleaning_service_company.Worker2Order.service.Worker2OrderService;
import com.example.house_cleaning_service_company.mapStructMapper.MapStructMapper;
import com.example.house_cleaning_service_company.orderType.dao.OrderDao;
import com.example.house_cleaning_service_company.orderType.dao.WalletInt;
import com.example.house_cleaning_service_company.orderType.domain.OrderType;
import com.example.house_cleaning_service_company.orderType.domain.StateOfOrder;
import com.example.house_cleaning_service_company.orderType.model.OrderModel;
import com.example.house_cleaning_service_company.wallet.dao.WalletDao;
import com.example.house_cleaning_service_company.wallet.domain.Wallet;
import com.example.house_cleaning_service_company.worker.dao.WorkerDao;
import com.example.house_cleaning_service_company.worker.domain.IsActive;
import com.example.house_cleaning_service_company.worker.domain.Worker;
import com.example.house_cleaning_service_company.worker.model.WorkerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private MapStructMapper mapStructMapper;

    @Autowired
    private WorkerDao workerDao;

    @Autowired
    private Worker2OrderService worker2OrderService;

    @Autowired
    private WalletDao walletDao;

    public OrderModel save(OrderModel orderModel) {
        OrderType save = orderDao.save(mapStructMapper.convertOrderModelToOrderTypeDomain(orderModel));
        return mapStructMapper.convertOrderTypeDomainToOrderModel(save);
    }

    public OrderModel view(Long id) {
        OrderType orderType = orderDao.findById(id).orElseThrow(RuntimeException::new);
        return mapStructMapper.convertOrderTypeDomainToOrderModel(orderType);
    }

    public OrderModel delete(Long id) {
        OrderType orderType = orderDao.findById(id).get();
        orderDao.delete(orderType);

        return mapStructMapper.convertOrderTypeDomainToOrderModel(orderType);

    }

    public OrderModel update(OrderModel orderModel) {
        orderDao.update(orderModel.getDateDelivery(), orderModel.getTimeDelivery(), orderModel.getDateOfOrder(), orderModel.getTimeOfOrder(), orderModel.getEmployerId(), orderModel.getSumOfAmount(), orderModel.getTypeOfServiceId(), orderModel.getId());
        return orderModel;
    }


    //todo this method not complete so must use pagination
    @Override
    public List<WorkerModel> viewAllWorkerModelsAreActive() {
        List<WorkerModel> workerModels = new ArrayList<>();
        for (Worker worker : workerDao.findAllByIsActive(IsActive.ACTIVE)) {
            workerModels.add(mapStructMapper.convertWorkerDomainToWorkerModel(worker));
        }
        return workerModels;
    }

    //todo  this method can register order and    worker2orderModel   to database
    public void registeringTheOrderToTheWorker(Long workerId, OrderModel orderModelInput) {

        OrderModel save = save(orderModelInput);

        Worker2OrderModel worker2OrderModel = new Worker2OrderModel();
        worker2OrderModel.setWorkerId(workerId);
        worker2OrderModel.setOrderId(save.getId());


        worker2OrderService.save(worker2OrderModel);

    }

    public void pay(Long orderId) {
        OrderType view = orderDao.findById(orderId).orElseThrow(RuntimeException::new);
        WalletInt wallet = orderDao.findWalletByOrderId(orderId);

        Wallet w = new Wallet();
        w.setAmount(wallet.getAmount());
        w.setId(wallet.getId());
        w.setEmployerId(wallet.getFk_employer());

        w.setAmount(   wallet.getAmount() - view.getSumOfAmount() );
        view.setStateOfOrder(StateOfOrder.PAYMENT_IS_DONE);

//        orderDao.save(mapStructMapper.convertOrderModelToOrderTypeDomain(view));
        orderDao.save(view);
        walletDao.save(w);
    }

}