
public interface EstadoConta {
    void registrar(ContaUsuario conta, String email, String nome);  // anonimo
    void verificarEmail(ContaUsuario conta); // aguardando verificacao
    
    void desativar(ContaUsuario conta); // desativada

    void ativar(ContaUsuario conta);
    
    String getNomeEstado();
}


