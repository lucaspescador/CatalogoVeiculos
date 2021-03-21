public class VeiculoPassageiros extends Veiculo{
    private int nroPassageiros;

    public VeiculoPassageiros (String placa, String marca, String modelo, int ano, double valor, int nroPassageiros){
        super(placa, marca, modelo, ano, valor);
        this.nroPassageiros = nroPassageiros;
    }

    public int getNroPassageiros(){
        return nroPassageiros;
    }

    public void setNroPassageiros(int nroPassageiros){
        this.nroPassageiros = nroPassageiros;
    }

    @Override
    public String toString(){
        return "VeiculoPassageiros - placa:" + placa + ", marca:" + marca + ", modelo:" + modelo + 
        ", ano:" + ano +  ", valor:" + valor + ", capCargaTon:" + capCargaTon + ", nroEixos:" + nroEixos;
    }
}