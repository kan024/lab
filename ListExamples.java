import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class ListExamples {

  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
  static List<String> filter(List<String> list, StringChecker sc) {
    List<String> result = new ArrayList<>();
    for(String s: list) {
      if(sc.checkString(s)) {
        result.add(0, s);
      }
    }
    return result;
  }


  // Takes two sorted list of strings and returns a new list with all upper case
  // letter from both strings;
  static List<String> capital(List<String> list1, List<String> list2) {
	  
    List<String> result = new ArrayList<>();
    
    for(String letter : list1) {
    	if (letter.equals(letter.toUpperCase())) {
    		result.add(letter);
    	}
    }
    return result;
  }


}
