
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeated {
    public static void main(String[] args) {
        String str="Java articles are Awesome"; //ot:c
        // char cr=str.chars().mapToObj(c->(char)c).filter(ch->str.indexOf(ch)==str.lastIndexOf(ch)).findFirst().orElse(null);
        // System.out.println(cr);


        //Repaeted 

          Character result = str.chars() // Stream of String       
                                  .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                                  .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                  .entrySet()
                                  .stream()
                                  .filter(entry -> entry.getValue() > 1L)
                                  .map(entry -> entry.getKey())
                                  .findFirst()
                                  .get();
          System.out.println(result);    
    }
}
