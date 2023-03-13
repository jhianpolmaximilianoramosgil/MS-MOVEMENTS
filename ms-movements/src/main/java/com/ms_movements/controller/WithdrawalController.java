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
    public Flux<Withdrawal> findWithdrawal() {
        return withdrawalService.findWithdrawal();
    }

    @GetMapping("/id/{id}")
    public Mono<Withdrawal> findWithdrawalById(@PathVariable Long id) {
        return withdrawalService.findWithdrawalById(id);
    }

    @PostMapping
    public Mono<Withdrawal> createWithdrawal(@RequestBody Withdrawal withdrawal) {
        return withdrawalService.createWithdrawal(withdrawal);
    }


}
