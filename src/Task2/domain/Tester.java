package Task2.domain;

public class Tester {
    private String name;
    private String surName;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surName, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surName = surName;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surName, int expirienceInYears, String englishLevel){
        this(name, surName, expirienceInYears, englishLevel, 0);
    }
    public Tester(String name, String surName, String englishLevel){
        this(name, surName, 0, englishLevel, 0);
    }

    public void printTesterInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surName);
        System.out.println("Experience in years: " + expirienceInYears);
        System.out.println("English level: " + englishLevel);
        System.out.println("Salary: " + salary);
    }

    public boolean isExperienced() {
        return expirienceInYears > 3;
    }

    public double calculateSalary(){
        return salary;
    }
    public double calculateSalary(double bonus) {
        return salary + bonus;
    }
    public double calculateSalary(double bonus, double premiya){
        return  salary + bonus + premiya;
    }

    public static String getTesterLevel(int expirienceInYears) {
        if (expirienceInYears < 1) {
            return "Junior Tester";
        } else if (expirienceInYears < 4) {
            return "Middle Tester";
        } else {
            return "Senior Tester";
        }
    }
}
