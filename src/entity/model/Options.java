package entity.model;

public class Options {

    private String body;

    public Options(String body) {
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
        return "Options{" +
                "body='" + body + '\'' +
                '}';
    }
}
