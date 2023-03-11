package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
    ArrayList<String> listHello = new ArrayList<>();
    listHello.add("Привет");
    listHello.add("Hello");
    ArrayList<String> listBye = new ArrayList<>();
    listBye.add("Пока");
    listBye.add("Bye");
    ArrayList<ArrayList> list = new ArrayList<>();
    list.add(listHello);
    list.add(listBye);
    for (ArrayList<String> spisok : list){
        for (String s : spisok){
            System.out.println(s);
        }
    }
}
}