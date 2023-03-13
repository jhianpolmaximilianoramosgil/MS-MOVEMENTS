package com.ms_movements.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "withdrawal")
public class Withdrawal {

    @Id private Long id;
    private String accountType;
    private String accountNumber;
    private Double amount;
    private String clue;
}
