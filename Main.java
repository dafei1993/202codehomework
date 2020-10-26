package com.company;

public class Main {
    public static void main(String[] args) {
        MachineQuarter gumballMachine25 = new MachineQuarter(2,1);
        MachineTwoQuarter gumballMachine50 = new MachineTwoQuarter(2, 2);
        MachineMix gumballMachineMix = new MachineMix(2, 3);

        System.out.println("25 Machine: ");
        gumballMachine25.insertQuarter(25);
        gumballMachine25.turnCrank();
        gumballMachine25.insertQuarter(25);
        gumballMachine25.turnCrank();
        gumballMachine25.insertQuarter(25);
        gumballMachine25.turnCrank();

        System.out.println("");
        System.out.println("50 Machine: ");
        gumballMachine50.insertQuarter(25);
        gumballMachine50.insertQuarter(25);
        gumballMachine50.turnCrank();
        gumballMachine50.insertQuarter(25);
        gumballMachine50.insertQuarter(10);
        gumballMachine50.turnCrank();

        System.out.println("");
        System.out.println("Mix Machine: ");
        gumballMachineMix.insertQuarter(25);
        gumballMachineMix.insertQuarter(10);
        gumballMachineMix.insertQuarter(10);
        gumballMachineMix.insertQuarter(5);
        gumballMachineMix.turnCrank();
        gumballMachineMix.insertQuarter(25);
        gumballMachineMix.insertQuarter(10);
        gumballMachineMix.turnCrank();
    }
}
