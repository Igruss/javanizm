package day39_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
  /*          car1.brand = "Toyota";
            car1.colour = "Blue";
            car1.model = "Corolla";
            car1.year = 2020;
            car1.mileage = 20066;
            car1.price = 23967.99;
   */
        car1.setInfo("Toyota","Corolla",2015,
                "Green",43119,13455.99);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.colour);

        System.out.println("================================");

        Car car2 = new Car();

    /*        car2.brand = "Mercedes";
            car2.model = "A345";
            car2.colour = "Silver";
            car2.year = 2019;
            car2.mileage = 10766;
         car2.price = 56367.99;
  */
        car2.setInfo("BMW","X5",2018,"Black",
                15466,45677.99);

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.colour);

        Car car3 = new Car();
        car3.setInfo("Audi","A7",2017,"White",
                32987,34555);

        Car car4 = new Car();
        car4.setInfo("Jeep","Wrangler",1995,"Brown",
                154335,9887.99);

        System.out.println(car4);




    }
}
