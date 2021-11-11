package com.exercicios.exercicio_4;

public class ControleRemoto implements ControleRemoto{
    private Televisao tv;

    public ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    public void aumentarVolume(){
        if(tv.getVolume() < 100) {
            tv.setVolume(tv.getVolume() + 1);
            System.out.println("Volume som: " + tv.getVolume());
        } else {
            System.out.println("Volume do som está no maximo");
        }
    }

    public void diminuirVolume(){
        if(tv.getVolume() > 0) {
            tv.setVolume(tv.getVolume() - 1);
            System.out.println("Volume som: " + tv.getVolume());
        } else {
            System.out.println("Volume do som está no 0");
        }
    }

    public void aumentarCanal(){
        tv.setCanal(tv.getCanal() + 1);
        System.out.println("Canal: " + tv.getCanal());
    }

    public void diminuirCanal(){
        if(tv.getCanal() > 0) {
            tv.setCanal(tv.getCanal() - 1);
            System.out.println("Canal: " + tv.getCanal());
        } else {
            System.out.println("Canal não disponivel.");
        }
    }

    public void escolherCanal(int numeroCanal){
        if (numeroCanal > 0){
            tv.setCanal(numeroCanal);
            System.out.println("Canal: " + tv.getCanal());
        } else {
            System.out.println("Canal não disponivel");
        }
    }

    public void consultar(){
        System.out.println("------------------------ \n" +
                            "Canal: " + tv.getCanal() + "\n" +
                            "Volume do Som: " + tv.getVolume() + "\n" +
                            "-----------------------");
    }
}
