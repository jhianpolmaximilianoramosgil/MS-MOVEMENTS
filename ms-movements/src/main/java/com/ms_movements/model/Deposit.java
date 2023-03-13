package com.ms_movements.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "movements")
public class Deposit {

    @Id private Long id;
    private String accountInCharge;
    private String typeOfDeposit;
    private String accountNumber;
    private String interbankCode;
    private Double amount;
    private String date;
}
