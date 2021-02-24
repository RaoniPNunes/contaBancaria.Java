
package contabancaria;


public class Conta {
    
    public int numconta;
    protected String tipo;
    private String cliente;
    private double saldo;
    private boolean status;
    
    public void estadoatual(){
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("conta: " + this.getnumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("cliente: " + this.getCliente());
        System.out.println("saldo atual: " + this.getSaldo());
        System.out.println("estado da conta: " + this.getStatus());
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
    }
    
    public void Conta(){  //método construtor
    this.setStatus(false);
    this.setSaldo(0f);
    }
    
    // Método sacar
    public void sacar(double s){
        if(this.getStatus()==true){
            if(this.getSaldo()<0){
                System.out.println("Saldo insuficiente");
            }
            else{
                this.setSaldo(this.getSaldo()-s);
                System.out.println("Saque realizado com sucesso");
            }
        }else{
            System.out.println("Conta ainda fechada para realizar saques");
        }
    }
    
    //Método depositar
    public void depositar(double d){
        if (this.getStatus()==false) {
            System.out.println("Conta ainda fechada");
            
        } else {
            this.setSaldo(saldo+=d);
            System.out.println("O seu saldo é " + this.getSaldo());
        }
        
    }
    
    public void abrirconta(String t){
    this.status = true;
    this.setTipo(t);
        if (t == "CC") {
            this.saldo = 50;
        } else if (t == "CP"){
            this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharconta(){
        if (this.getSaldo()>0) {
            System.out.println("Conta não pode ser fechada pois ainda existe saldo");
        } else if (this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada pois existe um débito");
        } else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }
        
    }
    
    public void pagarmensal(){
        
    }
    
    // MÉTODOS ESPECIAIS (get e set)
    
    public void setnumConta(int n){
        this.numconta=n;
    }
    
    public int getnumConta(){
        return numconta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setCliente(String cli){
        this.cliente = cli;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setSaldo(double sal){
        this.saldo = sal;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setStatus(boolean sta){
        this.status = sta;
    }
    
    public boolean getStatus(){
        return status;
    }
    
}
