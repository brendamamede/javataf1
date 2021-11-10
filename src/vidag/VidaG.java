/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vidag;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Proa
 */
public class VidaG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Java{
public static void main(String args []){
	Scanner in = new Scanner(System.in);
	
	System.out.println("Escolha uma opção:");
	System.out.println("1 - ver hora do sistema");
	System.out.println("2 - ver a resolução da tela");
	System.out.println("3 - ver o idioma do sistema");
	int num = in.nextInt();
	
	switch (num) {
	case 1:
		Date relogio = new Date();
		System.out.println("A hora do sistema é:");
		System.out.println(relogio.toString());
		break;
		
	case 2:
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A sua tela está em resolução: "+ d.width +" x " + d.height);
		break;
		
	case 3:
		Locale loc = Locale.getDefault();
		System.out.println("Seu sistema está em " + loc.getDisplayLanguage());
		break;
	case 4:
		Date relogio2 = new Date();
		System.out.println("A hora do sistema é:");
		System.out.println(relogio2.toString());
		Toolkit tk2 = Toolkit.getDefaultToolkit();
		Dimension d2 = tk2.getScreenSize();
		System.out.println("A sua tela está em resolução: " + d2.width + " x " + d2.height);
		Locale loc2 = Locale.getDefault();
		System.out.println("Seu sistema está em" + loc2.getDisplayLanguage());
	default:
		System.out.println("opção inválida");
		break;
	
		
	}
  }
}

