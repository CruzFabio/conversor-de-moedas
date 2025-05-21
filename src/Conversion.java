public class Conversion {
    private double valorAConverter;
    private double valorConvertido;

    public void conversor(Moeda moeda, String moedaDestino, double valorAConverter) {
        Double taxa = moeda.taxaDeConversao().get(moedaDestino);

        if (taxa != null) {
            valorConvertido = taxa * valorAConverter;
            System.out.printf("Total convertido de %s para %s: %.2f%n\n", moeda.codigo(), moedaDestino, valorConvertido);
        } else {
            System.out.println("Moeda de destino não encontrada.");
        }
    }

       public double getValorAConverter() {
        return valorAConverter;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }



}
