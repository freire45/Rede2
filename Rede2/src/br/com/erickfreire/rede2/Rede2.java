package br.com.erickfreire.rede2;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Crie um programa em Java que desenha uma rede dos quatro lados de uma janela
 * @author Erick Freire
 * @version 1 - Criado em 06-04-2021 as 18:26
 */

public class Rede2 extends JPanel {
	
	public void paintComponent(Graphics g) {
		 int width = getWidth ();
		   int height = getHeight();
		   int contador = 1;
		   int c =0;
		      
		   while(c<250){ 
		   
		       g.drawLine(0,c,c,height);
		       g.drawLine(width,c,c,0);
		       g.drawLine(width-c,0,0,c);
		       g.drawLine(width,c,height - c,height);
		      c+=10; 

		   }
	}

}
