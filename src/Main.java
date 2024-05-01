import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zweite_Programmieraufgabe Zweite_Programmieraufgabe = new Zweite_Programmieraufgabe();
        try {
            File file = new File("IntSeq100.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> data = new ArrayList<>();
            while (scanner.hasNextInt()) {
                data.add(scanner.nextInt());
            }
            scanner.close();
            for (int i = 0; i < data.size(); i++) {
                Zweite_Programmieraufgabe.push(data.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}