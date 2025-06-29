package br.com.estudo.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
// IGNORA TUDO QUE NÃO FOR OQ COLOQUEI ABAIXO, POR PADRÃO ELE VEM FALSE
// então ele tenta converter tudo que tá no json
public record DadosSerie(@JsonAlias("Title") String tituloSerie,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("Response") boolean resposta,
                         @JsonAlias("Actors") String atores,
                         @JsonAlias("Plot") String sinopse,
                         @JsonAlias("Poster") String poster,
                         @JsonAlias("Genre") String genero) {

    @Override
    public String toString() {
        return "\nTitulo: " + tituloSerie +
                "\nTemporadas: " + totalTemporadas +
                "\nAvaliação: " + avaliacao +
                "\nAtores: " + atores +
                "\nSinopse: " + sinopse;
    }

    @Override
    public Integer totalTemporadas() {
        return totalTemporadas;
    }

    /*@JsonProperty("Title") - le e escreve title, quando converter
    @JsonAlias("Title") String titulo - le title e escreve titulo pra converter*/

    // posso fazer list tambem @JsonAlias("Title", "Titulo")
}
