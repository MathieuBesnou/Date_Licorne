package Homme;

public class Thierry {
    private String nom;
    private String description;
    private Integer age;
    private  String lieu;

    public Thierry(String nom,String lieu, String description, Integer age){

        this.nom = "Thierry";
        this.lieu = "ChocolatPlace";
        this.age = 204;
        this.description = "fghj";
    }

    public  String getNom(){
        return nom;
    }

    public String getLieu(){
        return lieu;
    }

    public  String getDescription(){
        return description;
    }

    public Integer getAge() {
        return age;
    }
}
