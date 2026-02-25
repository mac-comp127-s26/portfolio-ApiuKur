public class Student {
private  String name;
private int age;
private String course;
private static int studentcount;

Student(String firstName,String fallCourse){
    this.age=1;
    this.course=course;
    this.name=name;
    // studentcount++;

}
public int getAge() {
    return age;
}
public String setName(String secondName){
    // this method sets a name and returns it.
    // this has simplified by use of constructors which sets variables to some values and then write functions to get them
    this.name=secondName;
    return secondName;
}
public String getName(){
    return name;
}
public String getCourse() {
    return course;
}
public static String isFood(String foodString){
    // this is a static method;it is a method that all class members have:
    // eg all class memebers must eat and no object is required to get the values;
    
    return foodString;

}
public static int countStudents(){
    // This static method must have a static variable
    // the static variable should be 
     studentcount++;
    return  studentcount;

}
    
}
