package daos.implementacion;

import Pedido.PedNatural;
import daos.PedidoNaturalDao;
import daos.PedidoDao;
import java.util.*;

/**
 *
 * @author emaravi
 */
public class PedidoNatuDaoImplMemory implements PedidoNaturalDao{
    
    private List<PedNatural> lista;

    public PedidoNatuDaoImplMemory() {
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(PedNatural t) {
        if(find(t.getNroPedido())==null)
            lista.add(t);
    }

    @Override
    public PedNatural find(Integer v) {
        for(PedNatural a:lista) if(a.getNroPedido()==v) return a;
        return null;
    }

    @Override
    public List<PedNatural> findAll() {
        return lista;
    }

    @Override
    public void update(PedNatural t) {
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
