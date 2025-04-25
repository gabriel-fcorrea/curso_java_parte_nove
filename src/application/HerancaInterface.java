package application;

import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class HerancaInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do Retângulo: ");
		System.out.print("Cor: ");
		Color rectangleColor = Color.valueOf(sc.next());
		System.out.print("Largura: ");
		double rectangleWidth = sc.nextDouble();
		System.out.print("Altura: ");
		double rectangleHeight = sc.nextDouble();

		Rectangle rectangle = new Rectangle(rectangleColor, rectangleWidth, rectangleHeight);

		System.out.println("Entre com os dados do Círculo: ");
		System.out.print("Cor: ");
		Color circleColor = Color.valueOf(sc.next());
		System.out.print("Raio: ");
		double circleRadius = sc.nextDouble();

		Circle circle = new Circle(circleColor, circleRadius);

		System.out.println(rectangle.area());
		System.out.println(circle.area());

		sc.close();

	}
}
