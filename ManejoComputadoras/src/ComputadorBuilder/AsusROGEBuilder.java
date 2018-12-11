package ComputadorBuilder;

import emsamablajecomputadoras.creacional.*;


public class AsusROGEBuilder extends ComputerBuilder{

	public AsusROGEBuilder() {
		super.computador = new Computador();
	}
	
	@Override
	public void buildMarca() {
		computador.setMarca("ASUS");
	}

	@Override
	public void buildModelo() {
		computador.setModelo("ROG");
	}

	@Override
	public void buildRam() {
		computador.setRam(32);
		
	}

	@Override
	public void buildalmacenamiento() {
		computador.setAlmacenamiento(1000);
		
	}

	@Override
	public void buildOS() {
		computador.setOs(new SistemaOperativo("Windows", 64, "10 Pro"));
		
	}

	@Override
	public void buildMainboard() {
		computador.setPlaca(new Mainboard("Strix", "x99"));	
	}

}
