INICIO CLASSE Produto
VARIÁVEIS:
nome: TEXTO
preco: REAL
quantidade: INTEIRO

INICIO FUNÇÃO CriarProduto(n: TEXTO, p: REAL, q: INTEIRO)
nome ← n
preco ← p
quantidade ← q
FIM FUNÇÃO

INICIO FUNÇÃO ExibirDetalhes()
ESCREVER "Nome: ", nome
ESCREVER "Preço: R$", preco
ESCREVER "Quantidade: ", quantidade, " unidades"
ESCREVER "Total: R$", preco * quantidade
FIM FUNÇÃO

INICIO FUNÇÃO AdicionarEstoque(qtd: INTEIRO)
quantidade ← quantidade + qtd
ESCREVER "Adicionadas ", qtd, " unidades ao estoque."
FIM FUNÇÃO

INICIO FUNÇÃO RemoverEstoque(qtd: INTEIRO)
SE qtd <= quantidade ENTAO
quantidade ← quantidade - qtd
ESCREVER "Removidas ", qtd, " unidades do estoque."
SENAO
ESCREVER "Erro: Estoque insuficiente!"
FIM SE
FIM FUNÇÃO
FIM CLASSE

INICIO PROGRAMA
ESCREVER "Informe os dados do produto:"
ESCREVER "Nome: "
LER nome
ESCREVER "Preço: "
LER preco
ESCREVER "Quantidade: "
LER quantidade

produto ← CriarProduto(nome, preco, quantidade)
ExibirDetalhes(produto)

ESCREVER "Produtos a adicionar: "
LER qtdAdicionar
AdicionarEstoque(produto, qtdAdicionar)
ExibirDetalhes(produto)

ESCREVER "Produtos a remover: "
LER qtdRemover
RemoverEstoque(produto, qtdRemover)
ExibirDetalhes(produto)
FIM PROGRAMA

