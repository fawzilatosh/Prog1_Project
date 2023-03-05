
public class Validator {

	public static void main(String[] args) {


		String[] emails = {""};
        for (String email : emails) {
            if (isEmail(email)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        	}
        
        
    }
		
	
	// EMAIL
	
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
    

    // USERNAME
    
    public static String isUsername(String input) {
        // check if input is null or empty
        if (input == null || input.isEmpty()) {
            return "";
        }

        // check if input contains only allowed characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!isAlphaNum(c) && !isSpecialChar(c)) {
                return "";
            }
        }

        // check if input contains at least one alphanumeric character
        boolean hasAlphaNum = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isAlphaNum(c)) {
                hasAlphaNum = true;
                break;
            }
        }
        if (!hasAlphaNum) {
            return "";
        }

        // check if input contains 7 or fewer characters
        if (input.length() > 7) {
            return "";
        }

        // check if input starts with a period or dash
        char firstChar = input.charAt(0);
        if (!isPrefixChar(firstChar)) {
            return "";
        }

        // check if period or dash is always followed by at least one alphanumeric character
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            if (isSpecialChar(previousChar) && !isAlphaNum(currentChar)) {
                return "";
            }
        }

        // if all checks passed, return lowercase input
        return input.toLowerCase();
    }

    public static boolean isSpecialChar(char c) {
        return c == '.' || c == '-' || c == '!';
    }

    public static boolean isAlphaNum(char c) {
        return Character.isLetterOrDigit(c);
    }

    public static boolean isPrefixChar(char c) {
        return c == '.' || c == '-';
    }

    

    
//	public static boolean isPrefix(String prefix) {
//	     if (prefix.length() == 0) {
//	         return false;
//	     }
//	     if (!Character.isLetterOrDigit(prefix.charAt(0))) {
//	         return false;
//	     }
//	     for (int i = 1; i < prefix.length(); i++) {
//	         char c = prefix.charAt(i);
//	         if (!(Character.isLetterOrDigit(c) || c == '_' || c == '.' || c == '-')) {
//	             return false;
//	         }
//	         if ((c == '_' || c == '.' || c == '-') && (i == prefix.length() - 1 || !Character.isLetterOrDigit(prefix.charAt(i + 1)))) {
//	             return false;
//	         }
//	     }
//	     return true;
////   
//	
//	
//	public static boolean isDomain(String str) {
//	     String[] parts = str.split("\\.");
//	     if (parts.length != 2) {
//	         return false;
//	     }
//	     String firstPart = parts[0];
//	     String secondPart = parts[1];
//	     if (firstPart.isEmpty() || secondPart.isEmpty()) {
//	         return false;
//	     }
//	     for (int i = 0; i < firstPart.length(); i++) {
//	         char ch = firstPart.charAt(i);
//	         if (!Character.isLetterOrDigit(ch) && ch != '.' && ch != '-') {
//	             return false;
//	         }
//	         if ((ch == '.' || ch == '-') && (i == 0 || i == firstPart.length() - 1)) {
//	             return false;
//	         }
//	         if ((ch == '.' || ch == '-') && !Character.isLetterOrDigit(firstPart.charAt(i + 1))) {
//	             return false;
//	         }
//	     }
//	     for (int i = 0; i < secondPart.length(); i++) {
//	         char ch = secondPart.charAt(i);
//	         if (!Character.isLetter(ch)) {
//	             return false;
//	        }
//	     	}
//	     return true;
//	 }
    
    
    
}


