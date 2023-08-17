
package enumeracao;


public enum StatusEnum {
    EM_PREPARACAO("Em Preparação"), EM_TRANSPORTE("Em Transporte"), ENTREGUE("Entregue");
    private String status;
    
    private StatusEnum (String status){
        this.status = status;
    }
    public String getStatus(){
        return  this.status;
    }    
    
}
