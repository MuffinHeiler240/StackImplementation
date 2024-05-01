import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zweite_Programmieraufgabe implements StackInterface<Integer> {
    public int max = 1;
    public int[] stack_array = new int[max];
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
    }

    @Override
    public void push(Integer newEntry) {

    }

    @Override
    public Integer pop() throws IllegalStateException {
        int i = stack_array[stack_array.length -1];
        try {
            System.arraycopy(stack_array, 0, stack_array, 0, stack_array.length - 1);
        }catch (Exception e) {
            new Error(e.getLocalizedMessage());
        }
        return i;
    }

    @Override
    public Integer peek() throws IllegalStateException {
        return stack_array[stack_array.length -1];
    }

    @Override
    public boolean isEmpty() {
        return stack_array.length == 0;
    }

    @Override
    public void clear() {
        stack_array = new int[]{};
    }
}
