import java.util.Arrays;
import java.util.List;

public class AllNoStartOne {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(102,201,111,99,1011,011,11);
        list.stream().map(x->x+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
