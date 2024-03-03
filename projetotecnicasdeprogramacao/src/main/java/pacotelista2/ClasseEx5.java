/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pacotelista2;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx5
 */
import java.util.Scanner;

public class ClasseEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidade, tempo, distancia;

        System.out.println("Informe a (Velocidade / Tempo da Viagem ) nessa ordem");
        velocidade = sc.nextInt();
        tempo = sc.nextInt();
        distancia = tempo * velocidade;

        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Tempo da Viagem: " + tempo + " horas");
        System.out.println("Distancia percorrida: " + distancia + " km");

        sc.close();
    }
}
