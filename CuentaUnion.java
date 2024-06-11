import java.util.Scanner;
public class CuentaUnion {
    private String correo, contraseña, correoComp, contraseñaComp, nobre, apellido;
    public String fdatos() {
        Scanner datos = new Scanner(System.in);
        String  codigoU, dni, opcion;

        System.out.println("¿Usted es estudiante de la UPeU?");
        System.out.println("Si/No");
        opcion=datos.nextLine();
        switch (opcion){
            case "Si":
                System.out.println("Ingrese sus nombres: ");
                nobre=datos.nextLine();
                System.out.println("Ingrese sus apellidos: ");
                apellido=datos.nextLine();
                System.out.println("Ingrese su DNI");
                dni= datos.nextLine();
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
        System.out.println("INICIE SESION EN PRODUCTOS UNION");
        System.out.println("INGRESE SU CORREO");
        correoComp=datos.nextLine();
        System.out.println("INGRESE SU COTRASEÑA");
        contraseñaComp=datos.nextLine();
        if(correoComp.equals(correo)&&contraseñaComp.equals(contraseña)){
            System.out.println("BIENVENIDO A PRODUCTOS UNION");
            System.out.println("Sr(a): "+nobre+""+apellido);
        }
        return null;
    }
    

    private String fTipoDePago() {
        Scanner tpago = new Scanner(System.in);
        int opcion, tarjeta, fechacaducidad, cvv;
        Double costo, pago;
        String titulartarjeta;
        System.out.println("ingrese el costo a pagar");
        costo=tpago.nextDouble();
        System.out.println("ingrese el tipo de pago?");
        System.out.println("1: tarjeta");
        System.out.println("2: efectivo");
        opcion=tpago.nextInt();
        switch (opcion){
            case 1:
                System.out.println("ingrese e l numero de tarjeta");
                tarjeta=tpago.nextInt();
                System.out.println("ingrese la fecha de caducidad de la tarjeta");
                fechacaducidad=tpago.nextInt();
                System.out.println("ingrese el nombre completo del titular de la tarjeta");
                titulartarjeta=tpago.nextLine();
                System.out.println("ingrese el CVV");
                cvv=tpago.nextInt();
                System.out.println("pago realizado exitosamente con su tarjeta");
                System.out.println("PRODUCTOS UNION");

                break;
            case 2:
                System.out.println("el total a pagar es de "+costo);
                do{
                    System.out.println("ingrese el monto que va pagar");
                    pago=tpago.nextDouble();
                    if (pago==0){
                        System.out.println("ingrese el pago porfavor\n//no va consumir los productos gratis");
                        pago=tpago.nextDouble();
                    } else if (pago>costo) {
                        Double vuelto=pago-costo;
                        System.out.println("su vuelto es de: "+vuelto);
                    } else if (pago<costo) {
                        System.out.println("complete el monto porfavor");
                        System.out.println("");
                    }
                }
                while (pago==0);
                break;
        }
        return  null;
    }
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A PRODUCTOS UNION");
        CuentaUnion union = new CuentaUnion();
        union.fdatos();
        union.fTipoDePago();
    }
}
