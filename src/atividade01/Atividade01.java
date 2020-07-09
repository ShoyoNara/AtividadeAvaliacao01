
package atividade01;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Atividade01 {

    /**
     * Faça um algoritmo que receba o valor do raio de um circulo qualquer.
     * Calcule o perímetro do círculo (P = 2.pi.r) , a Área do circulo 
     * (A = PI . r²) e o Diâmetro do círculo (D = 2 . r). Mostre os resultados.
     */
    public static void main(String[] args) {
        
        double r, p, a, d;
        
        r = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Raio: "));
        
        p = 2 * Math.PI * r;
        a = Math.PI * Math.pow(r, 2);
        d = 2 * r;

        
        JOptionPane.showMessageDialog(null, "O Valor do raio inserido foi de: "+r+
                "\nEntão, o valor do Perímetro sera de: "+p+ "\nO Valor da Área Do Circulo sera de: "+a+
                "\nE o valor do Diâmetro Do Circulo sera de: "+d);
        
    }
    
}
