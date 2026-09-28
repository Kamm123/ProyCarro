import negocio.carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    carro c1; //creo una referencia a un objeto de la clase carro
    c1 = new carro(); // ahi creo el objeto

    c1.potencia = 5;
    c1.acelerar();
}
