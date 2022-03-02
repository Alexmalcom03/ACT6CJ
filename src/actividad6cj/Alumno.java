/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6cj;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author alexm
 */
public class Alumno {
    
   protected String nombre = "";
   protected float array [] = new float[5];
   
    
   
     
   public float promedio(float array[], int contador ){
      float promedio=0;
      float suma=0;
      for(int i=0;i<=array.length-1;i++){
          suma= suma+array[i];
          System.out.println("Calificacion " + (i+1) +" :"+ array[i]);
      }
      
       System.out.println("Promedio: "+ (promedio= suma/array.length));
       return promedio= suma/array.length; 
  }
   
   public String calificacion(float promedio){
       String result = "calificacion";
       if(promedio<=50){
           result="F";
       }if(promedio>=51&&promedio<=60){
           result="E";
       }if(promedio>=61&&promedio<=70){
           result="D";
       }if(promedio>=71&&promedio<=80){
           result="C";
       }if(promedio>=81&&promedio<=90){
           result="B";
       }
       if(promedio>=91&&promedio<=100){
           result="A";
       }
       
       System.out.println("Calificacion:" +
               result);
       
       return result;
        
       
   }

   public void informacionAlumno(){
       System.out.println("Nombre del estudiante:"+nombre);
       calificacion(this.promedio(array, 0));
       
       
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getArray() {
        return array;
    }

    public void setArray(float[] array) {
        this.array = array;
    }
   
   
   
}
