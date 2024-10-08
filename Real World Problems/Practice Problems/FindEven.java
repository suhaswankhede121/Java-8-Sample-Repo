import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEven{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,10,11);
        list.stream().filter(x->x % 2==0).collect(Collectors.toList()).forEach(System.out::println);;

    }
}
