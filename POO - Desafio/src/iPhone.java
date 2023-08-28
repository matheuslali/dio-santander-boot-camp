public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;


    public void iniciar (){

    }

    @Override
    public void ligar() {
        telefone.ligar();
    }

    @Override
    public void atender() {
        telefone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina() {
        navegador.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    @Override
    public void tocar() {
        reprodutor.tocar();
    }

    @Override
    public void pausar() {
        reprodutor.pausar();
    }

    @Override
    public void selecionarMusica() {
        reprodutor.selecionarMusica();
    }
}
