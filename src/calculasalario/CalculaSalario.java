package calculasalario;

public class CalculaSalario {
    public String nome;
    public String cargo;
    public int salariobase;
    public int resultado = 0;
    
    public void setCargo(String cargo) {
	this.cargo = cargo;
    }
	
    public void setSalario(int valor) {
	salariobase = valor;
    }
    
    public int calcula(){
        int valor;
        if(cargo.equals("desenvolvedor") && salariobase >= 3000){
            valor = (20 * salariobase)/100;
            resultado = salariobase - valor;
        }
        if(cargo.equals("desenvolvedor") && salariobase < 3000){
            valor = (10 * salariobase)/100;
            resultado = salariobase - valor;
        }
        if(cargo.equals("dba") && salariobase >= 2000){
            valor = (25 * salariobase)/100;
            resultado = salariobase - valor;
        }
        if(cargo.equals("dba") && salariobase < 2000){
            valor = (15 * salariobase)/100;
            resultado = salariobase - valor;
        }
        if(cargo.equals("testador") && salariobase >= 2000){
            valor = (25 * salariobase)/100;
            resultado = salariobase - valor;
        }
        if(cargo.equals("testador") && salariobase < 2000){
            valor = (15 * salariobase)/100;
            resultado = salariobase - valor;
        }
        if(cargo.equals("gerente") && salariobase >= 5000){
             valor = (30 * salariobase)/100;
             resultado = salariobase - valor;
        }
        if(cargo.equals("gerente") && salariobase < 5000){
            valor = (20 * salariobase)/100;
            resultado = salariobase - valor;
        }
        return resultado;
    }
}
