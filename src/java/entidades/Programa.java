package entidades;

public class Programa {

    public static void main(String[] args) {
        //Carga de productos
        Productos articulo1;
        articulo1 = new Productos();
        articulo1.nombre = "Lapiz";
        articulo1.descripcion = "HB Negro";
        articulo1.precio = 20;

        Productos articulo2;
        articulo2 = new Productos();
        articulo2.nombre = "Cuaderno";
        articulo2.descripcion = "Tapa dura, rayado";
        articulo2.precio = 100;
        
        Productos articulo3;
        articulo3 = new Productos();
        articulo3.nombre = "Pincel";
        articulo3.descripcion = "Redondo N°6";
        articulo3.precio = 75;
        
        Productos articulo4;
        articulo4 = new Productos();
        articulo4.nombre = "Goma";
        articulo4.descripcion = "Blanca";
        articulo4.precio = 15;

        System.out.println(articulo1.nombre + " " + articulo1.nombre + " " + articulo1.descripcion + " " + articulo1.precio);

        System.out.println(articulo2.nombre + " " + articulo2.nombre + " " + articulo2.descripcion + " " + articulo2.precio);
        
        System.out.println(articulo3.nombre + " " + articulo3.nombre + " " + articulo3.descripcion + " " + articulo3.precio);
        
        System.out.println(articulo4.nombre + " " + articulo4.nombre + " " + articulo4.descripcion + " " + articulo4.precio);

        System.out.println("OK");
    }

}
