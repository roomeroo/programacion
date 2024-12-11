package UT8.matematicas;

public class matematicas {
    public static long voltea (long numero){
        long revNum = 0;
        while(numero > 0){
            revNum = numero % 10 + revNum * 10;
            numero /= 10;
        }
        return (revNum);
    }

    public static boolean esCapicua (int numero){
        if(numero == voltea(numero))
            return (true);
        return (false);
    }

    public static boolean esPrimo (int numero){
        if (numero == 2) return true;
        if(numero % 2  == 0) return false;
        for(int i = 3; i * i <= numero; i += 2){
            if(numero % i == 0)
                return (false);
        }
        return (true);
    }

    public static int siguientePrimo (int numero){
        int i = 0;
        while(!esPrimo(numero + (++i))){}
        return (numero + i);
    }

    public static long potencia (int base, int exp){
        long potencia = 1;
        for (int i = 1; i <= exp; i++){
            potencia *=base;
        }
        return (potencia);
    }

    public static int numLen(long num){
        int len = 0;
        if(num == 0)
            len = 1;
        while(num > 0){
                len++;
                num /= 10;
            }
        return (len);
    }

    public static int digitoN (long num, int pos){
        int n = 0;
        num = voltea(num);
        for (int i = 0; i < pos; i++){
            System.out.println(num);
            num /=10;
        }
        n = (int)num % 10;
        return (n);
    }

    public static int posicionDigito(long num, int digit){
        int position = -1;
        for(int i = numLen(num)- 1;i >= 0; i--){
            if(num % 10 == digit)
                position = i;   
            num/=10;
        }
        return (position);
    }

    public static long quitarPorDetras(long num, int index){
        for(int i = 1; i <= index; i++){
            num /= 10;
        }
        return (num);
    }

    public static long quitarPorDelante(long num, int index){
        num = voltea(num);
        num = quitarPorDetras(num, index);
        return(voltea(num));
    }
    public static long pegaPorDetras(long num, long extra){
        return (num * (potencia(10, numLen(extra))) + extra);
    }

    public static long pegaPorDelante(long num, long extra){
        return(voltea(pegaPorDetras(voltea(num), voltea(extra))));
    }

    public static long trozoDeUnNumero(long num, int inicio, int fin){
        num = quitarPorDetras(num, numLen(num)-fin - 1);
        num = quitarPorDelante(num, inicio);

        return (num);
    }

    public static long juntarNumeros(long num1, long num2){
        return(pegaPorDetras(num1, num2));
    }

    public static void main(String[] arguments){
        System.out.println(esCapicua(12321));
    }
}