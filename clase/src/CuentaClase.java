public class CuentaClase {
    String titular;
    float cantidad;

    public CuentaClase(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public CuentaClase() {

    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
}
