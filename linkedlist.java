import java.util.*;
class Main
{
    public static void main(String[] args){
        LinkedList<String> a=new LinkedList<>();
        a.add("Hello");
        a.add("Iam");
        a.add("students");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
