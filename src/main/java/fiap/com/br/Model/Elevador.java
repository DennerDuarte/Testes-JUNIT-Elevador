package fiap.com.br.Model;


public class Elevador {
    private int id;
    private double cargaMaxima = 200.00;
    private double cargaAtual;
    private boolean sinalAlerta;
    private Calculadora calculadora;


    public Elevador() {
        calculadora = new Calculadora();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public boolean isSinalAlerta() {
        return sinalAlerta;
    }

    public void setSinalAlerta(boolean sinalAlerta) {
        this.sinalAlerta = sinalAlerta;
    }

    public double entrarNoElevador(double peso){
        return calculadora.somar(cargaAtual, peso);
    }
    public double sairDoElevador(double peso){
        return calculadora.subtrair(cargaAtual,peso);
    }
    public boolean avaliarPeso(double peso){
        if( peso > cargaMaxima){
            return sinalAlerta = true;
        }
        return sinalAlerta;
    }
}
