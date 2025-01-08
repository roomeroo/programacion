package revStr;

public class revStr {
    public static void main(String[] args){
        System.out.println("Introduzca los 15 numeros");
        int str[] = new int[15];
        int revStr[] = new int[str.length];
        int j = 0;
        int k = str.length - 1;
        for(int i = 0; i < str.length; i++){
            str[i] = Integer.parseInt(System.console().readLine());
        }   
        while(j < str.length){
            revStr[k] = str[j];
            j++;
            k--;
        }
        System.out.println("Tu string es: ");
        for(int res = 0; res < revStr.length; res++){
            System.out.print(revStr[res] + " ");
        }
    }

}
