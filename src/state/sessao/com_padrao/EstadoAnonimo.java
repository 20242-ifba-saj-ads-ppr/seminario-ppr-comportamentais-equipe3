// Estado Anônimo

public class EstadoAnonimo implements EstadoConta {
    @Override
    public void registrar(ContaUsuario conta, String email, String nome) {
        System.out.println("Enviando email de verificação...");
        conta.setEmail(email);
        conta.setNome(nome);
        conta.setEstado(new EstadoVerificandoEmail());
    }
    
    @Override
    public void verificarEmail(ContaUsuario conta) {
        System.out.println("Se registre primeiro");
    }
    
    @Override
    public void desativar(ContaUsuario conta) {
        System.out.println("Conta ainda não está ativa para ser desativada.");
    }
    
    @Override
    public void ativar(ContaUsuario conta){
        System.out.println("Se registre primeiro");
    }

    
    @Override
    public String getNomeEstado() {
        return "Anônimo";
    }
}