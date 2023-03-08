package Prog1_Project;

public class Validator {

	public static void main(String[] args) {


        }
	/*
	 // First Method
	 public static boolean isAlphaNum(char alphaNumeric) {                 
	      
	    	 if ((alphaNumeric >= '0' && alphaNumeric <= '9') || (alphaNumeric >= 'a' && alphaNumeric <= 'z') || (alphaNumeric >= 'A' && alphaNumeric <= 'Z')){
	    	       return true ;
	    	      }else{
	    	       return false ;
	    	      }        		
		          }    
	  // Second Method                       
	public static boolean isSpecialChar(char specCharac) {                 
	         
	    	 if (specCharac == '_'  || specCharac == '-' || specCharac == '.'){
	    	       return true ;
	    	      }else{
	    	       return false ;
	    	      }        		
		          }           
	     // Third Method
	public static boolean isPrefixChar(char prefCharac) {                 
	         
	    	 if (isSpecialChar(prefCharac)|| isAlphaNum(prefCharac)){
	    	       return true ;
	    	      }else{
	    	       return false ;
	    	      }        		
		          }
		          // Forth Method
	public static boolean isDomainChar(char domCharac) {                 
	     
		 if (isSpecialChar(domCharac)|| isAlphaNum(domCharac)){
		       return true ;
		      }else{
		       return false ;
		      }        		
	          }  
		  // Fifth Method        
	public static boolean singleAtSign(String str) {                 
		int count=0;
		      
		
			 for (int i=0;i< (str.length()-1);i++ ) {
					if (str.charAt(i)== '@') {count +=  1;}
					} 
						if  (count ==1) return true;
				
					
						else return false;
			 }

       
	           // Sixeth Method
	public static String fetchBeforeAt(String str) {  
	String[] parts = str.split("\\@");
    String firstPart = parts[0];
    return firstPart;
	}

          // Seventh Method
public static String fetchAfterAt(String str) {                 
	String[] parts = str.split("\\@");
    String secondPart = parts[1];
    return secondPart;
	} 


     // eighteeth Method
	public static boolean isPrefix(String prefix) {
		
		boolean word1bt1 = false;
		boolean word1bt3 = false;
		boolean word1bt2 = false;
	    boolean word1bt4 = false;
		if (prefix.length() > 1) 
			 word1bt1 = true; 									     
	    
		for (int i=0;i< prefix.length();i++ ) {
		
		if ( isPrefixChar(prefix.charAt(i))== true ){
			word1bt2 = true;
		} else {word1bt2 = false;
	     break;}	
	    }
		for (int i=0;i< prefix.length();i++ ) {
			
			if  ( isSpecialChar(prefix.charAt(i))== true){ 
		          if (isAlphaNum(prefix.charAt(i+1))== true) 
			word1bt4 = true;
			 else word1bt4 = false; break;}
		    } 										
		if (isAlphaNum(prefix.charAt(0))== true) {
			word1bt3 = true; }		    	    
		if (word1bt1 == true && word1bt2 == true && word1bt3 == true && word1bt4 == true) return true; else return (false) ;
		}
		
		// ninth Method
			public static boolean isDomain(String str) {
		
	    // Split the input string into two parts using the period character as the separator
	     String[] parts = str.split("\\.");
	     // Store the first and second parts of the domain in separate variables
	     String firstPart = parts[0];
	     String secondPart = parts[1];
	     
	     if (firstPart.length() != 1) {
	         return false;
	     }
	     
	     if (secondPart.length() != 2) {
	         return false;
	     }
	     
	     // If either the first or second part is empty, it's not a valid domain
	     if (firstPart.isEmpty() || secondPart.isEmpty()) {
	         return false;
	     }
	     
	     if (firstPart.isEmpty() || secondPart.isEmpty()) {
	         return false;
	     }
	     
	     // Loop through the characters in the first part of the domain
	     for (int i = 0; i < firstPart.length(); i++) {
	         char ch = firstPart.charAt(i);
	       
	         // If a character is not a letter, digit, period, or hyphen, it's not a valid domain
	         if (isDomainChar(firstPart.charAt(i)) != true) {
		         return false;
		     }
	       
	         
	         if ((isAlphaNum(firstPart.charAt(i))!= true) && ch == '_' ) {
	             return false;
	         }
	         // If a period or hyphen is at the beginning or end of the first part, it's not a valid domain
	         if ((isSpecialChar(ch) == true) && (i == 0 || i == firstPart.length() - 1)) {
	             return false;
	         }
	         // If a period or hyphen is followed by a non-letter/digit character, it's not a valid domain
	         if ((ch == '.' || ch == '-') && (isAlphaNum(firstPart.charAt(i + 1))!= true)) {
	             return false;
	         }
	     }
	     // Loop through the characters in the second part of the domain
	     for (int i = 0; i < secondPart.length(); i++) {
	         char ch = secondPart.charAt(i);
	         // If a character is not a letter, it's not a valid domain
	     
	         
	         if (!Character.isLetter(ch)) {
	             return false;
	        }
	     }
	     return true;
		
	}
		*/
	
	// isAlphaNum() - check if a character is alphanumeric

	// isSpecialChar() - check if a character is an acceptable special character
	
	// isPrefixChar() - only alphanumeric characters, dashes, periods, or underscores in prefix
	
	// isDomainChar() - can contain only alphanumeric characters, dashes, or periods
	
	// singleAtSign() - check if a String contain a single at sign (@). 
	
	// fetchBeforeAt() - get the beginning of an email address
	
