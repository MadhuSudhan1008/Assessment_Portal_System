package Assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import Questions.Question;

public class Assessment {
	static ArrayList<Question> QuestionList = new ArrayList<>();
    static {
        HashMap<Integer, String> answerList1 = new HashMap<>();
        answerList1.put(1, "Answer 1");
        answerList1.put(2, "Answer 2");
        answerList1.put(3, "Answer 3");
        answerList1.put(4, "Answer 4");
        int correctAnswer = 2; 
        Question sampleQuestion1 = new Question("The ??", answerList1, correctAnswer);
        QuestionList.add(sampleQuestion1);
        
        HashMap<Integer, String> answerList2 = new HashMap<>();
        answerList2.put(1, "Answer 1");
        answerList2.put(2, "Answer 2");
        answerList2.put(3, "Answer 3");
        answerList2.put(4, "Answer 4");
        int correctAnswer2 = 4; 
        Question sampleQuestion2 = new Question("Sample Question", answerList2, correctAnswer2);
        QuestionList.add(sampleQuestion2);
       
        
        HashMap<Integer, String> answerList3 = new HashMap<>();
        answerList1.put(1, "Answer 1");
        answerList1.put(2, "Answer 2");
        answerList1.put(3, "Answer 3");
        answerList1.put(4, "Answer 4");
        int correctAnswer3 = 2; 
        Question sampleQuestion3 = new Question("The ??", answerList3, correctAnswer3);
        QuestionList.add(sampleQuestion3);
     
        HashMap<Integer, String> answerList4 = new HashMap<>();
        answerList2.put(1, "Answer 1");
        answerList2.put(2, "Answer 2");
        answerList2.put(3, "Answer 3");
        answerList2.put(4, "Answer 4");
        int correctAnswer4 = 4; 
        Question sampleQuestion4 = new Question("Sample Question", answerList4, correctAnswer4);
        QuestionList.add(sampleQuestion4);
        
     
        HashMap<Integer, String> answerList5 = new HashMap<>();
        answerList5.put(1, "Answer 1");
        answerList5.put(2, "Answer 2");
        answerList5.put(3, "Answer 3");
        answerList5.put(4, "Answer 4");
        int correctAnswer5 = 4; 
        Question sampleQuestion5 = new Question("Sample Question", answerList5, correctAnswer5);
        QuestionList.add(sampleQuestion5);
      
        HashMap<Integer, String> answerList6 = new HashMap<>();
        answerList6.put(1, "Answer 1");
        answerList6.put(2, "Answer 2");
        answerList6.put(3, "Answer 3");
        answerList6.put(4, "Answer 4");
        int correctAnswer6= 4; 
        Question sampleQuestion6 = new Question("Sample Question", answerList6, correctAnswer6);
        QuestionList.add(sampleQuestion6);
   
        HashMap<Integer, String> answerList7 = new HashMap<>();
        answerList7.put(1, "Answer 1");
        answerList7.put(2, "Answer 2");
        answerList7.put(3, "Answer 3");
        answerList7.put(4, "Answer 4");
        int correctAnswer7 = 4; 
        Question sampleQuestion7 = new Question("Sample Question", answerList7, correctAnswer7);
        QuestionList.add(sampleQuestion7);
        
       
        HashMap<Integer, String> answerList8 = new HashMap<>();
        answerList8.put(1, "Answer 1");
        answerList8.put(2, "Answer 2");
        answerList8.put(3, "Answer 3");
        answerList8.put(4, "Answer 4");
        int correctAnswer8 = 4; 
        Question sampleQuestion8 = new Question("Sample Question", answerList8, correctAnswer8);
        QuestionList.add(sampleQuestion8);
        
       
        HashMap<Integer, String> answerList9 = new HashMap<>();
        answerList9.put(1, "Answer 1");
        answerList9.put(2, "Answer 2");
        answerList9.put(3, "Answer 3");
        answerList9.put(4, "Answer 4");
        int correctAnswer9 = 4; 
        Question sampleQuestion9 = new Question("Sample Question", answerList9, correctAnswer9);
        QuestionList.add(sampleQuestion9);
        
        
        HashMap<Integer, String> answerList10 = new HashMap<>();
        answerList10.put(1, "Answer 1");
        answerList10.put(2, "Answer 2");
        answerList10.put(3, "Answer 3");
        answerList10.put(4, "Answer 4");
        int correctAnswer10 = 4; 
        Question sampleQuestion10 = new Question("Sample Question", answerList10, correctAnswer10);
        QuestionList.add(sampleQuestion10);
        
    }
    
 public void displayInformation() {
	 int score = 0;
	 System.out.println(".....................................................");
	 System.out.println("Welcome to the JAVA assessment");
	 Scanner obj = new Scanner(System.in);
	 for (int i = 0;i<QuestionList.size();i++) {
		 System.out.println((i+1)+"."+QuestionList.get(i).getQuestionName());
		 System.out.println("The Options are : ");
		 for(Entry<Integer, String> element : QuestionList.get(i).getAnswerList().entrySet()) {
			 System.out.println(element.getKey() + "." + element.getValue());
		 }
		 System.out.println("enter the correct answer");
		 
		 int answer = obj.nextInt();
		 if(answer == QuestionList.get(i).getCorrectAnswer()) {
			 score++;
		 }
	     System.out.println("............................");
	 }
	 System.out.println("you secured "+((score*100)/10)+"percentage");
	 System.out.println("Thank you for taking the test");
	 
 }
}
