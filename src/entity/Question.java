package entity;



public class Question {

    //    all the parameters are declared as protected, to have something between private and public.
    protected String body;
    protected String answer;
    protected String options;


    //    Constructor tha takes 3 parameters, body, options and answer, for when called on the other classes to create a Composition object
    public Question(String body,String options, String answer ){
        this.body = body;
        this.options = options;
        this.answer = answer;
    }

    //    Getters for question's body, options and answers
    public String getBody() {
        return body;
    }
    public String getAnswer() {
        return answer;
    }
    public String getOptions() {
        return options;
    }

    //    Setters for question's body, options and answers
    public void setBody(String body) {
        this.body = body;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void setOptions(String options) {
        this.options = options;
    }
}
