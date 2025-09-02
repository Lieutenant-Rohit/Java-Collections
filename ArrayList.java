import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class javaArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Collections.addAll(list, 2, 10, 7, 20, 12, 69, 0, 43, 100, 9, 400);
//      list.sort(null);
        System.out.println(list);

        System.out.println("Is 10 present in list - " + list.contains(10));
        System.out.println("List Size = " + list.size());

        //Replace element at index 0 with new element.
        list.set(0,99);
        System.out.println(list);

        //Removing last element
        list.removeLast();

        //Converting list to Array
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println("Printing Array Now");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        list.sort(new Ascending());
        System.out.println("Sorted List in Ascending Order:- " + list);

        list.sort(new Descending());
        System.out.println("Sorted List in Descending Order:- " + list);

    }

}

class Ascending implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2)
    {
        return o1-o2;
    }
}

class Descending implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2)
    {
        return o2-o1;
    }
}
