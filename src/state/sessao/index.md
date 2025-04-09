# State

Permite a um objeto alterar seu comportamento quando o seu estado interno muda. O
objeto parecerá ter mudado sua classe.

## Intenção

O padrão State permite encapsular os estados de um objeto e alterar dinamicamente seu comportamento de acordo com o estado atual, sem usar condicionais complexas ou múltiplas ramificações.

## Também conhecido como

Objects for States

## Motivação

Considere um modulo de contas de usuario de um sistema web, onde para cada visitante do site é automaticamente criada uma conta anonima, que mais tarde pode pode ser associada a um email, e este email deve ser vericado para que a conta seja considereda ativa, e eventualmente caso o usuario solicite, sua conta pode ser desativada

Além disso, para cada estado da que a conta se encontra (anonima, verificandoemail, ativa e desativa), diferentes comportamentos são esperados para a conta do usuario

## Estrutura

<figure>

<!-- @include: ./estrutura.puml -->

<figcaption>Estrutura do State</figcaption>

</figure>

## Participantes

- **Context (ContaUsuario)**  
  - Define a interface de interesse para os clientes.
  - Mantém uma instância de uma subclasse ConcreteState que define o estado
corrente.


- **State (EstadoSessao)**  
  - Interface comum para todos os estados possíveis.
  - Declara métodos que definem comportamentos que variam conforme o estado.

- **ConcreteState (EstadoAnonimo, EstadoVerificandoEmail, EstadoAtiva, EstadoDesativada)**  
  - Implementa comportamentos específicos para o estado correspondente.
  - Pode alterar o estado do `Context`.

## Exemplo

No seu exemplo em:

