<h1 align="center">🎯 Projeto Bingo em Java</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white" alt="Java Badge"/>
  <img src="https://img.shields.io/badge/Status-Concluído-brightgreen?style=flat-square" alt="Status Badge"/>
  <img src="https://img.shields.io/badge/License-MIT-blue?style=flat-square" alt="License Badge"/>
</p>

---

## 🧩 Sobre o Projeto

O **Bingo em Java** é um projeto educativo desenvolvido para praticar os fundamentos da **Programação Orientada a Objetos (POO)**.  
Ele simula um jogo de **bingo no terminal**, com sorteio de números aleatórios, exibição dos já sorteados e geração de cartelas.

Esse projeto reforça conceitos como **interfaces**, **encapsulamento**, **coleções**, **métodos**, **loops** e **tratamento de exceções**.

---

## 🚀 Funcionalidades

✅ Sortear números aleatórios entre 1 e 60 (sem repetição)  
✅ Exibir todos os números já sorteados  
✅ Gerar cartelas com números únicos e aleatórios  
✅ Interface `IBingo` para padronizar métodos e boas práticas  
✅ Menu interativo via console  

---

## 🧱 Estrutura do Projeto

```bash
📦 Projeto-Bingo
 ┣ 📜 IBingo.java        # Interface com a definição dos métodos
 ┣ 📜 Bingo.java         # Implementação da lógica do jogo
 ┣ 📜 Cartela.java       # Representação da cartela de bingo
 ┣ 📜 Main.java          # Classe principal com menu e interação
 ┗ 📜 README.md          # Este arquivo

💻 Tecnologias Utilizadas

☕ Java SE 8+
🧠 Programação Orientada a Objetos
📚 Collections Framework (ArrayList, Collections)
🎲 Classe Random
🧩 Tratamento de exceções (InputMismatchException)

⚙️ Como Executar o Projeto
🔧 Pré-requisitos

Antes de começar, verifique se você tem o Java JDK instalado:

java -version

Se o comando funcionar, está tudo certo ✅
Também é recomendável ter o Visual Studio Code com a extensão Extension Pack for Java instalada.

🧭 Passo a passo
1️⃣ Clonar o repositório
git clone https://github.com/SEU-USUARIO/Bingo_poo.git
cd Bingo_poo

2️⃣ Compilar os arquivos .java
javac *.java

3️⃣ Executar o programa principal
java Main

🕹️ Exemplo de Execução
===== MENU BINGO =====
1 - Sortear novo número
2 - Exibir números sorteados
0 - Sair
Escolha uma opção: 1
Número sorteado: 24

===== MENU BINGO =====
1 - Sortear novo número
2 - Exibir números sorteados
0 - Sair
Escolha uma opção: 2
Números sorteados: [24]

🧠 Conceitos Aplicados

| Conceito                      | Descrição                                                    |
| ----------------------------- | ------------------------------------------------------------ |
| **Encapsulamento**            | Controle de acesso a atributos com métodos getters e setters |
| **Interfaces**                | Estrutura que define os métodos da classe `Bingo`            |
| **Coleções**                  | Uso de `ArrayList` para armazenar números sorteados          |
| **Tratamento de Exceções**    | Prevenção de erros de entrada de dados                       |
| **Loops e Controle de Fluxo** | Uso de `do/while` e `switch` para o menu interativo          |

🏁 Conclusão

Este projeto foi desenvolvido para aprimorar a lógica de programação e a compreensão dos pilares da POO em Java.
Ideal para quem está iniciando e quer um exemplo prático de aplicação real de conceitos fundamentais.

📜 Licença

Este projeto está licenciado sob a MIT License.
Sinta-se livre para usar, modificar e compartilhar 🎉

<p align="center">Feito com 💙</p> 
