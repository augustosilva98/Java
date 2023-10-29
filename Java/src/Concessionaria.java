import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Carro> carros;

    public Concessionaria() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void exibirCarrosDisponiveis() {
        System.out.println("Carros disponiveis na concessionaria:");
        for (Carro carro : carros) {
            if (carro.isDisponivel()) {
                System.out.println(carro);
            }
        }
    }

    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        CarroNovo carroNovo1 = new CarroNovo("Ford", "Fiesta", 2023, true, 60000.0, 50000.0, 12);
        CarroNovo carroNovo2 = new CarroNovo("Chevrolet", "Onix", 2023, false, 70000.0, 60000.0, 24);
        CarroUsado carroUsado1 = new CarroUsado("Volkswagen", "Gol", 2018, true, 30000.0, 25000.0, 6);

        concessionaria.adicionarCarro(carroNovo1);
        concessionaria.adicionarCarro(carroNovo2);
        concessionaria.adicionarCarro(carroUsado1);

        concessionaria.exibirCarrosDisponiveis();
    }
}

class Carro {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected boolean disponivel;

    public Carro(String marca, String modelo, int ano, boolean disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - " + ano;
    }
}

class CarroNovo extends Carro {
    private double preco;
    private double valorEntrada;
    private int parcelas;

    public CarroNovo(String marca, String modelo, int ano, boolean disponivel, double preco, double valorEntrada, int parcelas) {
        super(marca, modelo, ano, disponivel);
        this.preco = preco;
        this.valorEntrada = valorEntrada;
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return super.toString() + " - Novo\nPreco: R$" + preco + "\nValor de Entrada: R$" + valorEntrada +
                "\nParcelas: " + parcelas + "x";
    }
}

class CarroUsado extends Carro {
    private double preco;
    private double valorEntrada;
    private int parcelas;

    public CarroUsado(String marca, String modelo, int ano, boolean disponivel, double preco, double valorEntrada, int parcelas) {
        super(marca, modelo, ano, disponivel);
        this.preco = preco;
        this.valorEntrada = valorEntrada;
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return super.toString() + " - Usado\nPreco: R$" + preco + "\nValor de Entrada: R$" + valorEntrada +
                "\nParcelas: " + parcelas + "x";
    }
}
