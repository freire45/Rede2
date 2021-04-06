package br.com.erickfreire.rede2;

import javax.swing.JFrame;

public class Rede2Teste {
	public static void main(String[] args) {
		Rede2 painel = new Rede2();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicacao.add(painel);
		aplicacao.setSize(250,250);
		aplicacao.setVisible(true);
	}

}
