import java.util.Random;
import java.util.Scanner;

/*
* Zookeeping Project, parts 1 and 2
*
* @ Reed Jordan
* AP Comp Sci A w/ Mr. Smith, Period 4
*/

public class Zookeeper{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number for the animal you want to view: "+
                "\n1: Penguin \n2: Spider \n3: Bat \n4: Lion \n \n>");

        int aniNumber = input.nextInt();

        Random rand = new Random();
        double temp = rand.nextDouble(0,100);
        if (aniNumber == 1){

        System.out.println("Switching cameras...");
        System.out.println("Animal Type: "+ aniType);
        System.out.printf("Habitat Temperature: %.2f"+ temp +"F");

        
        File file = new File("penguin.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        }
        
        System.out.println("\n Wow, what a cute "+ aniType +".");
    }
}
