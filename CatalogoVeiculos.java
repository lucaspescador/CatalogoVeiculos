import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoVeiculos{
    private List<Veiculo> veiculos;

    public CatalogoVeiculos(List<Veiculo> veiculos){
        this.veiculos = veiculos;        
    }

    public Veiculo consultaPorPlaca(String placa){
        System.out.println("Consulta de veículos da placa:" + placa);
        return veiculos.stream().filter(veiculo -> veiculo.placa.equals(placa)).findFirst().get();
    }

    public List<Veiculo> consultaPorMarca(String marca){
        System.out.println("Consulta de veículos da marca:" + marca);
        return veiculos.stream().filter(veiculo -> veiculo.marca.equals(marca)).collect(Collectors.toList());
    }

    public List<Veiculo> consultaPorAno(int ano){
        System.out.println("Consulta de veículos do ano:" + ano);
        return veiculos.stream().filter(veiculo -> veiculo.ano == ano).collect(Collectors.toList());
    }

    public List<Veiculo> consultaPorTipo(String tipo){
        System.out.println("Consulta de veículos do tipo:" + tipo);
        List<Veiculo> lista = new ArrayList<>();

        switch(tipo){
        case "passeio":
            veiculos.forEach(veiculo -> {
                if(veiculo instanceof VeiculoPasseio) {
                    lista.add(veiculo);
                }
            });
            break;
        
        case "utilitario":
            veiculos.forEach(veiculo -> {
                if(veiculo instanceof VeiculoUtilitario) {
                    lista.add(veiculo);
                }
            });
            break;
            
        case "passageiros":
            veiculos.forEach(veiculo -> {
                if(veiculo instanceof VeiculoPassageiros){
                    lista.add(veiculo);
                }
            });
            break;
        }

        return lista;
    }
}