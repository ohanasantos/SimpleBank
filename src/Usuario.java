public class Usuario {
    private String nome;
    private int idade;
    private String cidade;
    private int idCliente;
    private double saldoCliente;

    public Usuario(String nome, int idade, String cidade, int idCliente, double saldoCliente) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.idCliente = idCliente;
        this.saldoCliente = saldoCliente;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCidade() {
        return cidade;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void exibirInformacoes() {
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Saldo: " + saldoCliente);
        System.out.println("ID: " + idCliente);
    }

    public void saque(double valor) {
        if (valor > saldoCliente) {
            System.out.println("");
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldoCliente -= valor;
            System.out.println("");
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldoCliente += valor;
            System.out.println("");
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("");
            System.out.println("Valor de depósito inválido.");
        }
    }
}
