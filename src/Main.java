import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Functions f = new Functions();
        Toy car = new Toy("0","Car", "This toy sucks", 5, 80);
        Toy doll = new Toy("1","Doll", "This toy sucks", 7, 95);
        Toy pistol = new Toy("2","Pistol", "This toy sucks", 14, 72);
        Toy nutracker = new Toy("3","Nutracker", "This toy sucks", 2, 20);


        f.addToy(car);
        f.addToy(doll);
        f.addToy(pistol);
        f.addToy(nutracker);


        f.showInfo();

        f.input();
        f.input();
        f.input();
        f.input();
        f.input();




    }
}