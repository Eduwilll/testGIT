package pkg2021s2.aula07;

public class Empregado {
    
    // atribute de classe
    private static int proxCod = 1001;
    private static final String empresa = "Fatec Campinas";
    
    // atributos de instância
    private int codigo;
    private String nome;
    private String departamento;
    private float salario;
    
    public Empregado(String nome, String departamento) {
        this.codigo = proxCod++;
        this.nome = nome;
        this.departamento = departamento;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    // método da instância/objeto
    public void mostrarEmpregado() {
        System.out.println(empresa + "\n" + 
                this.getCodigo() + " - " +
                this.getNome() + 
                " (" + this.getDepartamento() + ") - R$" +
                this.getSalario() + "\n------------");
    }
    
    // método da classe
    public static void mostrarClasseEmpregado(Empregado emp) {
         System.out.println(empresa + "\n" + 
                emp.getCodigo() + " - " +
                emp.getNome() + 
                " (" + emp.getDepartamento() + ") - R$" +
                emp.getSalario() + "\n------------");      
    }
    
    public static void mostraEmpresa() {
        System.out.println("----" + empresa + "----");
    }
    
}
