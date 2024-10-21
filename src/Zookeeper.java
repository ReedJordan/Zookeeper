import java.util.Random;
import java.util.Scanner;
import java.io.File;

/*
* Zookeeper Project, tasks 3 and 4
*
* @ Reed Jordan
* AP Comp Sci A w/ Mr. Smith, Period 4
*/

public class Zookeeper{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number for the animal you want to view: "+
                "\n1: Penguin \n2: Spider \n3: Bat \n4: Lion \n \n> ");

        int aniNumber = input.nextInt();
        
        Random rand = new Random();
        double temp = rand.nextDouble(0,100);
        
        String aniType = null;
        
        switch (aniNumber){
            case 1: aniType = "Penguin"; break;
            case 2: aniType = "Spider"; break;
            case 3: aniType = "Bat"; break;
            case 4: aniType = "Lion"; break;
        }
        if (aniNumber == -1){
            System.exit(0);
        }
        
        
        System.out.println("\nSwitching cameras...");
        System.out.println("Animal Type: "+ aniType);
        System.out.printf("Habitat Temperature: %.2f", temp);
        System.out.println("F\n");

        if (aniType.equals("Penguin")){
            File file = new File("penguin.txt");
            try{
                Scanner fr = new Scanner(file);
                while(fr.hasNextLine()){
                    String i = fr.nextLine();
                    System.out.println(i);
                }
            } catch (Exception e){
                System.out.println("No file");
            }
        }
        
        if (aniType.equals("Spider")){
            File file = new File("spider.txt");
            try{
                Scanner fr = new Scanner(file);
                while(fr.hasNextLine()){
                    String i = fr.nextLine();
                    System.out.println(i);
                }
            } catch (Exception e){
                System.out.println("No file");
            }
        }
        
        if (aniType.equals("Bat")){
            File file = new File("bat.txt");
            try{
                Scanner fr = new Scanner(file);
                while(fr.hasNextLine()){
                    String i = fr.nextLine();
                    System.out.println(i);
                }
            } catch (Exception e){
                System.out.println("No file");
            }
        }
        
        if (aniType.equals("Lion")){
            File file = new File("lion.txt");
            try{
                Scanner fr = new Scanner(file);
                while(fr.hasNextLine()){
                    String i = fr.nextLine();
                    System.out.println(i);
                }
            } catch (Exception e){
                System.out.println("No file");
            }
        }
        
        
        
        
        System.out.println("\n\nWow, what a cute "+ aniType +".");
        System.out.println("To view another animal, please restart the watcher."+
        "\nTo quit, enter the value -1");
        
    }
}
