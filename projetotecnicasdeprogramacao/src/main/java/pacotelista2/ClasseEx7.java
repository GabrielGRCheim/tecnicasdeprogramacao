/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx7
 */
import java.util.Scanner;

public class ClasseEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, maior;

        System.out.println("Digite os valores de (A, B) nessa ordem");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }
        System.out.println("Valor de A:" + a);
        System.out.println("Valor de B:" + b);
        System.out.println("Maior:" + maior);

        sc.close();
    }
}
