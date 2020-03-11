public class Data{
    public int dia;
    public int mes;
    public int hora; 
    public int minuto;
    public int segundo;

    public void imprimir(){
        System.out.println("Mês "+this.mes+ " Dia " + this.dia + " Hora " + this.hora + " Minuto " + this.minuto + " Segundo " + this.segundo);
    }

    public void imprimi(){
        if (this.hora < 12){
            System.out.println(this.hora+" AM");
        } else {
            System.out.println(this.hora+" PM");
        }
    }
}