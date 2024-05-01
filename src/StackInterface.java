public interface StackInterface<T> {
        public void push(T newEntry);
        public T pop() throws IllegalStateException;
        public T peek() throws IllegalStateException;
        public boolean isEmpty();
        public void clear();
    }