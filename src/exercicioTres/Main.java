package exercicioTres;


public class Main {

	public static void main(String[] args) {
		
		//Returnos
		System.out.println("Exerc�cio retornos");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("�rea do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5, 5);
		System.out.println("�rea do retangulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("�rea do trap�zio: " + areaTrapezio);

	}

}
