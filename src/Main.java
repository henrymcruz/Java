//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //obj1
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        System.out.println("Meu nome é " + naruto.getNome());
        naruto.idade = 17;
        naruto.chakraInfinito();
        naruto.temBiju = true;
        naruto.ataqueBase();

        //obj 2
        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.getNome();
        System.out.println("Meu nome é " + sasuke.getNome());
        sasuke.idade = 17;
        sasuke.shariganAtivado();
        sasuke.ataqueBase();
        sasuke.ataqueBase(1);
    }
}