public class Shape {
    private String color = "white";

    public Shape(){}
    public Shape(String color) {
        this.color = color;
    }
    public double area(){
        return 0.0;
    }
    public double primeter(){
        return 0.0;
    }
    public void describe(int sideA,int sideB){
        System.out.println("Side a is "+sideA+" Side b is "+sideB);
    }
    public void describe(int sideA){
        System.out.println("Side a is "+sideA);
    }
    public void describe(double sideA){
        System.out.println("Side a is "+sideA);
    }
    public void describe(){
        System.out.println("This is a shape");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
