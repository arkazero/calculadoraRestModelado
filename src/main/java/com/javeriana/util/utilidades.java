package com.javeriana.util;

import java.util.ArrayList;
import java.util.List;

public class utilidades {
	
	public static final String VALIDAR_PARAM = "{parametros:(/?(-?[0-9]+))*}";
	
	public static final String PATH_MULTIPARAMETRO = "{parametros:(/?(-?[0-9]+))*}";
    public static final String PATH_MULTIPARAMETRO_DIV = "{parametros:(/?(-?[0-9]+))*}";
    public static final String PATH_PARAM_MULTIPARAMETRO = "parametros";
	
	public List<Double> leerParametros(String parametrosURL){
		List<Double> operadores = new ArrayList<Double>();
		//parametrosURL = parametrosURL.replace("%2F", "/");
		String [] parametros = parametrosURL.split("/");
		for (String op : parametros) {
            if(!"".equals(op)){
            	operadores.add(Double.valueOf(op)); 
            }
        }
		return operadores;
	}
}
