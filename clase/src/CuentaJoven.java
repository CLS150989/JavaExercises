public class CuentaJoven extends CuentaClase {

    float bonificación;

    public CuentaJoven(String titular, float cantidad, float bonificación) {
        super(titular, cantidad);
        this.bonificación = bonificación;
    }

    public CuentaJoven(float bonificación) {
        this.bonificación = bonificación;
    }

    public CuentaJoven() {

    }

    public float getBonificación() {
        return bonificación;
    }

    public void setBonificación(float bonificación) {
        this.bonificación = bonificación;
    }
}
