public class prueba {
    public static String quitarEspacios(String str){
        String newStr = "";
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i)!= ' '){
                newStr += str.charAt(i);
            }
        }
        return (newStr);
    }
}