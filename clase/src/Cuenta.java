public class Cuenta {
    public static void main(String[] args) {


        CuentaClase cuenta = new CuentaClase();

        CuentaJoven cuentaJoven = new CuentaJoven();

        cuentaJoven.setCantidad(5000);
        System.out.println(cuentaJoven.getCantidad());

    }
}
