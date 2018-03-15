package poo;

public class Carro {
    private float velocidade;

    public Carro(){
        velocidade = 80;
    }

    public Carro(int vl){
        definirVelocidade(vl);

    }

    public float definirVelocidade(float v){
        if((v <= 200) && (v >= -200)){
            velocidade = v;
        }
        else{
            if(velocidade < -200){ //Se o usuário quer dar a ré
                velocidade = -200;
            }
            else{
                velocidade = 200;
            }
        }
        return velocidade;
    }

    public float acelerar(float v){
        return definirVelocidade(v + velocidade);
        //return velocidade;
    }

}
