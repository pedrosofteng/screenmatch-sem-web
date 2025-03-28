package br.com.estudo.screnmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();
    // mapper é o objeto do Jackson que faz a conversão, json - object java

    @Override
    public <T> T obterDados(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        // mapper.readValue = lê o json e transforma em classe, nessa classe no caso
        // ELE PRECISA DE TRY CATCH!!!!!!!!!!!
    }
}
