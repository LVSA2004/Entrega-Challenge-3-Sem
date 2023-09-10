<h1 align="center">Projeto AgroAID</h1>

<h2> Projeto feito em Java para a entrega do Challenge do 3° Semestre. Foi feita uma API em SpringBoot com conexão a API do OpenWeather e da OpenAI para o uso do chat GPT e banco de dados da Oracle. </h2>

<h2> Vídeo da API RESTful:  </h2>

<h3 align="center">Link API Key Chat GPT: https://platform.openai.com/account/api-keys</h3>
<h3 align="center">Link API Clima: https://home.openweathermap.org/api_keys</h3>

<h2 align="center">Endpoints 📋</h2>

### Cadastro com Autenticação e Token ╹Usuário╷ **`/registrar`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"nome": "Luan Sá",
	"email": "lvssfiap@gmail.com",
	"senha": "|(:oUuC<UZ",
	"cpf":"535.710.748-96",
	"telefone":"(11) 95954-0882"
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
✔️ | `201` | Usuário cadastrado com sucesso.
❌ | `403` | Não foi possível cadastrar o usuário.


### Login com validação de Token ╹Usuário╷ **`/login`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"email": "santificado@gmail.com",
	"senha": "|(:oUuC<UZ"
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `201` | Login validado com sucesso.
| ❌ | `403` | Não foi possivel validar o login.

### Mandar prompt para o ChatGPT ╹ChatGPT╷ **`/chatbot/api`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"pergunta": "Gere dicas sobre a rotação de cultura em uma fazenda de médio porte no interior de São Paulo com 4 hectares de terreno disponível para plantação e com média de temperatura anual de 25 graus."
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
✔️ | `200` | Prompt inserido com sucesso.
❌ | `403` | Não foi possível inserir o prompt.

### Deletar Prompt ╹ChatGPT╷ **`/chatbot/{id}`**:

#### DELETE ⬇️

**Exemplo 👇**
```js
http://localhost:8080/chatbot/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Prompt deletado com sucesso.
| ❌ | `403` | Prompt com o id {id} não foi encontrado.

### Pesquisa Por ID ╹ChatGPT╷ **`/chatbot/busca/{id}`**:

#### GET ⬅️

**Exemplo 👇**
```js
http://localhost:8080/chatbot/busca/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Prompt com o id {id} encontrada.
| ❌ | `403` | Prompt com o id {id} não foi encontrada.


### Clima  ╹Open Weather╷ **`/clima/{city}`**:

#### POST ➡️

**Exemplo 👇**
```js
http://localhost:8080/clima/São Paulo
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Cidade encontrada com sucesso.
| ❌ | `403` | Cidade não encontrada.

### Cadastro  ╹Pessoa╷ **`/pessoa`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"id": 1,
	"nome": "Luiz Fernando",
	"nascimento": "1996-06-05",
	"sexo": "MASCULINO",
	"filhos": [],
	"cpf": "236.862.556-93"
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Pessoa cadastrada com sucesso.
| ❌ | `403` | Não foi possivel realizar o cadastro.

### Pesquisa Por ID ╹Pessoa╷ **`/pessoa/busca/{id}`**:

#### GET ⬅️

**Exemplo 👇**
```js
http://localhost:8080/pessoa/busca/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Pessoa com o id {id} encontrada.
| ❌ | `403` | Pessoa com o id {id} não foi encontrada.

### Atualizar Pessoa ╹Pessoa╷ **`/pessoa/{id}`**:

#### PUT 🔄

**Exemplo de cadastro 👇**
```js
	"id": 1,
	"nome": "Luiz Fernando",
	"nascimento": "1996-06-05",
	"sexo": "MASCULINO",
	"filhos": [],
	"cpf": "236.862.556-93"
```
** Exemplo de Alteração 👇**

```js
	"id": 1,
	"nome": "Luiz Fernando de Sá",
	"nascimento": "1969-06-05",
	"sexo": "MASCULINO",
	"filhos": [],
	"cpf": "236.862.556-93"
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `204` | Alteração feita com sucesso.
| ❌ | `403` | Pessoa com o id {id} não foi encontrada.

### Deletar Pessoa ╹Pessoa╷ **`/pessoa/{id}`**:

#### DELETE ⬇️

**Exemplo 👇**
```js
http://localhost:8080/pessoa/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `204` | Pessoa deletada com sucesso.
| ❌ | `403` | Pessoa com o id {id} não foi encontrada.
