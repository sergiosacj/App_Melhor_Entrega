package sergiosacj.com.myapplication.MelhorEntrega;

public class Van extends Veiculo_diesel {

    public Van() {
        setTipo("van");
        setEstado("disponivel");
        setRendimentoDiesel(10);
        setCargaAtual(0);
        setCargaSuportada(3500);
        setVelocidadeMedia(80);
        setTaxaReducaoRendimento(0.001);
    }

}
