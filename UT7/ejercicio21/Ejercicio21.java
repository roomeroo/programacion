package ejercicio21;

public class Ejercicio21 {
    public static int randomInt(int a, int b){
        return((int)(Math.random()*(b - a + 1) + a));
    }
    public static int comprobarMultiplo(int numeringo){
        if(numeringo % 5 == 0)  
            return numeringo;
        for(int i = 0; i < 5; i++){
            if((numeringo + i) % 5 == 0)
                return(numeringo + i);
        }
        return (-1);
    }
    public static void main(String[] args) {
       int str[] = new int[15];
       for(int i = 0; i < str.length; i++){
            str[i] = randomInt(0,500);
       }
       System.out.println("Array original:");
       for(int i = 0; i < str.length; i++){
        System.out.print(str[i] + " ");
        str[i] = comprobarMultiplo(str[i]);
        } 
        System.out.println("Array modificado");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
            } 
    }  
}
