class Genr<T1, T2> {
    T1 name;
    T2 value;

    Genr(T1 o1, T2 o2) {
        name = o1;
        value = o2;
    }

    public T1 getName() {
        return name;
    }

    public T2 getValue() {
        return value;
    }
}

public class GenWith2Param {
    public static void main(String[] args) {
        // Example 1: String and Integer
        Genr<String, Integer> obj1 = new Genr<>("Apple", 100);
        System.out.println("Name: " + obj1.getName());
        System.out.println("Value: " + obj1.getValue());

        //Ex2
        Genr<String,String> obj2 = new Genr<>("Aashutosh","Kumar");
        System.out.println("Name: "+obj2.getName());
        System.out.println("Value: "+obj2.getValue());

        //3
        Genr<Integer, Double> obj3 = new Genr<>(3,3.00*3.00);
        System.out.println("Square of "+obj3.name+" is "+obj3.getValue());


    }
}
