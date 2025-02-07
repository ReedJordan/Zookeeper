import java.util.Scanner;
import java.util.ArrayList;

/*
* Zookeeper Project, tasks 5
* 1/7/2025
* @ Reed Jordan
* AP Comp Sci A w/ Mr. Smith, Period 4
*/

public class Zookeeping{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Habitat> habitats = new ArrayList<Habitat>();

        Habitat penguin = new Habitat("Penguin-1", "2:33", 22, "penguin.txt");
        habitats.add(penguin);
        penguin.printFile();

    }
}
