package PatikaJava;

class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary <= 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public int bonus(){
        if (workHours > 40) {
            int extra = (workHours-40) * 30;
            return extra;
        }
        return 0;
    }

    public double raiseSalary(){
        int yil = 2021 - hireYear;
        double zam = 0.0;
        if (yil < 10){
            zam = salary*0.05;
        } else if (yil >= 10 && yil < 20){
            zam = salary*0.1;
        } else if (yil >= 20) {
            zam = salary*0.15;
        }
        return zam;
    }

    @Override
    public String toString() {
        return "Adı : " + name 
        + "\nMaaşı : " + salary 
        + "\nÇalışma saati : " + workHours 
        + "\nBaşlangıç yılı : " + hireYear 
        + "\nVergi : " + tax()
        + "\nBonus : " + bonus()
        + "\nMaaş artışı : " + raiseSalary()
        + "\nVergi ve Bonuslar ile birlikte maaş : "  + (salary + bonus() - tax())
        + "\nToplam maaş : " + (salary + raiseSalary());
    }

}

public class Patika39 {
    public static void main(String[] args) {
        Employee employee = new Employee("Darwin", 2000, 45, 1985);
        System.out.println(employee);
    }
}
