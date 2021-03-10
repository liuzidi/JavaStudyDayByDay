package Test;

public class TT {
    public static void main (String [] args){
        String s ="sssad";
        String s1 ="sssad";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("----");
        s1="sa";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());;
        System.out.println("----");
        s1 ="sssad";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        String s3 = "sssad";
        System.out.println(s3.hashCode());
        String s4 =new String("sssad");
        System.out.println(s4.hashCode());

    }
}

