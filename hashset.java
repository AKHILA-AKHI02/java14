import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> a = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            a.add(s);
        }
        System.out.println(a);
        a.remove("hello");
        System.out.println(a);
    }
}
