package Homme;

public class Jhone {
    private String nom;
    private String description;
    private Integer age;
    private  String lieu;

    public Jhone(){

    }

    public Jhone(String nom,String lieu, String description, Integer age){

        this.nom = "Jhone";
        this.lieu = "VanillaBeach";
        this.age = 29;
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
