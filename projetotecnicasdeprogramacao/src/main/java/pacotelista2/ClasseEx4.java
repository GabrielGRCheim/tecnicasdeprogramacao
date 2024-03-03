/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx4
 */
import java.util.Scanner;

public class ClasseEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z, calculo;
        System.out.println("digite o valor das 3 variaveis");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        calculo = x * y / z;
        System.out.println(calculo);

        sc.close();
    }
}
