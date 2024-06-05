import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class ProductosUnionPreLanzamiento {
    double total;
    private String correo, contraseña, correo_Comp, contraseña_Comp, nombre, apellido, codigoU, union_m, opc_variedad;
    private int opcion, cantidad, op_pdt = 0;

    public String fdatos() {
        Scanner datos = new Scanner(System.in);
        String opcion;
        System.out.println("¿Usted es estudiante de la UPeU?");
        System.out.println("Si/No");
        opcion = datos.nextLine();
        switch (opcion) {
            case "Si":
                System.out.println("Ingrese sus nombres: ");
                nombre = datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido = datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo = datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña = datos.nextLine();
                System.out.println("Ingrese su codigo univercitario univercitario: ");
                codigoU = datos.nextLine();
                this.fproductos();
                break;
            case "No":
                System.out.println("Ingrese sus nombres: ");
                nombre = datos.nextLine();
                System.out.println("ingrese sus apellidos: ");
                apellido = datos.nextLine();
                System.out.println("Ingrese su correo: ");
                correo = datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña = datos.nextLine();
                this.fproductos();
                break;
        }
        return null;
    }

    public String fcomprobarDatos() {
        Scanner comprueba = new Scanner(System.in);
        System.out.println("INICIE SESION PARA REALIZAR SU COMPRA");
        System.out.println("Ingrese su correo: ");
        correo_Comp = comprueba.nextLine();
        System.out.println("Ingrese su cotraseña: ");
        contraseña_Comp = comprueba.nextLine();
        if (correo_Comp.equals(correo) && contraseña_Comp.equals(contraseña)) {

            System.out.println("Bienvenido a PRODUCTOS UNION");
            System.out.println("Sr(a): " + nombre + " " + apellido);
            System.out.println(" " + correo + "@gmail.com");
        }
        this.función_de_impresion_de_cobro();
        return null;
    }

    public String fproductos() {
        Scanner union = new Scanner(System.in);
        int opcion;

        boolean salir;
        do {
            System.out.println("\033[96m");
            System.out.println("┌─────────────────────────────────────────────────────────┐");
            System.out.println("│                         PRODUCTOS                       │");
            System.out.println("├──────────────┼──────────────┼──────────────┼────────────┤");
            System.out.println("│     PANES    │  BOLLERIA    │    CEREALES  │ BEBIDAS    │");
            System.out.println("├──────────────┼──────────────┼──────────────┼────────────┤");
            System.out.println("│   GALLETAS   │     SNACK    │    UNTABLES  │ PANETONES  │");
            System.out.println("└──────────────┴──────────────┴──────────────┴────────────┘");

            System.out.println("Ingrese el nombre de la seccion de productos");
            String respuesta = union.next();
            salir = false;

            switch (respuesta) {
                case "PANES":
                    do {
                        System.out.println("\033[93m");
                        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────┐");
                        System.out.println("│                          PANES                                                     │");
                        System.out.println("├──────────────────────┼────────────────────┼───────────────┼────────────────────────┤");
                        System.out.println("│ 1. Pan multisemillas │ 2. Pan con granos  │  3.Pan Fibra  │ 4. Pan multisemillas   │");
                        System.out.println("│       con avena      │       semillas     │    Integral   │      miel de abeja     │");
                        System.out.println("├──────────────────────┼────────────────────┼───────────────┼────────────────────────┤");
                        System.out.println("│ 5. Pan Americano     │ 6. Pan Blanco      │  7.  Pan      │ 8.       Pan Integral  │");
                        System.out.println("│  Sándwich Clásico    │ Superbom Familiar  │      Fuente   │    Sándwich Clásico    │");
                        System.out.println("└──────────────────────┴────────────────────┴───────────────┴────────────────────────┘");
                        System.out.println("Seleccione una opción");
                        opcion = union.nextInt();
                        union.nextLine();
                        switch (opcion) {
                            case 1:
                                System.out.println("S/. 10");
                                System.out.println("Pan multisemillas con avena");
                                System.out.println("   Peso   │  Proteinas  │  Fibra  │ Hierro   ");
                                System.out.println("   540g   │     11g     │   6G    │   13g    ");
                                System.out.println("Delicioso y saludable pan, libre de bromato. Con una nutritiva");
                                System.out.println("mezcla en base a harina fortificada con hierro y vitaminas del complejo B,");
                                System.out.println("hojuelas de avena. Así mismo contiene semillas altamente nutritivas por");
                                System.out.println("su valor funcional para el organismo humano como el girasol, chía y linaza");
                                System.out.println(" Pan fortificado con alto en Hierro, contiene fuente de fibra y fuente de");
                                System.out.println(" proteínas del organismo.");
                                System.out.println("DESEA COMPRAR");
                                System.out.println("1. SI");
                                System.out.println("2. NO");
                                System.out.println("Seleccione una opción");
                                opcion = union.nextInt();
                                union.nextLine();
                                switch (opcion) {
                                    case 1:
                                        fcosto(union);

                                        break;
                                    case 2:
                                        System.out.println("gracias");
                                        break;
                                    default:
                                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                                        break;

                                }
                            case 0:
                                salir = true;

                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    } while (!salir);
                    break;
                case "SALIR":
                    salir = true;
                    break;
                default:
                    System.out.println("\033[93m");
                    System.out.println("Sección no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (!salir);
        union.close(); // Importante cerrar el scanner después de su uso.
        return null;
    }


    public String puntosdeventa() {
        Scanner direc = new Scanner(System.in);
        String opcionPV, opcionU;

            System.out.println("PUNTOS DE VENTA");
            System.out.println("Conoce las ubicaciones donde puedes encontrar nuestros productos");
            System.out.println("\uD83D\uDED2Supermercados");
            System.out.println("⛟Bodegas y distribuidores");
            System.out.println("1. Conoce más");
            System.out.println("2. Delivery");
            opcionPV = direc.nextLine();
            switch (opcionPV) {
                case "1":
                    System.out.println("Ingrese su ubicación");
                    System.out.println("Lima");
                    System.out.println("Arequipa");
                    System.out.println("Juliaca");
                    System.out.println("Huanuco");
                    System.out.println("Pucallpa");
                    System.out.println("Chimbote");
                    System.out.println("Trujillo");
                    System.out.println("Piura");
                    System.out.println("Jaèn");
                    System.out.println("Tarapoto");
                    System.out.println("Iquitos");
                    opcionU = direc.nextLine();
                    switch (opcionU) {
                        case "Lima":
                            System.out.println("Salida | Universidad de la Unión Peruana");
                            System.out.println("Carretera Central Km 19.5 Hermana\n" +
                                    "Chosica, Lima");
                            break;
                        case "Arequipa":
                            System.out.println("Av. La Marina 123, Cayma, Arequipa");
                            break;
                        case "Juliaca":
                            System.out.println("Jr. San Román 345, Juliaca, Puno");
                            break;
                        case "Huanuco":
                            System.out.println("Jr. 2 de Mayo 456, Huanuco");
                            break;
                        case "Pucallpa":
                            System.out.println("Av. Centenario 123, Pucallpa, Ucayali");
                            break;
                        case "Chimbote":
                            System.out.println("Av. José Gálvez 345, Chimbote, Ancash");
                            break;
                        case "Trujillo":
                            System.out.println("Jr. Independencia 456, Trujillo, La Libertad");
                            break;
                        case "Piura":
                            System.out.println("Av. Sullana 123, Piura");
                            break;
                        case "Jaèn":
                            System.out.println("Jr. Amazonas 345, Jaèn, Cajamarquilla");
                            break;
                        case "Tarapoto":
                            System.out.println("Av. Tarapoto 456, Tarapoto, San Martín");
                            break;
                        case "Iquitos":
                            System.out.println("Av. La Marina 123, Iquitos, Loreto");
                            break;
                        default:
                            System.out.println("sin ubicacion");

                    }
                default:
                    System.out.println("opcion no valida");
            }
            return null;
        }

    public String fcosto(Scanner union) {
        System.out.println("ingresa opcion");
        int opcion = union.nextInt();
        double precioPan = 0;

        switch (opcion) {
            case 1:
                precioPan = 7.80;
                break;
            case 2:
                precioPan = 7.80;
                break;
            case 3:
                precioPan = 7.80;
                break;
            case 4:
                precioPan = 7.80;
                break;
            case 5:
                precioPan = 7.80;
                break;
            case 6:
                precioPan = 7.80;
                break;
            case 7:
                precioPan = 7.80;
                break;
            case 8:
                precioPan = 7.80;
                break;
            default:
                System.out.println("Opción que selecciono no es valida");
                System.out.println("intente de nuevo");
        }

        System.out.println("¿Cuántos panes  desea comprar?");
        int panes = union.nextInt();
        double totalpan = precioPan * panes;

        System.out.println("El total a pagar es: S/. " + totalpan);
        System.out.println("Gracias por su comprar");
        System.out.println("vuelva pronto");
        fcomprobarDatos();
        return null;
    }

    public String función_de_impresion_de_cobro() {
        Scanner union_m = new Scanner(System.in);
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
                        System.out.println("|=-- Cliente: " + nombre + " " + apellido + "-----------------|");
                        System.out.println("|=-- Doc. ident: " + " " + "------------------------------|");
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
                        System.out.println("|=-- Facturado a Cliente: " + nombre + " " + apellido + "-----------|");
                        System.out.println("|=-- DNI: " + " " + "-------------------------------------------|");
                        System.out.println("|=-- Correo: " + correo + "--------------------------------------------------|");
                        System.out.println("|=-- Contraseña: " + contraseña + "----------------------------------------------|");
                        System.out.println("|=-- codigo universitario: " + codigoU + "------------------------------------|");
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
            return null;
        }

    public static void main(String[] args) {
        System.out.println("BIENVENIDO A PRODUCTOS UNION");
        ProductosUnionPreLanzamiento union = new ProductosUnionPreLanzamiento();
        union.fdatos();
        union.fproductos();
    }
}

