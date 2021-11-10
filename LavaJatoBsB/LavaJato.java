import java.util.ArrayList;

public class LavaJato {
    

    private ArrayList<Carro> lsCarro;

    // Método contrutor da classe, ele vai ser usado no momento que o objeto da classe Agenda for criado.
    public LavaJato() {
        lsCarro = new ArrayList<>();
    }

    // ações da LavaJato
    // incluir um novo carro
    public void incluir(Carro c) {
        lsCarro.add(c);
    }

    // atualizar um carro
    public void atualizar(int id, Carro c) {
        lsCarro.set(id, c);
    }

    // excluir um carro
    public void excluir(int id) {
        lsCarro.remove(id);
    }

    // ver lista de carro
    public String verLista() {
        // variavel feita para concater todo o resultado e ser retornada no final
        String texto = "";
        // variavel feita para contar os elemtos do ArrayList e servir como indice dos itens da lista
        int i = 0;
        // laço de repetição feito para mostrar tooodos os itens do ArrayList
        for (Carro c : lsCarro) {
            texto += "[" + i + "] Marca:" + c.getMarca() + " Modelo:" + c.getModelo()+ "Cor:" + c.getCor() + " Placa:" + c.getPlaca() + "\n";
            i++;
        }
        return texto;
    }

}

