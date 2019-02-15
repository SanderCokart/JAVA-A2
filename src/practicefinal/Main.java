package practicefinal;

public class Main {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 // TODO code application logic here
 Vermenigvuldiging v = new Vermenigvuldiging();
 Factorial f = new Factorial();
 
 System.out.println("4 * 3 = "+Integer.toString(v.vermenigvuldig(4, 3)));
 System.out.println("6 * 5 = "+Integer.toString(v.vermenigvuldig(6, 5)));
 System.out.println("7 * 5 = "+Integer.toString(v.vermenigvuldig(7, 5)));
 System.out.println("10 * 9 = "+Integer.toString(v.vermenigvuldig(10, 9)));
 System.out.println("1 * 1 = "+Integer.toString(v.vermenigvuldig(1, 1)));
 
 System.out.println("factorial of 5 = "+Integer.toString(f.factorial(5)));
 System.out.println("factorial of 10 = "+Integer.toString(f.factorial(10)));
 System.out.println("factorial of 7 = "+Integer.toString(f.factorial(7)));
 System.out.println("factorial of 8 = "+Integer.toString(f.factorial(8)));
 System.out.println("factorial of 3 = "+Integer.toString(f.factorial(3)));
 }

}