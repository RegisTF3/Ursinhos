/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ursinhos.Controler;

import java.util.ArrayList;

/**
 *
 * @author 182210131
 */
public class ursinhocontrole {
  private String base;
  private String acessorios;
  private String Roupas;
  private float  preco;

    public ursinhocontrole() {
    }

    public ursinhocontrole(String base, String acessorios, String Roupas, float preco) {
        this.base = base;
        this.acessorios = acessorios;
        this.Roupas = Roupas;
        this.preco = preco;
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

    public String getRoupas() {
        return Roupas;
    }

    public void setRoupas(String Roupas) {
        this.Roupas = Roupas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

   public ArrayList <Ursinho> criarUrsinho(String Base,String acessorios,String Roupas,float Preco){
       
       ArrayList<Usrinho> listaUrsinho = new ArrayList<>();
        Ursinho ursinho = new Ursinho(base, acessorios, Roupas, Preco);
        listaUrsinho.add(ursinho);
        return listaUrsinho;
   }
  
}
