import java.util.Scanner;
public class CuentaUnion {
    private String correo, contraseña, correoComp, contraseñaComp;
    public String fdatos() {
        Scanner datos = new Scanner(System.in);
        String nobre, apellido, codigoU, opcion;
        System.out.println("¿Usted es estudiante de la UPeU?");
        System.out.println("Si/No");
        opcion=datos.nextLine();
        switch (opcion){
            case "Si":
                System.out.println("Ingrese sus nombres: ");
                nobre=datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido=datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo=datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña=datos.nextLine();
                System.out.println("Ingrese su codigo univercitario univercitario: ");
                codigoU=datos.nextLine();
                break;
            case "No":
                System.out.println("Ingrese sus nombres: ");
                nobre=datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido=datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo=datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña=datos.nextLine();
                break;
        }
        return null;
    }
    public String fcomprobarDatos() {
        Scanner comprueba= new Scanner(System.in);
        System.out.println("INICIE SESION PARA REALIZAR SU COMPRA");
        System.out.println("Ingrese su correo: ");
        correoComp=comprueba.nextLine();
        System.out.println("Ingrese su cotraseña: ");
        contraseñaComp=comprueba.nextLine();

        if(correoComp.equals(correo)&&contraseñaComp.equals(contraseña)){

        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A PRODUCTOS UNION");
        CuentaUnion union = new CuentaUnion();
        union.fdatos();
        union.fcomprobarDatos();
    }
}
