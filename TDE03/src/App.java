public class App {
    public static void main(String[] args) throws Exception {
        double valor = -12.5;

        // 1. Converte o double para a representação long de 64 bits
        
        long bits = Double.doubleToRawLongBits(valor);
        System.out.println("Double: " + valor);
        System.out.println("Representação em Long: " + bits);
        System.out.println("Bits (63 a 0):");

        // 2. Loop para percorrer os 64 bits (do 63º ao 0º)
            for (int i = 63; i >= 0; i--) {
                
            // Desloca 'i' posições para a direita e faz AND com 1      
                long bit = (bits >> i) & 1;
        
            System.out.print(bit);
            // Apenas para organizar a saída (sinal | expoente | mantissa)     
            if (i == 63 || i == 52)
        
            System.out.print(" | "); 

        }
}
}