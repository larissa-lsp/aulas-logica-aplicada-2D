public class Solo {

    // Atributos
    String tipoSolo;
    boolean fertil;
    String cor;

    // Métodos
    public Planta gerarPlanta(Semente semente){
        return new Planta(semente);
    }

}
