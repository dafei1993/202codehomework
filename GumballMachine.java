package com.company;


public class GumballMachine {
    State soldOutState;
    State soldState;
    State noQuarterState;
    State hasQuarterState;

    State state;
    int coin;
    int type;
    int count;
    int totalCoin = 0;

    public GumballMachine(int numberGumballs, int machine) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        count = numberGumballs;
        if(numberGumballs > 0)
            this.state = noQuarterState;
        type = machine;
    }

    public void insertQuarter(int coin) {
        if(type == 1 && coin == 25) {
            state.insertQuarter(coin);
        }
        if(type == 2 && coin == 25) {
            totalCoin += coin;
            if(totalCoin == 50)
                state.insertQuarter(coin);
        }
        if(type == 3 && (coin == 25 || coin == 10 || coin == 5 || coin == 1)){
            totalCoin += coin;
            if(totalCoin == 50)
                state.insertQuarter(coin);
        }
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        System.out.println("turn Crank!");
        state.dispense();
    }

    public void setState (State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getsoldOutState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }
}