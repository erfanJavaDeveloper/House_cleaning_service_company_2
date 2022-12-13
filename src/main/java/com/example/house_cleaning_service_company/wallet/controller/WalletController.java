package com.example.house_cleaning_service_company.wallet.controller;

import com.example.house_cleaning_service_company.wallet.domain.Wallet;
import com.example.house_cleaning_service_company.wallet.model.WalletModel;
import com.example.house_cleaning_service_company.wallet.model.WalletModelUpdate;
import com.example.house_cleaning_service_company.wallet.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping
    public WalletModel save(WalletModel walletModel) {
        return walletService.save(walletModel);
    }

    @GetMapping
    public Wallet findById(Long id) {
        return walletService.findById(id);
    }

    @PutMapping
    public WalletModelUpdate updateAmount(WalletModelUpdate walletModelUpdate) {
        walletService.updateAmount(walletModelUpdate);
        return walletModelUpdate;
    }


}