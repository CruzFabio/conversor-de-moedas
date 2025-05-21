import java.util.Scanner;

public class Aplicacao {
    private Scanner scanner = new Scanner(System.in);
    private Conversion conversion;
    private ApiService apiService;

    public void iniciar() {
        this.apiService = new ApiService();
        this.conversion = new Conversion();
        int opcao;
        do {
            System.out.println(getMenu());
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando programa...");
                break;
            }

            switch (opcao) {
                case 1 -> executarConversao("USD", "EUR", obterValor());
                case 2 -> executarConversao("USD", "BRL", obterValor());
                case 3 -> executarConversao("USD", "JPY", obterValor());
                case 4 -> executarConversao("USD", "CNY", obterValor());
                case 5 -> executarConversao("USD", "KRW", obterValor());
                case 6-> executarConversao("BRL", "USD", obterValor());
                case 7 -> executarConversao("BRL", "EUR", obterValor());
                case 8 -> executarConversao("BRL", "KRW", obterValor());
                case 9 -> executarConversao("BRL", "JPY", obterValor());
                case 10 -> executarConversao("BRL", "CNY", obterValor());
                default -> System.out.println("Opção inválida");

            }
          } while (true);


    }

    public String getMenu() {
        return """
                |-----------------------------------------|
                |       *** CONVERSOR DE MOEDAS ***       |
                |-----------------------------------------|
                |    Selecione uma opção para continuar   |
                |                                         |
                | (1) Dólar (USD) > Euro (EUR)            |
                | (2) Dólar (USD) > Real (BRL)            |
                | (3) Dólar (USD) > Iene (JPY)            |
                | (4) Dólar (USD) > Yuan (CNY)            |
                | (5) Dólar (USD) > Won sul-coreano (KRW) |
                | (6) Real (BRL) > Dólar (USD)            |
                | (7) Real (BRL) > Euro (EUR)             |
                | (8) Real (BRL) > Won sul-coreano (KRW)  |
                | (9) Real (BRL) > Iene (JPY)             |
                | (10) Real (BRL) > Yuan (CNY)            |
                |-----------------------------------------|
                | (0) Sair                                |
                |-----------------------------------------|
                
                """;
    }

//    Método para auxiliar o switch
    public void executarConversao(String base, String destino, double valor) {
        Moeda moeda = apiService.consultaTaxa(base);
        conversion.conversor(moeda, destino, valor);
    }

    public double obterValor() {
        System.out.print("Digite o valor para conversão: ");
        return scanner.nextDouble();
    }

}
