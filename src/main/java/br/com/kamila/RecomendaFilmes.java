package br.com.kamila;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

public class RecomendaFilmes {
    public static void main(String[] args) throws IOException, TasteException {
        DataModel filmes = new Recomendador().getModeloDeFilmes();
        Recommender recommender = new RecomendadorBuilder().buildRecommender(filmes);
        
        //TODO receber as informações de usuário e número de recomendações do usuário
        
        List<RecommendedItem> recommendations = recommender.recommend(4, 3);
        for (RecommendedItem recommendation : recommendations) {
            System.out.println("Voce pode gostar deste filme");
            System.out.println(recommendation);
        }


    }
}
