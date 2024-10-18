import java.util.Random;
import java.util.Scanner;
import java.io.File;

/*
* Zookeeping Project, tasks 3 and 4
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
        
        if (aniNumber == 1){
            aniType = "Penguin";
        }
        if (aniNumber == 2){
            aniType = "Spider";
        }   
        if (aniNumber == 3){
            aniType = "Bat";
        }   
        if (aniNumber == 4){
            aniType = "Lion";
        }
        if (aniNumber == -1){
            System.exit(0);
        }
        if (aniNumber == 69){
            System.out.println("Nice");
            System.exit(0);
        }
        
        
        System.out.println("\nSwitching cameras...");
        System.out.println("Animal Type: "+ aniType);
        System.out.printf("Habitat Temperature: %.2f", temp);
        System.out.println("\n");

        if (aniNumber == 1){
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
        
        if (aniNumber == 2){
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
        
        if (aniNumber == 3){
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
        
        if (aniNumber == 4){
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
        
        
        
        
        System.out.println("\n Wow, what a cute "+ aniType +".");
        System.out.println("To view another animal, please restart the watcher."+
        "\n To quit, enter the value -1");
        
    }
}
