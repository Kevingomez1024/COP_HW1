import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //File dataFile = new File("Users/user/Documents/data.txt");
        //Scanner scan = new Scanner(dataFile);

        //beau bailey flacuchento DM :D

        DynamicQueue[] queues = new DynamicQueue[4];





        DynamicQueue queue = new DynamicQueue();
        queue.insertIntoQueue("a");
        queue.insertIntoQueue("b");
        queue.insertIntoQueue("c");
        queue.insertIntoQueue("b");

        System.out.println(queue.printQueue());


    }
}
