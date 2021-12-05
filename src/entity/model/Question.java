package entity.model;

import java.util.InputMismatchException;
import java.util.List;

public class Question {

    private String body;
    private String[][] options;
    private int points;
    private int constructor;

    public Question(String body, String[][] options, int points) {
        this.constructor = 1;
        this.body = body;
        this.options = options;
        this.points = points;
    }

    public Question(String body, int points) {
        this.constructor = 2;
        this.body = body;
        this.points = points;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String[][] getOptions() {
        return options;
    }

    public void setOptions(String[][] options) {
        this.options = options;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(Question question, int points) {
        int range = (int) (Math.random() * 5) + 1;
        if (question.constructor == 1) {
            points = 1;

        } else if (question.constructor == 2){
            points = range;
        }
        this.points = points;
    }

    @Override
    public String toString() {
        return "Question{" +
                "body='" + body + '\'' +
                ", options=" + options +
                '}';
    }
}
