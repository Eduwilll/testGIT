package pkg2021s2.aula07;

public class Aula07 {

    public static void main(String[] args) {
        
        Empregado e1 = new Empregado("João", "Compras");
        Empregado e2 = new Empregado("Maria", "Vendas");
        
        e1.setSalario(3400);
        e2.setSalario(4100);
        
        //e1.mostrarEmpregado();
        //e2.mostrarEmpregado();
        
        Empregado.mostrarClasseEmpregado(e2);
        Empregado.mostrarClasseEmpregado(e1);
        
        //Empregado.mostraEmpresa();

    }
    
}
