package com.javeriana.calculator;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.javeriana.util.utilidades;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Path("/calculator")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "Calculadora Rest", description = "Son las operaciones basicas de una calculadora")
public class Calculadora{

	@GET()
	@Path("/add/" + utilidades.PATH_MULTIPARAMETRO)
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@ApiOperation(value = "Operacion Sumar", notes = "Retorna el resultado de la suma de los numeros recibidos por parametro")	
	public Double sumar(@PathParam(utilidades.PATH_PARAM_MULTIPARAMETRO) String URL) {
		utilidades util = new utilidades();
		List<Double> operadores = util.leerParametros(URL);
		
		Double valorTotal = 0.0;
		
		for (Double op : operadores) {
			valorTotal += op;
		}
		return valorTotal;
	}
	
	@GET()
	@Path("/subs/" + utilidades.PATH_MULTIPARAMETRO)
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@ApiOperation(value = "Operacion Restar", notes = "Retorna el resultado de la resta de los numeros recibidos por parametro")
	public Double restar(@PathParam(utilidades.PATH_PARAM_MULTIPARAMETRO) String URL) {
		utilidades util = new utilidades();
		List<Double> operadores = util.leerParametros(URL);
		
		Double valorTotal = operadores.get(0).doubleValue();
		
		int i=0;
		for (Double op : operadores) {
			if ( i != 0){
				valorTotal -= op;
			}
			i++;
		}
		return valorTotal;
	}
	
	@GET()
	@Path("/mult/" + utilidades.PATH_MULTIPARAMETRO)
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@ApiOperation(value = "Operacion Multiplicar", notes = "Retorna el resultado de la multiplicacion de los numeros recibidos por parametro")
	public Double multiplicar(@PathParam(utilidades.PATH_PARAM_MULTIPARAMETRO) String URL) {
		utilidades util = new utilidades();
		List<Double> operadores = util.leerParametros(URL);
		
		Double valorTotal = 1.0;
		
		for (Double op : operadores) {
			valorTotal *= op;
		}
		return valorTotal;
	}
	
	@GET()
	@Path("/div/" + utilidades.PATH_MULTIPARAMETRO)
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@ApiOperation(value = "Operacion Division", notes = "Retorna el resultado de la division de los numeros recibidos por parametro")
	public Double dividir(@PathParam(utilidades.PATH_PARAM_MULTIPARAMETRO) String URL) {
		utilidades util = new utilidades();
		List<Double> operadores = util.leerParametros(URL);
		
		Double valorTotal = operadores.get(0).doubleValue();
		int i=0;
		for (Double op : operadores) {
			if ( i != 0){
				valorTotal /= op;
			}
			i++;
		}
		return valorTotal;
	}
	
}
