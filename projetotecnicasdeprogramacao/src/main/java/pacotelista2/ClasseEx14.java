/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx14
 */
import java.util.Scanner;

public class ClasseEx14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont, max;
        cont = 0;
        System.out.println("Digite o valor max:");
        max = sc.nextInt();

        for (int i = 2; i < max; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                cont++;
                System.out.println(i);
            }
        }

        System.out.println("Total de numeros primos existentes entre 1 a " + max + " : " + cont);

        sc.close();
    }
}
