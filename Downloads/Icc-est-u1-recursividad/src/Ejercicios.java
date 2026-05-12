public class Ejercicios {
    public Ejercicios (){
    }
    public int sumaConsecutivosPasos(int num){
        //Caso Base
        if( num == 1){
            return num;
        }
        int resultadoRecursivo = sumaConsecutivosPasos(num -1);
        int resultadoOperacion = num + resultadoRecursivo;
        System.out.println("ResultadoOp = " + num + "+" + "sumaConsecutivaPasos("+ resultadoRecursivo + ")");
        return resultadoOperacion;
    }

    public int getPotencia(int base, int exponente){
        if(exponente == 1)
            return base;
        return base * getPotencia(base, exponente - 1);
    }
    public int sumaDigitos(int num){
        if(num <10 )
            return num;
        //caso recursivo
        //6 + 9
        //5 + 4
        // r -> 4
        return(num % 10)+ sumaDigitos(num/10);
}
}






















