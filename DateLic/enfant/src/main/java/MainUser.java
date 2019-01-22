import Choix.MainMenuChoiceSentiments;
import Choix.MainMenuChoiceSexe;
import Homme.*;

import java.util.Scanner;

public class MainUser {
    private static Scanner userInput = new Scanner(System.in);

    public static void main (String[] args) {

        JhoneInt jh = new JhoneImpl();
        Jhone jhone = ((JhoneImpl) jh).presentation(" ", 25);

        ThierryInt th = new ThierryImpl();
        Thierry thierry = ((ThierryImpl) th).presentation("", 204);

        final MainMenuChoiceSexe input_sexe = mainMenu();


        switch (input_sexe){
            case FEMME:
                System.out.println("Vous etes une Femme");
                System.out.println("Voici les profils de vos prince charmant :");
                System.out.println("Son Nom : " + jhone.getNom());
                System.out.println("Son Age : " + jhone.getAge());
                System.out.println("Il habite a : " + jhone.getLieu());
                System.out.println("Sa description : " + jhone.getDescription());

                final MainMenuChoiceSentiments input_sentiment = mainSentiment();

                switch (input_sentiment){

                    case Like:

                    case Dislike:
                        System.out.println("Voici un nouveau profils : ");
                        System.out.println("Son Nom : " + thierry.getNom());
                        System.out.println("Son Age : " + thierry.getAge());
                        System.out.println("Il habite a : " + thierry.getLieu());
                        System.out.println("Sa description : " + thierry.getDescription());


                    case Superlike:
                }

                break;

            case HOMME:
                System.out.println("Vous etes un Homme");
                break;
        }

    }

    private static MainMenuChoiceSexe mainMenu(){
        MainMenuChoiceSexe input_sexe;

        try {
            System.out.println("Veuillez choisir votre sexe entre un HOMME ou une FEMME : ");
            String choice = userInput.nextLine();
            input_sexe = MainMenuChoiceSexe.valueOf(choice);
        }
        catch (Exception ex){
            input_sexe = mainMenu();
        }
        return input_sexe;
    }

    private  static MainMenuChoiceSentiments mainSentiment(){
        MainMenuChoiceSentiments input_sentiment;
        try {
            System.out.println("Veuillez choisir votre si vous Like son profil ou Dislike ou encore SuperLike : ");
            String choice = userInput.nextLine();
            input_sentiment = MainMenuChoiceSentiments.valueOf(choice);
        }
        catch (Exception ex){
            input_sentiment = mainSentiment();
        }
        return input_sentiment;
    }

}
