package edu.jsu.mcis;

import java.util.*;
import java.util.Scanner;

public class Hangman {
    public enum Result { WIN, LOSE, NONE };
    private String word;
    private List<Character> usedLetters;
    private int counter;
    public Hangman() {
        word = "";
        usedLetters = new ArrayList<Character>();
        counter=0;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public boolean available(char c) {
    	for(i=0; i<word.length){
    		if(c==word.charAt(i)){
    			counter++;
    			return true;
    		}
    			
    	}
    	return false;
    }
    
    public int guess(char c) {
    	if(available(C))
    		return 2;
    	else
    		return 1;
    }
    
    public Result getResult() {
    	if (counter>=word.length());
    		return WIN;
    	else{
    	if (usedLetters>=10)
    		return LOSE
    	else
    		return Result.NONE;
    	}
    }
    
}












