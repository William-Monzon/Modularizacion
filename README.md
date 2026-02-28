# Modularización



El proyecto de modularización se realizó con varios métodos y llamados en el menú principal que es otro método que a la vez este esta llamado en el método main. En el proyecto importe la herramienta de Scanner para ingresar datos en la consola, la herramienta Random para que me de un número random y la herramienta InputMismatchExceptio para ingresar un excepción cuando se pide un número pero el usuario ingresa texto. Los menús los realice con el bucle do-while.



1. #### Calculadora Básica



Este inciso se realizo en 6 métodos incluyendo el método de validación cuando el usuario ingresa texto. En donde el primero es el menú de la calculadora, 4 son los métodos de suma, resta, multiplicación y división que retornan la operación y el último es el método de validación. En el método de división lance una excepción "ArithmeticException" para cuando la división es entre 0, para que así el programa no se detenga cuando al denominador se le ingrese 0.



#### 2\. Validación de Contraseña



Utilice un método para este inciso. La contraseña que tiene el programa la guarde como una constante global, en el programa el usuario debe ingresar la contraseña y si no es igual a la contraseña de la constante, el programa pedirá ingresarla nuevamente hasta que sea correcta utilizando el ciclo do-while y el if-else para cuando la contraseña es incorrecta se repita el bucle.



#### 3\. Números Primos



Para este inciso se utilizó un método. Utilizando el if-else y una variable booleana que devuelve false cuando el número no es primo mediante el módulo de una división y true cuando el número es primo. Para saber si es primo el residuo de la división no debe de ser 0 y para eso se utilizo un bucle for en donde el numero ingresado se va dividiendo entre los números menores a él.



#### 4\. Suma de Números Pares



En este inciso se utilizo un método. Para sumar los números pares utilice un ciclo while siendo la condición para finalizar que el número ingresado sea 0. Con un para saber si los números son pares se utilizo un if con la condición de que el módulo entre 2 sea 0, si cumple el numero se guarda en una variable y se va sumando con los siguientes números que cumplan la condición y al fina se imprime la suma de los números pares.



#### 5\. Conversión de Temperatura



Para este inciso se utilizaron 4 métodos incluyendo el de validación. El primer método es donde se elige el tipo de conversión, en el segundo método se convierte la temperatura ingresada de °C a °F y se retorna la resultado de la operación de conversión, en el tercer método la conversión es de °F a °C y el cuarto método es la validación para que el usuario no ingrese texto.



#### 6\. Contador de Vocales



Aquí se utilizo dos métodos. En el primer método se ingresa un texto, en el segundo primero se convierte el texto a minúscula con ".toLowerCase()" y se guarda en una variable, luego utilice un ciclo for con la condición que que el bucle se haga un número equivalente a la longitud del texto, para saber la longitud utilice ".length()" y para leer caracter por caracter utilice ".charAt()" guardando los caracters en otra variable y al fina con un if con la condición de que los caracteres sean "a, e, i, o, u" se suma un contador.



#### 7\. Cálculo Factorial



Utilice dos métodos. El primero para pedir un número y con try-catch validar que el número no sea negativo, en el segundo métdo hice el cálculo de factorial utilizando un if-else, cuando el número ingresado es menor a 0 lanzo una excempción "IllegalArgumentException" con un mensaje de error y cuando el número es 0 o 1 se retorna 1 y si no cumple ninguan se retorna la operación del factorial realizada con recursividad.



#### 8\. Juego de Adivinanza



Se utilizo un método. En el método utilice el ciclo do-while para que el programa pida ingresar un número siempre y cuando no se haya adivinado el número random. Para el búmero rando utilice la herramienta de Random y lo guarde en una variable haciendo que el número sea de entre 1 a 100 y con un if-else, si el numero ingresado es menor se imprime un mensaje de que el número random es mayor y si el número ingresado es mayor se imprime que el random es menor y cuando los números son iguales imprime un mensaje que ganaste y en cuantos intentos lo hiciste.



#### 9\. Paso por Referencia



Utilice 2 métodos. Al primero le ingreso valores a un arreglo de tamaño 2 e imprime primero el valor antes del cambio y luego después del cambio. En el segundo método hago los cambios  utilizando una variable temporal como ayuda.



#### 10\. Tabla de Multiplicar



Para este inciso se utilizo dos métodos. El primer método ingrese el número ya validado y en el segundo con un bucle for realice las multiplicaciones en donde el bucle se repetia 10 veces y por cada repetición el número se múltiplicaba por el número de repetición y cada resultado lo imprimí realizando una tabla al final.





#### Métodos extras

Son 5 métodos extras los cuales son 3 para ingresar entero, double y String respectivamente, el cuarto para validar números enteros y el quinto para darle una pausa al programa, pidiendo presionar "Enter" para que el programa continue.

