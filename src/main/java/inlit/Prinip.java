package inlit;

import challenge.Carro;
import challenge.Cor;
import challenge.Estacionamento;
import challenge.Motorista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Prinip {



    public static void main(String args[]){
        List<Carro> parqueadero = new ArrayList<>();
        for(int cnt=57;cnt>=54;cnt--) {
            String[] nms = {"Alberto","Maria","Flavio","Lucia"};
            Motorista.MotoristaBuilder detran = Motorista.builder()
                    .withNome(nms[cnt-54])
                    .withHabilitacao("NaoVazia")
                    .withPontos(19)
                    .withIdade(cnt+4);
            Carro.CarroBuilder alugou = Carro.builder()
                    .withMotorista(detran.build())
                    .withCor(Cor.COLORIDO)
                    .withPlaca("Placoso")
                    ;

            parqueadero.add(alugou.build());

        }


        System.out.println("\n"+parqueadero.toString());

        Estacionamento instaceano = new Estacionamento();
        for(int i=0; i<=3;i++)
           instaceano.estacionar(parqueadero.get(i));

        Motorista motorista = Motorista.builder().withNome("Ada")
                .withIdade(25)
                .withPontos(10)
                .withHabilitacao("1231")
                .build();
        Carro carro = Carro.builder().withCor(Cor.BRANCO).withPlaca("123").withMotorista(motorista).build();
        instaceano.estacionar(carro);

        System.out.println(instaceano.Araimai().toString());

    }

}
