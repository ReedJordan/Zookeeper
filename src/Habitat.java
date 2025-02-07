import java.io.File;
import java.util.Scanner;

public class Habitat {
    private String animal;
    private String time;
    private int temp;
    private String fileName;

    public Habitat(String aniType, String habiTime, int habiTemp, String filefile){
        animal = aniType;
        time = habiTime;
        temp = habiTemp;
        fileName = filefile;
    }

    public void changeTime(String newTime){
        time = newTime;
    }

    public void changeTemp(int newTemp){
        temp = newTemp;
    }

    public void changeFile(String newFileName){
        fileName = newFileName;
    }

    public String getTime(){
        return time;
    }

    public int getTemp(){
        return temp;
    }

    public String getFilename(){
        return fileName;
    }

    public void printFile(){
        File file = new File(fileName);
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

    public String toString(){
        return String.format("Habitat Creature: \nHabitat Temp: ", this.animal, this.temp);
    }

}
