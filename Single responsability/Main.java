public class Main {
    public static void main(String[] args) {
        SistemaPedidos pedidos = new SistemaPedidos("Elias", "Espresso");
        MaquinaCafe maquina = new MaquinaCafe("Espresso");
        Factura factura = new Factura("Elias", 82.50);
        Notificación notificacion = new Notificación("Elias", "Tu café está listo");

        pedidos.tomarPedido();
        maquina.PrepararCafe();
        factura.generarFactura();
        notificacion.enviarCorreo();
    }
}
