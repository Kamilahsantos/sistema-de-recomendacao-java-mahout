# Configuração inicial do Maven:

No diretório em que deseja criar o projeto, execute o seguinte comando (no terminal):

```bash
mvn archetype:generate -DgroupId=br.com.kamila -DartifactId=sistema-de-recomendacao-java-mahout -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

**Onde**:

- ```mvn archetype: generate ``` - cria projeto

- ```GroupId ``` - identificação do grupo do projeto, por convenção, inciamos com nomedopais.com.nomedaorganização

- ```ArtifactId ``` - nome do projeto

- ```arc hetypeArtifactId ``` - tipo de configuração inicial do projeto, no caso o quickstart usa configurações default.


Se o seu prompt não reconhecer o comando mvn, devemos adicioná-lo no PATH:

```bash
PATH=$PATH:onde_esta_o_bin_do_maven
```

E tente executar o comando para gerar o projeto novamente...

----

Para o conteúdo completo desse tutorial, acesse o post [Sistema de recomendação em Java](https://imasters.com.br/back-end/sistema-de-recomendacao-em-java) no iMasters.

Acompanhe meus próximos posts clicando [aqui](https://imasters.com.br/perfil/kamiladefatimasantos)

---

:octocat:
