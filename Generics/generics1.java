class Gen<T>{
    T ob; //an object of type T is declared
    Gen(T o){ //Constructor
        ob = o;
    }
    public T getOb(){
        return ob;
    }
}
public class generics {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(100); //instance of integer type Gen class
        int x = iob.getOb();
        System.out.println(x);
        Gen<String> sob = new Gen<>("Hello");  //instance of String type Gen class
        String str = sob.getOb();
        System.out.println(str);
    }
}
