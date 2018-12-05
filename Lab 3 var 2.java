public abstract class Dog {
    private String dogName;
    private int age;
    private double holkaHigh;
    private String haircolor;

    public String getDogName() {
        return dogName;
    }

    ;

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getAge() {
        return age;
    }

    ;

    public void setAge(int age) {
        this.age = age;
    }

    public double getHolkaHigh() {
        return holkaHigh;
    }

    ;

    public void setHolkaHigh(double holkaHigh) {
        this.holkaHigh = holkaHigh;
    }

    public String getHaircolor() {
        return haircolor;
    }

    ;

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String toString() {
        return getDogName() + "Age:" + getAge() + "HolkaHigh:" + getHolkaHigh() + "HairColor:" + getHaircolor();
    }

    public abstract void displayDogsPasport();

    public abstract boolean checkOkras();

    public boolean checkOkras(String[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (getHaircolor().equalsIgnoreCase(array[i])) {
                result = true;
                break;
            }
        }
        return result;
    }
}

public class Labrador extends Dog {

    @Override
    public void displayDogsPasport() {

        System.out.println("Labrador" + toString());
    }

    @Override
    public boolean checkOkras() {
        String[] okrasy = {"Шоколадный", "Черный", "Желтый"};
        return checkOkras(okrasy);
    }
}

public class Ovcharka extends Dog {
    @Override
    public void displayDogsPasport() {
        System.out.println("Ovcharka " + toString());
    }

    @Override
    public boolean checkOkras() {
        String[] checkocras = {"Белая", "Чепрачная", "Рыжая"};
        return checkOkras(checkocras);

    }
}

public class Vystavka {
    public static void main(String[] args) {
        Labrador petya = new Labrador();
        petya.setDogName("Адам");
        petya.setAge(5);
        petya.setHolkaHigh(65.0);
        petya.setHaircolor("Шоколадный");
        System.out.println(petya.checkOkras());
        petya.displayDogsPasport();

        Ovcharka masha = new Ovcharka();
        masha.setDogName("Генда");
        masha.setAge(5);
        masha.setHolkaHigh(60.0);
        masha.setHaircolor("Красный");
        System.out.println(masha.checkOkras());
        masha.displayDogsPasport();
    }
}
