package Casting;
class Polygon {
    public void display() {
        System.out.println("Inside the polygon class");
    }
}
    class Anonymousdemo {
        public void createClass() {
            // creation of anonymous class extending class Polygon
            Polygon p1 = new Polygon() {
                public void display() {
                    System.out.println("Inside an anonymous class.");
                }
            };
            p1.display();
        }
    }

    public class Anonymousclass {
        public static void main(String[] args) {
            Anonymousdemo an = new Anonymousdemo();
            an.createClass();

        }
    }



