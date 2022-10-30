import java.util.Scanner;

public class Main {
    static boolean ordering=true;
public static void menu(){
    System.out.println("************* Menu du programme*************"
            +"\n1. Ajouter un nouvel employé"
            +"\n2. Modifier un employé"
            +"\n3. Supprimer un employé"
            +"\n4. Afficher un  employé"
            +"\n5. Afficher tous les employés"
            +"\n6. Calculer le nombre des employés ayant un salaire qui dépasse 10000"
            +"\n7. Afficher l’employé le plus âgé"
            +"\n8. Afficher l’employé le moins âgé"
            +"\n9. Quitter");
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    EmployéService service=new EmployéService();
    do {
        menu();
        System.out.println("Donnez votre choix");
        int choice = sc.nextInt();
        switch (choice) {
         case 1:
             System.out.println("Ajouter un nouvel employé");
             service.addEmp();
             break;
            case 2:
                System.out.println("Modifier un employé");
                service.updateEmploye();
                break;
            case 3:
                System.out.println("Supprimer un employé");
                service.deleteEployé();
                break;
            case 4:
                System.out.println("Afficher un  employé");
                service.viewEmp();
                break;
            case 5:
                System.out.println("Afficher tous les employés");
                service.viewAllEmps();
                break;
            case 6:
                System.out.println("Calculer le nombre des employés ayant un salaire qui dépasse 10000");
                service.CalculerNbrEmp();

                break;
            case 7:
                System.out.println("Afficher l’employé le plus âgé");
                service.EmpPlusAgé();
                break;
            case 8:
                System.out.println("Afficher l’employé le moins âgé");
                service.EmpMoinsAgé();
                break;
            case 9:
                System.out.println("Thank you for using application!!");
                System.exit(0);
            default:
                System.out.println("Please enter valid choix");
                break;

        }
    }while (ordering);
}
}