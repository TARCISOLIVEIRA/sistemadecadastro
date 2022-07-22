
package Cadastro;

import java.util.List;


public class DAOCidade {
    
    public List <Cidade> getLista(){
        return Dados.listaCidade;
    }
    public boolean salvar(Cidade obj){
        if (obj.getCodigo()== null);
        Integer codigo = Dados.listaCidade.size()+1;
        Dados.listaCidade.add(obj);
    
    return true;
}
}