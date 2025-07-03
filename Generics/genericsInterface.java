/* The general syntaxx to declare a generic i
interface interface-name<T>{
    void method-name(T t); //public abstract method.
}
*/

interface Fruits<T>{
    void showFruits(T t);
}

interface Animals<T>{
    void showAnimals(T t);
}

public class genericsInterface<T> implements Fruits<T>, Animals<T>{
    public void showFruits(T t){
        System.out.println("Fruit is: "+t);
    }
    public void showAnimals(T t){
        System.out.println("Animal is: "+t);
    }

    public static void main(String[] args) {
        genericsInterface<String> ob = new genericsInterface<>();
        ob.showFruits("Mango");
        ob.showAnimals("Lion");
    }
}
