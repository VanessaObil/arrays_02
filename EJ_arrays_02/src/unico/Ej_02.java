package unico;

public class Ej_02 {

	public static void main(String[] args) {
		/* Implementar un programa que solicite al usuario cuántos números desea introducir. 
		 A continuación, se introducirá por teclado esa cantidad de números enteros, y por último, 
		 los mostrará en el orden inverso al introducido.*/

		int numero;
		numero =Util.leerInt("Cuantos números desea introducir?");
		int[]a = new int[numero];
		mostrarNumero(a);
		numerosInversos(a);
	}
		public static void mostrarNumero(int[] a) {
			for(int i=0; i<a.length; i++) {
				Util.escribir("Introduzca un número" + a + "/5");
			}
		} 
		public static void numerosInversos(int[]a) {
			for (int i=0; i<a.length; i--) {
				Util.escribir(a[i]);
			}
		}
}
