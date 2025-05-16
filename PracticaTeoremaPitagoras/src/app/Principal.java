package app;
import Clases.TrianguloRectangulo;
public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo t1 = new TrianguloRectangulo();
		double areaDefecto = t1.area();
		double perimetroDefecto = t1.perimetro();
		

		TrianguloRectangulo tRandom = new TrianguloRectangulo((int)(Math.random() * 10),(int)(Math.random() * 10));
		double areaRandom = tRandom.area();
		double perimetroRandom = tRandom.perimetro();

		TrianguloRectangulo t3 = new TrianguloRectangulo(0,0);
		
	}

}
