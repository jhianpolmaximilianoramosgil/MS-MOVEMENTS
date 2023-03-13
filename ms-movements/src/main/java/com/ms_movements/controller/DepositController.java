package com.ms_movements.controller;

import com.ms_movements.model.Customers;
import com.ms_movements.model.Deposit;
import com.ms_movements.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

@RestController
@RequestMapping("/deposit")
public class DepositController {

    @Autowired
    private DepositService depositService;

    @GetMapping
    public Flux<Deposit> findDeposit() {
        return depositService.findDeposit();
    }

    @GetMapping("/id/{id}")
    public Mono<Deposit> findDepositById(@PathVariable Long id) {
        return depositService.findDepositById(id);
    }

    @PostMapping
    public Mono<Deposit> createDeposit(@RequestBody Deposit deposit) {
        return depositService.createDeposit(deposit);
    }



}
