import java.util.Scanner;
public class CuentaUnion {
    private String correo, contraseña, correo_Comp, contraseña_Comp, nobre, apellido, codigoU;
    public String fdatos() {
        Scanner datos = new Scanner(System.in);
        String  opcion;
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
        correo_Comp=comprueba.nextLine();
        System.out.println("Ingrese su cotraseña: ");
        contraseña_Comp=comprueba.nextLine();
        if(correo_Comp.equals(correo)&& contraseña_Comp.equals(contraseña)){

            System.out.println("Bienvenido a PRODUCTOS UNION");
            System.out.println("Sr(a): "+nobre+" "+apellido);
            System.out.println(" "+correo+"@gmail.com");

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
