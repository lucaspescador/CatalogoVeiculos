import java.util.List;

public class App{
    public static void main(String[]args) {

    CatalogoVeiculos catalogo = new CatalogoVeiculos(List.of(
      new VeiculoUtilitario("placa1","marca1","modelo1",2021,1000,2,5),
      new VeiculoPasseio("placa2","marca2","modelo2",2020,2000,3,6),
      new VeiculoPassageiros("placa3","marca3","modelo3",2019,3000,4,7)
    ));

    System.out.println(catalogo.consultaPorPlaca("placa1"));
    System.out.println(catalogo.consultaPorMarca("marca1"));
    System.out.println(catalogo.consultaPorAno("2020"));
    System.out.println(catalogo.consultaPorTipo("utilitario"));

    }
}