import java.util.*;
import java.util.stream.Collectors;

public class NoPresentTwice {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer> set=new HashSet<>();
        list.stream().anyMatch(num->!set.add(num));
        if(set.size()==list.size()){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
