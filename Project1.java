
import java.util.*;

public class Project1 {
    public static void main(String[] args) {
        // ! list
        System.out.println("\nLIST\n");
        List<String> new_list = new ArrayList<>();
        new_list.add("A");
        new_list.add("B");
        new_list.add("C");

        System.out.println("The list is: " + new_list);

        new_list.remove("B");
        System.out.println("The list after removing B is: " + new_list);
        new_list.add("D");
        new_list.add("E");
        System.out.println("The list after adding D, E is: " + new_list);

        new_list.remove(2);
        System.out.println("The list after removing the element at index 2 is: " + new_list);
        // ! update the element at index 2 to F
        new_list.set(2, "F");
        System.out.println("The list after setting the element at index 2 to F is: " + new_list);

        // ! set
        System.out.println("\nSET\n");
        Set<String> new_set = new HashSet<>();
        new_set.add("A");
        new_set.add("B");
        new_set.add("C");
        System.out.println("The set is: " + new_set);
        new_set.remove("B");
        System.out.println("The set after removing B is: " + new_set);
        new_set.add("D");
        new_set.add("E");
        new_set.add("D"); // ! adding duplicate element
        new_set.add("E"); // ! adding duplicate element
        new_set.add("E"); // ! adding duplicate element
        System.out.println("The set after adding D, E is: " + new_set);
        new_set.remove("C");
        System.out.println("The set after removing C is: " + new_set);
        new_set.remove("A");  // remove old
        new_set.add("F");     // add new
        System.out.println("The set after setting the element at index 0 to F is: " + new_set);


        // ! queue
        System.out.println("\nQUEUE\n");
        Queue<String> new_queue = new LinkedList<>();
        new_queue.add("A");
        new_queue.add("B");
        new_queue.add("C");
        System.out.println("The queue is: " + new_queue);
        new_queue.remove();
        System.out.println("The queue after removing the head element is: " + new_queue);
        new_queue.add("D");
        new_queue.add("E");
        System.out.println("The queue after adding D, E is: " + new_queue);
        new_queue.remove();
        System.out.println("The queue after removing the head element is: " + new_queue);
        System.out.println("The head element of the queue is: " + new_queue.peek());
        System.out.println("The queue after polling the head element is: " + new_queue.poll());
        System.out.println("The queue after polling the head element is: " + new_queue);


        // ! map
        System.out.println("\nMAP\n");
        Map<Integer, String> new_map = new HashMap<>();
        new_map.put(1, "A");
        new_map.put(2, "B");
        new_map.put(3, "C");
        System.out.println("The map is: " + new_map);
        new_map.remove(2);
        System.out.println("The map after removing the element with key 2 is: " + new_map);
        new_map.put(4, "D");
        new_map.put(5, "E");
        System.out.println("The map after adding key 4, 5 with value D, E is: " + new_map);
        new_map.remove(3);
        System.out.println("The map after removing the element with key 3 is: " + new_map);
        new_map.put(1, "F");
        System.out.println("The map after setting the value of key 1 to F is: " + new_map);
        // ! set the value of key 4 to G
        new_map.put(4, "G");
        System.out.println("The map after setting the value of key 4 to G is: " + new_map);
    }
}
