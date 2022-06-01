package com.example.payroll;

import static com.sun.tools.javac.main.Option.X;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
    }
}