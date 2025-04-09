// Classe principal ContaUsuario

public class ContaUsuario {
    private EstadoConta estado;
    private String email;
    private String nome;
    
    public ContaUsuario() {
        this.estado = new EstadoAnonimo(); // Estado inicial
    }

    public void setEstado(EstadoConta estado) {
        this.estado = estado;
    }

    public void registrar(String email, String nome) {
        estado.registrar(this, email, nome);
    }
    
    public void verificarEmail() {
        estado.verificarEmail(this);
    }
    
    public void desativar() {
        estado.desativar(this);
    }
    
    public void ativar() {
        estado.ativar(this);
    }

    public String getEstadoAtual() {
        return estado.getNomeEstado();
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
