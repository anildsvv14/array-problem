//how to make an class as immutable
/*
 * 1. declare the class a final so it can't be extended
 * 2. make all fields as private so direct access is not allowed
 * 3. don't provide setter method for field
 * 4. make all mutable field final so that field value can be assigned only once
 * 5. initialize all fields using constructor method perform deep copy
 * 6. perform deep copy in getter of mutable fields
 * 
 */
import java.util.*;

final class Student{
    final private String name;
    final private int studentId;
    final private long percentage;
    final private List<String> friends;
    
    public Student(String name, int studentId, long percentage, List<String> friends) {
        this.name = name;
        this.studentId = studentId;
        this.percentage = percentage;
        //this.friends = friends;
        List<String> tempList=new ArrayList<>();
        for(String value:friends){
            tempList.add(value);
        }
        this.friends=tempList;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public long getPercentage() {
        return percentage;
    }
    public List<String> getFriends(){
        List<String> tempList=new ArrayList<>();
        for(String value:friends){
            tempList.add(value);
        }
        return tempList;
    }
    
   /*  @Override
    public String toString() {
        return "Student [name=" + name + ", studentId=" + studentId + ", percentage=" + percentage + "]";
    }*/
    
}