import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDublicates {
    public static void main(String[] args) {
        int[] list={1,3,2,1,4,1,6,7,5,6}; //NOTE: IF YOU DONT WANT TO CONVERT IT INTO LIST YOU HAVE TO PASS STREAM(ARR).BOXED()
        // Set<Integer> set=new HashSet<>();
        // list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        List<Integer> list1 = Arrays.stream(list).boxed().distinct().collect(Collectors.toList());
        System.out.println(list1);
        
    }
}
