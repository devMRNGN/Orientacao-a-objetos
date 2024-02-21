1 - ORIENTAÇÃO A OBJETOS

* Consiste em abstrair as representações.
* É muito díficil orientar algo começando do nada sem informação nenhuma, portanto, sempre busque o máximo de informações para que as abstrações não fujam do seu destino inicial.
* Realizar um planejamento bem definido o ajudará a aplicar futuramente a orientação a objetos de forma que não acarrete em problemas.

1.1 - O QUE É UMA CLASSE

* As classes são um conjunto de objetos armazenados como grupos, esse conjunto de objetos compartilham dos mesmos atributos (dados do objeto) e métodos (ações do objeto).
* Em JAVA por padrão é considerada do tipo **Object**, ao qual também é uma classe.

1.2 - ATRIBUTOS

* São as caracteristicas ou propriedades que seu objeto possui.
* Ex: carro possui (cor, peso, qnt bancos, airbag e etc).

1.3 - MÉTODOS

* Também conhecido como funcionalidades/funções que seu objeto irá possuir.
* Usando o exemplo do carro, ele possuiria os métodos (andar(), trocarMarcha(), abrirPorta() e etc).

1.4 - VISIBILIDADE

* Uma classe possuí regras de controle das propriedades, elas são definidas para ter segurança.
* Cada atributo pode ter seu próprio esquema de segurança, sendo os valores:
** + PÚBLICO
** - PRIVADO

1.5 - HERANÇA 

* O conceito de herança é baseado na concepção de reaproveitamento de códigos, a ideia principal de utilizar esse recurso é criar **Classes** genéricas aonde elas serão reutilizadas em outras classes.
* Ex: uma classe Pessoa é genérica e pode ser herdada por outras classes futuramente como: Pessoa física, Pessoa júridica. Aonde ambas as classes possuem nome, endereço e etc. Mas alguns atributos são diferentes como: CPF/CNPJ. Isso reaproveita não somente os atributos como também os métodos da classe genérica. Por exemplo se voce possuisse uma função cadastrar, tanto a pessoa fisica como a júridica poderam utilizar esse método (somente por ter herdado a classe Pessoa).
* A classe genérica que irá herdar seus valores é chamada de **SUPERCLASSE**
* A classe que irá herdar os valores é chamada de **SUBCLASSE**
* Herança é tratado no modelo representativo da seguinte maneira:
* (SUPERCLASSE) Pessoa <-------- PessoaFísica (SUBCLASSE)
* Note que acima a seta é está sempre do lado da SUPERCLASSE, já a parte sem a seta está sempre do lado da classe Herdeira SUBCLASSE

1.6 - POLIMORFISMO

* Consiste no conceito de alterar algo herdado de uma classe genérica.
* Ex: Validar CPF é diferente de Validar CNPJ, nesse caso voce está herdando a mesma classe Pessoa que contém o método validarDocumento(). Para polimorfar esse método e reajustar de acordo com o tipo de Pessoa, na nova classe herdeira (subclasse) basta repetir o nome do método da SUPERCLASSE e reescrever a função da maneira que voce precisa.

1.7 - ABSTRAÇÃO 

* Consiste em focar nas caracteristicas **GLOBAIS** ou **GERAIS** da aplicação.
* Ex: ao dirigir um carro você não precisa saber como o motor funciona.
* Normalmente faz parte do POLIMORFISMO. Você abstrai todas as classes gerais aonde terá somente os conceitos (ATRIBUTOS E MÉTODOS) e que futuramente será implementado o conteúdo realmente.