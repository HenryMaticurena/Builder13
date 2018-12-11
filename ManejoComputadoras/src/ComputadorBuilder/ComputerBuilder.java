package ComputadorBuilder;
import emsamablajecomputadoras.creacional.*;

public abstract class ComputerBuilder {
	
	protected Computador computador;
	
	public Computador getComputador() {
		return computador;
	}
	
	public abstract void buildMarca();
	public abstract void buildModelo();
	public abstract void buildRam();
	public abstract void buildalmacenamiento();
	public abstract void buildOS();
	public abstract void buildMainboard();
	
}
