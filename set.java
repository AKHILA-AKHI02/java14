import java.util.*;
class Main
{
    public static void main(String[] args){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Iam");
        a.add("students");
        a.add("Rajesh");
        a.add("Mtie");
        for(String s : a)
        {
            System.out.print(s+" ");
        }
    }
}
