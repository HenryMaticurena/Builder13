package ComputadorBuilder;

import emsamablajecomputadoras.creacional.*;


public class AsusZenbookBuilder extends ComputerBuilder{

	public AsusZenbookBuilder() {
		super.computador = new Computador();
	}
	
	@Override
	public void buildMarca() {
		computador.setMarca("ASUS");
	}

	@Override
	public void buildModelo() {
		computador.setModelo("Zenbook");
	}

	@Override
	public void buildRam() {
		computador.setRam(16);
		
	}

	@Override
	public void buildalmacenamiento() {
		computador.setAlmacenamiento(500);
		
	}

	@Override
	public void buildOS() {
		computador.setOs(new SistemaOperativo("Windows", 64, "10 Home"));
		
	}

	@Override
	public void buildMainboard() {
		computador.setPlaca(new Mainboard("Prime", "Z370"));	
	}

}
