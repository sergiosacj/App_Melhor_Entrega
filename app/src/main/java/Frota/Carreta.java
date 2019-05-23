package Frota;

public class Carreta extends Veiculos {
    public Carreta() {
        setTipo("carreta");
        setEstado("disponivel");
        setCombustivel("diesel");
        setRendimentoDiesel(8);
        setRendimentoGasolina(0);
        setRendimentoAlcool(0);
        setCarga_atual(0);
        setCarga_suportada(30000);
        setVelocidade_media(60);
        setTaxa_reducao_rendimento(0.0002);
    }
}
