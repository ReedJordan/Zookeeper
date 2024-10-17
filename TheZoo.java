import java.util.Random;
import java.time.LocalTime;
import java.util.Scanner;
import java.io.File;

/*
* Zookeeping Project, parts 1 and 2
*
* @ Reed Jordan
* AP Comp Sci A w/ Mr. Smith, Period 4
*/

public class Zookeeper{
    public static void main (String[] args){
        
        String aniType = "Pengiun";
        
        Random rand = new Random();
        double temp = rand.nextDouble();
        int temp1 = rand.nextInt(100);
        double fullTemp = temp + temp1;
        
        LocalTime currentTime = LocalTime.now();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Animal Type: "+ aniType);
        System.out.println("Current Time: "+ currentTime);
        System.out.printf("Habitat Temperature: %.2f"+ fullTemp +"F");
        
        System.out.println("Do you want to see the "+ aniType +"s?");
        String aniAns = input.nextLine();
        System.out.println("Here you go!");
        System.out.println("");
        
        File file = new File("penguin.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("The animal has escaped. No file found.");
        }
        
        System.out.println("\n Wow, what a cute "+ aniType +".");
    }
}
