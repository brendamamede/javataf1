
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Proa
 */

class Hello{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("1 - Ver hora do sistema");
        System.out.println("2 - Ver resolução da tela");
        System.out.println("3 - Ver o idioma do sistema");
        System.out.println("4 - Ver todos acima");
        int num = in.nextInt();

        switch (num) {
            case 1 -> {
                Date relogio = new Date();
                System.out.println("A hora do sistema é: ");
                System.out.println(relogio.toString());
            }
            case 2 -> {
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();
                System.out.println("A resolução de sua tela é: " + d.width + "x" + d.height);
            }
            case 3 -> {
                Locale loc = Locale.getDefault();
                System.out.println("Seu sistema está em " + loc.getDisplayLanguage());
            }
            case 4 -> {
                Date relogio2 = new Date();
                System.out.println("A hora do sistema é: ");
                System.out.println(relogio2.toString());

                Toolkit tk2 = Toolkit.getDefaultToolkit();
                Dimension d2 = tk2.getScreenSize();
                System.out.println("A resolução de sua tela é: " + d2.width + "x" + d2.height);

                Locale loc2 = Locale.getDefault();
                System.out.println("Seu sistema está em " + loc2.getDisplayLanguage());
            }
            default -> System.out.println("Opção inválida");
        }

    }
}