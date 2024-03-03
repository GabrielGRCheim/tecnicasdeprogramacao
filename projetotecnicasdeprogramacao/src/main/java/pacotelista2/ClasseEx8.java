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
