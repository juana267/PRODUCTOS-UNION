import java.util.Scanner;
public class union {
    private int opcion, cantidad;
    private String nombre, apellido,correo, contraseña, codigoU,opc_variedad;
    Scanner union_m= new Scanner(System.in);
    public String ingresarDatos() {
        Scanner datos = new Scanner(System.in);
        System.out.println("¿Usted es estudiante de la UPeU?");
        System.out.println("Si/No");
        opc_variedad=union_m.nextLine();
        switch (opc_variedad){
            case "Si":
                System.out.println("Ingrese sus nombres: ");
                nombre=datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido=datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo=datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña=datos.nextLine();
                System.out.println("Ingrese su codigo univercitario univercitario: ");
                codigoU=datos.nextLine();
                función_de_impresion_de_cobro();
                break;
            case "No":
                System.out.println("Ingrese sus nombres: ");
                nombre=datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido=datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo=datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña=datos.nextLine();
                función_de_impresion_de_cobro();
                break;
        }
        return null;
    }

    public void función_de_impresion_de_cobro(){
        do {
            System.out.println("Seleccione si desea boleta o factura :");
            System.out.println("1. PARA BOLETA");
            System.out.println("2. PARA FACTURA");
            System.out.println("0. PARA SALIR");
            opcion = union_m.nextInt();
            union_m.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("\033[38;5;226m|--------------------------------------------------------------|");
                    System.out.println("|---------------------------- UNIÓN ---------------------------|");
                    System.out.println("|-------------------- Saludable por naturaleza ----------------|");
                    System.out.println("|--------------------------------------------------------------|");
                    System.out.println("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|");
                    System.out.println("|--------- Centro de prod. de Bienes  Productos union ---------|");
                    System.out.println("|---------------- C. central Km. 19 Villa union ---------------|");
                    System.out.println("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|");
                    System.out.println("|------------------ Telef. 618-6309 - 618-6310 ----------------|");
                    System.out.println("|------------------------ RUC 20138122256 ---------------------|");
                    System.out.println("|--------------------------------------------------------------|");
                    System.out.println("|===================== BOLETA ELECTRONICA =====================|");
                    System.out.println("|=-- Numero: --------------------------------------------------|");
                    System.out.println("|=-- Cliente: "+nombre+" "+apellido+"-----------------|");
                    System.out.println("|=-- Doc. ident: "+" "+"------------------------------|");
                    System.out.println("|=-- Fecha: ---------------------------------------------------|");
                    System.out.println("|=-- Dirección: -----------------------------------------------|");
                    System.out.println("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
                    System.out.println("|N°|CANTIDAD|  |ARTICULO|                        |MONTO|       |");
                    System.out.println("|=== Op. Gratuitas: ===========================================|");
                    System.out.println("|=== Op. Exoneradas: ==========================================|");
                    System.out.println("|=== Op. Gravadas: ============================================|");
                    System.out.println("|=== Total de descuento: ======================================|");
                    System.out.println("|=== Sub-Total: ===============================================|");
                    System.out.println("|=== IGV: =====================================================|");
                    System.out.println("|=== ICBPER: ==================================================|");
                    System.out.println("|=== Importe total: ===========================================|");
                    System.out.println("|=== Detracción: ==============================================|");
                    System.out.println("|=== Importe neto: ============================================|");
                    System.out.println("|================= GRACIAS POR SU COMPRA ======================|");
                    System.out.println("|==============================================================|");
                    break;
                case 2:
                    System.out.println("\u001B[36m|--------------------------------------------------------------|");
                    System.out.println("|---------------------------- UNIÓN ---------------------------|");
                    System.out.println("|-------------------- Saludable por naturaleza ----------------|");
                    System.out.println("|--------------------------------------------------------------|");
                    System.out.println("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|");
                    System.out.println("|--------- Centro de prod. de Bienes  Productos union ---------|");
                    System.out.println("|---------------- C. central Km. 19 Villa union ---------------|");
                    System.out.println("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|");
                    System.out.println("|------------------ Telef. 618-6309 - 618-6310 ----------------|");
                    System.out.println("|------------------------ RUC 20138122256 ---------------------|");
                    System.out.println("|--------------------------------------------------------------|");
                    System.out.println("|======================= FACTURA DE UNIÓN =====================|");
                    System.out.println("|=-- Facturado a Cliente: "+nombre+" "+apellido+"-----------|");
                    System.out.println("|=-- DNI: "+" "+"-------------------------------------------|");
                    System.out.println("|=-- Correo: "+correo+"--------------------------------------------------|");
                    System.out.println("|=-- Contraseña: "+contraseña+"----------------------------------------------|");
                    System.out.println("|=-- codigo universitario: "+codigoU+"------------------------------------|");
                    System.out.println("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
                    System.out.println("|N°|CANTIDAD|  |ARTICULO|                        |MONTO|       |");
                    System.out.println("|==============================================================|");
                    System.out.println("|=== Op. Gratuitas: ===========================================|");
                    System.out.println("|=== Op. Exoneradas: ==========================================|");
                    System.out.println("|=== Op. Gravadas: ============================================|");
                    System.out.println("|=== Total de descuento: ======================================|");
                    System.out.println("|=== Sub-Total: ===============================================|");
                    System.out.println("|=== IGV: =====================================================|");
                    System.out.println("|=== ICBPER: ==================================================|");
                    System.out.println("|=== Importe total: ===========================================|");
                    System.out.println("|=== Detracción: ==============================================|");
                    System.out.println("|=== Importe neto: ============================================|");
                    System.out.println("|================= GRACIAS POR SU COMPRA ======================|");
                    System.out.println("|==============================================================|");
                    break;
                case 0:
                    System.out.println("\u001B[31m🌟✨ Gracias por usar nuestro servicio. ✨🌟");
                    break;
                default:
                    System.out.println("\u001B[31m😒❌SOLO TIENES QUE ELEGIR ENTRE EL NUMERO 1 O 2 ❌😒");
            }
        } while (opcion != 0);
    }
    public static void main(String[] args) {
        union union=new union();
        union.ingresarDatos();
        union.función_de_impresion_de_cobro();
    }
}

