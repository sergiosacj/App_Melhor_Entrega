package sergiosacj.com.myapplication.MelhorEntrega;

public class Moto extends Veiculo_flex {

    public Moto() {
        setTipo("moto");
        setEstado("disponivel");
        setCargaAtual(0);
        setCargaSuportada(50);
        setVelocidadeMedia(110);
        setTaxaReducaoRendimentoAlcool(0.4);
        setTaxaReducaoRendimentoGasolina(0.3);
        setRendimentoAlcool(43);
        setRendimentoGasolina(50);
    }

}
