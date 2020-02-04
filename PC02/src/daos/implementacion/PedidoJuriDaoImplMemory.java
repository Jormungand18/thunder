package daos.implementacion;

import Pedido.PedJuridico;
import daos.PedidoJuridicoDao;
import daos.PedidoDao;
import java.util.*;

/**
 *
 * @author emaravi
 */
public class PedidoJuriDaoImplMemory implements PedidoJuridicoDao{
    
    private List<PedJuridico> lista;

    public PedidoJuriDaoImplMemory() {
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(PedJuridico t) {
        if(find(t.getNroPedido())==null)
            lista.add(t);
    }

    @Override
    public PedJuridico find(Integer v) {
        for(PedJuridico a:lista) if(a.getNroPedido()==v) return a;
        return null;
    }

    @Override
    public List<PedJuridico> findAll() {
        return lista;
    }

    @Override
    public void update(PedJuridico t) {
        for(int ind=0; ind<lista.size(); ind++){
            if(lista.get(ind).getNroPedido()==t.getNroPedido()){
                lista.set(ind,t);
                break;
            }
        }
        
    }
    @Override
    public void delete(Integer NroPedido) {
        lista.remove(find(NroPedido));
    }


    
    


    

}
