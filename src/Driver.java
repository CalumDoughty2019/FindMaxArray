import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static  void main(String[] args){
        FindMax findMax = new FindMax();
        List<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(9);
        list.add(10);
        list.add(100);
        list.add(74);
        list.add(23);
        list.add(19);
        list.add(400);

        long start = System.nanoTime();
        System.out.print("The max of the array is " + findMax.findMax(list));
        System.out.println(System.nanoTime() - start + " ns");

//        start = System.nanoTime(); //much quicker by using efficient implemented code
//        Collections.max(list);
//        System.out.println(System.nanoTime() - start + " ns");
    }
}
