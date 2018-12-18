# Player De Musica Textual
O objetivo desse software é a implementação, teste e depuração de um gerador de música a partir de texto, o programa recebe um texto (a princípio, um texto livre) como entrada e gera (informalmente, ´toca´ via acionamento de funções de som) um conjunto de notas correspondentes ao texto segundo alguns parâmetros.

**Execução:**
  - Baixe o projeto entre na pasta 'dist' e execute 'Player_de_Musica_Textual.jar'
  - Interface:
      - Area de texto, um JTextArea onde digitamos o texto que será tocado (respeitando as especificações indicadas abaixo no campo "Especificações").
      - Volume: um JSlider usado para aumentar e/ou diminuir o volume inicial da música.
      - Intrumentos: JSpinner usado para indicar a numeração dos instrumentos conforme o "General MIDI Instruments List" e selecionar um           instrumento inicial
      - BPMs: JSpinner usado para indicar os "beats per minute" ou batimentos por minuto iniciais da música.
      - Oitava: JSpinner usado para indicar a oitava incial da musica.
      - Botão Play: executa o texto digitado na area reservada para a digitação do texto.
      
**Especificações:**
  - O texto a ser digitado deve estar de acordo as seguintes especificações para o funcionamento correto do player: