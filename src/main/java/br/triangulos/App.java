package br.triangulos;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) {

    }

    static void leLados() {
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1: "));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2: "));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3: "));
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

    }
}
