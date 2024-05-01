import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zweite_Programmieraufgabe implements StackInterface<String> {
    public static void main(String[] args) {
        try {
            File file = new File("IntSeq100.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> data = new ArrayList<>();
            while (scanner.hasNextInt()) {
                data.add(scanner.nextInt());
            }
            scanner.close();
            int[] arr = new int[data.size()];
            for (int i = 0; i < data.size(); i++) {
                arr[i] = data.get(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int max = 1;
        int[] stack_array = new int[max];
    }


    @Override
    public void push(String newEntry) {

    }

    @Override
    public String pop() throws IllegalStateException {
        return "";
    }

    @Override
    public String peek() throws IllegalStateException {
        return "";
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
