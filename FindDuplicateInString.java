import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateInString { 
    public static void main(String[] args) 

    { 

  

        // Initial stream 

       // Stream<Integer> stream = Stream.of(5, 13, 4,21, 13, 27, 2, 59, 59, 34); 
        //List<Character> stream=Arrays.asList("ABCCBDEAF");
  
        List<Character> chrList=new ArrayList<>();
        
    
        String str="ABCCBDEAF";
        
        for(int i=0;i<str.length();i++){
            
            chrList.add(str.charAt(i));
        }
       
        Set<Character> items = new HashSet<>();
        chrList.stream().filter(n->!items.add(n)).collect(Collectors.toSet());
        System.out.println(items);
      

    } 
} 