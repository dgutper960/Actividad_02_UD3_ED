/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * Clase de tipo píblica
 * @author David
 * @version 1.1.
 */
public class CCuenta {

/**
 * Campos de Clase
 */
     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue
    * @param sal
    * @param tipo 
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * Metodo que asigna el nombre
   * @param nom 
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    public String obtenerNombre()
    {
        return nombre;
    }

    
     public double estado ()
    {
        return saldo;
    }
/**
 * Metodo para ingresar
 * @param cantidad
 * @throws Exception 
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * Metodo para retirar
    * @param cantidad
    * @throws Exception 
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }
/**
 * Esto son los Setters
 * @param cuenta 
 */
  
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * Esto es un Getter
  * @return 
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
