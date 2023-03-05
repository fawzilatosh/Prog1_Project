
public class Validator {

	public static void main(String[] args) {

        String prefix = "thebest!";
		
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
    
    
    
    
    
    
    
}