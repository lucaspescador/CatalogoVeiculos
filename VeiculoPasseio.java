public class VeiculoPasseio extends Veiculo {
    private double consumoKmLt;

    public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valor, double consumoKmLt){
        super(placa, marca, modelo, ano, valor);
        this.consumoKmLt = consumoKmLt;
    }

    public double getConsumoKmLt(){
        return consumoKmLt;
    }

    public void setConsumoKmLt(double consumoKmLt){
        this.consumoKmLt = consumoKmLt;
    }

    @Override
    public String toString(){
        return "VeiculoPasseio - placa:" + placa + ", marca:" + marca + ", modelo:" + modelo + 
        ", ano:" + ano +  ", valor:" + valor + ", consumoKmLt:" + consumoKmLt;
    }
}