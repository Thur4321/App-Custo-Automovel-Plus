package custoautomovelplus;

import java.time.LocalDate;

public class InfoAuto {

    protected String marca, modelo, cor, combustível;

    protected float custo;
    
    protected double venda;

    protected int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustível() {
        return combustível;
    }

    public void setCombustível(String combustível) {
        this.combustível = combustível;
    }

    public InfoAuto(String marca, String modelo, String cor, String combustível, float custo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustível = combustível;
        this.custo = custo;
        this.ano = ano;
    }

    public InfoAuto(String marca, String modelo, String cor, String combustível, float custo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustível = combustível;
        this.custo = custo;
        this.ano = LocalDate.now().getYear();

    }

    public double qtoCusta() {
        if (combustível.equals("Gasolina")) {
            venda = custo + (custo * 5 / 100);
        } else if (combustível.equalsIgnoreCase("Álcool")) {
            venda = custo + (custo * 7 / 100);
        } else if (combustível.equalsIgnoreCase("Diesel")) {
            venda = custo + (custo * 15 / 100);
        } else if (combustível.equalsIgnoreCase("GNV")) {
            venda = custo + (custo * 3 / 100);
        } else if (combustível.equalsIgnoreCase("Flex")) {
            venda = custo + (custo * 10 / 100);
        }
        return venda;
    }
    
    @Override
    public String toString() {
        return "Marca: " + marca
                + "\nModelo: " + modelo
                + "\nAno: " + ano
                + "\nCor: " + cor
                + "\nConbustível: " + combustível
                + "\nPreço de custo: R$" + custo
                + "\nPreço de venda: R$" + qtoCusta();
    }
}
