package entity.model;

import java.util.ArrayList;
import java.util.List;

public class ExaminationModel {

    List<Question> questions = new ArrayList<>();
    List<Answer> answers = new ArrayList<>();

    public ExaminationModel(List<Question> questions, List<Answer> answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "questions=" + questions +
                ", answers=" + answers +
                '}';
    }
}
