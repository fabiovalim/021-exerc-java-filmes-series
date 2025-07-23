package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(150);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme (minutos): " + meuFilme.getDuracaoEmMinutos());

        Serie minhaSerie = new Serie("Breaking Bad", 2000);
        minhaSerie.setDuracaoEmMinutos(150);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpPorTemporadas(7);
        minhaSerie.setMinPorEpisodio(45);
        minhaSerie.setAtiva(false);
        System.out.println("Duração da série (minutos): " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora =  new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro =  new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeNovo = new Filme("Dogville", 2003);
        filmeNovo.setDuracaoEmMinutos(200);
        filmeNovo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>(); // trabalhando com listas
        listaDeFilmes.add(meuFilme);                        // consultar no JavaDoc
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeNovo);
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println((i+1) + "º filme: " + listaDeFilmes.get(i).getNome());
        }


    }
}
