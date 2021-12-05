package entity.model;

public class Answer {

    private String body;

    public Answer(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "body='" + body + '\'' +
                '}';
    }
}
