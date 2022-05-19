package kr.ac.tukorea.reminder.model;

public class QuizModel {
    private String word;
    private String mean;
    private int quizSpace;

    public QuizModel(String word, String mean, int quizSpace) {
        this.word = word;
        this.mean = mean;
        this.quizSpace = quizSpace;
    }


    public String getWord() {
        return word;
    }

    public String getMean() {
        return mean;
    }

    public int getQuizSpace() {
        return quizSpace;
    }
}

