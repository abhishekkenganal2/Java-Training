public class Car {
    String color="blue";
    String brand="Benz";
    double price = 34222;
    public void display(String color,double price,String brand) {
        Car c1 = new Car();
        c1.price = 23456;
        Car c2 = new Car();
        System.out.println(price);
        System.out.println(c1.price);
        System.out.println(c2.price);
        System.out.println(this.price);
        System.out.println(this.color);
        System.out.println(brand);
    }
}
