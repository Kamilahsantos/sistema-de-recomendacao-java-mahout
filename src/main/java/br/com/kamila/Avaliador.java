package br.com.kamila;
//realizando todos os imports necessários:
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

import java.io.IOException;
//esta classe avaliador mede a taxa de erro do  nosso recomendador
public class Avaliador {
    public static void main(String[] args) throws IOException, TasteException {
        //o método usetestseed permite fixar valores para teste, impedindo resultados aleatórios a cada teste
        RandomUtils.useTestSeed();
        //usa  o modelo de de análise
        DataModel modelo = new Recomendador().getModeloDeFilmes();
        //calcula a média absoluta dos testes para informar a taxa de erro
        RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
        RecommenderBuilder builder = new RecomendadorBuilder();
        //90% para treino e 10% para teste
        double erro = evaluator.evaluate(builder, null, modelo, 0.9, 1.0);
        System.out.println("A taxa de erro desse sistema de recomendacao atualmente e:");
        System.out.println(erro);

    }
}
