import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Clase scanner que nos permite que el usuario escriba en consola

        //Juego del ahorcado

        //Declaración de variables y asignación de valores
        String palabraSecreta="inteligencia";
        int intentosMaximos=10;
        int intentos=0;
        boolean palabraAdivinada=false;
       
        char[] letrasAdivinadas= new char[palabraSecreta.length()];//Arreglo de caracteres que contendrá las letras adivinadas

            //Llenar el arreglo de letras adivinadas con guiones bajos
            //Estructura de control: Iterativa(Bucle for)
        for(int i=0;i<letrasAdivinadas.length;i++){
            letrasAdivinadas[i]='_';
        }

        //Estructura de control: Iterativa(Bucle while)
        while(palabraAdivinada==false  &&  intentos< intentosMaximos ){ 
            //Mientras la palabra no haya sido adivinada y el número de intentos sea menor al máximo

            System.out.println("Palabra a adivinar: "+String.valueOf(letrasAdivinadas)+ "("+palabraSecreta.length()+" letras)");
            //El valueOf convierte un arreglo de caracteres a un string
            //para que se pueda imprimir en consola

            System.out.println("Ingresa una letra, por favor: ");

            char letra= Character.toLowerCase(scanner.next().charAt(0));
            //Para eviar que el usuario ponga una letra en mayúscula
            /*
            Esto lo que hace es leer el primer caracter que el usuario ingrese
            */

            boolean letraCorrecta=false;
            for(int i=0;i<palabraSecreta.length();i++){
                if(palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i]=letra;
                    letraCorrecta=true;
                    /* 
                     * Si la letra ingresada por el usuario es igual a alguna letra de la palabra secreta
                    */
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta, intentos restantes: "+(intentosMaximos-intentos));
                //Aqui se muestra el número de intentos restantes
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada=true;
                System.out.println("Felicidades, has adivinado la palabra secreta: "+palabraSecreta);
            }

        }
        if(!palabraAdivinada){
            System.out.println("Lo siento, has perdido, la palabra secreta era: "+palabraSecreta);
        }
        scanner.close();
        
        //EXPLICACIÓN DE CÓDIGO
        //1. Se declara la palabra secreta y el número de intentos máximos
        //2. Se crea un arreglo de caracteres que contendrá las letras adivinadas
        //3. Se llena el arreglo de letras adivinadas con guiones bajos
        //4. Se inicia un bucle while que se ejecutará mientras la palabra no haya sido adivinada y el número de intentos sea menor al máximo
        //5. Se muestra en consola la palabra a adivinar
        //6. Se solicita al usuario que ingrese una letra
        //7. Se lee la letra ingresada por el usuario
        //8. Se inicializa una variable que nos dirá si la letra ingresada es correcta
        //9. Se recorre la palabra secreta para verificar si la letra ingresada por el usuario es correcta
        //10. Si la letra es correcta, se actualiza el arreglo de letras adivinadas
        //11. Si la letra es incorrecta, se incrementa el número de intentos
        //12. Se muestra en consola el número de intentos restantes
        //13. Si la palabra ha sido adivinada, se muestra un mensaje de felicitaciones
        //14. Si la palabra no ha sido adivinada, se muestra un mensaje de derrota
        //15. Se cierra el scanner

    }
}
