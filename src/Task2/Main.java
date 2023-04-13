package Task2;

import Task2.domain.Tester;

public class Main {
    public static void main(String[] args) {
        String testerLevel = Tester.getTesterLevel(2);
        System.out.println(testerLevel);
        testerLevel = Tester.getTesterLevel(0);
        System.out.println(testerLevel);
        testerLevel = Tester.getTesterLevel(5);
        System.out.println(testerLevel);

        Tester tester = new Tester("Adam", "Clarence", 10, "C1", 6700);
        Tester tester1 = new Tester("Andrew", "AntaCow", 2, "B2");
        Tester tester2 = new Tester("Vlad", "Sholtun", "A2");
        System.out.println();
        tester.printTesterInfo();
        System.out.println();
        tester1.printTesterInfo();
        System.out.println();
        tester2.printTesterInfo();
    }
}
