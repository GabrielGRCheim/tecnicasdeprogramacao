/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx8
 */
import java.util.Scanner;

public class ClasseEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, maior;
        System.out.println("Digite o valor de (A e B)");
        a = sc.nextInt();
        b = sc.nextInt();

        maior = (a > b) ? (maior = a) : (maior = b);

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        System.out.println("Maior: " + maior);

        sc.close();
    }
}
