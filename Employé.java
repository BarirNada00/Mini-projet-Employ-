public class Employé {
    private String nom;
    private String prenom;
    private int matricule;
    private int age;
    private double salaire;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom){

        this.nom=nom;
    }
    public String getPrenom(){

        return prenom;
    }
    public void setPrenom(String prenom){

        this.prenom=prenom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getAge() {

        return age;
    }
    public void setAge(int age){

        this.age=age;
    }
    public double getSalaire(){
        return salaire;

    }
    public void setSalaire(double salaire){

        this.salaire=salaire;
    }

    @Override
    public String toString() {
        return "Employé{" +
                "name='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule=" + matricule +
                ", age=" + age +
                ", salaire=" + salaire +
                '}';
    }

    public Employé(String nom,String prenom,int matricule,int age,double salaire) {
        this.nom = nom;
        this.prenom=prenom;
        this.matricule=matricule;
        this.age=age;
        this.salaire=salaire;
    }
}
