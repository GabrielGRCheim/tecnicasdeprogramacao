/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx15
 */
import java.util.Scanner;

public class ClasseEx15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da matriz quadrada");
        int valor = sc.nextInt();

        int matriz[][] = new int[valor][valor];

        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                System.out.println("Digite o valor:");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sua diagonal principal:");
        for (int i = 0; i < valor; i++) {

            System.out.println(matriz[i][i] + " ");
        }
        sc.close();
    }
}
