package gitgud;

import java.io.File;
/**
 * 
 * @author Antonio Sobrino
 *
 */
public class FUtil {
	public static boolean existe(String rutaArchivo) {
		File archivo =new File(rutaArchivo);
		return archivo.exists();
	}
	public void escribo (String a_escribir) {
		
		System.out.println(a_escribir);
	}
	}

