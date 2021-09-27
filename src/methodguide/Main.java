
package methodguide;

/**
 *
 * @author JoseMejia62
 */
public class Main {
    
    public static void methodName(){
        System.out.println("Code to executed when the method is call");
    }
    //Parameter
    public static void passingParams(String name){
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        // Call a Method
        methodName();
        
        // Argumenst
        passingParams("Twitter");
        
        int resultInt = MethodOverloading.sumValues(2, 7);
        System.out.println("Int Result " + resultInt);
        
        double resultDouble = MethodOverloading.sumValues(4.9, 1.1);
        System.out.println("Double Result " + resultDouble);
    }
    
}
