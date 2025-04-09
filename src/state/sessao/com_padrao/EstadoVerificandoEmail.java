
public class EstadoVerificandoEmail implements EstadoConta {
    @Override
    public void registrar(ContaUsuario conta, String email, String nome) {
        System.out.println("Email já está em processo de verificação. Verifique sua caixa de entrada.");
    }
    
    @Override
    public void verificarEmail(ContaUsuario conta) {
        System.out.println("Email verificado com sucesso. Conta ativada!");
        conta.setEstado(new EstadoAtiva());
    }
    
    @Override
    public void desativar(ContaUsuario conta) {
        System.out.println("Conta ainda não está ativa para ser desativada.");
    }
    
    @Override
    public void ativar(ContaUsuario conta) {
        System.out.println("Verifique seu email");
    }
    
    @Override
    public String getNomeEstado() {
        return "Verificando Email";
    }
}