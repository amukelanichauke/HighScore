package com.amukelani.chauke.high.score;

import java.util.List;

public class HighScore {

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<TestScore> getTopScores() {
        return topScores;
    }

    public void setTopScores(List<TestScore> topScores) {
        this.topScores = topScores;
    }

    private int score;
    private List<TestScore> topScores;
}
