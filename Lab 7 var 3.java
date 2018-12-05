public class MyArrayList {

    private int initialSize = 5;
    private int stepSize = 5;
    private int[] innerStorage;
    private int currentIndex = 0;

    public MyArrayList() {
        innerStorage = new int[initialSize];
    }

    private void add(int value) {
        if (currentIndex < innerStorage.length) {
            innerStorage[currentIndex] = value;
            currentIndex++;
        } else {
            resizeArray();
            innerStorage[currentIndex] = value;
            currentIndex++;
        }
    }

    private void resizeArray() {
        initialSize += stepSize;
        int tmp[] = new int[initialSize];
        for (int i = 0; i < innerStorage.length; i++) {
            tmp[i] = innerStorage[i];
        }
        innerStorage = tmp;
    }


    public void add(int value, int index) {
        if (currentIndex >= innerStorage.length) {
            resizeArray();
        }

        for (int i = currentIndex - 1; i >= index; i--) {
            innerStorage[i + 1] = innerStorage[i];
        }
        innerStorage[index] = value;
        currentIndex++;

    }


    private void remove(int index) {
        if (index < currentIndex) {
            for (int i = index; i < currentIndex; i++) {
                innerStorage[i] = innerStorage[i + 1];
            }
            currentIndex--;
        }
    }

    ;

    private int get(int index) {
        return innerStorage[index];
    }

    private void printMyArray() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(innerStorage[i] + "; ");
        }
        System.out.println();
    }

    public static void main(String[] arg) {
        MyArrayList list = new MyArrayList();
        list.add(4);
        list.printMyArray();
        list.add(8);
        list.printMyArray();
        list.add(1);
        list.printMyArray();
        list.add(6);
        list.printMyArray();
        list.add(34);
        list.printMyArray();
        list.add(2);
        list.printMyArray();
        System.out.println(list.get(3));

        list.remove(1);
        list.printMyArray();
        list.add(5);
        list.printMyArray();
        list.remove(0);
        list.printMyArray();
        list.add(54, 2);
        list.printMyArray();
        list.add(43, 2);
        list.printMyArray();
        list.add(14, 2);
        list.printMyArray();
        list.add(73, 2);
        list.printMyArray();
        list.add(52, 2);
        list.printMyArray();
        list.add(79, 2);
        list.printMyArray();
        list.add(11, 2);
        list.printMyArray();
        list.add(22, 2);
        list.printMyArray();
        list.add(33, 2);
        list.printMyArray();

    }
}
