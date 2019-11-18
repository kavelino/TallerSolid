/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersolid;

import java.util.ArrayList;
import java.util.Currency;

/**
 *
 * @author CltControl
 */
public class Carrito {
    private ArrayList <Producto> items;
    private Currency subTotal;
    private Currency impuestos;
    private Currency total;
    private SqlDatabase db;
    private CreditCard tarjeta;
    public Carrito(){
        db = new SqlDatabase();
        tarjeta = new CreditCard();
    } 
    public void comprar() {
        guardarEnBaseSQL(items);
        pagarConTarjetaCredito(total);
    }
    public void guardarEnBaseSQL(ArrayList <Producto> l){
        // Guarda los datos en una SQL database
    }
    public void pagarConTarjetaCredito(Currency monto){
        // Realiza el pago utilizando una Tarjeta de crédito
    }
    public void agregarProducto(Producto p){
        items.add(p);
    }
    public void quitarProducto(Producto p){
        items.remove(p);
    }
    public void calcularTotales(){
        // Calcula el total, subtotal e impuestos de los 
        // productos y sus cantidades
    }
    // Getters y Setters

    
}