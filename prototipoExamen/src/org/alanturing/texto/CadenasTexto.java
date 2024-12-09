package org.alanturing.texto;

public class CadenasTexto {
    public static int contadorVocales (String str){
        int index = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                index++;
        }
        
        return (index);
    }

    public static String revString (String str){
        String revString = "";
        for(int i = 0; i < str.length(); i++){
            revString += str.charAt(str.length() - 1 - i);
        }

        return (revString);
    }

    public static String quitarEspacios(String str){
        String newStr = "";
        str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ')
                newStr += str.charAt(i);
        }

        return (newStr);
    }

    public static boolean esPalindromo (String str){
        str = quitarEspacios(str);
            if(str.equals(revString(str)))
                return(true);
            return (false);
    }
}
