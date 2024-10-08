import java.util.*;
public class FindMaximum {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(102,201,111,99,1011,011,11);
        int max=list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println(list.stream().max(Integer::compare).get());
    }
}
