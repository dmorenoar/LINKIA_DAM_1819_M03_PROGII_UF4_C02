/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf4_c02;

/**
 *
 * @author dmorenoar
 */
public class Coche implements Cloneable{
    
    private String marca;
    private int potencia;
    private static int id = 0; //Creo una variable común para todos
    private int precio;
    private int identificadorCoche = 0; //Es única para cada objeto
    
    
    public Coche(){}
    
    public Coche(String marca, int potencia){
        this.marca = marca;
        this.potencia = potencia;
        id++;
        this.identificadorCoche = id;
    }
    
    //Aprovechamiento de constructores
    public Coche(String marca, int potencia,int precio){
        this(marca,potencia); //El busca un constructor que cumpla lo que le pasamos
        this.precio = precio;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public int getPotencia(){
        return this.potencia;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    @Override
    public String toString(){
         return "Coche:" + "Marca:" + this.marca + ", Potencia: " + this.potencia;
    }
    
    @Override //Redefino el método clone para hacerlo mío
    public Object clone() throws CloneNotSupportedException{
        id++;
        return super.clone();
    }
    
    public int getContadorIds(){
        return this.id;
    }
    
    
    public int getId(){
        return this.id;
    }
    
    public int getIdentificadorCoche(){
        return this.identificadorCoche;
    }
}
