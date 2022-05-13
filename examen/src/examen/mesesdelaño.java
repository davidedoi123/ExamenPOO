/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author LABORATORIO_2
 */
public class mesesdelaño {
    String mes ="";
    String[] meses = new String[12];
    
    public void nombre_mes(){
        mes ="abril";
        mes="noviembre";
        System.out.println("nombre de mes:"+mes);
    }
    public String nombre_meses(){
        meses[0]="Enero";
        meses[1]="Febrero";
        meses[2]="Marzo";
        meses[3]="Abril";
        meses[4]="Mayo";
        meses[5]="Junio";
        meses[6]="Julio";
        meses[7]="Agosto";
        meses[8]="Setiembre";
        meses[9]="Octubre";
        meses[10]="Noviembre";
        meses[11]="Diciembre";
          
    return "";
    }
    public String[] arreglo_meses(){
        meses[0]="Enero";
        meses[1]="Febrero";
        meses[2]="Marzo";
        meses[3]="Abril";
        meses[4]="Mayo";
        meses[5]="Junio";
        meses[6]="Julio";
        meses[7]="Agosto";
        meses[8]="Setiembre";
        meses[9]="Octubre";
        meses[10]="Noviembre";
        meses[11]="Diciembre";
          
    return meses;
    }
    public static void main(String[] args) {
        mesesdelaño r=new mesesdelaño();
        //r.nombre_mes();
        for(String a : r.arreglo_meses()){
            System.out.println("arreglo:"+a);
        }
    }
    }

