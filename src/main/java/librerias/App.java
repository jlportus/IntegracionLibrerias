package librerias;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import es.lanyu.commons.identificable.Identificable;
import es.lanyu.comun.evento.Competicion;

public class App {

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(new File("sp1.csv")));
			String linea = "";
			String[] fragmentos;
			while ((linea = buffer.readLine()) != null) {
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		Identificable<>
	}
}
