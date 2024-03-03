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
 * @brief Class ClasseEx16
 */
import java.util.Scanner;

public class ClasseEx16 {
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
        int j = valor;
        System.out.println("Sua diagonal Secundaria:");
        for (int i = 0; i < valor; i++) {
            j--;
            System.out.println(matriz[i][j] + " ");
        }
        sc.close();
    }
}
