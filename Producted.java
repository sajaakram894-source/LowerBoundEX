//يخزن بيانات المنتج
//: اسمه وسعره، ويعرضهم ويرجع السعر
package lowerboundex;
public class Producted <T> {
    String name;
    T price;

    public Producted(String name, T price) {
        this.name = name;
        this.price = price;  }

    public T getPrice() {  return price;}

    public void display() {
        System.out.println("Product:" + name);
        System.out.println("Price:" + price + "LYD");    }
}