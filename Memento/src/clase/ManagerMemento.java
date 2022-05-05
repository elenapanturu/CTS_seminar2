package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<MementoAutobuz> listaMemento;


    public ManagerMemento() {
        this.listaMemento = new ArrayList<>();
    }

    public void addMemento(MementoAutobuz memento){
        this.listaMemento.add(memento);
    }

    public MementoAutobuz getMemento(int index){
        return listaMemento.get(index);
    }
}
