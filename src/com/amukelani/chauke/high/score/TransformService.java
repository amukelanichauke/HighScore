package com.amukelani.chauke.high.score;

import java.util.ArrayList;
import java.util.List;

import static com.amukelani.chauke.high.score.Constants.CSV_DELIMITER;
import static com.amukelani.chauke.high.score.Constants.LINE_SEPERATOR;

public class TransformService {

    public List<TestScore> getTestScoresFromStringData( String data){

        List <TestScore> testScores = new ArrayList<>();
        String [] testScoresArray = data.split(LINE_SEPERATOR);

        for (int score = 0; score< testScoresArray.length; score++){
            TestScore testScore = new TestScore();
            String [] testScoreDate = testScoresArray[score].split(CSV_DELIMITER);
            testScore.setFirstName(testScoreDate[0]);
            testScore.setLastName(testScoreDate[1]);
            testScore.setScore(Integer.parseInt(testScoreDate[2]));

            testScores.add(testScore);
        }
        return testScores;
    }
}
