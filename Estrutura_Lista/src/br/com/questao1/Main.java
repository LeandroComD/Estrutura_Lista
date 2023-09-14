package br.com.questao1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> prioridade = new LinkedList<Integer>();
        LinkedList<Integer> lista = new LinkedList<Integer>();

        for (int i = 0; i < 200; i++) {
            lista.add(i+1);
            if (i % 2 != 0 && i <= 100) {
                prioridade.add(i);
                lista.remove(prioridade.indexOf(i));
            }


        }
        for (Integer elemento : prioridade) {
            System.out.println(elemento);
        }

        System.out.println();
        for (Integer comum : lista) {
            System.out.println(comum);

        }
    }
}