public class Lakers {
    private String url = "jdbc:mariadb://localhost:3306/baloncesto";
    private String usuario = "root";
    private String contraseña = "";

    public static int pedirEntero(String mensaje){
        int numero;
        boolean correcto = false;
        try{
            while(!correcto){
                System.out.println(mensaje);
                numero = Integer.parseInt(System.console().readLine());
                correcto = true;
                return numero;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;  //pongo -1 como error aunque nose si podria necesitar numeroos negativos
    }

    public static void añadirSocio(){

    }

    public static void bajaSocio(){

    }

    public static void modificarSocio(int identificador){

    }

    public static void listarSocios(){

    }

    public static void buscarSocio(int identificador){
    
    }
}
