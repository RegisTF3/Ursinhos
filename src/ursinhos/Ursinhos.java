/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ursinhos;

import javax.swing.JFrame;
import ursinhos.View.Janela;

/**
 *
 * @author 182210131
 */
public class Ursinhos {

    public static void main(String[] args) {
       
        Janela in = new Janela();
        in.setVisible(true);
        in.setSize(450,785);
        in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    
}
