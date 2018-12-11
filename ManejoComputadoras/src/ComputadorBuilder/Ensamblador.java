package ComputadorBuilder;

import emsamablajecomputadoras.creacional.Computador;

public class Ensamblador {
	private ComputerBuilder computerbuilder;
	
	public void setComputerBuilder(ComputerBuilder cb) {
		computerbuilder=cb;
	}
	
	public Computador getComputador() {
		return computerbuilder.getComputador();
	}
	
	public void construirComputador() {
		computerbuilder.buildMarca();
		computerbuilder.buildModelo();
		computerbuilder.buildRam();
		computerbuilder.buildOS();
		computerbuilder.buildMainboard();
		computerbuilder.buildalmacenamiento();
	}
}
