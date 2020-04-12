/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import enums.TipoElemento;

/**
 *
 * @author davim
 */
public class ElementoDTO{
    public String elemento;
    public TipoElemento tipo;
    public int posicao;   
    
    public ElementoDTO setElementoDTO(String elemento, TipoElemento tipo, int posicao){
        this.elemento = elemento;
        this.tipo = tipo;
        this.posicao = posicao;
        
        return this;
    }
    
    public TipoElemento getTipo(){
        return tipo;
    }
}
