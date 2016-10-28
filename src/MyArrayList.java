
public class MyArrayList {

    private String[] data;

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("Первая строка");
        System.out.println("list.data[0] = " + list.data[1]);
    }

    private void add(String s) {
        data = new String[1];
        data[0] = s;
    }
}
