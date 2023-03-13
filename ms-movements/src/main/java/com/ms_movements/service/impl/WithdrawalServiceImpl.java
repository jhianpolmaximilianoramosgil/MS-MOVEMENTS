package com.ms_movements.service.impl;

import com.ms_movements.model.Withdrawal;
import com.ms_movements.repository.WithdrawalRepository;
import com.ms_movements.service.WithdrawalService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class WithdrawalServiceImpl implements WithdrawalService {

    @Autowired
    private WithdrawalRepository withdrawalRepository;

    @Override
    public Flux<Withdrawal> findWithdrawal() {
        log.info("Mostrando todos los Withdrawals");
        return withdrawalRepository.findAll();
    }

    @Override
    public Mono<Withdrawal> findWithdrawalById(Long id) {
        log.info("Withdrawal ID = " + id);
        return withdrawalRepository.findById(id);
    }

    @Override
    public Mono<Withdrawal> createWithdrawal(Withdrawal withdrawal) {
        log.info("Creando Withdrawal");
        return withdrawalRepository.save(withdrawal);
    }

    @Override
    public Mono<Withdrawal> updateWithdrawal(Withdrawal withdrawal) {
        log.info("Actualizando Withdrawal");
        return withdrawalRepository.save(withdrawal);
    }

}
