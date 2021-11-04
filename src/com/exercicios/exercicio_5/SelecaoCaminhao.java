package com.exercicios.exercicio_5;

import java.util.ArrayList;

public class SelecaoCaminhao extends Controle{
    private ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();

    public void selecionarCaminhaoApto(){
        boolean continuar = true;
        while (continuar){
            String tipo = leString("Digite o tipo do caminhão:");
           if (!tipo.equalsIgnoreCase("fim")) {
                int quantidadePluviometros = leInteiro("Digite o numero de pluviometros transportados:");
                adicionarCaminhao(tipo, quantidadePluviometros);
            } else {
                continuar = false;
                System.out.println("Finalizando ...");
                obterCaminhaoApto();
            }
        }
    }

    private void adicionarCaminhao(String tipo, int quantidadePluviometros){
        ArrayList<Pluviometro> pluviometros = new ArrayList<Pluviometro>();
        for (int i = 1; i <= quantidadePluviometros; i++){
            double quantidade = leInteiro("Digite a quantidade do " + i +"°"+ " pluviometro:");
            pluviometros.add(new Pluviometro(quantidade));
        }
        caminhoes.add(new Caminhao(tipo, pluviometros));
    }

    private void obterCaminhaoApto(){
        double maior = 0;
        Caminhao caminhaoApto = new Caminhao("indisponivel", new ArrayList<Pluviometro>(0));
        for (Caminhao caminhao : caminhoes) {
            if (caminhao.capacidade() > maior){
                maior = caminhao.capacidade();
                caminhaoApto = caminhao;
            }
        }
        System.out.println("--------------------------------------------------------------------- \n" +
                            "DETALHES SOBRE O CAMINHÃO MAIS APTO A DISTRIBUIÇÃO DE PLUVIÔMETROS \n" +
                            "---------------------------------------------------------------------\n" +
                            "TIPO: " + caminhaoApto.getTipo() + "\n" +
                            "PLUVIOMETROS: ");
        for (Pluviometro pluviometro : caminhaoApto.getPluviometros()){
            System.out.println(pluviometro.getQuantidade());
        }
    }

}