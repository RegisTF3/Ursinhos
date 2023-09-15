/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ursinhos.model;
import java.util.ArrayList;
/**
 *
 * @author 182210126
 */
public class Ursinho {
    String base;
    String acessorios;
    String roupa;
    float valor;

    public Ursinho(String base, String acessorios, String roupa, float valor) {
        this.base = base;
        this.acessorios = acessorios;
        this.roupa = roupa;
        this.valor = valor;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public ArrayList<Ursinho> listaUrso(){
      ArrayList<Ursinho> alUrs = new ArrayList<>();
      Ursinho urso = new Ursinho(base,acessorios,roupa,valor);   
    return alUrs;
    }
           
}
