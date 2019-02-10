package br.com.kamila;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

import java.io.IOException;

public class Avaliador {
    public static void main(String[] args) throws IOException, TasteException {
        
        RandomUtils.useTestSeed();
        
        DataModel modelo = new Recomendador().getModeloDeFilmes();
        
        RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
        RecommenderBuilder builder = new RecomendadorBuilder();
        
        double erro = evaluator.evaluate(builder, null, modelo, 0.9, 1.0);
        System.out.println("A taxa de erro desse sistema de recomendacao atualmente e:");
        System.out.println(erro);

    }
}
