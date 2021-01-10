public class Triangle {
  public Triangle() {
    double perimeter;
    double area;
    int s1=5,s2=2,s3=4;    
    perimeter=s1+s2+s3;
    double phalf = perimeter/2; 
    area=Math.sqrt(phalf*(phalf-s1)*(phalf-s2)*(phalf-s3));
    System.out.println("Perimeter Of Triangle with sides 5,2,4 = "+perimeter);
    System.out.println("Area Of Triangle with sides 5,2,4 = "+area); 
  }
  public static void main(String[] args) {
    Triangle ob = new Triangle();
  }
}