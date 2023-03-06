package com.calculator.calculator_api;

public class JsonOutput {
    private double a,b,answer;
    public JsonOutput(double a, double b, double answer){
        this.a=a;
        this.b=b;
        this.answer=answer;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getAnswer() {
        return answer;
    }
}
