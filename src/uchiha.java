public class uchiha extends ninja {

    String nivelDoSharingan = "Sharingan 2";

    public void shariganAtivado(){
        System.out.println("Sharingan Ativado");
    }

    @Override
    public void ataqueBase() {
        System.out.println("Eu sou um ninja e taquei uma kunai elemento fogo");
    }

    public void ataqueBase(int nivelDeChakra){
        if (nivelDeChakra >= 2){
            System.out.println("Susano Ativado!");
        }
        else if (nivelDeChakra <= 1){
            System.out.println("Só consigo ativar o sharingan!");
        }
        else{
            System.out.println("Estou sem chakra!");
        }
    }
}
