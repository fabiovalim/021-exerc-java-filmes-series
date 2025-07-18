import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Filme outroFilme = new Filme();
        Serie minhaSerie = new Serie();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(150);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme (minutos): " + meuFilme.getDuracaoEmMinutos());

        minhaSerie.setNome("Breaking Bad");
        minhaSerie.setAnoLancamento(2000);
        minhaSerie.setDuracaoEmMinutos(150);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpPorTemporadas(7);
        minhaSerie.setMinPorEpisodio(45);
        minhaSerie.setAtiva(false);
        System.out.println("Duração da série (minutos): " + minhaSerie.getDuracaoEmMinutos());

        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
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
    }
}
