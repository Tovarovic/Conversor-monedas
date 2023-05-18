package conversorDeMoneda.enums;

public enum TipoDeConversion {
	
	DOLAR_ARG("Dolar a Peso Argentino"),
	DOLAR_CHI("Dolar a Peso Chileno"),
	DOLAR_URU("Dolar a Peso Uruguayo"),
	DOLAR_COL("Dolar a Peso Colombiano"),
	DOLAR_BOLIVAR("Dolar a Bolivar Venezolano"),
	DOLAR_BOLIVIANO("Dolar a Boliviano"),
	DOLAR_REAL("Dolar a Real Brasilero"),
	DOLAR_SOL("Dolar a Sol Peruano"),
	DOLAR_GUARANI("Dolar a Guarani Paraguayo"),
	
	ARG_DOLAR("Peso Argentino a Dolar"),
	CHI_DOLAR("Peso Chileno a Dolar"),
	URU_DOLAR("Peso Uruguayo a Dolar"),
	COL_DOLAR("Peso Colombiano a Dolar"),
	BOLIVAR_DOLAR("Bolivar Venezolano a Dolar"),
	BOLIVIANO_DOLAR("Boliviano a Dolar"),
	REAL_DOLAR("Real Brasilero a Dolar"),
	SOL_DOLAR("Sol Peruano a Dolar"),
	GUARANI_DOLAR("Guarani Paraguayo a Dolar");
	
	private String DESCRIPCION;

	TipoDeConversion(String DESCRIPCION) {
		this.DESCRIPCION = DESCRIPCION;
	}

	public String getDESCRIPCION() {
		return DESCRIPCION;
	}

}
