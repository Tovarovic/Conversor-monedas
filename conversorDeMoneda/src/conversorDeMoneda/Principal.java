package conversorDeMoneda;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import conversorDeMoneda.enums.TipoDeConversion;
import conversorDeMoneda.operaciones.IniciarConversion;
import conversorDeMoneda.operaciones.Validar;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		
		String conversion = "Convertir moneda";
		
		boolean ejecuta = true;
		
		while (ejecuta) {
			String operacion = JOptionPane.showInputDialog(null, "Elige la operacion", "Conversiones", 
					JOptionPane.QUESTION_MESSAGE, null, new String[] {conversion}, "Elección").toString();
			
			if (operacion.equals(conversion)) {
				IniciarConversion iniciarConversion = new IniciarConversion();
				String operaciones = JOptionPane.showInputDialog(null, "Elige una moneda", "Monedas",
						JOptionPane.QUESTION_MESSAGE, null, new String[] {
								TipoDeConversion.DOLAR_ARG.getDESCRIPCION(),
								TipoDeConversion.DOLAR_BOLIVAR.getDESCRIPCION(),
								TipoDeConversion.DOLAR_BOLIVIANO.getDESCRIPCION(),
								TipoDeConversion.DOLAR_CHI.getDESCRIPCION(),
								TipoDeConversion.DOLAR_COL.getDESCRIPCION(),
								TipoDeConversion.DOLAR_GUARANI.getDESCRIPCION(),
								TipoDeConversion.DOLAR_REAL.getDESCRIPCION(),
								TipoDeConversion.DOLAR_SOL.getDESCRIPCION(),
								TipoDeConversion.DOLAR_URU.getDESCRIPCION(),
								TipoDeConversion.ARG_DOLAR.getDESCRIPCION(),
								TipoDeConversion.BOLIVAR_DOLAR.getDESCRIPCION(),
								TipoDeConversion.BOLIVIANO_DOLAR.getDESCRIPCION(),
								TipoDeConversion.CHI_DOLAR.getDESCRIPCION(),
								TipoDeConversion.COL_DOLAR.getDESCRIPCION(),
								TipoDeConversion.GUARANI_DOLAR.getDESCRIPCION(),
								TipoDeConversion.REAL_DOLAR.getDESCRIPCION(),
								TipoDeConversion.SOL_DOLAR.getDESCRIPCION(),
								TipoDeConversion.URU_DOLAR.getDESCRIPCION()},
						"Elija una operacion").toString();
				
				String valor = JOptionPane.showInputDialog("Introduce un valor");
				Validar validar = new Validar();
				
				if(!validar.verificar(valor)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validar.transformarEnDouble(valor);
                    BigDecimal valorConvertido = iniciarConversion.InstruccionesOperaciones(operaciones, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
			}
		}
		
		
	}
}
