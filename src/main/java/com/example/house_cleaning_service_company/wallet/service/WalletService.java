package com.example.house_cleaning_service_company.wallet.service;

import com.example.house_cleaning_service_company.wallet.dao.WalletDao;
import com.example.house_cleaning_service_company.wallet.domain.Wallet;
import com.example.house_cleaning_service_company.wallet.model.WalletModel;
import com.example.house_cleaning_service_company.wallet.model.WalletModelUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {
    @Autowired
    private WalletDao walletDao;

    public WalletModel save(WalletModel walletModel) {
        return convertDomainToModel(walletDao.save(convertModelToDomain(walletModel)));
    }

    public Wallet findById(Long id) {
        return walletDao.findById(id).orElseThrow(RuntimeException::new);
    }

    public WalletModelUpdate updateAmount(WalletModelUpdate walletModelUpdate) {
         walletDao.update(walletModelUpdate.getAmount(), walletModelUpdate.getEmployerId());
        return walletModelUpdate;
    }


    public Wallet convertModelToDomain(WalletModel walletModel) {
        Wallet wallet = new Wallet();
        wallet.setAmount(walletModel.getAmount());
        wallet.setEmployerId(walletModel.getEmployerId());
        wallet.setId(walletModel.getId());

        return wallet;

    }

    public WalletModel convertDomainToModel(Wallet wallet) {
        WalletModel walletModel = new WalletModel();
        walletModel.setAmount(wallet.getAmount());
        walletModel.setEmployerId(wallet.getEmployerId());
        walletModel.setId(wallet.getId());

        return walletModel;

    }

}