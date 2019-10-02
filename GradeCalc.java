/*
 * DeJonte July
 * 10/1/2019
 */
import java.util.Scanner;
public class GradeCalc {

	public static void main(String[] args) {
		
		Scanner grade = new Scanner(System.in);
		
		System.out.println("Grade 1: ");
		System.out.println("Grade 2: ");
		System.out.println("Grade 3: ");
		System.out.println("Grade 4: ");
		System.out.println("Grade 5: ");
		
		double g1 = grade.nextDouble();
		double g2 = grade.nextDouble();
		double g3 = grade.nextDouble();
		double g4 = grade.nextDouble();
		double g5 = grade.nextDouble();
		
		double total = g1 + g2 + g3 + g4 + g5;
		double per = (total/5);
		
		if(per >= 97.0 && per >= 100.0) {
			System.out.println("A+");
		}
		if(per >= 93.0 && per <= 96.0) {
			System.out.println("A");
		}
		if(per >= 90.0 && per <= 92.0) {
			System.out.println("A-");
		}
		if(per >= 87.0 && per <= 89.0) {
			System.out.println("B+");
		}
		if(per >= 83.0 && per <= 86.0) {
			System.out.println("B");
		}
		if(per >= 80.0 && per <= 82.0) {
			System.out.println("B-");
		}
		if(per >= 77.0 && per <= 79.0) {
			System.out.println("C+");
		}
		if(per >= 73.0 && per <= 76.0) {
			System.out.println("C");
		}
		if(per >= 70.0 && per <= 72.0) {
			System.out.println("C-");
		}
		if(per >= 67.0 && per <= 69.0) {
			System.out.println("D+");
		}
		if(per >= 65.0 && per <= 66.0) {
			System.out.println("D");
		}
		if(per < 65.0) {
			System.out.println("F");
			
		System.out.printf("%.2f out of a possible 500 points \n", total);
		System.out.printf("Percentage: %.2f", per);
		
		grade.close();
		
		}
	}
}
