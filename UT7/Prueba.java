public class Prueba{
    public static void main(String[] args){
        int str[] = new int[5];
        
        str[0] = 1;
        str[1] = 6;
        int i = 1;
        while(++i < 5){
            System.out.println("Posicion del array 1, " + i);
            str[i] = Integer.parseInt(System.console().readLine());
        }
        i = 0;
        printStr(str);
        while(i < 5){
            System.out.println("Posicion del array 2, " + i);
            str[i] = Integer.parseInt(System.console().readLine());
            i++;
        }
        printStr(str);
    }
    public static void printStr(int str[]){
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + ", ");
        }
        System.out.println("");
    }
}