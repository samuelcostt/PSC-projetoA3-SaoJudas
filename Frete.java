package a3;



public class Frete {

    private String material;
    private String fragilidade;
    private int quantidade;
    private float peso;
    private double tamanho;
    private double orcamento;
    private String dataEstimada;
    private int codigo;

    public Frete() {
        // Inicializar variáveis, se necessário
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFragilidade() {
        return fragilidade;
    }

    public void setFragilidade(String fragilidade) {
        this.fragilidade = fragilidade;
    }



    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDataEstimada() {
        return dataEstimada;
    }

    public void setDataEstimada(String dataEstimada) {
        this.dataEstimada = dataEstimada;
    }
}
