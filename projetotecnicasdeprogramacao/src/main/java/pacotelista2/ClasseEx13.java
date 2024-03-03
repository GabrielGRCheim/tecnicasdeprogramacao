/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx13
 */
import java.util.Scanner;

public class ClasseEx13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, soma;
        x = sc.nextInt();
        y = sc.nextInt();
        soma = x;

        for (int i = 1; i < y; i++) {
            soma = soma * x;
        }
        System.out.println(soma);

        sc.close();
    }
}
