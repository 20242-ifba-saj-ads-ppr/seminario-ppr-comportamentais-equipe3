
public class EstadoAtiva implements EstadoConta {
    @Override
    public void registrar(ContaUsuario conta, String email, String nome) {
        System.out.println("Email já foi verificado.");
    }
    
    @Override
    public void verificarEmail(ContaUsuario conta) {
        System.out.println("Conta já está ativa.");
    }
    
    @Override
    public void desativar(ContaUsuario conta){
        System.out.println("Desativando conta");
    }

    @Override
    public void ativar(ContaUsuario conta){
        System.out.println("Conta ja ativa");
    }

    @Override
    public String getNomeEstado() {
        return "Ativa";
    }
}