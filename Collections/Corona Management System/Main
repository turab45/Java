import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CoronaInfoSystem {
    String name,gender,address,taluka,district,province;
     int age;
    Patient patient;
    Location location;
    public static Scanner scanner = new Scanner(System.in);

    // unique records, best choice is HashSet
    static HashSet<Patient> patients;
    // initializing the contructor
    CoronaInfoSystem() {
        patients = new HashSet<>();

    }

    // add a patient into the list.
    public void addPatient(){
        System.out.println("\n========================== ADD PATIENT ======================\n");
        System.out.print("- Enter Name : ");
        name = scanner.next();
        System.out.print("- Enter Gender : ");
        gender = scanner.next();
        System.out.print("- Enter Age : ");
        age = scanner.nextInt();
        System.out.print("- Enter Address : ");
        address = scanner.next();
        System.out.print("- Enter Taluka : ");
        taluka = scanner.next();
        System.out.print("- Enter District : ");
        district = scanner.next();
        System.out.print("- Enter Province : ");
        province = scanner.next();

        location = new Location();
        location.setTaluka(taluka);
        location.setDistrict(district);
        location.setProvince(province);

        patient = new Patient();
        patient.setName(name);
        patient.setGender(gender);
        patient.setAge(age);
        patient.setAddress(address);
        patient.setLocation(location);

        patients.add(patient);
        System.out.println("\n========================== PATIENT ADDED ======================\n");
    }

    // update the record of patient
    public void updatePatient(){
        int choice;
        Location l;
        System.out.println("\n========================== UPDATE PATIENT ======================\n");
        System.out.print("Enter Patient Name : ");
        name = scanner.next();
        if(contains(name)) {
            Patient p = getPatient(name);
            System.out.println("\n......................... RECORD FOUND .........................\n");
            System.out.println("What do you want to update?\n");
            updateFields1();
            System.out.print("\tEnter Choice : ");
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
                switch (choice) {
                    case 1:
                        System.out.println("\n------------------- PATIENT NAME --------------------");
                        System.out.println("/t| Patient's Old Name -> " + p.getName() + " |");
                        System.out.print("Enter New Name : ");
                        String newName = scanner.next();
                        p.setName(newName);
                        System.out.println("\n------------------- NAME UPDATED --------------------");
                        break;
                    case 2:
                        System.out.println("\n------------------- PATIENT GENDER --------------------");
                        System.out.println("/t| Patient's Old Gender -> " + p.getGender() + " |");
                        System.out.print("Enter New Gender : ");
                        String newGender = scanner.next();
                        p.setGender(newGender);
                        System.out.println("\n------------------- GENDER UPDATED --------------------");
                        break;
                    case 3:
                        System.out.println("\n------------------- PATIENT AGE --------------------");
                        System.out.println("/t| Patient's Old Age -> " + p.getAge() + " |");
                        System.out.print("Enter New Age : ");
                        int newAge = scanner.nextInt();
                        p.setAge(newAge);
                        System.out.println("\n------------------- AGE UPDATED --------------------");
                        break;
                    case 4:
                        System.out.println("\n------------------- PATIENT ADDRESS --------------------");
                        System.out.println("/t| Patient's Old Address -> " + p.getAddress() + " |");
                        System.out.print("Enter New Address : ");
                        String newAddress = scanner.next();
                        p.setAddress(newAddress);
                        System.out.println("\n------------------- ADDRESS UPDATED --------------------");
                        break;
                    case 5:
                        System.out.println("\n------------------- PATIENTS LOCATION INFO --------------------\n");
                        System.out.println("What do you want to update in Patient Location?\n");
                        updateFields2();
                        System.out.print("\tEnter Choice: ");
                        choice = scanner.nextInt();
                        if (choice == 1 || choice == 2 || choice == 3) {
                            switch (choice) {
                                case 1:
                                    System.out.println("\n------------------- PATIENT TALUKA --------------------");
                                    System.out.println("\t| Patient's Old Taluka -> " + p.getLocation().getTaluka() + " |");
                                    System.out.print("\tEnter New Taluka : ");
                                    String newTaluka = scanner.next();
                                    l = p.getLocation();
                                    l.setTaluka(newTaluka);
                                    p.setLocation(l);
                                    System.out.println("\n------------------- TALUKA UPDATED --------------------");
                                    break;
                                case 2:
                                    System.out.println("\n------------------- PATIENT DISTRICT --------------------");
                                    System.out.println("\t| Patient's Old District -> " + p.getLocation().getDistrict() + " |");
                                    System.out.print("\tEnter New District : ");
                                    String newDistrict = scanner.next();
                                    l = p.getLocation();
                                    l.setDistrict(newDistrict);
                                    p.setLocation(l);
                                    System.out.println("\n------------------- District UPDATED --------------------");
                                    break;
                                case 3:
                                    System.out.println("\n------------------- PATIENT PROVINCE --------------------");
                                    System.out.println("\t| Patient's Old Province -> " + p.getLocation().getProvince() + " |");
                                    System.out.print("\tEnter New Province : ");
                                    String newProvince = scanner.next();
                                    l = p.getLocation();
                                    l.setProvince(newProvince);
                                    p.setLocation(l);
                                    System.out.println("\n------------------- Province UPDATED --------------------");
                                    break;

                            }
                        }else{
                            System.out.println("\tPlease Choose Between 1-3");
                        }


                }
            }else{
                System.out.println("\tPlease Choose between 1-5");
            }
        }else{
            System.out.println("\tPatient Not Found.");
        }
    }



    public void deletePatient(){
        System.out.println("\n========================== DELETE PATIENT ======================\n");
        System.out.print("Enter Patient Name: ");
        name = scanner.next();
        if (contains(name)){
            System.out.println("Patient "+name+" Found.");
            Patient p = (Patient) getPatient(name);
            patients.remove(p);
            System.out.println("\n========================== PATIENT DELETED ======================\n");
        }else{
            System.out.println("Patient "+name+" Not Found.");
            System.out.println("\n===========================================================\n");
        }


    }
    public void view(){
        System.out.println("\n========================== VIEW PATIENT ======================\n");
        System.out.print("\tEnter Patient Name: ");
        name = scanner.next();
        if(contains(name)){
            Patient p = getPatient(name);
            System.out.println("\t................. PATIENT DETAILS ....................");
            System.out.println("\tName: "+p.getName());
            System.out.println("\tGender: "+p.getGender());
            System.out.println("\tAge: "+p.getAge());
            System.out.println("\tAddress: "+p.getAddress());
            System.out.println("\t............ PATIENT LOCATION DETAILS ...............");
            System.out.println("\tTaluka: "+p.getLocation().getTaluka());
            System.out.println("\tDistrict: "+p.getLocation().getDistrict());
            System.out.println("\tProvince: "+p.getLocation().getProvince());
            System.out.println("\n=========================================================\n");

        }else{
            System.out.println("\tPatient Not Found.");
        }

    }
    public void viewAll(){
        System.out.println("\n========================== VIEW ALL PATIENT ======================\n");
        Iterator iterator = patients.iterator();
        int no=1;
        while(iterator.hasNext()){
            Patient p = (Patient) iterator.next();
            System.out.println("\t"+no+". "+p.getName());
            no++;
        }
        System.out.println("\n==============================================================\n");
    }
    public void getByDistrict(){
        System.out.println("\n========================== GET PATIENT BY DISTRICT ======================\n");
        System.out.print("\tEnter District Name: ");
       String districtName = scanner.next();
        Iterator iterator = patients.iterator();
        int no=1;
        while(iterator.hasNext()){
            Patient p = (Patient) iterator.next();
            if(p.getLocation().getDistrict().equals(districtName)){
                System.out.println("\t"+no+". "+p.getName());
                no++;
            }
        }

    }

    public static boolean contains(String patientName){
        boolean search = false;
        Iterator iterator = patients.iterator();

        while(iterator.hasNext()){
            Patient p = (Patient) iterator.next();
            if(p.getName().equals(patientName)){
                search = true;
                break;
            }

        }
        return search;
    }
    public static Patient getPatient(String patientName){
        Patient searchedPatient = null,p = null;
        Iterator iterator = patients.iterator();

        while(iterator.hasNext()){
             p = (Patient) iterator.next();
            if(p.getName().equals(patientName)){
                searchedPatient = p;
                break;
            }

        }
        return searchedPatient;
    }
    private static void updateFields1(){

        System.out.println("    1. Patient Name");
        System.out.println("    2. Patient Gender");
        System.out.println("    3. Patient Age");
        System.out.println("    4. Patient Address");
        System.out.println("    5. Patient Location");
    }
    private static void updateFields2(){

        System.out.println("    1. Patient Taluka");
        System.out.println("    2. Patient District");
        System.out.println("    3. Patient Province");

    }
    public void menu(){
        int choice;
        boolean action = false;
        System.out.println("=============================== MENU ==========================\n");
        System.out.println("\t1. ADD PATIENT");
        System.out.println("\t2. UPDATE PATIENT");
        System.out.println("\t3. REMOVE PATIENT");
        System.out.println("\t4. VIEW PATIENT");
        System.out.println("\t5. VIEW ALL PATIENTs");
        System.out.println("\t6. VIEW PATIETS BY DISTRICT WISE");
        System.out.println("\t7. EXIT");
        System.out.print("\tEnter Choice: ");
        choice = scanner.nextInt();
        do {

            if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7) {
                switch (choice) {
                    case 1:
                        addPatient();
                        menu();
                        action = false;
                        break;
                    case 2:
                        updatePatient();
                        menu();
                        action = false;
                        break;
                    case 3:
                        deletePatient();
                        menu();
                        action = false;
                        break;
                    case 4:
                        view();
                        menu();
                        action = false;
                        break;
                    case 5:
                        viewAll();
                        menu();
                        action = false;
                        break;
                    case 6:
                        getByDistrict();
                        menu();
                        action = false;
                        break;
                    case 7:
                        action = true;
                        System.exit(0);
                        break;

                }

            } else {
                System.out.println("Please Choose between 1-7");
            }
        } while(action == true);
    }
    public static void main(String[] args) {
        CoronaInfoSystem cif = new CoronaInfoSystem();
        System.out.println("___________________ CORONA INFORMATION SYSTEM ___________________");

        cif.menu();






    }
}
