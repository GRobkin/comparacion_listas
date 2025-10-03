Guillermo Robkin
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Construa um programa em Java que compare diferentes implementações de listas de alunos utilizando as seguintes estruturas:

ArrayList
LinkedList
Vector
Cada aluno deve ser identificado pelos seguintes atributos:

Nome (String)
Matrícula (String, com 5 números gerados aleatoriamente)
Data de Nascimento (dia/mês/ano)
Dados Pré-definidos:
Você poderá utilizar os seguintes vetores de nomes e sobrenomes para depois gerar os nomes dos alunos:

private static String[] nomes = {"Ana", "João", "Carlos", "Maria", "Pedro", "Juliana", "Lucas", "Fernanda"};
private static String[] sobrenomes = {"Silva", "Souza", "Oliveira", "Costa", "Pereira", "Rodrigues", "Almeida", "Ferreira"};
Se desejar, adicione outros nomes e sobrenomes a lista

Funcionalidades do Programa:
O programa deverá automaticamente gerar e preencher três listas de alunos, cada uma utilizando uma das implementações (ArrayList, LinkedList e Vector), e apresentar as seguintes funcionalidades:

Cadastrar Alunos:
O programa deve cadastrar 350.000 alunos nas três implementações de lista. Não é necessário exibir na tela os dados gerados.

Ordenar as Listas:
Após o cadastro, as três listas devem ser ordenadas por nome dos alunos.

Exportar Todos os Alunos para CSV:
Os dados de cada lista (já ordenada) devem ser exportados para arquivos CSV.
O arquivo CSV deve conter as colunas: Nome, Matrícula, Data de Nascimento.
Os arquivos CSV devem ser salvos com os seguintes nomes: alunos_arraylist.csv, alunos_linkedlist.csv e alunos_vector.csv.

Medição de Tempo:
O programa deve medir o tempo de execução das operações de inserção, ordenação e exportação para CSV para cada tipo de lista.
Ao final da execução, o programa deve apresentar uma tabela com os tempos de execução das três operações para as três listas (ArrayList, LinkedList e Vector).

Estrutura da Tabela de Tempo:
Operação	ArrayList (ms)	LinkedList (ms)	Vector (ms)
Cadastro	(tempo)	(tempo)	(tempo)
Ordenação	(tempo)	(tempo)	(tempo)
Exportação	(tempo)	(tempo)	(tempo)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Se ejecuto 3 veces el código, estos son los resultados:

Operación    ArrayList (ms)  LinkedList (ms) Vector (ms)    
Registro     205             82              119            
Ordenación   131             123             104            
Exportación  304             267             270  

Operación    ArrayList (ms)  LinkedList (ms) Vector (ms)    
Registro     189             95              111            
Ordenación   133             131             103            
Exportación  311             287             272    

Operación    ArrayList (ms)  LinkedList (ms) Vector (ms)    
Registro     186             82              105            
Ordenación   131             124             103            
Exportación  297             278             246   

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Pc Setup:
- **Processador**: Ryzen 7 5800X3D
- **Placa Madre**: Aorus B550 Pro V2
- **Memoria RAM**: 32GB (2x16GB Kingston Fury Beast DDR4 3600MHz)
- **Almacenamiento**: ADATA 256GB XPG SPECTRIX S40G M.2 NVMe SSD


