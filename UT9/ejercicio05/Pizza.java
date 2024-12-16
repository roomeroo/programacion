package UT9.ejercicio05;

public class Pizza {
    String ingredientes[] = new String[16];
    String nombre = "";
    int numIngredientes = 0;

    Pizza(String ingrediente1, String ingrediente2, String ingrediente3){
        ingredientes[0] = ingrediente1;
        ingredientes[1] = ingrediente2;
        ingredientes[2] = ingrediente3;
        numIngredientes = 3;
    }
    Pizza(String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4){
        ingredientes[0] = ingrediente1;
        ingredientes[1] = ingrediente2;
        ingredientes[2] = ingrediente3;
        ingredientes[3] = ingrediente4;
        numIngredientes = 4;
    }
    Pizza(String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5){
        ingredientes[0] = ingrediente1;
        ingredientes[1] = ingrediente2;
        ingredientes[2] = ingrediente3;
        ingredientes[3] = ingrediente4;
        ingredientes[4] = ingrediente5;
        numIngredientes = 5;
    }

    public void añadirIngrediente(String ingrediente){
        ingredientes[numIngredientes] = ingrediente;
        numIngredientes++;
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < numIngredientes; i++){
            str += ingredientes[i] + " ";
        }
        return (str);
    }
}
