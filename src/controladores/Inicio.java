package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.UsuarioDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz menuI = new MenuImplementacion();
		
		List<UsuarioDto>listaUsuario = new ArrayList<UsuarioDto>(); 
		
		int numero;
		boolean cerrarMenu = false;

		try {

			while (!cerrarMenu) {

				numero = menuI.mostrarMenu();

				switch (numero) {

				case 0:
					System.out.println("Has seleccionado la opcion de cerrar menu.");
					cerrarMenu = true;
					break;

				case 1:
					System.out.println("Has seleccionado la opcion de dar alta a un nuevo usuario.");
					break;

				case 2:

					break;

				default:
					System.out.println("Has seleccionado una opcion incorrecta, intentelo de nuevo.");

					break;

				}

			}

		} catch (Exception e) {
			// TODO: handle exception

		}

	}
}
