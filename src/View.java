import java.util.Scanner;

public class View {

    public void startProgram()
    {
        Scanner sc = new Scanner(System.in);
        Functions f = new Functions();
        while (true)
        {
            System.out.println("1. Add a toy.\n2. Delete a toy. \n3. Show the information about all toys.\n" +
                    "4. Change the value of a toy. \n5. Start prize draw.\n6. Show the prize pool.\n7. Give prize to the customer.");
            switch (sc.next())
            {
                case "1" ->
                {
                    System.out.println("ID: ");
                    String id = sc.next();
                    if (f.checkID(id))
                    {
                        System.out.println("Enter name, commentary, number, and value of the toy: ");
                        Toy a = new Toy(id, sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
                        f.addToy(a);
                    }
                    else
                        System.out.println("Invalid index. Try another one.");
                }
                case "2" ->
                {
                    if (!f.toys.isEmpty())
                    {
                        f.showInfo();
                        System.out.println("Enter an ID of a toy to delete it: ");
                        String id = sc.next();
                        f.deleteAToy(f.findByID(id));
                    }
                    else
                        System.out.println("There are no toys.");
                }
                case "3" -> f.showInfo();
                case "4" ->
                {
                    f.showInfo();
                    System.out.println("Enter ID of a toy to change its value: ");
                    String id = sc.next();
                    System.out.println("New value: ");
                    f.findByID(id).setValue(sc.nextInt());
                }
                case "5" -> f.input();
                case "6" -> f.showPrizePool();
                case "7" -> f.giveToys();
                default ->
                    System.out.println("No such choice.");
            }
        }
    }


}
