package main;

public class CadastraLivros implements Comparable<CadastraLivros> {
    private String nome;
    private String autor;
    private int ano;
    private String status;
    private String posicao;

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getStatus() {
        return status;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + getNome() + "\n" + "Autor: " + getAutor() + "\n" + "Ano: " + getAno() + "\n" + "Posição: " + getPosicao() + "\n";
    }
    
    public int compareTo(CadastraLivros outroCadastro) {
      return this.getNome().compareTo(outroCadastro.getNome());
    }
}