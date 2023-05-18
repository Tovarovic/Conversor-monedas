package conversorDeMoneda.operaciones;

public class Validar {
	
	public boolean verificar(String operacion){
		boolean esNumero =  operacion.matches("[+-]?\\d*(\\.\\d+)?");
		return esNumero;
	}

	public double transformarEnDouble(String operacion){
		double valorNumerico = Double.parseDouble(operacion);
		return valorNumerico;
	}
}
