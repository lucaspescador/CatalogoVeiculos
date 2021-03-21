public class VeiculoUtilitario extends Veiculo {
    private int capCargaTon;
    private int nroEixos;

    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int capCargaTon, int nroEixos){
        super(placa, marca, modelo, ano, valor);
        this.capCargaTon = capCargaTon;
        this.nroEixos = nroEixos;
    }

    public int getCapCargaTon(){
        return capCargaTon;
    }

    public void setCapCargaTon(int capCargaTon){
        this.capCargaTon = capCargaTon;
    }

    public int getNroEixos() {
        return nroEixos;
    }

    public void setNroEixos(int nroEixos){
        this.nroEixos = nroEixos;
    }

    @Override
    public String toString(){
        return "VeiculoUtilitario - placa:" + placa + ", marca:" + marca + ", modelo:" + modelo + 
        ", ano:" + ano +  ", valor:" + valor + ", capCargaTon:" + capCargaTon + ", nroEixos:" + nroEixos;
    }
}