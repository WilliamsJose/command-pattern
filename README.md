# M�todos Avan�ados de Programa��o

## UNIESP Faculdades

### Professora

* Dr� Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno
* Williams Jos� de Aguiar Silva ([contatowilliamsj@gmail.com](mailto:contatowilliamsj@gmail.com?subject=[GitHub]%20Command%20Pattern))


### Padr�o Comportamental: 
> O Command � um padr�o de projeto comportamental que transforma um pedido em um objeto independente que cont�m toda a informa��o sobre o pedido. Essa transforma��o permite que voc� parametrize m�todos com diferentes pedidos, atrase ou coloque a execu��o do pedido em uma fila, e suporte opera��es que n�o podem ser feitas.


## Padr�o Command

### Problema: 
> As vezes � necess�rio emitir solicita��es para objetos sem saber sobre a opera��o que est� sendo solicitada ou quem � o receptor. Imagine o seguinte: um objeto GUI chama um m�todo da l�gica do neg�cio, passando alguns argumentos. Este processo � geralmente descrito como um objeto mandando um pedido para outro.

> N�o demora muito e voc� percebe que essa abordagem � falha. Primeiro voc� tem um enorme n�mero de subclasses, e isso seria okay se voc� n�o arriscasse quebrar o c�digo dentro dessas subclasses cada vez que voc� modificar a classe base. Colocando em mi�dos: seu c�digo GUI se torna absurdamente dependente de um c�digo vol�til da l�gica do neg�cio.


### Solu��o: 

> O padr�o Command sugere que os objetos GUI n�o enviem esses pedidos diretamente. Ao inv�s disso, voc� deve extrair todos os detalhes do pedido, tais como o objeto a ser chamado, o nome do m�todo, e a lista de argumentos em uma classe comando separada que tem apenas um m�todo que aciona esse pedido.

> Objetos comando servem como links entre v�rios objetos GUI e de l�gica de neg�cio. De agora em diante, o objeto GUI n�o precisa saber qual objeto de l�gica do neg�cio ir� receber o pedido e como ele vai ser processado. O objeto GUI deve acionar o comando, que ir� lidar com todos os detalhes.


### Consequ�ncias: 

* Desacopla o objeto que invoca a opera��o do que sabe realiz�-la.
* Comandos s�o objetos de **primeira classe**.
* Comandos podem ser reunidos para fazer comandos compostos.
* Facilidade em adicionar novos comandos.
* Enfileirar, Especificar e Executar requisi��es em diferentes momentos.


### Exemplo: 
![Command Pattern UML.jpg](CommandPattern.jpg)

[Source files](src)


### Refer�ncias:
[Refactoring.guru](https://refactoring.guru/pt-br/design-patterns/command)
