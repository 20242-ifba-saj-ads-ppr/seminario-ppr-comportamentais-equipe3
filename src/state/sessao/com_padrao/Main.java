
// Classe de teste para demonstrar o funcionamento
public class Main {
    public static void main(String[] args) {
        ContaUsuario conta = new ContaUsuario();
        System.out.println("Estado atual: " + conta.getEstadoAtual());
        
        // Processo normal de criação e ativação de conta
        System.out.println("Registrando: ");
        conta.registrar("example@example.com", "Jonh Doe");
        System.out.println("Estado atual: " + conta.getEstadoAtual());

        
        System.out.println("Verificando email: ");
        conta.verificarEmail();
        System.out.println("Estado atual: " + conta.getEstadoAtual());

        
        // Desativar a conta
        System.out.println("Desativando conta:");
        conta.desativar();
        System.out.println("Estado atual: " + conta.getEstadoAtual());
        
        System.out.println("Reativando conta");
        conta.ativar();
        System.out.println("Estado atual: " + conta.getEstadoAtual());
        
    }
}