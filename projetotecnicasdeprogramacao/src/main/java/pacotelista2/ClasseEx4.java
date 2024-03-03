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