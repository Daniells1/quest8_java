/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char kind;

        int rabbits = 0, rats = 0, frogs = 0, value, total;

        int a = input.nextInt();

        for (int i = 0; i < a; i++) {

            value = input.nextInt();

            kind = input.next().charAt(0);



            if (kind == 'C') {

                rabbits += value;

            }else if (kind == 'R') {

                rats += value;

            }else

                frogs += value;



        }

        total = frogs + rats + rabbits;

        System.out.println("Total: "+ total +" cobaias");

        System.out.println("Total de coelhos: "+ rabbits);

        System.out.println("Total de ratos: "+ rats);

        System.out.println("Total de sapos: "+ frogs);

        float pc = ((float) rabbits * 100) / (float) total;

        System.out.println(String.format("Percentual de coelhos: %.2f", pc) + " %");

        pc = ((float) rats * 100) / total;

        System.out.println(String.format("Percentual de ratos: %.2f", pc) + " %");

        pc = ((float) frogs * 100) / total;

        System.out.println(String.format("Percentual de sapos: %.2f", pc) + " %");

    }

}