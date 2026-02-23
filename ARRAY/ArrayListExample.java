import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list= new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(10);
        list.add(50);
        list.add(50);

        list.remove(3);

        list.set(0,6437);
        System.out.println(list);




    }
}
