package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {
	
	public List<Question> loadQuestionsOnJava() {
		String subjectName="Java";
		
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q = new Question("What is Java ?", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Java is a Database", false));
		ops.add(new Option("Java is a Programming language", true));
		ops.add(new Option("Java is a OS", false));
		ops.add(new Option("Java is a filesystem", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
	
		q = new Question("What is G1 ?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("G1 is a Garbage Collector in Java", true));
		ops.add(new Option("Java is a Programming language", false));
		ops.add(new Option("Java is a OS", false));
		ops.add(new Option("Java is a filesystem", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Which is data structure that does not allow duplicate values?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("G1 is a Garbage Collector in Java", false));
		ops.add(new Option("Java is a Programming language", false));
		ops.add(new Option("Set", true));
		ops.add(new Option("Java is a filesystem", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		return qb.getQuestionsFor(subjectName);
	
	}
}
