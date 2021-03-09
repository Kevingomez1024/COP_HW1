import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File dataFile = new File("/Users/user/IdeaProjects/COP_HW1/src/data.txt");
        Scanner scan = new Scanner(dataFile);

        while(scan.hasNextLine()) { //loop to read the entire file
            String[] line = scan.nextLine().split(" "); //array to hold the key and index provided in each line
            char key = line[0].charAt(0);
            int index = Integer.parseInt(line[1]);
        }

        DynamicQueue[] queues = new DynamicQueue[4];
        queues[0] = new DynamicQueue(4);
        queues[1] = new DynamicQueue(4);
        queues[2] = new DynamicQueue(4);
        queues[3] = new DynamicQueue(4);









    }
}
