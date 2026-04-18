public class MyOwnList<T> {
    Object[] fixed;
    T type;

    public MyOwnList(T type) {
        this.type = type;
    }

    public MyOwnList() {
    }

    public void add(T element) {
        if (fixed == null) {
            fixed = new Object[1];
            fixed[0] = element;
        } else {
            Object[] new_fixed = new Object[fixed.length + 1];
            int index = fixed.length;
            for (int i = 0; i < fixed.length; i++) {
                new_fixed[i] = fixed[i];
            }
            new_fixed[index] = element;
            fixed = new_fixed;
        }
    }

    public void addFirst(T element) {
        if (fixed == null) {
            fixed = new Object[1];
            fixed[0] = element;
        }else {
            Object[] new_fixed = new Object[fixed.length + 1];
            for (int i = 0; i < new_fixed.length; i++) {
                if (i == 0) {
                    new_fixed[i] = element;
                } else {
                    new_fixed[i] = fixed[i - 1];
                }
            }
            fixed = new_fixed;
        }
    }

    public void addLast(T element) {
        add(element);
    }

    public void insert (int index, T element) {
        Object[] new_fixed = new Object[fixed.length + 1];
        for (int i = 0; i < new_fixed.length; i++) {
            if (i < index) {
                new_fixed[i] = fixed[i];
            } else if (i == index) {
                new_fixed[i] = element;
            } else {
                new_fixed[i] = fixed[i - 1];
            }
        }
        fixed = new_fixed;
    }

    public void show() {
        for (int j = 0; j < 1; j++) {
            System.out.print("[ ");
            for (int i = 0; i < fixed.length; i++) {
                System.out.print(fixed[i]);
                if (i != fixed.length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.println(" ]");
        }
    }

    public T get(int index) {
        return (T) fixed[index];
    }

    public int size() {
        return fixed == null ? 0 : fixed.length;
    }

    public void remove(int index) {
        for (int i = index; i < fixed.length - 1; i++) {
            fixed[i] = fixed[i + 1];
        }
        Object[] new_fixed = new Object[fixed.length - 1];
        for (int i = 0; i < new_fixed.length; i++) {
            new_fixed[i] = fixed[i];
        }
        fixed = new_fixed;
    }


}
