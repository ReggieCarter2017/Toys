import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Functions f = new Functions();
        Toy car = new Toy("0","Car", "This toy sucks", 5, 50);
        Toy doll = new Toy("1","Doll", "This toy sucks", 7, 14);
        Toy pistol = new Toy("2","Pistol", "This toy sucks", 14, 70);
        Toy nutracker = new Toy("3","Nutracker", "This toy sucks", 2, 5);

        Scanner sc = new Scanner(System.in);
        int sf = sc.nextInt();
        f.addToy(car);
        f.addToy(doll);
        f.addToy(pistol);
        f.addToy(nutracker);


        f.showInfo();

    }
}