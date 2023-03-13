package com.ms_movements.service.impl;

import com.ms_movements.model.Customers;
import com.ms_movements.model.Deposit;
import com.ms_movements.repository.DepositRepository;
import com.ms_movements.service.DepositService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.*;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class DepositServiceImpl implements DepositService {

    @Autowired
    private DepositRepository depositRepository;

    @Override
    public Flux<Deposit> findDeposit() {
        log.info("Mostrando todos los Deposits");
        return depositRepository.findAll();
    }

    @Override
    public Mono<Deposit> findDepositById(Long id) {
        log.info("Deposit ID = " + id);
        return depositRepository.findById(id);
    }

    @Override
    public Mono<Deposit> createDeposit(Deposit deposit) {
        log.info("Creando Deposit");
        return depositRepository.save(deposit);
    }

    @Override
    public Mono<Deposit> updateDeposit(Deposit deposit) {
        log.info("Actualizando Deposit");
        return depositRepository.save(deposit);
    }

    private final WebClient.Builder webClientBuilder = WebClient.builder();

    @Override
    public Mono<Customers> findCustomersById(Long idCustomers){
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8084/customers/id/{idCustomers}", idCustomers)
                .retrieve()
                .bodyToMono(Customers.class);
    }

}
