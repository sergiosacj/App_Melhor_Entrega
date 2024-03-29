package sergiosacj.com.myapplication.Interface;

import sergiosacj.com.myapplication.MelhorEntrega.Veiculos;

public interface ComunicaFragments {

    void atualizaEmpresa(Double porcentagemLucro, int numeroCarros, int numeroCarretas, int numeroMotos, int numeroVans);

    void realizaEntrega(double pesoCarga, double distancia, double tempoMaximo);

    void enviaDadosCadastro();

    void enviaDadosOpcoes();

    void enviaDadosDesocupa();

    void escolheVeiculo(String veiculoEscolhido);

    void retiraVeiculo(Veiculos veiculoRetirado, int posicao);
}
