package com.ms_movements.repository;

import com.ms_movements.model.Deposit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends ReactiveMongoRepository<Deposit,Long> {

}
