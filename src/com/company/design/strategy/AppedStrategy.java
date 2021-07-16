package com.company.design.strategy;

public class AppedStrategy implements  EncodingStrategy{
    @Override
    public String encode(String text) {
        return "ABCD"+text;
    }
}
