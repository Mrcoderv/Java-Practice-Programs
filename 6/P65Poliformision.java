class Students{
    String name;
    int age;
    //same function name with diffrent work this is called polymorfism
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(int age, String name) {
        System.out.println(age+" "+name);
    }
}
public class P65Poliformision {
public static void main(String[] args) {
        Students s1 = new Students();
        s1.age=19;
        s1.name="raghav";
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.age,s1.name);// automatic call that as the requirement
    }
}
