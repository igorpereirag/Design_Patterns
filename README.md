# Guia Detalhado de Padrões de Projeto


Este repositório é seu guia completo para entender e implementar padrões de projeto, Padrões de projeto oferecem soluções testadas e comprovadas para desafios recorrentes, proporcionando estruturas desacopladas e flexíveis para criar sistemas de alta qualidade.

## O que são Padrões de Projeto?

Imagine-os como receitas refinadas para resolver problemas específicos de design de software. Essas receitas, desenvolvidas por especialistas ao longo dos anos, são as melhores práticas encapsuladas em formas reutilizáveis. Ao aplicar padrões de projeto, você não apenas resolve problemas, mas também constrói sistemas mais modulares, expansíveis e fáceis de manter.

## Categorias de Padrões de Projeto

### Padrões de Criação:

1. **Singleton:**
   - **Objetivo:** Garante uma única instância de uma classe.
   - **Quando usar:** Use quando for essencial ter exatamente uma instância de uma classe e quando esta instância precisa ser acessível globalmente. Útil para controle de recursos compartilhados, como conexões de banco de dados ou logs.

2. **Factory Method:**
   - **Objetivo:** Define uma interface para criar objetos, permitindo que subclasses alterem os tipos de objetos criados.
   - **Quando usar:** Use quando uma classe não pode antecipar a classe de objetos que ela precisa criar, deixando as subclasses decidirem sobre a criação. Útil para frameworks onde a classe base prevê a estrutura, mas as subclasses definem a implementação.

3. **Abstract Factory:**
   - **Objetivo:** Fornece uma interface para criar famílias de objetos relacionados.
   - **Quando usar:** Use quando precisa garantir que os objetos criados pertençam a famílias compatíveis, sem especificar suas classes concretas. Ideal para sistemas que precisam ser independentes da forma como seus objetos são criados, compostos e representados.

4. **Builder:**
   - **Objetivo:** Separa a construção de um objeto complexo de sua representação.
   - **Quando usar:** Use quando deseja criar diferentes representações de um objeto sem alterar sua estrutura interna. Ótimo para criar objetos complexos com muitos parâmetros opcionais.

5. **Prototype:**
   - **Objetivo:** Cria novos objetos clonando objetos existentes.
   - **Quando usar:** Use quando a criação de uma classe hierárquica de fábricas que sabem como clonar suas próprias classes seria impraticável ou complexa. Útil quando os objetos a serem copiados são desconhecidos até o tempo de execução.

### Padrões Estruturais:

1. **Adapter:**
   - **Objetivo:** Permite que interfaces incompatíveis trabalhem juntas.
   - **Quando usar:** Use quando uma classe existente não atende às necessidades da interface desejada, proporcionando uma interface intermediária. Ótimo para integrar componentes ou bibliotecas legadas em novos sistemas.

2. **Decorator:**
   - **Objetivo:** Anexa responsabilidades adicionais a um objeto dinamicamente.
   - **Quando usar:** Use quando é necessário estender as funcionalidades de um objeto sem alterar sua estrutura. Ótimo para adicionar funcionalidades específicas sem modificar o comportamento do objeto base.

3. **Composite:**
   - **Objetivo:** Compõe objetos em estruturas de árvore para representar hierarquias parte-todo.
   - **Quando usar:** Use quando deseja tratar objetos individuais e composições de objetos de maneira uniforme. Ótimo para construir estruturas complexas que podem ser tratadas como objetos individuais.

4. **Bridge:**
   - **Objetivo:** Separa uma abstração da sua implementação.
   - **Quando usar:** Use quando uma mudança em uma classe não deve afetar seus clientes. Ótimo para desacoplar uma abstração de sua implementação, permitindo que ambas evoluam independentemente.

5. **Proxy:**
   - **Objetivo:** Fornece um substituto ou marcador de posição para modificar um comportamento e/ou controlar o acesso a um objeto.
   - **Quando usar:** Use quando precisa controlar o acesso a um objeto, adiando ou evitando a sua criação. Ótimo para implementar lazy loading, controle de acesso ou monitoramento.

### Padrões Comportamentais: 

1. **Observer:**
   - **Objetivo:** Estabelece uma dependência um-para-muitos entre objetos.
   - **Quando usar:** Use quando uma alteração em um objeto exige que outros objetos sejam notificados e atualizados automaticamente. Ideal para implementar distribuição de eventos ou broadcasting de atualizações em tempo real.

2. **Strategy:**
   - **Objetivo:** Define uma família de algoritmos, tornando-os intercambiáveis.
   - **Quando usar:** Use quando precisa alterar dinamicamente o comportamento de um objeto. Ótimo para implementar diferentes estratégias de algoritmos ou regras de negócios.

3. **Command:**
   - **Objetivo:** Encapsula solicitações como objetos.
   - **Quando usar:** Use quando deseja parametrizar clientes com diferentes solicitações, enfileirar solicitações ou suportar operações desfazer. Ótimo para desacoplar quem emite uma solicitação do objeto que a processa.

4. **State:**
   - **Objetivo:** Permite que um objeto altere seu comportamento quando seu estado interno muda.
   - **Quando usar:** Use quando um objeto precisa alterar seu comportamento com base em mudanças de estado, evitando instruções condicionais. Ótimo para simplificar códigos com múltiplos estados.

5. **Chain of Responsibility:**
   - **Objetivo:** Passa uma solicitação ao longo de uma cadeia de manipuladores.
   - **Quando usar:** Use quando deseja desacoplar remetentes de seus destinatários, permitindo que mais de um objeto possa manipular uma solicitação. Ótimo para construir pipelines de processamento de dados ou eventos.


## Como Usar Este Repositório

Explore as pastas para cada categoria de padrões de projeto e, dentro delas, encontre exemplos de implementação em diversas linguagens. Cada padrão possui um arquivo explicativo e um código exemplar para facilitar o entendimento.

## Contribuição

Sinta-se à vontade para abrir issues, propor melhorias ou enviar pull requests.
