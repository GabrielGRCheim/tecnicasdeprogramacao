/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx9
 */
import java.util.Scanner;

public class ClasseEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o valor dos lados do trinagulo");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilatero");

        } else if (a == b || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Escaleno");
        }

        sc.close();
    }
}
