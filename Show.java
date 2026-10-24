package lowerboundex;
public class Show {
     public static void showPrice(Producted<? super Number> Producted) {
        System.out.println("Registered price: " + Producted.getPrice());  
}}
//يطبق مفهوم 
//Lower Bounded Wildcard  
    //-->    ? super Number