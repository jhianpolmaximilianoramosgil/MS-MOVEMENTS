package com.ms_movements.repository;

import com.ms_movements.model.Withdrawal;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WithdrawalRepository extends ReactiveMongoRepository<Withdrawal,Long> {
}
