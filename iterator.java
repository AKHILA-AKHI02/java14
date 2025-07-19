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
        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}

        
