package Xadrez;

public enum Cor {
    PRETO("Preto"),
    BRANCO("Branco");
    private String cor;

    Cor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
}
