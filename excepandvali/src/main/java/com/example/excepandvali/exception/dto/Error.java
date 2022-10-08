package com.example.excepandvali.exception.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Error {

    private String field;
    private String message;
    private String invalidValue;

}