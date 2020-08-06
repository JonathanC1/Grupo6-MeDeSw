
package tallerautomotriz;
public class Formulario {
        
    private String Agencia;
    private String email;
    private long numero;
    private String paquete;

    public Formulario(String Agencia, String email, long numero, String paquete) {
        this.Agencia = Agencia;
        this.email = email;
        this.numero = numero;
        this.paquete = paquete;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    @Override
    public String toString() {
        return "Formulario{" + "Agencia=" + Agencia + ", email=" + email + ", numero=" + numero + ", paquete=" + paquete + '}';
    }
        
}
