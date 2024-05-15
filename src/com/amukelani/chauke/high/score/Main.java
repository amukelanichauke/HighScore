package com.amukelani.chauke.high.score;

import java.io.IOException;
import java.util.*;

import static com.amukelani.chauke.high.score.Constants.EMPTY_STRING;
import static com.amukelani.chauke.high.score.Constants.SCORE;

public class Main {
    public static void main(String[] args) throws IOException {

        DataReaderService dataReaderService = new DataReaderService();
        TransformService transformService = new TransformService();
        RankingService rankingService = new RankingService();
        HighScore highScore;

        String fileName = args[0]; // src/TestData.csv

        //get string data from file
        String data = dataReaderService.getDataFromCSVFile(fileName);

        //Transform the string data into a list
        List<TestScore> testScoresList = transformService.getTestScoresFromStringData(data);

        //Get High Scores
        highScore = rankingService.getTopScores(testScoresList);

        //Print the results
        for (TestScore scorer : highScore.getTopScores()) {
            System.out.printf("%s %s%n", scorer.getFirstName(), scorer.getLastName());
        }
        System.out.printf("%s%s%n", SCORE, highScore.getScore() + EMPTY_STRING);

    }
}