package com.ms_movements.service;

import com.ms_movements.model.Customers;
import com.ms_movements.model.Deposit;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;

@Service
public interface DepositService {

    Flux<Deposit> findDeposit();

    Mono<Deposit> findDepositById(Long id);

    Mono<Deposit> createDeposit(Deposit deposit);

    Mono<Deposit> updateDeposit(Deposit deposit);

    Mono<Customers> findCustomersById(Long idCustomers);

}
