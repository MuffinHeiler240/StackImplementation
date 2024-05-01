public class OwnStack implements StackInterface<Integer> {
    public int max = 1;
    public Integer [] stack_array = new Integer [max];

    @Override
    public void push(Integer newEntry) {
        if(stack_array[stack_array.length-1] != null){
            Integer[] temp_stack_array= new Integer[(stack_array.length-1)*2];
            for (int i = 0; i < stack_array.length; i++) {
                temp_stack_array[i] = stack_array[i];
            }
            stack_array = temp_stack_array;
        }
        int i=0;
        while(i>=0){
            Integer Value = stack_array[i];
            if(Value == null){
                stack_array[i] = newEntry;
                return;}
            i++;
        }

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
        stack_array = new Integer[max];
    }
}
