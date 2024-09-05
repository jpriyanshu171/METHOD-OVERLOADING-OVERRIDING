class A {
    void run() {
        System.out.println("This is a method of parent class");
    }
}
class METHOD_OVERRIDING {
    void run(){
        System.out.println("This is a method of child class");
    }

    public static void main(String[] args) {
        METHOD_OVERRIDING obj=new METHOD_OVERRIDING();
        obj.run();
    }
}
