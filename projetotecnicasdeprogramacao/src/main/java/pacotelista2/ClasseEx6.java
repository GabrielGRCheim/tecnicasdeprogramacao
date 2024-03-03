/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx6
 */
import java.util.Scanner;

public class ClasseEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, d;

        System.out.println("Digite os valore de (x1,y1,x2,y2) nessa ordem");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        d = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);

        System.out.println("Ponto 1:(" + x1 + "," + y1 + ")");
        System.out.println("Ponto 2:(" + x2 + "," + y2 + ")");
        System.out.println("Distancia: " + d);

        sc.close();
    }
}
