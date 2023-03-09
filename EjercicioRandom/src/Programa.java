import java.util.Random;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args){

		String[] names = {"Alejandro", "David", "Sergio", "Sol", "Mel", "Evelyn", "Jared", "Omar", "Juan", "Luis"};
        Random random = new Random();
		Personas[] personas = new Personas[10];
		for(int i = 0; i < 10; i++){
			int randomNum = random.nextInt(10);
			while(names[randomNum] == "cero"){
				randomNum = random.nextInt(10);
			}
			personas[i] = new Personas(){};
			String randomName = names[randomNum];
			names[randomNum] = "cero";
			personas[i].setName(randomName);
        }
        int contadorBarba = 0;
        int contadorPelo = 0;
        int contadorBrazos = 0;
        int contadorMayorEdad = 0;
        for (int i = 0; i <= personas.length-1; i++) {
            if(personas[i].gethasBarba()){
                contadorBarba++;
            }
            if(personas[i].gethasPelo()){
                contadorPelo++;
            }
            if(personas[i].gethasBrazos()){
                contadorBrazos++;
            }
            if(personas[i].getisMayorEdad()){
                contadorMayorEdad++;
            }
        }
        System.out.println("hasBarba se utilizo: " + contadorBarba + " veces");
        System.out.println("hasPelo se utilizo: " + contadorPelo + " veces");
        System.out.println("hasBrazos se utilizo: " + contadorBrazos + " veces");
        System.out.println("isMayorEdad se utilizo: " + contadorMayorEdad + " veces");
        while(true){
            int personaX = random.nextInt(10);
            for (int i = 0; i <= personas.length-1; i++) {
                System.out.println(i + " " + personas[i].getName() + ": tiene barba = " + personas[i].gethasBarba() + ", tiene brazos = " + personas[i].gethasBrazos() + ", tiene pelo = " + personas[i].gethasPelo() + ", es mayor de edad = " + personas[i].getisMayorEdad());
            }
            try (Scanner scan = new Scanner(System.in)) {
                for (int i = 0; i <= 3; i++) {
                    System.out.println("Seleccione lo que quiere comprobar: barba = 1, brazos = 2, pelo = 3, mayor de edad = 4");
                    int respuesta = Integer.parseInt(scan.next());
                    switch(respuesta){
                        case 1:
                        System.out.println("Las personas con barba son: ");
                            for (int j = 0; j <= personas.length-1; j++) {
                                if(personas[j].gethasBarba() == personas[personaX].gethasBarba() && personas[j].getName() != null){
                                    System.out.println(j + " " + personas[j].getName());
                                } else{
                                    personas[j].eliminarNombre();
                                }
                            } 
                            break;
                        case 2:
                        System.out.println("Las personas con brazos son: ");
                        for (int j = 0; j <= personas.length-1; j++) {
                            if(personas[j].gethasBrazos() == personas[personaX].gethasBrazos() && personas[j].getName() != null){
                                System.out.println(j + " " + personas[j].getName());
                            } else{
                                personas[j].eliminarNombre();
                            }
                        }
                        break;
                        case 3:
                        System.out.println("Las personas con pelo son: ");
                        for (int j = 0; j <= personas.length-1; j++) {
                            if(personas[j].gethasPelo() == personas[personaX].gethasPelo() && personas[j].getName() != null){
                                System.out.println(j + " " + personas[j].getName());
                            } else{
                                personas[j].eliminarNombre();
                            }
                        }
                        break;
                        case 4:
                        System.out.println("las personas mayores de edad son: ");
                        for (int j = 0; j <= personas.length-1; j++) {
                            if(personas[j].getisMayorEdad() == personas[personaX].getisMayorEdad() && personas[j].getName() != null){
                                System.out.println(j + " " + personas[j].getName());
                            } else{
                                personas[j].eliminarNombre();
                            }
                        }
                        break;
                    } 
                }
                System.out.println("Cual es la persona X? Seleccione el numero");
                int respuesta1 = Integer.parseInt(scan.next());
                if(respuesta1 == personaX){
                    System.out.println("Usted adivino");
                    System.exit(0);
                }else{
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
    }
}