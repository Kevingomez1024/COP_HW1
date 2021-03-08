import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File dataFile = new File("/Users/user/IdeaProjects/COP_HW1/src/data.txt");
        Scanner scan = new Scanner(dataFile);


        while(scan.hasNextLine()) { //loop to read the entire file
            String[] line = new String[2]; //array to hold the key and index provided in each line
            line = scan.nextLine().split(" "); //obtaining the key and index by splitting the line wherever there is a space
            char key = line[0].charAt(0); //setting the key equal
            int index = Integer.parseInt(line[1]); //setting the index
            System.out.println(key + " " + index);

        }






        DynamicQueue[] queues = new DynamicQueue[4];




    }
}
