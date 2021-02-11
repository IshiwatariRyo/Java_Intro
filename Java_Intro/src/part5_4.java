public class part5_4 {
public static void main(String[] args) {
	double b = 10.0;
	double h = 5.0;
	double r =5.0;
	System.out.println("三角形の面積は"+calcTrinabgleArea(b,h));
	System.out.println("円の面積は"+calcCircleArea(r));
}
public static double calcTrinabgleArea(double bottom,double height) {
	return bottom * height / 2;
}
public static double calcCircleArea(double radius) {
	return Math.pow(radius,2)*3.14;
}
}
