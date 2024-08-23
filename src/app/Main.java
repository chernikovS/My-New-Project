package app;

public class Main {

    public static void main(String[] args) {

        Area[] areas = new Area[]{
                new Circle(5.5),
                new Square(2.8),
                new Triangle(3.3, 7.7)
        };

        double totalArea = calcArea(areas);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }

    public static double calcArea(Area[] areas) {
        double totalArea = 0.0;
        for (Area area : areas) {
            totalArea += area.getArea();
        }
        return totalArea;
    }
}