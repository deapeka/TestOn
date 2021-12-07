package service;

import entity.Student;
import entity.Question;
import entity.Teacher;


import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ExaminationService {
   protected String userInput;

   public String getUserInput() {
      return userInput;
   }

   public void setUserInput(String courseInput) {
      this.userInput = courseInput;
   }

   Scanner input = new Scanner(System.in);
   CourseService course = new CourseService();

//   int secondPassed = 0;
//   Timer timer = new Timer();
//   TimerTask timerTask = new TimerTask() {
//      @Override
//      public void run() {
//       secondPassed ++;
//         System.out.println("Second passed: " + secondPassed);
//      }
//   };

   Teacher[] teachers = new Teacher[]{
           new Teacher("Irin Vokopola", "irin1", "test1",18),
           new Teacher("Dea Peka", "dea1", "test2",15)
   };

   Student[] students = new Student[]{
           new Student("Irin Vokopola", "irin", "test1",2),
           new Student("Dea Peka", "dea", "test2",2)
   };

   public void run(){
      System.out.println("\nWelcome on our Online Examination Program\nAre you a Teacher or a Student");
      String userInput = input.next();
      if (userInput.equalsIgnoreCase("teacher")){
         System.out.println("Enter your username and password");
         String teacherUsername = input.next();
         String teacherPassword = input.next();
         for (Teacher value : teachers) {
            if (teacherUsername.equalsIgnoreCase(value.getUsername()) && teacherPassword.equalsIgnoreCase(value.getPassword())) {
               System.out.println("Log in Successful\nWelcome " + value.getFullName());
               chooseCourse();
               System.out.println("The other actions you can make are:  ");
               System.out.println("1.Add Questions, 2.Delete Question, 3.Check Question");

               try {
                  int teacherAnswer = input.nextInt();
                  if (teacherAnswer == 1) {
                     if (getUserInput().equalsIgnoreCase("m")) {
                        addQuestion(course.MathematicsQuestions);
                     } else if (getUserInput().equalsIgnoreCase("h")) {
                        addQuestion(course.HistoryQuestions);
                     } else if (getUserInput().equalsIgnoreCase("l")) {
                        addQuestion(course.LiteratureQuestions);
                     }
                  } else if (teacherAnswer == 2) {
                     if (getUserInput().equalsIgnoreCase("m")) {
                        deleteQuestions(course.MathematicsQuestions);
                     } else if (getUserInput().equalsIgnoreCase("h")) {
                        deleteQuestions(course.HistoryQuestions);
                     } else if (getUserInput().equalsIgnoreCase("l")) {
                        deleteQuestions(course.LiteratureQuestions);
                     }
                  } else if (teacherAnswer == 3) {
                     if (getUserInput().equalsIgnoreCase("m")) {
                        checkQuestion(course.MathematicsQuestions);
                     } else if (getUserInput().equalsIgnoreCase("h")) {
                        checkQuestion(course.HistoryQuestions);
                     } else if (getUserInput().equalsIgnoreCase("l")) {
                        checkQuestion(course.LiteratureQuestions);
                     }
                  }break;
               }catch (InputMismatchException i ){
                  System.out.println("Invalid input! Only digits are allowed!");
               }
               catch (Exception e) {
                  e.printStackTrace();
               }
            }
         }
      }
      else if (userInput.equalsIgnoreCase("student")){
         System.out.println("Enter your username and password");

         String studentUsername = input.next();
         String studentPassword = input.next();

         for (Student value : students) {
            if (studentUsername.equalsIgnoreCase(value.getUsername()) && studentPassword.equalsIgnoreCase(value.getPassword())) {
               System.out.println("Welcome " + value.getFullname());
               chooseCourse();
               if (getUserInput().equalsIgnoreCase("m")) {
                  takeTest(course.MathematicsQuestions);
               } else if (getUserInput().equalsIgnoreCase("h")) {
                  takeTest(course.HistoryQuestions);
               } else if (getUserInput().equalsIgnoreCase("l")) {
                  takeTest(course.LiteratureQuestions);
               }
            }
         }
      }
   }

   public void chooseCourse(){
      System.out.println("\nWhich course's quiz would you like to see?\nM = Mathematics, H = History, L=Literature " );

      userInput = input.next();
      setUserInput(userInput);
      if (userInput.equalsIgnoreCase("m")){
         course.MathematicsCourse();
         course.getMathematicsQuestions();
      }else if (userInput.equalsIgnoreCase("h")){
         course.HistoryQuestion();
         course.getHistoryQuestions();
      }else if (userInput.equalsIgnoreCase("l")){
         course.LiteratureQuestion();
         course.getLiteratureQuestions();
      }else{
         System.out.println("Ups! The course you entered is not available for the moment. We are working on adding new ones!");
         chooseCourse();
      }
   }


   public void takeTest(Question[] questions){
      Scanner input = new Scanner(System.in);
      int score = 0;


      for (Question question : questions) {
         System.out.println(question.getBody());
         System.out.println(question.getOptions());
         System.out.println("\nYour Answer:");
         String userInput = input.next();
         if (userInput.equalsIgnoreCase(question.getAnswer())) {
            score++;

         }
         }
      System.out.println("\nYour Score is: " + score + " / " + questions.length);

   }


   public void addQuestion(Question[] questions){
      System.out.println("Please enter your question below: ");
      String questionInput = input.next();
      System.out.println("Below add at least two options(numbers to be written as words): ");
      String option1 = input.next();
      String option2 = input.next();
      System.out.println("Would you like to add more options?(yes/no) ");
      String userResponse = input.next();
      if (userResponse.equalsIgnoreCase("yes")){
         System.out.println("Now you can add exactly two more options: ");
         String option3 = input.next();
         String option4 = input.next();
         System.out.println("Which is the correct answer? (a, b, c, d) " );
         String testAnswer = input.next();
         String userOptions = "\n" + "(a) " + option1 + "\n(b) " + option2 + "\n(c) " + option3 + "\n(d) " + option4;
         new Question(questionInput, userOptions, testAnswer);
         checkQuestion(questions);
      }else if (userResponse.equalsIgnoreCase("no")){
         System.out.println("Which is the correct answer? (a, b)" );
         String testAnswer = input.next();
         String userOptions = "\n" + "(a) " + option1 + "\n(b) " + option2;
         new Question(questionInput, userOptions, testAnswer);
         checkQuestion(questions);
      }
   }

   public void deleteQuestions(Question[] questions){
      Question[] newQuestions = new Question[questions.length-1];
      int count = 0;
      int index = 0;
      for (Question question : questions) {
         System.out.println(count + ") " + question.getBody());
         count++;
      }
      System.out.println("Which element you want to delete" );
      Scanner input = new Scanner(System.in);
      int userAnswer = input.nextInt();
      if (questions.length - 1 - userAnswer >= 0)
         System.arraycopy(questions, userAnswer + 1, questions, userAnswer, questions.length - 1 - userAnswer);
      System.arraycopy(questions, 0, newQuestions, 0, newQuestions.length);
      System.out.println("The list of questions after the deletion is: \n");
      for (Question newQuestion : newQuestions) {
         System.out.println(index + ") " + newQuestion.getBody());
         index++;
      }
   }

   public void checkQuestion(Question[] questions){
      int count = 0;
      for (Question question : questions) {
         System.out.println(count + ") " + question.getBody());
         count++;
      }
   }




}
