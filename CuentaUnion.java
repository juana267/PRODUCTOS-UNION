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
            System.out.println("Sr(a): "+nobre+" "+apellido);
        }
        return null;
    }


    private String fTipoDePago() {
        Scanner tpago = new Scanner(System.in);
        int opcion;

        System.out.println("ingrese el tipo de pago?");
        System.out.println("1: tarjeta");
        System.out.println("2: efectivo");
        opcion=tpago.nextInt();
        switch (opcion){
            case 1:
                this.ftarjeta();
                break;
            case 2:
                this.fefectivo();
        }
        return  null;
    }

    public String ftarjeta() {
        Scanner tar= new Scanner(System.in);
        int tarjeta, fechacaducidad, cvv;
        System.out.println("ingrese el nombre completo del titular de la tarjeta");
        String titulartarjeta=tar.nextLine();
        System.out.println("ingrese el numero de tarjeta");
        tarjeta=tar.nextInt();
        System.out.println("ingrese la fecha de caducidad de la tarjeta");
        fechacaducidad=tar.nextInt();
        System.out.println("ingrese el CVV");
        cvv=tar.nextInt();
        System.out.println("pago realizado exitosamente con su tarjeta");
        System.out.println("PRODUCTOS UNION");
        return null;
    }

    public String fefectivo() {
        Scanner efect = new Scanner(System.in);
        double costo, totalPagado;
        System.out.println("Ingrese el costo:");
        costo = efect.nextDouble();
        System.out.println("El monto a pagar es de: " + costo);
        System.out.println("Ingrese el pago de los productos:");
        totalPagado = efect.nextDouble();
        while (totalPagado < costo) {
            System.out.println("Monto insuficiente. Faltan " + (costo - totalPagado) + " para completar el pago.");
            System.out.println("Ingrese el monto adicional que va a pagar:");
            double pagoAdicional = efect.nextDouble();
            if (pagoAdicional <= 0) {
                System.out.println("Ingrese un monto válido, por favor. No puede consumir los productos gratis.");
            } else {
                totalPagado += pagoAdicional;
            }
        }
        if (totalPagado > costo) {
            double vuelto = totalPagado - costo;
            System.out.println("Pago recibido. Su vuelto es de: " + vuelto);
        } else {
            System.out.println("Pago completado. Gracias por su compra.");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("BIENVENIDO A PRODUCTOS UNION");
        CuentaUnion union = new CuentaUnion();
        union.fdatos();
        union.fTipoDePago();
    }
}

