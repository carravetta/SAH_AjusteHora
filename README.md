![Unisinos Logo](https://upload.wikimedia.org/wikipedia/pt/9/91/Lp_logo_unisinos.png)
### SAH - Sistema de Ajuste de Horas ###
### Introdução ###  

 Uma empresa educacional demanda de uma serie de processos para ajuste de folha ponto de funcionários que prestam serviços
 educacionais fora da intituição, podendo estes ser emprestados para outras unidades desta instituição para dar palestras, realizar a         
 produção ou versionamento de conteúdos, podem participar de capacitações e realizar consultorias que podem ser feitas fora da
 instituição.
 Sendo assim essas horas são lançadas em planilha impressa a qual é verificada pelas coordenações para averiguar a quantidade de
 horas realizadas fora da instituição, qual a natureza da atividade e se não excedeu ao total de horas determinadas para cada
 trabalhador.
 Neste documento estarão descritas a seguir o objetivo da atividade, o cronograma etc. Complementarmente serão disponibilizados os
 documentos sobre o produto (protótipos-wireframes, regras de negócio e casos de uso).

### Objetivos ###

- **Desenvolver um sistema WEB**
- **Desenvolver um sistema que atenda todos atores do processo**

### Procedimentos ###

   O sistema será desenvolvido a partir da documentação disponibilizada, porém a implementação será parcial. A documentação pode ser encontrada no diretorio do [branch desenvolvimento](https://github.com/carravetta/SAH_AjusteHora/tree/desenvolvimento/Docs).
   
   Portanto será trabalhado os seguintes casos:
   
   - **Autenticar usuario**
   - **Manter horas ajustadas (trabalhador)**
   - **Cada trabalhador terá acesso a um tipo de perfil**
   
   ### Cronograma ###
   
  - **Elaboração da pagina HTML com estilo CSS**
  - **Validação de dados**
  - **Criação do banco de dados simulado**
  - **Criação das funcionalidades descritas na documentação**
  - **Testes unitarios**
  - **Testes de caso de uso**
  - **Correção de bugs (caso necessário)**
  - **Aprovação**
  - **Implantação**
  
 OBS.: Não será criado um banco de dados para este sistema devido a limitação de Hardware. O banco de dados simulado pode ser encontrado no diretorio [Workspace/EspelhoPonto/src/br/com/dao/](https://github.com/carravetta/SAH_AjusteHora/tree/desenvolvimento/Workspace/EspelhoPonto/src/br/com/dao)

### Ferramentas necessarias para desenvolvimento/Testes ###

- [Java Develpment Kit](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [IDE Eclipse](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/oxygen3)
- [Maven](http://maven.apache.org/download.cgi)
- Tutorial de como instalar o Maven, no trecho [instalando o Maven](http://luizricardo.org/2014/06/instalando-configurando-e-usando-o-maven-para-gerenciar-suas-dependencias-e-seus-projetos-java/)
 - [Tomcat Apache 8.5](https://tomcat.apache.org/download-80.cgi)
 
