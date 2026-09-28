package negocio;

public class MainCarro {
    static void main() {
        carro c1 = new carro();
        carro c2 = new carro();

        c1.potencia = 2;
        c1.velocidad = 60;

        c2.potencia = 5;
        c2.velocidad = 100;

        System.out.println("La potencia del carro 1 es: "+c1.potencia + " y la velocidad es: "+c1.velocidad);
        System.out.println("La potencia del carro 2 es: "+c2.potencia + " y la velocidad es: "+c2.velocidad);

        c1.acelerar();
        c1.frenar();
        c1.acelerar();
        c1.acelerar();

        c2.frenar();

        if (c2.velocidad > c1.velocidad ){
            System.out.println("El carro con mayor velocidad es: c2 ");
        } else{
            System.out.println("El carro con mayor velocidad es: c1 ");
        }

        System.out.println("La potencia del carro 1 es: "+c1.potencia + " y la velocidad es: "+c1.velocidad);
        System.out.println("La potencia del carro 2 es: "+c2.potencia + " y la velocidad es: "+c2.velocidad);
    }
}
