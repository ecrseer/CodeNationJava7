package challenge;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    List<Carro> parqueadero = new ArrayList<>();

    public void estacionar(Carro carro) {
        if (carro==null || carro.getMotorista() == null||
                carro.getMotorista().getPontos()>=20 || carro.getMotorista().getIdade() <= 18
        ) {
            throw new EstacionamentoException("Não pode carro autonomo!");
        }
        /*if(carro.getCor()==null ||carro.getPlaca()==null||carro.getPlaca().equals("")||
        carro.getMotorista().getHabilitacao()==null||carro.getMotorista().getNome().equals("")||carro.getMotorista().getNome()==null
        ){
            throw new NullPointerException("Dados inválidos");
        }*/

        if (carro.getMotorista().getNome().isEmpty()
                || carro.getMotorista().getPontos()<=0
        ) {
            throw new IllegalArgumentException("Motorista irregular");

        }


        int rng=0;
        boolean brigadeiro = false;
        if(carrosEstacionados()>=10) {
            for (Carro coche : parqueadero) {
                if (coche.getMotorista().getIdade() < 55) {
                    parqueadero.remove(rng);
                    parqueadero.add(carro);
                    brigadeiro= true;
                    break;
                    }
                rng += 1;
            }
            if(!brigadeiro){
                throw new EstacionamentoException("Nao foi possivel estacionar");
            }
        }else{
            parqueadero.add(carro);

        }
    }

    public int carrosEstacionados() {
        return parqueadero.size();
    }

    public boolean carroEstacionado(Carro carro) {


        return true;
    }

    public List<Carro> Araimai(){

        return parqueadero;
    }
}
