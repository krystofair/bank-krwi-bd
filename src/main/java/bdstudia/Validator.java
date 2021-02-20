package bdstudia;

/**
 *
 * @author krystofair
 */
public class Validator {
    
    public static boolean validateSQL(String s) {
        if(s.contains("'")) return false;
        if(s.contains("--")) return false;
        return false;
    }
    public static boolean isOnlyDigit(String s) {
        for(int i=0; i<s.length(); ++i) {
            if(!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
    
    public static boolean validatePESEL(String s) {
        if(s.length() == 11) {
            int[] tab = {1,3,7,9,1,3,7,9,1,3};
            int suma=0;
            for(int i=0; i<10; ++i) {
                suma += tab[i] * (s.charAt(i)-48);
            }
            suma = suma%10 == 0 ? 0 : 10-suma%10;
            return suma == (s.charAt(10)-48);
        }
        return false;
    }
}
