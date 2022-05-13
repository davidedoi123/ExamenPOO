/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.util.ArrayList;
import modelo.producto;



public class administradorArray {
    ArrayList <producto> productos; 
    private int contador;
    public administradorArray()  {
    
    }
    public void crearArraylist(){
        productos= new ArrayList();
    }
    public void insertarproducto(producto producto){
        productos.add(producto );
    }
    public String devolverInformacion(){
        String reporte="";
        for(int contador_0;contador<productos.size();contador++){
            reporte+=productos.get(contador).toString();
        }
    return reporte;
    }
    public boolean eliminarProducto(String codigo){
            boolean encontrado=false;
            for(int contador_0;contador<productos.size();contador++){
            if(productos.get(contador).getcodigo().equals(codigo)){
               encontrado=true;
                productos.remove(contador);
            }
    }
              
   return encontrado;
   }
}

  

