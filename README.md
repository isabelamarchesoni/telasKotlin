# 📚 App Android - Cadastro de Livros

Aplicativo Android desenvolvido em **Kotlin** com navegação entre telas para cadastro e exibição de detalhes de livros.

---

## 📋 Funcionalidades

### 1. 📝 Tela de Cadastro (`CadastroActivity`)
O usuário informa o **título** e o **autor** do livro em dois campos de texto. Ao clicar no botão, o aplicativo navega para a tela de detalhes passando os dados via `Intent`.

**Comportamento:**
- Campos preenchidos → navega para `DetalhesActivity` exibindo os dados do livro cadastrado

---

### 2. 📖 Tela de Detalhes (`DetalhesActivity`)
Exibe as informações do livro cadastrado recebidas via `Intent`.

**Dados exibidos:**
- `"Título: [título do livro]"`
- `"Autor: [nome do autor]"`

---

## 📸 Screenshots

<table>
  <tr>
    <th align="center">📝 Cadastro de Livro</th>
    <th align="center">📖 Detalhes do Livro</th>
  </tr>
  <tr>
    <td align="center"><img src="screenshots/cadastro_livro.jpeg" width="220" alt="Tela de Cadastro"/></td>
    <td align="center"><img src="screenshots/descricao_livro.jpeg" width="220" alt="Tela de Detalhes"/></td>
  </tr>
</table>

---

## 🗂️ Estrutura do Projeto

```
app/src/main/
├── java/br/edu/fatecpg/livros/
│   ├── model/
│   │   └── Livro.kt
│   └── view/
│       ├── CadastroActivity.kt
│       └── DetalhesActivity.kt
└── res/
    ├── drawable/
    │   └── book.png
    └── layout/
        ├── activity_cadastro.xml
        └── activity_detalhes.xml
```

---

## 🛠️ Tecnologias

- **Linguagem:** Kotlin
- **SDK mínimo:** Android 21+ (Lollipop)
- **Componentes:** `EditText`, `Button`, `TextView`, `ImageView`, `Intent`
- **Arquitetura:** Activity-based (sem ViewModel)

---

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Abra o projeto no **Android Studio**
3. Conecte um dispositivo ou inicie um emulador
4. Clique em **Run ▶️** (ou `Shift + F10`)

---
