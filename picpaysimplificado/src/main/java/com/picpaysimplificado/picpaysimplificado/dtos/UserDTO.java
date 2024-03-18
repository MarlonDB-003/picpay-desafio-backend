package com.picpaysimplificado.picpaysimplificado.dtos;

import java.math.BigDecimal;

import org.hibernate.usertype.UserType;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
    
}
