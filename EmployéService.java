import java.util.HashSet;
import java.util.Scanner;

public class EmployéService {
    HashSet<Employé> empset = new HashSet<Employé>();
    Employé emp1 = new Employé("fatihi", "Anas", 101, 17, 2500);
    Employé emp2 = new Employé("nassiri", "fatima", 102, 18, 57000);
    Employé emp3 = new Employé("alaoui", "olaya", 103, 31, 7000);
    Employé emp4 = new Employé("fadili", "hafssa", 104, 22, 70000);
    Scanner sc = new Scanner(System.in);
    boolean found = false;
    String nom;
    String prenom;
    int matricule;
    int age;
    double salaire;

    public EmployéService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);

    }

    //Afficher tous les employés
    public void viewAllEmps() {
        for (Employé emp : empset) {
            System.out.println(emp);
        }

    }

    //View employé based on there matricule
    public void viewEmp() {
        boolean found = false;
        System.out.println("Enter matricule: ");
        matricule = sc.nextInt();
        for (Employé emp : empset) {
            if (emp.getMatricule() == matricule) {//check if la matricule de lemployé égale a celle entré par l'utilisateur
                System.out.println(emp);
                found = true;
            }

        }
        if (!found) {
            System.out.println("employé with this matricule is not present");

        }
    }
        // Update employé
        public void updateEmploye() {
            System.out.println("Enter matricule:");
            matricule = sc.nextInt();
            boolean found = false;
            for (Employé emp : empset) {
                if (emp.getMatricule() == matricule) {//check if la matricule de lemployé égale a celle entré par l'utilisateur
                    System.out.println("Entrer le nom");
                    nom = sc.next();
                    System.out.println("Entrer le prenom");
                    prenom=sc.next();
                    System.out.println("Entrer l'age");
                    age=sc.nextInt();
                    System.out.println("Entrer un nouveau salaire");
                    salaire = sc.nextDouble();
                    emp.setNom(nom);
                    emp.setPrenom(prenom);
                    emp.setAge(age);
                    emp.setSalaire(salaire);
                    System.out.println("les details modifiés du l'employé sont:");
                    System.out.println(emp);
                    found = true;


                }
            }
            if (!found) {
                System.out.println("employé with this matricule is not present");
            } else {
                System.out.println("les details de l'employé ont été successivement modifiés !!");
            }
        }
    //delete Employé
    public void deleteEployé(){
        System.out.println("Entrer matricule");
        matricule=sc.nextInt();
        boolean found=false;
        Employé empdelete=null;
        for (Employé emp : empset) {
            if (emp.getMatricule() == matricule) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("employé with this matricule is not present");
        } else {
            empset.remove(empdelete);
            System.out.println("l'employé est successivement supprimé!!");
        }


    }
    //add emp
    public void addEmp(){
        System.out.println("Entrer le nom");
        nom = sc.next();
        System.out.println("Entrer le prenom");
        prenom = sc.next();
        System.out.println("Entrer matricule:");
        matricule = sc.nextInt();
        System.out.println("Entrer l'age");
        age = sc.nextInt();
        System.out.println("Entrer le salaire");
        salaire = sc.nextDouble();
    Employé emp=new Employé(nom,prenom,matricule,age,salaire);
    empset.add(emp);
        System.out.println(emp);
        System.out.println("l'employé a été successivement ajouté");

    }
    //Afficher l'employé le plus agé
    public void EmpPlusAgé(){
        for (Employé emp : empset) {
            if (emp.getAge()==31) {
                System.out.println(emp);
            }
            }

        }
    //Afficher l'employé le moins agé
    public void EmpMoinsAgé(){
        for(Employé emp:empset){
            if(emp.getAge()==17){
                System.out.println(emp);
            }
        }
    }
    // Calculer le nombre des employés ayant un salaire qui dépasse 10000
    public void CalculerNbrEmp(){
       int count=0;
       int nbrEmp;
        for (Employé emp : empset) {
            if (emp.getSalaire()>10000) {
              count=count+1;
              nbrEmp=count;
                System.out.println(nbrEmp);
            }
        }

    }

}

