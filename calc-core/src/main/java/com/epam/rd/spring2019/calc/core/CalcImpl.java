package com.epam.rd.spring2019.calc.core;

import com.epam.rd.spring2019.calc.interfaces.Calc;

public class CalcImpl implements Calc
{

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b ;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if(b != 0)
        {
        }
        return 0;
    }
}
