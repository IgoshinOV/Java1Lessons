package com.geekbrains.lesson5;

public class HomeWorkApp5 {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312000",
                30000, 24);
        employeesArray[1] = new Employee("Kuznecov Viktor", "Engineer", "Viktor@mailbox.com", "892312111",
                35000, 27);
        employeesArray[2] = new Employee("Steponov Sergey", "Engineer", "Sergey@mailbox.com", "892312222",
                40003, 33);
        employeesArray[3] = new Employee("Mironov Aleksey", "Engineer", "Aleksey@mailbox.com", "892312333",
                55000, 55);
        employeesArray[4] = new Employee("Dudochkin Nikolay", "Engineer", "Nikolay@mailbox.com", "892312444",
                900000, 60);

        employeeSelection(employeesArray);
    }

    public static void employeeSelection(Employee[] employeesArray) {
        for (Employee employee : employeesArray) {
            if (employee.getAge() > 40) {
                employee.employeesOverForty();
            }
        }
    }
}
