package com.company;

import java.lang.ref.Cleaner;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Nameable[] objectsArray = new Nameable[5];
        Car toyota = new Car();
        toyota.setName("Toyota");
        toyota.setDealer("Rubicon");
        toyota.setEngine("DVS V8");

        Employee mark = new Employee();
        mark.setName("Mark");
        mark.setSecondName("Frensis");
        mark.setSalary(100);
        mark.setPosition("Courier");

        Device IphoneX = new Device();
        IphoneX.setName("IphoneX");
        IphoneX.setDealer("Apple");
        IphoneX.setPrice(1000);
        IphoneX.setType("Smartphone");

        Employee ivan = new Employee();
        ivan.setName("Ivan");
        ivan.setSecondName("Petrov");
        ivan.setThirdhName("Ivanovich");
        ivan.setSalary(1000);
        ivan.setPosition("Cleaner");

        Device SamsungS9 = new Device();
        SamsungS9.setName("SamsungS9");
        SamsungS9.setDealer("Samsung");
        SamsungS9.setPrice(600);
        SamsungS9.setType("Smartphone");

        objectsArray[0] = toyota;
        objectsArray[1] = mark;
        objectsArray[2] = IphoneX;
        objectsArray[3] = ivan;
        objectsArray[4] = SamsungS9;

        for (int i = 0; i < objectsArray.length; i++) {
            System.out.println(objectsArray[i].getName());
        }

    }
}

package com.company;

public interface Nameable {
    String getName();
}

package com.company;

public class Car implements Nameable {
    private String name;
    private String dealer;
    private String engine;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}

package com.company;

public class Employee implements Nameable {
    private String name;
    private String secondName;
    private String thirdhName;
    private int salary;
    private String position;

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdhName() {
        return thirdhName;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setThirdhName(String thirdhName) {
        this.thirdhName = thirdhName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

package com.company;

public class Device implements Nameable {
    private String name;
    private int price;
    private String dealer;
    private String type;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDealer() {
        return dealer;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public void setType(String type) {
        this.type = type;
    }


}
