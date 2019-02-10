package br.com.kamila;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

public class Recomendador {

    public DataModel getModeloLivros() throws IOException {
        
        return getModelo("livros.csv");
    }

    private DataModel getModelo(String path) throws IOException {
        File file = new File("src/main/resources/" + path);
        return new FileDataModel(file);
    }

    public DataModel getModeloDeFilmes() throws IOException {
        
       return getModelo("filmes.csv");
    }

}
