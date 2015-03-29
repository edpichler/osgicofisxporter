# Introdução #
As empresas brasileiras, por diversos motivos, frequentemente precisam exportar seus dados contábeis para serem analisados de forma automatizada pela Receita Federal Brasileira. Isso não é necessariamente uma característica obrigatória dos sistemas comerciais. Esse componente transforma os dados contábeis de uma organização nos arquivos digitais necessários para enviar à Receita.

## Conceito ##
Uma biblioteca Java (OSGi compilant) para exportação dos arquivos digitais no leiaute dos _txt's_ exigidos pela Receita Federal brasileira. Cria os arquivos digitais no formato da Receita Federal com os dados contábeis da empresa, que podem estar em qualquer lugar.
Use livremente (de acordo com a licença) no seu projeto.

## Conteúdo ##
O componente disponibiliza interfaces java, que uma vez implementadas, são usadas como parâmetros para chamar as funcionalidades de exportação. Na implementação da interface é definido de onde os virão. O destino deles serão os arquivos digitais exportados.

### Exemplo de uso ###

Veja um [exemplo de uso](exemploDeUso.md).

## Contexto ##

Feito para ser usado em um ambiente OSGi, porém, pode ser usado no classpath normalmente como em qualquer sistema Java básico.
O componente é util para sistemas comerciais que precisam exportar seus dados contábeis para a Receita, atendendo os leiautes do **Atos Declaratórios Executivos Cofis 55/2009 (IN 86 2001)**. Estes são validados  na segunda opção do  programa validador de arquivos digitais da Receita Federal, o SVA versão 3.0.3.

Abaixo está o _screenshot_ do validador de arquivos digitais disponibilizado pela Receita, o SVA. Os arquivos gerados são validados com a segunda opção, como está selecionado em azul na  imagem:
![http://wiki.osgicofisxporter.googlecode.com/hg/printsva.jpg](http://wiki.osgicofisxporter.googlecode.com/hg/printsva.jpg)

Atualmente este programa está disponível na _url_ http://www.receita.fazenda.gov.br/previdencia/ArquivosDigitais/default.htm