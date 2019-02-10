package br.com.kamila;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;
//nesta classe está a relação dos modelos de filmes e livros para a serem recomendados
public class Recomendador {

    public DataModel getModeloLivros() throws IOException {
        //arquivo usado com a base de usuários, os códigos dos livros e as notas atribuídas
        return getModelo("livros.csv");
    }

    private DataModel getModelo(String path) throws IOException {
        File file = new File("src/main/resources/" + path);
        return new FileDataModel(file);
    }

    public DataModel getModeloDeFilmes() throws IOException {
        //arquivo usado com a base de usuários, os códigos dos filmes e as notas atribuídas
       return getModelo("filmes.csv");
    }

}
