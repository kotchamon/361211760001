package Lab5;

import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();

        myList.add("momay");//0
        myList.add("nan");//1
        myList.add("ben");//2
        myList.add("jan");//3
        myList.add("som");//4
        System.out.println(myList);

        myList.add(2,"momay");
        System.out.println(myList);
        myList.remove(0:"ben");
        System.out.println(myList);

    }
}
