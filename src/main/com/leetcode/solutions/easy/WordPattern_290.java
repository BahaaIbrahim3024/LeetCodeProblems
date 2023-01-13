package main.com.leetcode.solutions.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern_290 {
  public boolean wordPattern(String pattern, String s) {
    String [] listOfWords = s.split(" ");
    int patternSize = pattern.length();
    int listOfWordsSize = listOfWords.length;
    if(listOfWordsSize != patternSize)
      return false;
    Set<Character> uniqPattern = new HashSet<>();
    Set<String> uniqWord = new HashSet<>();
    for(int i =0; i<patternSize; ++i){
     uniqPattern.add(pattern.charAt(i));
     uniqWord.add(listOfWords[i]);
    }
    if(uniqPattern.size() != uniqWord.size())
      return false;
    Map<Character, String> map = new HashMap<>();

    for (int i =0; i<patternSize; ++i){
      if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(listOfWords[i]))
        return false;
      map.put(pattern.charAt(i), listOfWords[i]);
    }
    return true;
  }
}