	// fetchAfterAt() - get the ending of an email address
	
	
	
	
	// PREFIX - check if the start of a string is a valid email prefix
	
//	» Contains at least one character.
//	» Contains only alphanumeric characters, underscores (_), periods (.), and dashes (-).
//	» An underscore, period, or dash must always be followed by at least one alphanumeric characters. 
//	» First character is alphanumeric.
	
	public static boolean isPrefix(String prefix) {
	// If the input string has no characters, it's not a valid prefix
	     if (prefix.length() == 0) {
	         return false;
	     }

	     for (int i = 1; i < prefix.length(); i++) {
	         char c = prefix.charAt(i);
	         if (!isAlphaNum(c) || !isPrefixChar(c)) {
	             return false;
	         }
	         if ((c == '_' || c == '.' || c == '-') && (i == prefix.length() - 1 || !Character.isLetterOrDigit(prefix.charAt(i + 1)))) {
	             return false;
	         }
	     }
	     return true;
	}

	
	// DOMAIN - check if the end of a String is a valid email domain
	     
//	     » Made up of two portions separated by a period.
//	     » First portion contains at least one character.
//	     » Second portion contains at least two characters.
//	     » First portion contains only alphanumeric characters, periods, and dashes.
//	     » A period or dash, in the first portion must be followed by one or more alphanumeric characters. » The second portion contains only letters of the alphabet.
	     
	     
	public static boolean isDomain(String str) {
		
	    // Split the input string into two parts using the period character as the separator
	     String[] parts = str.split("\\.");
	     if (parts.length != 2) {
	         return false;
	     }
	     // Store the first and second parts of the domain in separate variables
	     String firstPart = parts[0];
	     String secondPart = parts[1];
	     
	     // If either the first or second part is empty, it's not a valid domain
	     if (firstPart.isEmpty() || secondPart.isEmpty()) {
	         return false;
	     }
	     
	     // Loop through the characters in the first part of the domain
	     for (int i = 0; i < firstPart.length(); i++) {
	         char ch = firstPart.charAt(i);
	         
	         // If a character is not a letter, digit, period, or hyphen, it's not a valid domain
	         if (!Character.isLetterOrDigit(ch) && ch != '.' && ch != '-') {
	             return false;
	         }
	         // If a period or hyphen is at the beginning or end of the first part, it's not a valid domain
	         if ((ch == '.' || ch == '-') && (i == 0 || i == firstPart.length() - 1)) {
	             return false;
	         }
	         // If a period or hyphen is followed by a non-letter/digit character, it's not a valid domain
	         if ((ch == '.' || ch == '-') && !Character.isLetterOrDigit(firstPart.charAt(i + 1))) {
	             return false;
	         }
	     }
	     // Loop through the characters in the second part of the domain
	     for (int i = 0; i < secondPart.length(); i++) {
	         char ch = secondPart.charAt(i);
	         // If a character is not a letter, it's not a valid domain
	         if (!Character.isLetter(ch)) {
	             return false;
	        }
	     }
	     return true;
	 }
	
	
	// EMAIL - check if a string is a valid email address
	
	// A valid email address consists of a prefix, '@' symbol, and domain. Both the prefix and the domain must be written in acceptable formats.
	
    public static boolean isEmail(String email) {
        // check for single @ sign
        if (!singleAtSign(email)) {
            return false;
        }
        
        // split the email into prefix and domain
        String prefix = fetchBeforeAt(email);
        String domain = fetchAfterAt(email);
        
        // check prefix and domain lengths
        if (prefix.length() == 0 || domain.length() == 0) {
            return false;
        }
        
        // check prefix and domain characters
        if (!isPrefix(prefix) || !isDomain(domain)) {
            return false;
        }
        
        // if all checks passed, email is valid
        return true;
        
    	}
    

    // USERNAME - check if a string is a valid username
    
//    » Contains at least one alphanumeric character
//    » Contains seven or less characters
//    » Contains only alphanumeric characters, periods, dashes, or an exclamation point (!). » Must start with a period, or dash.
//    » A period, or dash must always be followed by at least one alphanumeric characters.

    
    
    public static String isUsername(String username) {
        // check if input is empty
        if (username == null || username.isEmpty()) {
            return "";
        }

        // check if input contains only allowed characters
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!isAlphaNum(c) && !isSpecialChar(c)) {
                return "";
            }
        }

        // check if input contains at least one alphanumeric character
        boolean hasAlphaNum = false;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (isAlphaNum(c)) {
                hasAlphaNum = true;
                break;
            }
        }
        if (!hasAlphaNum) {
            return "";
        }

        // check if input contains 7 or fewer characters
        if (username.length() > 7) {
            return "";
        }

        // check if input starts with a period or dash
        char firstChar = username.charAt(0);
        if (!isPrefixChar(firstChar)) {
            return "";
        }

        // check if period or dash is always followed by at least one alphanumeric character
        for (int i = 1; i < username.length(); i++) {
            char currentChar = username.charAt(i);
            char previousChar = username.charAt(i - 1);
            if (isSpecialChar(previousChar) && !isAlphaNum(currentChar)) {
                return "";
            }
        }

        // if all checks passed, return lowercase input
        return username.toLowerCase();


}


    
    
    public static boolean safePassword(String password) {
    	
        // check if input contains at least one alphanumeric character
        boolean hasAlphaNum = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (isAlphaNum(c)) {
                hasAlphaNum = true;
                break;
            	}
           
    

    ////////////////////////////////////////////////////////////////////////////////////

    

    
    





    
}