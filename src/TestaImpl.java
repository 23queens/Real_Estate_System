
import Controler.ControlePrincipal;
import Model.*;
import java.util.*;

// Java project for the first time in Spanish

public class TestaImpl {

    public static void main(String[] args) {
        /*
        ArrayList<Imovel> listaImoveis = new ArrayList();
        
        // Criando vendedores, compradores e corretores        
        Vendedor v1 = new Vendedor("111222", "Joao Silva", "joao@gmail.com",
                "99998888", Util.FONE);
        Vendedor v2 = new Vendedor("222333", "Jose Santos", "jose@gmail.com",
                "88889999", Util.EMAIL);

        Comprador c1 = new Comprador("333444", "Caio Souza", "caio@gmail.com",
                "77776666", Util.FONE);
        Comprador c2 = new Comprador("444555", "Felipe Kerr", "felipe@gmail.com",
                "66665555", Util.FONE);

        Corretor cor1 = new Corretor("555666", "Ana Cintra", "ana@gmail.com",
                "55554444", "123456", 50);
        Corretor cor2 = new Corretor("666777", "Mario Prieto", "mario@gmail.com",
                "44443333", "654321", 40);

        Imovel casa = new Imovel(101, Util.CASA, "casa 3 dormitorios","ENDERECO1", "", 500000, 5,
                Calendar.getInstance(), v1);
        Imovel apto = new Imovel(102, Util.APTO, "apto 2 dormitorios", "ENDERECO2","", 350000, 4,
                Calendar.getInstance(), v2);
        Imovel lote = new Imovel(103, Util.LOTE, "lote 300 mts", "ENDERECO3","", 200000, 5,
                Calendar.getInstance(), v1);

        //Criando visitas
        Visita vis1 = new Visita(Calendar.getInstance(), c1, cor1);
        Visita vis2 = new Visita(Calendar.getInstance(), c2, cor2);
        Visita vis3 = new Visita(Calendar.getInstance(), c1, cor1);
        Visita vis4 = new Visita(Calendar.getInstance(), c2, cor2);
        Visita vis5 = new Visita(Calendar.getInstance(), c1, cor2);

        //Associando as visitas aos imóveis
        casa.agendaVisita(vis1);
        casa.agendaVisita(vis2);
        apto.agendaVisita(vis3);
        apto.agendaVisita(vis4);
        lote.agendaVisita(vis5);

        //Realizando ou cancelando as visitas
        casa.realizaVisita(vis1);
        casa.cancelaVisita(vis2);
        apto.realizaVisita(vis3);
        apto.realizaVisita(vis4);
        lote.realizaVisita(vis5);

        //Criando e registrando propostas
        Proposta prop1 = new Proposta(Calendar.getInstance(), c1, cor1, 320000);
        Proposta prop2 = new Proposta(Calendar.getInstance(), c2, cor1, 330000);

        apto.registraProposta(prop1);
        apto.registraProposta(prop2);

        //Aceitando uma proposta (efetivando uma venda)
        apto.aceitaProposta(prop2);

        //Incluindo os imóveis no ArrayList        
        listaImoveis.add(casa);
        listaImoveis.add(apto);
        listaImoveis.add(lote);

        //Listando as visitas realizadas em cada imóvel
        System.out.println("Visitas:");
        for (Imovel i : listaImoveis) {
            if (!i.getListaVisitas().isEmpty()) {
                System.out.println("\n" + i.getCodigo() + " " + i.getDescricao());
                for (Visita v : i.getListaVisitas()) {
                    if (v.getEstado().equalsIgnoreCase(Util.REALIZADA)) {
                        System.out.println("Cliente " + v.getComprador().getNome()
                                + " visitou o imóvel em " + v.getData().getTime());
                    }
                }
            }
        }

        //Listando as propostas submetidas para cada imóvel
        System.out.println("\nPropostas:");
        for (Imovel i : listaImoveis) {
            if (!i.getListaPropostas().isEmpty()) {
                System.out.println("\n" + i.getCodigo() + " " + i.getDescricao());
                for (Proposta p : i.getListaPropostas()) {
                    System.out.println("Proposta submetida por "
                            + p.getComprador().getNome());
                    if (!p.getEstado().equalsIgnoreCase(Util.SUBMEDITA)) {
                        System.out.println("\tStatus da proposta: " + p.getEstado());
                    }
                }
            }
        }

        //Listando os imóveis vendidos
        System.out.println("\nImóveis vendidos:");
        for (Imovel i : listaImoveis) {
            if (i.getEstado().equalsIgnoreCase(Util.VENDIDO)) {
                System.out.println("\n" + i.getCodigo() + " " + i.getDescricao());
                for (Proposta p : i.getListaPropostas()) {
                    if (p.getEstado().equalsIgnoreCase(Util.ACEITA)) {
                        System.out.println("Comprador: " + p.getComprador().getNome());
                        System.out.println("Valor venda: " + p.getValor());
                    }
                }

            }

        }
        */
        //cria o controlador principal
        new ControlePrincipal();
    }
}
