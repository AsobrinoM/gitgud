package gitgud;
import java.util.Scanner;
public class github {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String ubicacionArchivo = input.next();
		FUtil.existe(ubicacionArchivo);
		
	}
}
