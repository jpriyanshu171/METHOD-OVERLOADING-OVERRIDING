public class METHOD_OVERLOADING {
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        METHOD_OVERLOADING obj=new METHOD_OVERLOADING();
        obj.add(11,11);
        obj.add(11,11,11);
    }
}
