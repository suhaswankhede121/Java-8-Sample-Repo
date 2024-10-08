import java.util.*;;
public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(102,201,111,99,1011,011,11);
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().count());
    }
}
