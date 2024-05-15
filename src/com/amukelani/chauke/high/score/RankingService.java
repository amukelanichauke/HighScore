package com.amukelani.chauke.high.score;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RankingService {

    public HighScore getTopScores(List<TestScore> testScoresList){
        HighScore highScore = new HighScore();

        // Find the maximum score
        int maxScore = Integer.MIN_VALUE;
        for (TestScore scorer : testScoresList) {
            maxScore = Math.max(maxScore, scorer.getScore());
        }

        List<TestScore> topScorers = new ArrayList<>();
        for (TestScore scorer : testScoresList) {
            if (scorer.getScore() == maxScore) {
                topScorers.add(scorer);
            }
        }

        Collections.sort(topScorers, Comparator.comparing(TestScore::getFirstName)); // Sorting on First Name

        highScore.setScore(maxScore);
        highScore.setTopScores(topScorers);
        return highScore;

    }
}
