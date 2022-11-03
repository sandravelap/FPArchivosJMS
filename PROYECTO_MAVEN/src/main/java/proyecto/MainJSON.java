package proyecto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class MainJSON {

	public static void main(String[] args) {

		File archivo = new File("src/main/resources/usuarios.xml");
		
		JAXBContext contexto;
		try {
			//para leer el documento
			contexto = JAXBContext.newInstance(Usuario.class);
			//unmarshaller para pasar de xml a java
			Unmarshaller objetoUnmarshaller = contexto.createUnmarshaller();
			Usuario usuario;
			usuario = (Usuario) objetoUnmarshaller.unmarshal(archivo);
			System.out.println(usuario.getNombre());
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		Path archivoAlumnos = Path.of("src/main/resources/usuarios.json");

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario = new Usuario();
		usuarios.add(usuario);
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.setPrettyPrinting().create();

		String textoAlumno = gson.toJson(usuario);
		System.out.println(textoAlumno);

		try {
			Files.write(archivoAlumnos, textoAlumno.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}