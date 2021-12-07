package service;

import entity.Question;

public class CourseService {

    Question[] MathematicsQuestions, HistoryQuestions, LiteratureQuestions;

    public void MathematicsCourse(){
        MathematicsQuestions = new Question[]{
                new Question("What is 5 time 2? ", "\n(a)10\n(b)20\n(c)5\n(d)1", "c"),
                new Question("What is 3 times 3? ", "\n(a)3\n(b)9\n(c)11\n(d)12", "b"),
                new Question("How can you write differently the derivative for a function? ", "\n(a)dy/dx\n(b)dx/dy", "a"),
                new Question("How is velocity calculated?", "\n(a)Displacement / time\n(b)Displacement * time\n(c)Time / displacement\n(d)Time + displacement", "a"),
                new Question("Is it sin(x) the integral of cos(x)? ", "\n(a)Yes\n(b)No", "b")
        };
    }

    public void HistoryQuestion(){
        HistoryQuestions = new Question[]{
                new Question("Which is the capital of England?", "\n(a)London\n(b)Tirana\n(c)Washington DC\n(d)Berlin", "a"),
                new Question("In which year did the Albania's independence day was declared? ", "\n(a)1300\n(b)1989\n(c)1912\n(d)2001", "c"),
                new Question("Who was the man to raise Albania's national flag on it's Independence Day? " ,"\n(a)Ismail Qemali\n(b)Qemal Stafa\n(c)Gjergj Kastriot Skenderbeu\n(d)Lek Dukagjini", "a"),
                new Question("Did ILYRIA have a larger expansion than toady's Albania?" ,"\n(a)Displacement / time\n(b)Displacement * time\n(c)Time / displacement\n(d)Time + displacement", "a"),
                new Question("Italy is the biggest country in the world when it comes to it's territory surface " ,"\n(a)True\n(b)False", "b")
        };
    }

    public void LiteratureQuestion(){
        LiteratureQuestions = new Question[]{
                new Question("How many alphabet characters are there in Albania's language?", "\n(a)30\n(b)28\n(c)36\n(d)40", "c"),
                new Question("How many vowels are there in Albania's alphabet? " ,"\n(a)7\n(b)9\n(c)11\n(d)5", "a"),
                new Question("Which is spelled rightly?", "\n(a)Indipendence\n(b)Independence", "b"),
                new Question("Which was the first Albanian written document?" ,"\n(a)Meshari i Gjon Buzukut\n(b)Independence document", "a"),
                new Question("The alternation of the timber voice is called:" ,"\n(a)Intonation\n(b)Syllables\n(c)Verse\n(d)Tune", "a")
        };
    }

    public void setMathematicsQuestions(Question[] mathematicsQuestions) {
        MathematicsQuestions = mathematicsQuestions;
    }

    public void setHistoryQuestions(Question[] historyQuestions) {
        HistoryQuestions = historyQuestions;
    }

    public void setLiteratureQuestions(Question[] literatureQuestions) {
        LiteratureQuestions = literatureQuestions;
    }

    public Question[] getMathematicsQuestions() {
        return MathematicsQuestions;
    }

    public Question[] getHistoryQuestions() {
        return HistoryQuestions;
    }

    public Question[] getLiteratureQuestions() {
        return LiteratureQuestions;
    }
}
