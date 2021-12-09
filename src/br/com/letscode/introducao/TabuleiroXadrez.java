package br.com.letscode.introducao;

public class TabuleiroXadrez {

    public static final int TAMANHO_TABULEIRO = 8;

    public static void main(String[] args) {
        String Tabuleiro[][] = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

        populandoTabuleiroComPeoes(Tabuleiro);

        imprimeTabuleiro(Tabuleiro);

    }

    private static void imprimeTabuleiro(String[][] Tabuleiro) {
        for (String[] linhas : Tabuleiro) {
            for (String celulas : linhas) {
                System.out.printf("%s", celulas);
            }
            System.out.println("");
        }
    }

    private static void populandoTabuleiroComPeoes(String[][] Tabuleiro) {
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                if( i == 1 || i == 6 ){
                    Tabuleiro[i][j] = "p";
                } else {
                    Tabuleiro[i][j] = "_";
                }
            }
        }
    }
}
