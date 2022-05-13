package examen;

import java.util.ArrayList;
import java.util.Iterator;

public class productos {

    Producto prod = new Producto();
    ArrayList<Producto> listaproductos = new ArrayList<>();

    ArrayList pr1 = new ArrayList();

    public void addProducto(Producto pr) {
        listaproductos.add(pr);
    }

    public void reporteproductos() {
        for (Producto p : listaproductos) {
            System.out.println("" + p.getProd_id());
            System.out.println("" + p.getMarca());
            System.out.println("" + p.getProd_nombre());
            System.out.println("" + p.getProd_precio());
        }
    }

    public void eliminarproducto() {
        Iterator it = pr1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public void actualizareporte() {

    }

    public static void main(String[] args) {
        Producto pr1 = new Producto();
        pr1.setProd_id("211");
        pr1.setMarca("M");
        pr1.setProd_nombre("papa");
        pr1.setProd_precio(15);

        Producto pr2 = new Producto();
        pr2.setProd_id("22");
        pr2.setMarca("qwe");
        pr2.setProd_nombre("asdf");
        pr2.setProd_precio(5);

        productos iprod = new productos();
        iprod.addProducto(pr1);
        iprod.addProducto(pr2);
        iprod.reporteproductos();
        pr1.remove(1);

    }

}
