
public class EstadoDesativada implements EstadoConta {
    @Override
    public void registrar(ContaUsuario conta, String email, String nome) {
        System.out.println("Conta ja registrada");
    }
    
    @Override
    public void verificarEmail(ContaUsuario conta) {
        System.out.println("Email ja verificado");
    }
    

    @Override
    public void desativar(ContaUsuario conta) {
        System.out.println("Conta ja desativada");        
    }

    @Override
    public void ativar(ContaUsuario conta){
        System.out.println("Reativando conta");
        conta.setEstado(new EstadoAtiva());
    }

    @Override
    public String getNomeEstado() {
        return "Ativa";
    }
}