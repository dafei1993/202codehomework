package com.company;

interface State {
    void insertQuarter(int coin);
    void ejectQuarter();
    void turnCrank();
    void dispense();
}