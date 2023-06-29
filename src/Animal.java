public class Animal {

    // Atributos - características
    String nome;
    String raca;
    double peso;
    String tipoPelo;
    String corOlhoDireito;

    // mais sobrecargas do construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Métodos - comportamento
    public void andar(){        // () passagem de parâmetros
        System.out.println("andou");
    }
    public void comer(){ System.out.println("Animal Comeu!!!"); }

    // Construtor padrão
    Animal(){

    }
    // sobrecarga do construtor
    Animal(String raca){
        this.raca = raca;
    }

}
