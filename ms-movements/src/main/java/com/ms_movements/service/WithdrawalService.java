package com.ms_movements.service;

import com.ms_movements.model.Withdrawal;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;

@Service
public interface WithdrawalService {

    Flux<Withdrawal> findWithdrawal();

    Mono<Withdrawal> findWithdrawalById(Long id);

    Mono<Withdrawal> createWithdrawal(Withdrawal withdrawal);

    Mono<Withdrawal> updateWithdrawal(Withdrawal withdrawal);

}
