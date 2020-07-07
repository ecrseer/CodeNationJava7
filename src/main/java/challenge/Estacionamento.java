package challenge;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    List<Carro> parqueadero = new ArrayList<>();

    public void estacionar(Carro carro) {
        if(carro.getCor()==null){
            throw new EstacionamentoException("Não tem COR");
        }
        if (carro.getMotorista() == null) {
            throw new EstacionamentoException("Não pode carro autonomo!");
        }
        if (carro.getMotorista().getIdade() <= 18
                || carro.getMotorista().getPontos() > 20) {
            throw new EstacionamentoException("Motorista irregular");

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
        }else{
            parqueadero.add(carro);

        }
    }

    public int carrosEstacionados() {
        return parqueadero.size();
    }

    public boolean carroEstacionado(Carro carro) {


        return false;
    }

    public List<Carro> Araimai(){

        return parqueadero;
    }
}
