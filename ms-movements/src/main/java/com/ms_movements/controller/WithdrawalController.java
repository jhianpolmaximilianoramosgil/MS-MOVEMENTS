package com.ms_movements.controller;

import com.ms_movements.model.Withdrawal;
import com.ms_movements.service.WithdrawalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

@RestController
@RequestMapping("/withdrawal")
public class WithdrawalController {

    @Autowired
    private WithdrawalService withdrawalService;

    @GetMapping
    public Flux<Withdrawal> findCustomers() {
        return withdrawalService.findWithdrawal();
    }

    @GetMapping("/id/{id}")
    public Mono<Withdrawal> findCustomersById(@PathVariable Long id) {
        return withdrawalService.findWithdrawalById(id);
    }

    @PostMapping
    public Mono<Withdrawal> createCustomers(@RequestBody Withdrawal withdrawal) {
        return withdrawalService.createWithdrawal(withdrawal);
    }

}
