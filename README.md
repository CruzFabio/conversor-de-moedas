# 💱 Conversor de Moedas em Java

Este é um projeto Java que implementa um conversor de moedas utilizando a **ExchangeRate API**. Ele apresenta um menu interativo com 10 opções de conversão entre as principais moedas do mundo, como Dólar, Euro, Real, Iene, Yuan e Won sul-coreano.

## 📋 Tabela de Conteúdos

- [📖 Sobre o Projeto](#-sobre-o-projeto)
- [🚀 Como Executar](#-como-executar)
- [🔧 Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [🧭 Funcionalidades](#-funcionalidades)
- [📄 Licença](#-licença)

---

## 📖 Sobre o Projeto

O objetivo deste projeto é permitir que o usuário converta rapidamente valores entre diferentes moedas, utilizando uma API real de mercado para obter as taxas de câmbio atualizadas.
As opções de conversão disponíveis no menu são:

```
(1) Dólar (USD) > Euro (EUR)
(2) Dólar (USD) > Real (BRL)
(3) Dólar (USD) > Iene (JPY)
(4) Dólar (USD) > Yuan (CNY)
(5) Dólar (USD) > Won sul-coreano (KRW)
(6) Real (BRL) > Dólar (USD)
(7) Real (BRL) > Euro (EUR)
(8) Real (BRL) > Won sul-coreano (KRW)
(9) Real (BRL) > Iene (JPY)
(10) Real (BRL) > Yuan (CNY)
```

O programa solicita que o usuário selecione uma das opções e insira o valor a ser convertido. Em seguida, ele faz uma requisição à **ExchangeRate API** e retorna o valor convertido.

---

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/CruzFabio/conversor-de-moedas
```

2. Navegue até o diretório do projeto:

```bash
cd conversor-de-moedas
```

3. Compile e execute o projeto com seu ambiente Java (recomenda-se usar uma IDE como IntelliJ ou Eclipse).

> É necessário ter o Java instalado na sua máquina (Java 17 ou superior).

---

## 🔧 Tecnologias Utilizadas

- Java 17
- [ExchangeRate API](https://www.exchangerate-api.com/)
- Gson (para parsing de JSON)
- IDE IntelliJ IDEA

---

## 🧭 Funcionalidades

- Conversão de moedas em tempo real
- Menu de seleção com 10 opções
- Interface simples no terminal
- Utiliza taxas de câmbio atualizadas via API

