/**
 * 
 */
package emsamablajecomputadoras;

import ComputadorBuilder.AsusROGEBuilder;
import ComputadorBuilder.AsusZenbookBuilder;
import ComputadorBuilder.Ensamblador;
import emsamablajecomputadoras.creacional.*;

/**
 * @author HenryMaticurena, Kevin Gomez
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
		Ensamblador ensamblador = new Ensamblador();
		// AsusROGE
		//Computador roge = new Computador(/*todos los atributos*/);
		AsusROGEBuilder asus_roge_builder=new AsusROGEBuilder();
		// AsusZenbook
		//Computador zenbook = new Computador(/*todos los atributos*/);
		AsusZenbookBuilder asus_zenbook_builder = new AsusZenbookBuilder();
		//Mostrar las caracteristicas de ambas computadoras 
		ensamblador.setComputerBuilder(asus_roge_builder);
		ensamblador.construirComputador();
		
		Computador computadora1 = ensamblador.getComputador();
		
		ensamblador.setComputerBuilder(asus_zenbook_builder);
		ensamblador.construirComputador();
		
		Computador computadora2 = ensamblador.getComputador();
		
		computadora1.toString();
		computadora2.toString();

	}

}
