import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OwnStack Stack = new OwnStack();
        try {
            File file = new File("src/IntSeq100.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> data = new ArrayList<>();
            while (scanner.hasNextInt()) {
                data.add(scanner.nextInt());
            }
            scanner.close();
            for (int i = 0; i < data.size(); i++) {
                Stack.push(data.get(i));
                System.out.println(Stack.peek());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}