import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zweite_Programmieraufgabe implements StackInterface<Integer> {
    public int max = 1;
    public Integer [] stack_array = new Integer [max];
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

        int i=stack_array.length-1;
        while(i>=0){
            Integer Value = stack_array[i];
            if(Value != null){
                stack_array[i] = null;
                return Value;}
            i--;
        }
        return null;
    }

    @Override
    public Integer peek() throws IllegalStateException {
        int i=stack_array.length-1;
        while(i>=0){
            if(stack_array[i] != null)
                return stack_array[i];
            i--;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        for (Integer i:stack_array) {
            if(i != null)
                return false;
        }
        return true;
    }

    @Override
    public void clear() {
        stack_array = new Integer[]{};
    }
}
