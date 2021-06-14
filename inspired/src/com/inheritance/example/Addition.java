package com.inheritance.example;

public  class Addition implements interaction,Inter23{

    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public float add(float a,float b){
        return a+b;
    }

    @Override
    public int add() {
        return 0;
    }

    @Override
    public int def() {
        return 0;
    }
}
