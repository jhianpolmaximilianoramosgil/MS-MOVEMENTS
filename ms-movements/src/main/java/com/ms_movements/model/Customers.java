package com.ms_movements.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customers {

    @Id private Long id;
    //@Id
    //private String id = UUID.randomUUID().toString().substring(0, 10);
    @NotEmpty(message="El nombre no debe estar vacio")
    private String  name;
    @NotEmpty(message="El apellido no debe estar vacio")
    private String  lastname;
    private String  dni;
    private String  cellphone;
    private String address;
    private String ruc;
    private String companyName;
    private String type;
    private boolean status;
}
