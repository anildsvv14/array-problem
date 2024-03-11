import java.util.ArrayList;
import java.util.List;

public class ImmutableObject {
    public static void main(String[] args) {
        System.out.println("immutable object");
        List<String> friends=new ArrayList<>();
        friends.add("devesh");
        Student s=new Student("anil kumar sahu ", 101  , 70L, friends);
        System.out.println(s);
        System.out.println(s.getFriends());
      
    }
}
