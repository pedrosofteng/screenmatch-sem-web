package br.com.estudo.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") Integer numero,
                             @JsonAlias("Episodes") List<DadosEpisodios> episodios) {
    @Override
    public List<DadosEpisodios> episodios() {
        return episodios;
    }

    @Override
    public String toString() {
        return "\nTemporada: " + numero + "\n";
//                "\nEpisodios: " + episodios + "\n";
    }
}
