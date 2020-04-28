package comportamiento.command;

/**
 * esta clase contiene la referencia del comando a invocar
 * sus medotos invocar() llaman al metodo ejecutar() del comando
 **/
public class InvocadorComida {
    Comando comando;

    public InvocadorComida(Comando comando) {
        this.comando = comando;

    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void invocar() {
        comando.ejecutar();
    }
}
