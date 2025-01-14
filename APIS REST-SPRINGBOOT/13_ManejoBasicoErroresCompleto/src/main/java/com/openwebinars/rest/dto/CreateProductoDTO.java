package com.openwebinars.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateProductoDTO {
	
	private String nombre;
	private float precio;
	private long categoriaId;

	public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

}
