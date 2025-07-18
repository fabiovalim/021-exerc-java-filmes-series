package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epPorTemporadas;
    private int minPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpPorTemporadas() {
        return epPorTemporadas;
    }

    public void setEpPorTemporadas(int epPorTemporadas) {
        this.epPorTemporadas = epPorTemporadas;
    }

    public int getMinPorEpisodio() {
        return minPorEpisodio;
    }

    public void setMinPorEpisodio(int minPorEpisodio) {
        this.minPorEpisodio = minPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epPorTemporadas * minPorEpisodio;
    }
}
