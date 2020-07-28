História da Programação

Podemos imaginar o computador como uma super calculadora, 
capaz de fazer cálculos muito mais rápido que nós, mas para isso 
devemos dizer para o computador o que deve ser calculado e como deve 
ser calculado. A função das linguagens de programação é exatamente essa, 
ou seja, servir de um meio de comunicação entre computadores e humanos.

Existem dois tipos de linguagens de programação: as de baixo nível e as 
de alto nível. Os computadores interpretam tudo como números em base binária, 
ou seja, só entendem zero e um. As linguagens de baixo nível são interpretadas 
diretamente pelo computador, tendo um resultado rápido, porém é muito difícil 
e incômodo se trabalhar com elas. Exemplos de linguagens de baixo nível são a 
linguagem binária e a linguagem Assembly.

Exemplo de código em Assembly:

MOV r0, #0C ;load base address of string into r0
LOAD: MOV r1,(r0) ;load contents into r1
CALL PRINT ; call a print routine to print the character in r1
INC r0 ;point to next character
JMP LOAD ;load next character

