
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class compras_union {
    Scanner union = new Scanner(System.in);
    String[] menus = {"PRODUCTOS", "PUNTOS DE VENTA", "DELIVERY", "ELIJO SER SALUDABLE"};
    String[] productos = {"PANES", "BOLLERIA", "CEREALES", "BEBIDAS", "GALLETAS", "SNACK", "UNTABLES", "PANETONES"};
    String[] panes = {"Pan Americano Sandwich -----> S/ 7.80", "Pan  Blanco Superbom Familiar ----->  S/6.40", "Pan Fibra Integral ----->  S/8.90", "Pan multisemillas miel de abeja -----> S/9.30", "Fan Integral Familiar Superbom -----> S/6.50 ", "Pan Granos y Semillas -----> S/8.90", "Pan Fuente -----> S/8.90", "Pan Integral Sándwich Clásico -----> S/9.30"};
    String [] bolleria={"Pan pita integral granos andinos ----->  S/ 7.60","Pan pita semillas chia y linaza ----->  S/ 7.60","Pre Pizza Union ----->  S/ 8.90","Rollo de Canela ----->  S/ 11.10","Pionono x 7----->  S/19.00"};
    String [] cereales={"Cereal Premium x 350 g ----->  S/ 21.50","Germen de Trigo ----->  S/ 9.99","Granola  con Granos Andinos ----->  S/ 14.50","Granola con Pasas y Almendras ----->  S/15.20 ","Granola Lonchera x 400 gr ----->  S/13.30","Salvado de Trigo ----->  S/5.99"};
    String [] bebidas={"Bebida con pulpa de durazno 475 ml ----->  5.50","Bebida con pulpa de mango 475 ml ----->  5.50","Bebida con pulpa de manzana 475 ml ----->  5.50","Bebida con pulpa de piña 475 ml ----->  5.50","Duo Pack D Vine ----->  73.50","Zumo de  Uva 295 mll ----->  7.20"};
    String [] galletas={"Galleta Lonchera de Coco x 42 gr ----->  S/ 2.50","Galleta Lonchera de Kiwicha x 42 gr ----->  S/ 2.50","Galleta Lonchera de Naranja x 42 gr ----->  S/ 2.50"," Mega Galleta  de Kiwicha ----->   S/5.10"," Mega Galleta de Naranja ----->   S/5.10","Mega Galleta Integral de Coco ----->   S/5.10"};
    String [] snack={"Palitos con ajonjoli y linaza 65 g ----->  S/ 2.30","Palitos con Especias x 65 gr ----->  S/ 2.30","Tostada Blanca X 10 ----->  S/ 5.30","Tostada Integral X 10 ----->  S/ 5.30"};
    String [] untables={"Mant. de Mani 1 Kg ----->  S/ 36.00","Mermelada de Uva Frasco ----->  S/ 8.40","Mantequilla de Mani Sachet 200 gr ----->  S/ 10.50","Mant. de Mani Frasco 410 gr ----->  S/ 19.90"};
    String [] panetones={"Paneton Diet T/L 500 gr ----->  S/ 24.40","Paneton Integral T/B 900 ----->  S/ 23.00 ","Paneton Integral T/C 900 gr ----->  S/ 24.00","Paneton Union T/L 1kg ----->  S/ 32.40","Paneton Vita Rey con Arádanos T/C 900 gr ----->  S/ 26.00"};
    double[] precioPanes = {7.80,6.40,8.90,9.30,6.50,8.90,8.90,9.30};
    double[] precioBolleria = {7.60,7.60,8.90,11.10,19.00};
    double[] precioCereales = {21.50,9.99,14.50,15.20,13.30,5.99};
    double[] precioBebidas = {5.50,5.50,5.50,5.50,73.50,7.20};
    double[] precioGalletas = {2.50,2.50,2.50,5.10,5.10,5.10};
    double[] precioSnack = {2.30,2.30,5.30,5.30};
    double[] precioUntables = {36.00,8.40,10.50,19.90};
    double[] precioPanetones = {24.40,23.00,24.00,32.40,26.00};

    String [] ubicacion = {"Salida | Universidad de la Unión Peruana","Av. La Marina 123, Cayma, Arequipa","Carretera Salida a Arequipa Km. 6 Chullunquiani,Av. Héroes de la Guerra del Pacífico","Jr. 2 de Mayo 456, Huanuco","Av. Centenario 123, Pucallpa, Ucayali","Av. José Gálvez 345, Chimbote, Ancash","Jr. Independencia 456, Trujillo, La Libertad","Av. Sullana 123, Piura","Jr. Amazonas 345, Jaèn, Cajamarquilla","Av. Tarapoto 456, Tarapoto, San Martín","Av. La Marina 123, Iquitos, Loreto"};
    String [] lugar = {"Lima","Arequipa","Juliaca","Huanuco","Pucallpa","Chimbote","Trujillo","Piura","Jaèn","Tarapoto","Iquitos"};

    String[] productosdel = {
            "Pionono",
            "Cereal Premium",
            "Mantequilla de Mani Sachet",
            "Mant. de Mani 1 Kg.",
            "Mermelada de Uva Frasco",
            "Palitos con Especias",
            "Palitos con ajonjoli y linaza",
            "Tostada Integral X 10",
            "Tostada Blanca X 10",
            "Paneton Diet T/L 500 gr",
            "Paneton Integral T/C 900 gr",
            "Pan pita integral granos andinos",
            "Pan pita semillas chia y linaza",
            "Pan Integral Sandwich",
            "Pan Integral Mediano Union",
            "Pan Blanco Familiar Superbom",
            "Pan Fuente",
            "Pan Integral Familiar Superbom",
            "Mega Galleta Integral de Naranja",
            "Mega Galleta Integral de Coco",
            "Mega Galleta de Naranja",
            "Mega Galleta de Kiwicha",
            "Mega Galleta de Coco"
    };
    double[] preciodel = {19.00,21.50,10.50,36.00,8.40,2.30,2.30,5.30,5.30,24.40,24.00,7.60,7.60,8.50,4.70,6.40,9.50,6.50,5.10,5.10,5.10,5.10,5.10};

    private double total = 0,subtotal=0, precio,precio1,total1=0;
    private static String correo;
    private static String dni;
    private static String contraseña;
    private String correoComp;
    private String contraseñaComp;
    private static String nombre;
    private String nombreconvertido;
    private static String apellido;
    private String apellidoconvertido;
    private static String opcion_de_pago;
    private static String opcionU;
    private static String codigoU;
    private int cantidad,cantidad1,opcion;
    private float peso,talla,rpt_imc;   // este dato estoy usando
    private static String numero_factura;
    private String contra_vende;
    private static String nombre_vende; //este mas
    private static int contador_factura = 0;
    double[] subtotal_extra = new double[8];
    double totalPagar;
    int[] carrito = new int[productos.length];
    String respuesta;
    public String fdatos() {
        Scanner datos = new Scanner(System.in);
        String  codigoU, opcion, opcionconvertido;
        System.out.println("¿Usted es estudiante de la UPeU?");
        System.out.println("SI/NO");
        opcion=datos.nextLine();
        opcionconvertido=opcion.toUpperCase();
        switch (opcionconvertido){
            case "SI":
                System.out.println("Ingrese sus nombres: ");
                nombre=datos.nextLine();
                nombreconvertido=nombre.toUpperCase();
                System.out.println("Ingrese sus apellidos: ");
                apellido=datos.nextLine();
                apellidoconvertido=apellido.toUpperCase();
                do {
                    System.out.print("Introduce tu numero de DNI (8 dígitos): ");
                    dni = datos.nextLine();
                } while (dni.length() != 8);
                System.out.println("Ingrese su correo: ");
                correo=datos.nextLine();
                System.out.println("Ingrese su contraseña: ");
                contraseña=datos.nextLine();
                System.out.println("Ingrese su codigo univercitario univercitario: ");
                codigoU=datos.nextLine();
                break;
            case "NO":
                System.out.println("Ingrese sus nombres: ");
                nombre=datos.nextLine();
                nombreconvertido=nombre.toUpperCase();
                System.out.println("Ingrese sus apellidos: ");
                apellido=datos.nextLine();
                apellidoconvertido=apellido.toUpperCase();
                do {
                    System.out.print("Introduce tu numero de DNI (8 dígitos): ");
                    dni = datos.nextLine();
                } while (dni.length() != 8);
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
            System.out.println("Sr(a): "+nombreconvertido+" "+apellidoconvertido);
            this.fpregunta();
        }
        return null;
    }
    public String fpregunta(){ //CODIGO DE JUANA
        System.out.println("---------Bienvenido a Productos Union -----------");
        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println("Seleccione productos a comprar");
        for (int i = 0; i < menus.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + menus[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        switch (opcion) {
            case 1:
                this.fproductos();
                break;
            case 2:
                this.puntosdeventa();
                break;
            case 3:
                this.delivery();
                break;
            case 4:
                this.IMC();
            default:
                System.out.println("Opcion no válida");
                this.fpregunta();
                break;
        }
        return null;
    }
    public String fproductos() {
        System.out.println("------ PRODUCTOS------------");
        System.out.println("Seleccione productos a comprar");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + productos[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        switch (opcion) {
            case 1:
                this.fpanes();
                break;
            case 2:
                this.fbolleria();
                break;
            case 3:
                this.fcereales();
                break;
            case 4:
                this.fbebidas();
                break;
            case 5:
                this.fgalletas();
                break;
            case 6:
                this.fsnack();
                break;
            case 7:
                this.funtables();
                break;
            case 8:
                this.fpanetones();
                break;
            default:
                System.out.println("Opcion no válida");
                this.fpregunta();
                break;
        }
        return null;
    }

    public void fpanes() {
        System.out.println("------ PANES------------");
        System.out.println("Seleccione panes a comprar");
        for (int i = 0; i < panes.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + panes[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= panes.length) {
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioPanes[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + panes[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.fpanes();
        }
    }
    public void fbolleria() {
        System.out.println("------ BOLLERIA------------");
        System.out.println("Seleccione panes a comprar");
        for (int i = 0; i < bolleria.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + bolleria[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= bolleria.length) {
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioBolleria[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + bolleria[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.fpanes();
        }
    }
    public void fcereales() {
        System.out.println("------ CEREALES------------");
        System.out.println("Seleccione panes a comprar");
        for (int i = 0; i < cereales.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + cereales[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= cereales.length) {
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioCereales[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + cereales[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.fpanes();
        }
    }
    public void fbebidas() {
        System.out.println("------ BEBIDAS------------");
        System.out.println("Seleccione panes a comprar");
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + bebidas[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= bebidas.length) {
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioBebidas[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + bebidas[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.fpanes();
        }
    }
    public void fgalletas() {
        System.out.println("------ GALLETAS------------");
        System.out.println("Seleccione panes a comprar");
        for (int i = 0; i < galletas.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + galletas[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= galletas.length) {
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioGalletas[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + galletas[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.fpanes();
        }
    }
    public void fsnack() {
        System.out.println("------ SNACK------------");
        System.out.println("Seleccione panes a comprar");
        for (int i = 0; i < snack.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + snack[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= snack.length) {
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioSnack[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + snack[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.fpanes();
        }
    }
    public void funtables() {
        System.out.println("------ UNTABLES------------");
        System.out.println("Seleccione panes a comprar");
        for (int i = 0; i < untables.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + untables[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= untables.length) {
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioUntables[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + untables[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.fpanes();
        }
    }
    public void fpanetones() {
        System.out.println("------ PANETONES------------");
        System.out.println("Seleccione panes a comprar");
        for (int i = 0; i < panetones.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + panetones[i]);
        }
        opcion = union.nextInt();
        union.nextLine();
        if (opcion > 0 && opcion <= panetones.length) {
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = union.nextInt();
            union.nextLine();
            carrito[opcion - 1] += cantidad;
            subtotal_extra[opcion - 1] = carrito[opcion - 1] * precioPanetones[opcion - 1];
            System.out.println("Ud ha pedido " + carrito[opcion - 1] + " de " + panetones[opcion - 1]);
            System.out.println("¿Desea elegir otro producto?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = union.nextInt();
            union.nextLine();
            if (opcion == 1) {
                this.fproductos();
            } else if (opcion == 2) {
                this.fTipoDePago();
            } else if (opcion == 3) {
                this.fpregunta();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.fpanes();
        }
    }

    public void puntosdeventa() {
        Scanner direc = new Scanner(System.in);
        System.out.println("PUNTOS DE VENTA");
        System.out.println("Conoce las ubicaciones donde puedes encontrar nuestros productos");
        System.out.println("\uD83D\uDED2Supermercados");
        System.out.println("⛟Bodegas y distribuidores");
        System.out.println(" Conoce más");
        for (int i = 0; i < lugar.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + lugar[i]);
        }
        opcion = direc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("su ubicacion es:" + ubicacion[0]);
                break;
            case 2:
                System.out.println("su ubicacion es:" + ubicacion[1]);
                break;
            case 3:
                System.out.println("su ubicacion es:" + ubicacion[2]);
                break;
            case 4:
                System.out.println("su ubicacion es:" + ubicacion[3]);
                break;
            case 5:
                System.out.println("su ubicacion es:" + ubicacion[4]);
                break;
            case 6:
                System.out.println("su ubicacion es:" + ubicacion[5]);
                break;
            case 7:
                System.out.println("su ubicacion es:" + ubicacion[6]);
                break;
            case 8:
                System.out.println("su ubicacion es:" + ubicacion[7]);
                break;
            case 9:
                System.out.println("su ubicacion es:" + ubicacion[8]);
                break;
            case 10:
                System.out.println("su ubicacion es:" + ubicacion[9]);
                break;
            case 11:
                System.out.println("su ubicacion es:" + ubicacion[10]);
                break;
            case 12:
                System.out.println("su ubicacion es:" + ubicacion[11]);
                break;
        }
    }
    public void delivery() {
        Scanner union = new Scanner(System.in);
        int opcion;
        System.out.println("DELIVERY");
        System.out.println("Visita la tienda virtual y conoce las ofertas\n" +
                "que tenemos para ti");
        System.out.println("¿Deseas ingresar a WEB DELIVERY?");
        System.out.println("SI | NO");
        String respuesta = union.nextLine();
        switch (respuesta) {
            case "SI":
                System.out.println("\033[38;5;203m");
                System.out.println("Productos disponibles:");
                System.out.println("┌──────────────────────────────────────────────────────────┐");
                System.out.println("│ Nº │ Producto                        │ Precio │ Cantidad │");
                System.out.println("├────┼─────────────────────────────────┼────────┼──────────┤");
                System.out.println("│ 1  | "+productosdel [0]+"                         | 19.00  | 7        │");//19
                System.out.println("│ 2  | "+productosdel [1]+"                  | 21.50  | 350g     │");//21.50
                System.out.println("│ 3  | "+productosdel [2]+"      | 10.50  | 200g     │");//10.50
                System.out.println("│ 4  | "+productosdel [3]+"             | 36.00  | 1000g    │");//36
                System.out.println("│ 5  | "+productosdel [4]+"         | 8.40   | 1        │");//8.40
                System.out.println("│ 6  | "+productosdel [5]+"            | 2.30   | 65g      │");//+
                System.out.println("│ 7  | "+productosdel [6]+"   | 2.30   | 65g      │");//+
                System.out.println("│ 8  | "+productosdel [7]+"           | 5.30   | 10       │");//P
                System.out.println("│ 9  | "+productosdel [8]+"             | 5.30   | 10       │    ┌──────────────────────────────────────────────────────────┐");//P
                System.out.println("│ 10 | "+productosdel [9]+"         | 24.40  | 500g     │    │                                                        X │ ");//24.40
                System.out.println("│ 11 | "+productosdel [10]+"     | 24.00  | 900g     │    │                           AVISO                          │");//24
                System.out.println("│ 12 | "+productosdel [11]+"| 7.60   | 1        │    │      Días de entrega                  Monto Mínimo       │");//--
                System.out.println("│ 13 | "+productosdel [12]+" | 7.60   | 1        │    │   El día de entrega es          El monto mínimo para las │");//--
                System.out.println("│ 14 | "+productosdel [13]+"           | 8.50   | 1        │    │          jueves                    compras es de S/. 58  │");//8.50
                System.out.println("│ 15 | "+productosdel [14]+"      | 4.70   | 1        │    │                                       incluye Delivery   │");//4.70
                System.out.println("│ 16 | "+productosdel [15]+"    | 6.40   | 1        │    │                                                          │");//6.40
                System.out.println("│ 17 | "+productosdel [16]+"                      | 9.50   | 1        │    │                           Además                         │");//9.50
                System.out.println("│ 18 | "+productosdel [17]+"  | 6.50   | 1        │    │      Recuerda usar la aplicación para encontrar muchas   │");//6.50
                System.out.println("│ 19 | "+productosdel [18]+"| 5.10   | 1        │    │      promociones y ofertas                               │");//
                System.out.println("│ 20 | "+productosdel [19]+"   | 5.10   | 1        │    │                                                          │");//
                System.out.println("│ 21 | "+productosdel [20]+"         | 5.10   | 1        │    │                                                          │");//
                System.out.println("│ 22 | "+productosdel [21]+"         | 5.10   | 1        │    │      App: Tienda Unión                                   │");//
                System.out.println("│ 23 | "+productosdel [22]+"            | 5.10   | 1        │    └──────────────────────────────────────────────────────────┘");//
                System.out.println("└──────────────────────────────────────────────────────────┘    ");//===============16
                System.out.println("selecione opcion");
                opcion = union.nextInt();
                switch (opcion) {
                    case 1:
                        precio1 = 19.00;
                        break;
                    case 2:
                        precio1 = 21.50;
                        break;
                    case 3:
                        precio1 = 10.50;
                        break;
                    case 4:
                        precio1 = 36.00;
                        break;
                    case 5:
                        precio1 = 8.40;
                        break;
                    case 6:
                        precio1 = 2.30;
                        break;
                    case 7:
                        precio1 = 2.30;
                        break;
                    case 8:
                        precio1 = 5.30;
                        break;
                    case 9:
                        precio1 = 5.30;
                        break;
                    case 10:
                        precio1 = 24.40;
                        break;
                    case 11:
                        precio1 = 24.00;
                        break;
                    case 12:
                        precio1 = 7.60;
                        break;
                    case 13:
                        precio1 = 7.60;
                        break;
                    case 14:
                        precio1 = 8.50;
                        break;
                    case 15:
                        precio1 = 4.70;
                        break;
                    case 16:
                        precio1 = 6.40;
                        break;
                    case 17:
                        precio1 = 9.50;
                        break;
                    case 18:
                        precio1 = 6.50;
                        break;
                    case 19:
                        precio1 = 5.10;
                        break;
                    case 20:
                        precio1 = 5.10;
                        break;
                    case 21:
                        precio1 = 5.10;
                        break;
                    case 22:
                        precio1 = 5.10;
                        break;
                    case 23:
                        precio1 = 5.10;
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
                System.out.println("¿Cuántos desea comprar?");
                cantidad1 = union.nextInt();
                subtotal = precio1 * cantidad1;
                if (subtotal >= 58.00) {
                    System.out.println(" se le sumara S/. 8.00 soles por el delivery");
                    total1 = subtotal + 8;
                    System.out.println("El monto total a pagar es: S/. " + total1);
                    System.out.println("vaya a caja a pagar");
                    this.fTipoDePago();
                } else if (subtotal < 58) {
                    System.out.println("Todavia no supera el monto mínimo");
                    this.delivery();
                }
                else {
                    System.out.println("opcion no valida");
                }
                break;


            case "NO":
                System.out.println("\033[38;5;226m");
                System.out.println("¡DESCARGA NUESTRA APP!");
                System.out.println("┌─────────────────┐        ┌─────────────────┐");
                System.out.println("│  descargalo en  │        │  DISPONIBLE EN  │");
                System.out.println("│   App STORE     │        │   Google play   │");
                System.out.println("└─────────────────┘        └─────────────────┘");
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    public void IMC(){ //mio may
        Scanner imc = new Scanner(System.in);
        System.out.println("\033[38;5;226m----------BIENVENIDO ESTAS SON LAS RECOMENDACIONES DE UNIÓN----------");
        System.out.println("Por favor ingrese su peso en Kg: ");
        peso = imc.nextFloat();
        System.out.println("Por favor ingrese su talla en centímetros: ");
        talla = imc.nextFloat();
        talla = talla / 100; // convercion en metros
        rpt_imc = peso / (talla * talla);
        String[][] recomendaciones = {
                {"Mega Galleta de Coco", "Producto saludable contra la anemia"},
                {"Mega Galleta de Kiwicha", "Producto saludable contra la anemia"},
                {"Mega Galleta de Naranja", "Producto saludable contra la anemia"},
                {"Mega Galleta Integral de Coco", "Producto saludable contra la anemia"},
                {"Mega Galleta Integral de Naranja", "Producto saludable contra la anemia"},
                {"Mega Galleta Integral de Coco", "Producto saludable contra la anemia"},
                {"Palitos con Especias", "Producto saludable contra la anemia"},
                {"Palitos con ajonjoli y linaza", "Producto saludable contra la anemia"},
                {"Paneton Integral T/C 900 gr", "Producto saludable contra la anemia"}
        };
        String[][] recomendacionesPesoNormal = {
                {"Palitos con Especias", "Producto veganos con ingesta de hierro y vitamina de b12"},
                {"Palitos con ajonjoli y linaza", "Producto veganos con ingesta de hierro y vitamina de b12"}
        };
        String[][] recomendacionesExcesoPeso = {
                {"Palitos con Especias", "Producto que considera los antioxidantes"},
                {"Palitos con ajonjoli y linaza", "Producto que considera los antioxidantes"}
        };
        String[][] recomendacionesObeso = {
                {"Paneton Integral T/C 900 gr", "Variedad de producto sin azucar añadida"},
                {"Paneton Diet T/L 500 gr", "Variedad de producto sin azucar añadida"}
        };
        String[][] recomendacionesObesoExtremo = {
                {"Mega Galleta de Coco", "Producto sin presencia de octógonos de alerta"},
                {"Mega Galleta de Kiwicha", "Producto sin presencia de octógonos de alerta"},
                {"Mermelada de Uva Frasco", "Producto sin presencia de octógonos de alerta"},
                {"Mantequilla de Mani Sachet", "Producto sin presencia de octógonos de alerta"},
                {"Tostada Integral X 10", "Producto sin presencia de octógonos de alerta"},
                {"Tostada Blanca X 10", "Producto sin presencia de octógonos de alerta"}
        };
        if (rpt_imc < 18.5) {
            mostrarRecomendaciones("bajo peso", recomendaciones);
        } else if (rpt_imc >= 18.5 && rpt_imc <= 24.9) {
            mostrarRecomendaciones("peso normal", recomendacionesPesoNormal);
        } else if (rpt_imc >= 25 && rpt_imc <= 29.9) {
            mostrarRecomendaciones("exceso de peso", recomendacionesExcesoPeso);
        } else if (rpt_imc >= 30 && rpt_imc <= 34.9) {
            mostrarRecomendaciones("obeso o ebesa", recomendacionesObeso);
        } else if (rpt_imc > 35 && rpt_imc <= 100) {
            mostrarRecomendaciones("obeso/a extremo/a", recomendacionesObesoExtremo);
        }
    }
    private void mostrarRecomendaciones(String categoria, String[][] recomendaciones) { //mio may
        System.out.println("Ud. cuenta con " + categoria + " con un IMC de: " + rpt_imc);
        System.out.println("Unión recomienda los siguientes productos: ");
        System.out.println("┌─────────────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│ Producto                          │ Informe Nutricional recomendaciones nutricional             │");
        System.out.println("├───────────────────────────────────┼─────────────────────────────────────────────────────────────┤");
        for (String[] producto : recomendaciones) {
            System.out.printf("│ %-31s   │ %-49s    │%n", producto[0], producto[1]);
        }
        System.out.println("└─────────────────────────────────────────────────────────────────────────────────────────────────┘");
        System.out.println(" ----------------------------AQUI LOS PUEDES COMPRAR:--------------------------------");
        this.fproductos();
    }
    private String fTipoDePago() {
        double total = Arrays.stream(subtotal_extra).sum();
        System.out.println("El total a pagar es: " + total);
        System.out.println("Vaya a caja a pagar");
        System.out.println("ingrese el tipo de pago?");
        System.out.println("1. TARJETA ");
        System.out.println("2. EFECTIVO");
        opcion = union.nextInt();
        union.nextLine();;
        switch (opcion) {
            case 1:
                String tarjeta, fechacaducidad, dni, cvv;
                System.out.println("ingrese el nombre completo del titular de la tarjeta");
                String titulartarjeta=union.nextLine();
                do {
                    System.out.println("ingrese el numero de DNI del titular de la tarjeta (8 digitos)");
                    dni = union.nextLine();
                } while (dni.length() !=8);
                do {
                    System.out.print("Introduce tu numero de tarjeta (16 dígitos): ");
                    tarjeta = union.nextLine();
                } while (tarjeta.length() != 16);
                boolean formatoValido = false;
                do {
                    System.out.print("Introduce la fecha de caducidad de la tarjeta (MM/YY): ");
                    fechacaducidad = union.nextLine();
                    if (fechacaducidad.matches("\\d{2}/\\d{2}")) {
                        formatoValido = true;
                    } else {
                        System.out.println("Formato de fecha no válido. Debe ser MM/YY.");
                    }
                } while (!formatoValido);
                do {
                    System.out.print("Ingrese el numero de CVV ( 3 digitos) ");
                    cvv = union.nextLine();
                } while (cvv.length() != 3);
                System.out.println("pago realizado exitosamente con su tarjeta");
                System.out.println("PRODUCTOS UNION");
                función_de_impresion_de_cobro();
                break;
            case 2:
                double totalPagado;
                System.out.println("El monto a pagar es de: " + total);
                System.out.println("Ingrese el pago de los productos:");
                totalPagado = union.nextDouble();
                while (totalPagado < total) {
                    System.out.println("Monto insuficiente. Faltan " + (total - totalPagado) + " para completar el pago.");
                    System.out.println("Ingrese el monto adicional que va a pagar:");
                    double pagoAdicional = union.nextDouble();
                    if (pagoAdicional <= 0) {
                        System.out.println("Ingrese un monto válido, por favor. No puede consumir los productos gratis.");
                    } else {
                        totalPagado += pagoAdicional;
                    }
                }
                if (totalPagado > total) {
                    double vuelto = totalPagado - total;
                    System.out.println("Pago recibido. Su vuelto es de: " + vuelto);
                } else {
                    System.out.println("Pago completado. Gracias por su compra.");
                }
                función_de_impresion_de_cobro();
                break;

            default:
                System.out.println("Opcion no válida");
                this.fpregunta();
                break;
        }


        return  null;
    }
    public void función_de_impresion_de_cobro(){
        Scanner union_m= new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        double op_gratuitas=0.00; //Recordar dar valores pero solo si lo deseas *
        double op_exoneradas=0.00;
        double op_gravadas=precio;
        double descuento_total=0.00;
        double tasaIGV = 0.18;
        double igv = (precio+precio1) * (cantidad+cantidad1) * tasaIGV;
        double sub_total = ((precio+precio1) * (cantidad+cantidad1))-igv;
        double icbper = 0.00;
        double importe_Total = sub_total + igv + icbper;
        double detraccion = 0.00;
        double importe_Neto = importe_Total-detraccion;
        String[][] productos = {
                {"N°", "CANTIDAD", "ARTICULO", "MONTO"},
                {"1", String.valueOf(cantidad), "ARTICULO 1", String.valueOf(precio)},
                {"2", String.valueOf(cantidad1), "ARTICULO 2", String.valueOf(precio1)}
        };
        do {
            System.out.println("------------------------------");
            System.out.println("Ingrese nombre del vendedor: ");
            nombre_vende = union_m.nextLine();
            System.out.println("Ingrese nsu contraseña: ");
            contra_vende = union_m.nextLine();
            System.out.println("--------INICIANDO SESIÓN--------");
            System.out.println("Ingrese nuevamente su contraseña: ");
            String contra_vende_com = union_m.nextLine();
            if (contra_vende_com.equals(contra_vende)) {
                System.out.println("|-------------------------------------------------------------------------------|");
                System.out.println("|----- BIENVENIDO(A) A PRODUCTOS UNION"+" Srta.:  "+nombre_vende+" 🌟 ----------|");
                System.out.println("|-------------------------------------------------------------------------------|");
                System.out.println("|1| GENERAR BOLETA      	       	   -----------------------------------------|");
                System.out.println("|2| GENERAR FACTURA               	   -----------------------------------------|");
                System.out.println("|3| EXPORTAR BOLETA            	       -----------------------------------------|");
                System.out.println("|4| EXPORTAR FACTURA      	       	   -----------------------------------------|");
                System.out.println("|5| MOSTRAR CARRITO      	       	   -----------------------------------------|");
                System.out.println("|0| SALIR                              -----------------------------------------|");
                System.out.println("|-------------------------------------------------------------------------------|");
                System.out.print("|INGRESAR LA OPCION DEL (1 AL 4): ");
                opcion = union_m.nextInt();
                union_m.nextLine();
                switch (opcion) {
                    case 1:
                        numero_factura = "BROE - 00000" + (++contador_factura);
                        System.out.println("\033[38;5;226m");
                        System.out.println("|--------------------------------------------------------------|");
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
                        System.out.println("|=-- Numero: -----------------------------------  " + numero_factura + "|");
                        System.out.println("|=-- Cliente: --------------------------  " + nombre + " " + apellido + " |");
                        System.out.println("|=-- Doc. ident: -----------------------------------  " + dni + "|");
                        System.out.println("|=-- Fecha: ------------------  " + fechaActual + "   " + horaActual + "|");
                        System.out.println("|=-- Dirección: ---------------------------" + opcionU + " - Perú|");
                        System.out.println("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
                        for (int i = 0; i < productos.length; i++) {
                            System.out.printf("|%s|%s|%s|%s|%n", productos[i][0], productos[i][1], productos[i][2], productos[i][3]);
                        }
                        System.out.println("|=== Op. Gratuitas: ============================== S/. " + op_gratuitas + "        |");
                        System.out.println("|=== Op. Exoneradas: ============================= S/  " + op_exoneradas + "        |");
                        System.out.println("|=== Op. Gravadas: =============================== S/. " + op_gravadas + "        |");
                        System.out.println("|=== Total de descuento: ========================= S/. " + descuento_total + "        |");
                        System.out.println("|=== Sub-Total: ================================== S/. " + sub_total + "        |");
                        System.out.println("|=== IGV: ======================================== S/. " + igv + "          |");
                        System.out.println("|=== ICBPER: ===================================== S/. " + icbper + "       |");
                        System.out.println("|=== Importe total: ============================== S/. " + importe_Total + " |");
                        System.out.println("|=== Detracción: ================================= S/. " + detraccion + "|");
                        System.out.println("|=== Importe neto: =============================== S/. " + importe_Neto + " |");
                        System.out.println("|================= GRACIAS POR SU COMPRA ======================|");
                        System.out.println("|==============================================================|");
                        System.out.println("|=== Medio de Pago: ==============================  " + opcion_de_pago + "   |");
                        System.out.println("|=== Vendedor(a) :================================  " + nombre_vende + "     |");
                        System.out.println("|==============================================================|");
                        System.out.println("|==== Representación Impresa de documento, el cual puede ser ==|");
                        System.out.println("|==========  descargado de la pagina WWW.upeu.pe   ============|");
                        System.out.println("|==============================================================|");
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
                        System.out.println("|=-- Fecha: ------------------  " + fechaActual + "   " + horaActual + "|");
                        System.out.println("|=-- Facturado a Cliente: " + nombre + " " + apellido + "-----------|");
                        System.out.println("|=-- DNI: " + dni + "-------------------------------------------|");
                        System.out.println("|=-- Correo: " + correo + "--------------------------------------------------|");
                        System.out.println("|=-- Contraseña: " + contraseña + "----------------------------------------------|");
                        System.out.println("|=-- codigo universitario: " + codigoU + "------------------------------------|");
                        System.out.println("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|");
                        for (int i = 0; i < productos.length; i++) {
                            System.out.printf("|%s|%s|%s|%s|%n", productos[i][0], productos[i][1], productos[i][2], productos[i][3]);
                        }
                        System.out.println("|=== Op. Gratuitas: ============================== S/. " + op_gratuitas + "        |");
                        System.out.println("|=== Op. Exoneradas: ============================= S/  " + op_exoneradas + "        |");
                        System.out.println("|=== Op. Gravadas: =============================== S/. " + op_gravadas + "        |");
                        System.out.println("|=== Total de descuento: ========================= S/. " + descuento_total + "        |");
                        System.out.println("|=== Sub-Total: ================================== S/. " + sub_total + "        |");
                        System.out.println("|=== IGV: ======================================== S/. " + igv + "          |");
                        System.out.println("|=== ICBPER: ===================================== S/. " + icbper + "       |");
                        System.out.println("|=== Importe total: ============================== S/. " + importe_Total + " |");
                        System.out.println("|=== Detracción: ================================= S/. " + detraccion + "|");
                        System.out.println("|=== Importe neto: =============================== S/. " + importe_Neto + " |");
                        System.out.println("|================= GRACIAS POR SU COMPRA ======================|");
                        System.out.println("|==============================================================|");
                        System.out.println("|=== Medio de Pago: ==============================  " + opcion_de_pago + "   |");
                        System.out.println("|=== Vendedor(a) :================================  " + nombre_vende + "     |");
                        System.out.println("|==============================================================|");
                        System.out.println("|==== Representación Impresa de documento, el cual puede ser ==|");
                        System.out.println("|==========  descargado de la pagina WWW.upeu.pe   ============|");
                        System.out.println("|==============================================================|");
                        System.out.println("|==============================================================|");
                        break;
                    case 3:
                        EXPO_BOLETA(productos, fechaActual, horaActual);
                        break;
                    case 4:
                        EXPO_FACTURA(productos, fechaActual, horaActual);
                        break;
                    case 5:
                        //CARRITO();
                        break;
                    case 0:
                        System.out.println("\u001B[31m🌟✨ Gracias por usar nuestro servicio. ✨🌟");
                        break;
                    default:
                        System.out.println("\u001B[31m😒❌ OPCIÓN NO VÁLIDA ❌😒");
                        break;
                }
            }
        } while (opcion != 0);
    }
    public static void EXPO_BOLETA(String[][] productos, LocalDate fechaActual, LocalTime horaActual){
        String nombreArchivo = "D:\\Factura.txt";
        try (FileWriter writer = new FileWriter(nombreArchivo)){
            writer.write("\033[38;5;226m|--------------------------------------------------------------|\n");
            writer.write("|---------------------------- UNIÓN ---------------------------|\n");
            writer.write("|-------------------- Saludable por naturaleza ----------------|\n");
            writer.write("|--------------------------------------------------------------|\n");
            writer.write("|------------------- UNIVERSIDAD PERUANA UNIÓN ----------------|\n");
            writer.write("|--------- Centro de prod. de Bienes  Productos union ---------|\n");
            writer.write("|---------------- C. central Km. 19 Villa union ---------------|\n");
            writer.write("|-------------- Lurigancho - Chosica Fax : 6186300 ------------|\n");
            writer.write("|------------------ Telef. 618-6309 - 618-6310 ----------------|\n");
            writer.write("|------------------------ RUC 20138122256 ---------------------|\n");
            writer.write("|--------------------------------------------------------------|\n");
            writer.write("|===================== BOLETA ELECTRONICA =====================|\n");
            writer.write("|=-- Numero: -----------------------------------  " + numero_factura + "|\n");
            writer.write("|=-- Cliente: --------------------------  " + nombre + " " + apellido + " |\n");
            writer.write("|=-- Doc. ident: -----------------------------------  " + dni + "|\n");
            writer.write("|=-- Fecha: ------------------  " + fechaActual + "   " + horaActual + "|\n");
            writer.write("|=-- Dirección: ---------------------------" + opcionU + " - Perú|\n");
            writer.write("|================ BOLSA DE PRODUCTOS COMPRADOS: ===============|\n");
            for (int i = 0; i < productos.length; i++) {
                writer.write(String.format("|%s|%s|%s|%s|%n", productos[i][0], productos[i][1], productos[i][2], productos[i][3]));
            }
            writer.write("|=== Op. Gratuitas: ============================== S/. " +  0+ "        |\n");
            writer.write("|=== Op. Exoneradas: ============================= S/  " + 0+ "        |\n");
            writer.write("|=== Op. Gravadas: =============================== S/. " + 0+ "        |\n");
            writer.write("|=== Total de descuento: ========================= S/. " + 0+ "        |\n");
            writer.write("|=== Sub-Total: ================================== S/. " + 0+ "        |\n");
            writer.write("|=== IGV: ======================================== S/. " + 0+ "          |\n");
            writer.write("|=== ICBPER: ===================================== S/. " + 0+ "       |\n");
            writer.write("|=== Importe total: ============================== S/. " + 0+ " |\n");
            writer.write("|=== Detracción: ================================= S/. " + 0+ "|\n");
            writer.write("|=== Importe neto: =============================== S/. " + 0+ " |\n");
            writer.write("|================= GRACIAS POR SU COMPRA ======================|\n");
            writer.write("|==============================================================|\n");
            writer.write("|=== Medio de Pago: ==============================  " + opcion_de_pago + "   |\n");
            writer.write("|=== Vendedor(a) :================================  " + nombre_vende + "     |\n");
            writer.write("|==============================================================|\n");
            writer.write("|==== Representación Impresa de documento, el cual puede ser ==|\n");
            writer.write("|==========  descargado de la pagina WWW.upeu.pe   ============|\n");
            writer.write("|==============================================================|\n");
            writer.write("|==============================================================|\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void EXPO_FACTURA(String[][] productos, LocalDate fechaActual, LocalTime horaActual){
        String nombreArchivo = "D:\\Factura.txt";
        //aqui repetimos otra vez
    }
    public static void CARRITO(String[][] productos, LocalDate fechaActual, LocalTime horaActual){

    }
    public static void main(String[]args){
        compras_union todo= new compras_union();
        todo.fdatos();
    }
}
