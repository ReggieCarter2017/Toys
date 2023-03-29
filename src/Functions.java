import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Functions extends Toy implements showInfo, addAToy, deleteToy {
    List<Toy> toys;
    List<Toy> prizePool;
    List<Integer> luckyValues;
    Random rn = new Random();
    Scanner sc = new Scanner(System.in);

    public Boolean checkIfWin(Integer val)
    {
        double temp = (double)val * 0.01;
        int rand = (Math.random()<temp)?0:1;
        return rand == 1;
    }

    public Boolean checkID(String ID)
    {
        for (Toy c : toys)
        {
            if (ID.equals(c.getID()))
                return false;
        }
        return true;
    }

    public void input()
    {
        System.out.println("Type any key to start: ");
        String temp = sc.next();
        for (Toy c : toys)
        {
            if (checkIfWin(c.getValue()))
            {
                prizePool.add(c);
                int new_count = c.getNumOfToys() - 1;
                c.setNumOfToys(new_count);
                System.out.printf("You win a %s!", c.getName());
            }
        }
    }

    public void giveToys()
    {
        System.out.println("The toy was given to the winner!");
        prizePool.remove(prizePool.size() - 1);

    }

    @Override
    public void viewInfo() {
        System.out.printf("ID: %s\nName: %s\nNumber of toys left: %s\nValue: %s\nCommentary: %s\n",
                getID(), getName(), getNumOfToys(), getValue(), getComment());
    }


    public Functions()
    {
        toys = new ArrayList<Toy>();
        prizePool = new ArrayList<Toy>();
    }



    @Override
    public void addToy(Toy n) {
        {
            if (!toys.contains(n)) toys.add(n);
        }
    }

    @Override
    public void deleteAToy(Toy n) {
        if (toys.contains(n)) toys.remove(n);
    }

    public void showInfo() {
        for (Toy s : toys)
            System.out.printf("ID: %s\nName: %s\nNumber of toys left: %s\nValue of a toy: %s\nCommentary: %s\n\n",
                    s.getID(), s.getName(), s.getNumOfToys(), s.getValue(), s.getComment());
    }
}
