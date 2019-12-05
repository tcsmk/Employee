package com.employee.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String postCode;
    private String firstLine;
    private String secondLine;

    public Address() {

    }
}
