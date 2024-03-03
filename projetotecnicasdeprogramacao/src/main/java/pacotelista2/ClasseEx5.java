/*
 * Copyright (C) 2024 Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
