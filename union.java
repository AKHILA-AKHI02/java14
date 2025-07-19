import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr1[]={99,5,6,1,2,3};
        int arr2[]={1,3,5,6,23,51};
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int s : arr1)
        a.add(s);
        for(int s1 :arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set <Integer> u=new HashSet<>(a);
        u.retainAll(b);
        System.out.println(u);
    }
}

                                          
