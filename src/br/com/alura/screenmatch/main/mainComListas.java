package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mainComListas {
    public static void main(String[] args) {
        Filme meuFilme1 = new Filme("O Poderoso Chefão", 1970);
        Filme meuFilme2 = new Filme("Avatar", 2023);
        Filme meuFilme3 = new Filme("Dogville", 2003);
        Serie minhaSerie = new Serie("Breaking Bad", 2000);

        meuFilme1.avalia(9);
        meuFilme2.avalia(6);
        meuFilme3.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme1);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(minhaSerie);

        for(Titulo item: lista) { // para cada elemento da lista
            System.out.println(item.getNome());

            if(item instanceof Filme filme) { // verificar se o item é do tipo 'Filme'
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("Adam Sandler");
        artistas.add("Paulo Freire");
        artistas.add("Fabio Valim");

        System.out.println(artistas); // nao ordenado
        Collections.sort(artistas);
        System.out.println(artistas); // ordenado

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento)); // usar o ano de lancamento como criterio
        System.out.println(lista);
    }
}
