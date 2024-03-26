import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_etudiant {
   static ArrayList< String> liste_etudiant=new ArrayList<>();
   static Scanner scanner=new Scanner(System.in);
    static void add_studiant(){
        System.out.print("Enter the name of studiant:");
        String name=scanner.nextLine();
        liste_etudiant.add(name);
        System.out.println("\u001B[32m"+"The studiant "+name+" added successfuly");

    }
    static void update_studiant(){
        System.out.print("Enter the name of studiant to modify:");
        String name=scanner.nextLine();
        boolean name_existe=liste_etudiant.contains(name);
        if(name_existe){
            System.out.print("Enter the modify name ");
            String name_modify=scanner.nextLine();
            int index=liste_etudiant.indexOf(name);
            liste_etudiant.set(index,name_modify);
            System.out.println(name +"was modify to "+name_modify);
        }
        else{
            System.out.println("This studiant not added yet,do you want to add him/her?");
        }
        

    }
    static void delete_studiant(){
        System.out.print("Enter the name of studiant to delete:");
        String name=scanner.nextLine();
        boolean name_existe=liste_etudiant.contains(name);
        if(name_existe){
            liste_etudiant.remove(name);
            System.out.println(" \u001B[32m"+name+" Delete successfuly");
        }
        else{
            System.out.println("This studiant not added yet,do you want to add him/her?");
        }
        

    }
    static void lister_studiant(){
        for(String i: liste_etudiant){
            System.out.println("All the studaint :\n"+i);

        }
    }

    public static void main(String[] args) {
        
       
        while (true){
        
        System.out.println("\u001B[34m"+"------MENU-----\n"
           +"1-Add a studiant\n"
           +"2-Update the name of a studiant\n"
           +"3-Delete a studiant\n"
           +"4-Liste of all the studiant\n"
           +"5-Quit the programme\n"
           +"---------------------------------");
       
        System.out.print(" \u001B[37m"+"Entrer a choise :");
        Scanner valeur=new Scanner(System.in);
        byte choice=valeur.nextByte();
        switch (choice) {
            case 1:
            add_studiant();
                break;
            case 2:
            update_studiant();
            break;
            case 3:
            delete_studiant();
            break;
            case 4:
            lister_studiant();
            break;
            case 5:
            System.out.println("Thunks for your visit :>");
            System.exit(0);
            default:
                System.out.println("\u001B[31m"+"Invalide choise");
        }
        valeur.close();
        
    }
    



    }


}
