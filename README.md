# Gerador De Musica Textual

O objetivo desse software é a implementação, teste e depuração de um gerador de música a partir de texto, o programa recebe um texto (a princípio, um texto livre) como entrada e gera (informalmente, "toca" via acionamento de funções de som) um conjunto de notas correspondentes ao texto segundo alguns parâmetros.

### **Funcionamento:**
  - Baixe o projeto, entre na pasta 'dist' e execute 'Player_de_Musica_Textual.jar'
  - Interface:
      - Area de texto, um JTextArea onde digitamos o texto que será tocado (respeitando as especificações indicadas abaixo no campo "Especificações").
      - Volume, um JSlider usado para aumentar e/ou diminuir o volume inicial da música.
      - Intrumentos, um JSpinner usado para indicar a numeração dos instrumentos conforme o "General MIDI Instruments List" e selecionar um instrumento inicial.
      - BPMs, um JSpinner usado para indicar os "beats per minute" ou batimentos por minuto iniciais da música.
      - Oitava, um JSpinner usado para indicar a oitava incial da musica.
      - Botão Play, executa o texto digitado na area reservada para a digitação do texto ou continua uma execução pausada.
      - Botão Pause, pausa a execução da musica digitada.
      - Botão Parar, para por completo a execução da musica digitada.
      - Botão Salvar, abre uma nova janela para salvar a música digitada na extenção de arquivo ".mid".
      
### **Especificações:**
  - O texto a ser digitado terá como criterio de geração de musica as seguintes especificações:
  
![especificacao](https://user-images.githubusercontent.com/44712765/50199203-af8ecf00-0336-11e9-884a-3fca1ade40bd.PNG)

### **Observações:**
  - Caso deseje personalizar o software fique atento as seguintes informações:
    - No projeto foi utilizada a biblioteca JFugue versão 4.0.3.
    - Em caso de alteração e/ou personalização dos codigos fontes, não nos responsabilizamos por qualquer tipo de dano causado.
