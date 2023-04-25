package gitgud;

public class LineaOrdenesApp {
	public static void main(String[] args) {
	if (args.length == 0) {
		System.out.println("No has escrito ningun parametro");
	}
	else {
		String param=args[0];
		if (param.equals("--help")) {
			System.out.println("la ayuda esta in cuming");
		}
		else {
			System.out.println("has escrito " + param + " pero no lo entiendo");
		}
		
	}
	
	}
}
