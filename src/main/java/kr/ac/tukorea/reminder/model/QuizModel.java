package kr.ac.tukorea.reminder.model;

public class QuizModel {
    private String word;
    private String mean;
    private int quizSpace;
    private String uid;

    public QuizModel(String word, String mean, int quizSpace, String uid) {
        this.word = word;
        this.mean = mean;
        this.quizSpace = quizSpace;
        this.uid = uid;
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

    public String getUid() {
        return uid;
    }
}

