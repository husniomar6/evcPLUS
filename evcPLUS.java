import java.util.Date;
import java.util.Scanner;
// waa qeybo ka mid ah variables ka aan isticmaali doono
public class evcPLUS {
    static Scanner input = new Scanner(System.in);
    static final int CORRECT_PIN = 1122;
    private static int haraaa = 1000;
    private static int Haraaga_Koontada = 3000;
    private static final int MAX_PIN_ATTEMPTS = 3;
    private static final int kaarka_aqoonsiga = 1234;
    private static final int koonto = 777555;
    private static final int ref_num = 8822;
    private static final Date currenDateAndTime = new Date();
    public static void main(String[] args) {
        System.out.print(" ");
        String ussd = input.nextLine();

        if (!ussd.equals("*770#")) {
            System.out.println("Invalid number.");
            return;
        }

        if (verifyPin()) {
            showMainMenu();
        } else {
            System.out.println("Waxaad gelisay PIN khaldan. Fadlan isku day mar kale.");
        }
    }
    public static boolean verifyPin() {
        System.out.println("\nEVC Plus");
        System.out.print("Fadlan geli PIN-kaaga: ");
        int enteredPin = input.nextInt();
        input.nextLine();

        if (enteredPin == CORRECT_PIN) {
            return true;
        } else {
            System.out.println("PIN-ka waa khalad.");
            return false;
        }
    }
    
    // adeegyada uu nooqabto adeega evc pluska
    
    public static void showMainMenu() {
        System.out.println("\n------ EVC Plus ------");
        System.out.println("1. Itus haraagaaga");
        System.out.println("2. Kaarka hadalka");
        System.out.println("3. Bixi bill");
        System.out.println("4. U wareeji EVC Plus");
        System.out.println("5. Warbixin kooban");
        System.out.println("6. Salaam Bank");
        System.out.println("7. Maaraynta");
        System.out.println("8. Bill payment");
        System.out.print("Fadlan dooro (1-8): ");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                Itusharaagaaga();
                break;
            case 2:
                Kaarkahadalka();
                break;
            case 3:
//
               evcPLUS.BillsApp.Bixibill();

                break;
            case 4:
                UwareejiEVCPlus();
                break;
            case 5:
                WarbixinKoban();
                break;
            case 6:
                SalaamBank();
                break;
            case 7:
                Maaraynta();
                break;
            case 8:
                Billpayment();
                return;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

// qeybtaaan waxaad ku ogaaa neysaa haraa gaaga

    private static void Itusharaagaaga() {
        System.out.println("\nEVC Plus");
        System.out.println("Haraagaaga waa: " + haraaa);
    }

// menu ga ku ku shubashada kaarka hadalka
    private static void Kaarkahadalka() {
        System.out.println("\nEVC Plus");
        System.out.println("1. Ku shubo airtime");
        System.out.println("2. Ugu shub airtime");
        System.out.println("3. MIFI packages");
        System.out.println("4. Ku shubo internet");
        System.out.println("5. Ugu shub qof kale");

        String option = input.nextLine();

        switch (option) {
            case "1":
                Kushuboairtime();
                break;
            case "2":
                ugushuboairtime();
                break;

            case "3":
                MIFIpackages();
                break;
            case "4":
                return;
            default:
                System.out.println("Invalid option.");
        }
    }
 // qeyta ku shubashada kaarka hadalka
    
    private static void Kushuboairtime() {
        System.out.println("\nEVC Plus");
        System.out.print("Fadlan geli lacagta ($): ");
        int amount = input.nextInt();
        input.nextLine();
        if (amount > 0 && amount <= haraaa) {
            System.out.print("Ma hubtaa inaad ku shubto $" + amount + "?\n 1.haa\n2.maya: ");
            String confirm = input.nextLine();
            if (confirm.equals("1")) {
                System.out.println("waxaad  ku shubatay $" + amount + "\n" +
                        "Tar:" + currenDateAndTime + "haraa gaagu waa " + ((haraaa + amount)));
            } else {
                System.out.println("Hawlgalka waa la joojiyay.");
            }
        } else {
            System.out.println("Sorry, haraaga kuguma filna.");
        }
    }
 // qof kale ugu shub  kaarka hadalka
    
    private static void ugushuboairtime() {
        System.out.println("\nEVC Plus");
        System.out.print("fadlan gali numberka: ");
        int number = input.nextInt();
        input.nextLine();
        System.out.print("Fadlan geli lacagta ($): ");

        int amount = input.nextInt();
        input.nextLine();
        if (amount > 0 && amount <= haraaa) {
            System.out.println("ma hubtaa in aad $" + amount + "ugu shubto" + number + "?\n 1.haa\n2.maya: ");
            String confirm = input.nextLine();
            if (confirm.equals("1")) {
                System.out.println("waxaad u shubtay $" + amount + number + "\n" +
                        "Tar:" + currenDateAndTime + "haraa gaagu waa " + ((haraaa - amount)));
            } else {
                System.out.println("Mahadsanid!.");
            }
        } else {
            System.out.println("Sorry, haraaga kuguma filna.");
        }
    }
// menu ga qeybta ku shubashada xirmooyinka internet ka
    private static void MIFIpackages() {
        System.out.println("\n--- Internet Bundles ---");
        System.out.println("1. is buucle - $5 = 10 GB");
        System.out.println("2. maalinle - $1 = 2 GB");
        System.out.println("3. bille - $25 Unlimited");
        System.out.print("Choose a bundle: ");

        String bundleChoice = input.nextLine();
        double cost = 0;
        String bundleDesc = "";

        switch (bundleChoice) {
            case "1":
                cost = 5;
                bundleDesc = "Weekly 10 GB";
                break;
            case "2":
                cost = 1;
                bundleDesc = "Daily 2 GB";
                break;
            case "3":
                cost = 25;
                bundleDesc = "Monthly Unlimited";
                break;
            default:
                System.out.println("haraa gaagu kuguma filna.");
                return;
        }

        if (cost > haraaa) {
            System.out.println("haraa gaagu kuguma filna.");
            return;
        }

        System.out.print("Ma hubtaa inaad  ugu shubtid " + bundleDesc + " for $" + cost + "? (1.haa 2.maya): ");
        String confirm = input.nextLine();

        if (confirm.equals("1")) {
            haraaa -= cost;
            System.out.println("waxaad wareejisay $" + cost + "haraa gaagu waa: $" + haraaa);
            System.out.println("Tar: " + new Date());
        } else {
            System.out.println("Mahadsanid!.");
        }
    }



// qeyta bixinta billka 
    public class BillsApp {

        private static Scanner input = new Scanner(System.in);
        private static int haraaa = 1000;

        public static void main(String[] args) {
            Bixibill();
        }

        public static void Bixibill() {
            System.out.println("\n--- Pay Bills ---");
            System.out.println("1. Post Paid");
            System.out.println("2. Ku iibso");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    postPaid();
                    break;
                case "2":
                    kuiibsoPayment();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        private static void postPaid() {
            System.out.println("\nPost Paid Bills");
            System.out.println("1. Ogow Biilka");
            System.out.println("2. Bixi Biil");
            System.out.println("3. Ka Bixi Biil");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("error.");
                    break;
                case "2":
                    System.out.print("Fadlan Geli Lacagta: $");
                    int amount = readIntInput();
                    if (amount <= 0) {
                        System.out.println("Invalid amount.");
                        return;
                    }
                    if (amount > haraaa) {
                        System.out.println("Haraaga xisaabtaada Kuguma filna.");
                        return;
                    }
                    System.out.print("Ma Hubtaa inaad bixisid bill lacagtiisu tahay $" + amount + "? (1.haa 2.maya): ");
                    String confirm = input.nextLine();
                    if (confirm.equals("1")) {
                        haraaa -= amount;
                        System.out.println("Bill paid successfully. New balance: $" + haraaa);
                    } else {
                        System.out.println("mahadsanid.");
                    }
                    break;

                case "3":
                    System.out.print("Imisa qof ayaad lacag u diraysaa? ");
                    int numRecipients = readIntInput();

                    int[] numbers = new int[numRecipients];
                    int[] amounts = new int[numRecipients];

                    for (int i = 0; i < numRecipients; i++) {
                        System.out.print("Geli mobile number #" + (i + 1) + ": ");
                        numbers[i] = readIntInput();
                        System.out.print("Geli lacagta loogu diro: $");
                        amounts[i] = readIntInput();

                        if (amounts[i] <= 0 || amounts[i] > haraaa) {
                            System.out.println("Invalid amount ama haraaga kuma filna.");
                            return;
                        }
                    }

                    System.out.println("Ma Hubtaa inaad bixiso lacagaha hoos ku qoran?");
                    int total = 0;
                    for (int i = 0; i < numRecipients; i++) {
                        System.out.println("Number: " + numbers[i] + ", Amount: $" + amounts[i]);
                        total += amounts[i];
                    }

                    System.out.print("Wadarta waa $" + total + ". (1.haa 2.maya): ");
                    String confirmm = input.nextLine();

                    if (confirmm.equals("1")) {
                        if (total > haraaa) {
                            System.out.println("Haraaga xisaabtaada Kuguma filna.");
                            return;
                        }
                        haraaa -= total;
                        for (int i = 0; i < numRecipients; i++) {
                            System.out.println("Waxaad u dirtay $" + amounts[i] + " tel: " + numbers[i]);
                        }
                        System.out.println("Haraagaaga cusub waa: $" + haraaa);
                    } else {
                        System.out.println("Mahadsanid!");
                    }
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        private static int readIntInput() {
            while (!input.hasNextInt()) {
                System.out.println("Fadlan geli tiro sax ah.");
                input.next(); // discard invalid input
            }
            return input.nextInt();
        }
    }


    public static void kuiibsoPayment() {
        int aqoonsiga = 0;

        for (int attempts = 0; attempts < 5 && aqoonsiga != kaarka_aqoonsiga; attempts++) {
            System.out.println("Fadlan Geli aqoonsiga ganacsiga: ");
            aqoonsiga = input.nextInt();
            if (aqoonsiga != kaarka_aqoonsiga) {
                System.out.println("Invalid input format(dataType)");
            }
            if (attempts == 4 && aqoonsiga != kaarka_aqoonsiga) {
                System.out.println("waxaad gaartay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                return;
            }
        }
        System.out.println("Fadlan soo geli lacagta: ");
        int Lacagta = input.nextInt();
        if (Lacagta <= haraaa) {
            System.out.println("Mahubtaa inaad ku iibsato " + "$" + Lacagta + "? :");
            System.out.println("1. Haa");
            System.out.println("2. Maya");
            int confirm = input.nextInt();
            if (confirm == 1) {
                haraaa -= Lacagta;
                System.out.println("Waad ku iibsatay" + " Lacag Dhan $" + Lacagta + " " +
                        "Haraagaagu waa $" + haraaa);
            } else {
                System.out.println("Mahadsanid!.");
            }
        } else {
            System.out.println("Haraaga xisaabtaada Kuguma filna");
        }

    }
// qeyta u wareejinta lacagta EVC pluska
    private static void UwareejiEVCPlus() {
        System.out.println("\nEVC Plus");
        System.out.print("Fadlan geli mobilka aad u wareejinayso: ");
        String number = input.nextLine();

        System.out.print("Fadlan geli lacagta aad u wareejinayso: ");
        int lacag = input.nextInt();
        input.nextLine();
        System.out.println("Ma Hubtaa inaad $" + lacag + " u wareejisay " + number + "\n 1.haa" + "\n 2.maya");
        int op = input.nextInt();
        if (op == 1) {
            if (lacag > haraaa)
                System.out.println("haraaga xisaabtaada kugu ma filana");
            else
                System.out.println("[-EVC PLUS-] $" + lacag + " ayaad u wareejisay " + number +
                        " Tar:" + currenDateAndTime + " haraagaagu waa " + ((haraaa - lacag)));
        } else
            System.out.println("mahadsanid!");
    }
// menu ga lagu ogaado qeybta warbixinta kooban
    public static void WarbixinKoban() {
        Scanner input = new Scanner(System.in);
        System.out.println("Warbixin Kooban");
        System.out.println("1.Last Action");
        System.out.println("2.Wareejintii u dambeysay");
        System.out.println("3.Iibsashadii u dambeysay");
        System.out.println("4.Last 3 Actions");

        int warbixin = input.nextInt();
        switch (warbixin) {
            case 1:
                System.out.println("\nEVC Plus");
                System.out.print("Fadlan geli pinkaga: ");
                int pin = input.nextInt();
                input.nextLine();
                System.out.println("waxaad $5 ka heshay  0615283900  Taariikh: 26/10/25 10:23:32 ");
                break;
            case 2:

                System.out.println("1.U dirtay");
                System.out.println("2.Kaheshay");
                int statement = input.nextInt();
                switch (statement) {
                    case 1:
                        System.out.println("\nEVC Plus");
                        System.out.print("Fadlan geli numberka: ");
                        String numb = input.nextLine();
                        System.out.print("Fadlan geli pinkaga: ");
                        int pinn = input.nextInt();
                        input.nextLine();
                        System.out.println("waxaad $5 ka heshay  0615283900  Taariikh: 26/10/25 10:23:32 ");
                        break;
                    case 2:
                        System.out.println("\nEVC Plus");
                        System.out.print("Fadlan geli numberka: ");
                        String numbe = input.nextLine();
                        System.out.print("Fadlan geli pinkaga: ");
                        int pin1 = input.nextInt();
                        input.nextLine();
                        System.out.println("waxaad $5 u wareejisay  0615283900  Taariikh: 26/10/25 10:23:32 ");
                        break;

                    default:
                        System.out.println("Invalid input please try again..!!");
                }
                break;
            case 3:
                System.out.println("Last 3 actions:");
                System.out.println("\nEVC Plus");
                System.out.print("Fadlan geli pinkaga: ");
                int pin1 = input.nextInt();
                input.nextLine();
                System.out.println("1. $0.25 -> 252617353733, Date: 26/10/25 10:23:32");
                System.out.println("2. $0.5 -> 252615317741, Date: 25/10/25 24:15:40");
                System.out.println("3. $0.7 -> 252615433121, Date: 25/10/25 5:18:17");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

// qeybta aan ku ogaaneyno  adeegyada uu nooqabto SALAAM bank
    private static void SalaamBank() {
        while (true) {
            System.out.println("\n--- Salaam Bank Services ---");
            System.out.println("1. Itus Haraaga");
            System.out.println("2. Lacag dhigasho");
            System.out.println("3. Lacag qaadasho");
            System.out.println("4. Ka Wareeji EVCPlus");
            System.out.println("5. Ka Wareeji Account-kaga");
            System.out.println("6. Hubi wareejin account");
            System.out.println("7. Maareynta Bankiga");
            System.out.println("8. Kala Bax");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Koontadaada Bangiga:" + koonto + " " + "Haraageedu waa:"
                            + Haraaga_Koontada + "USD\n" + "IBAN: SO 45 0007 108 500065467843");
                    break;
                case "2":
                    Lacagdhigasho();
                    break;
                case "3":
                    Lacagqaadasho();
                    break;
                case "4":
                    KaWareejiEVCPlus();
                    break;
                case "5":
                    KaWareejiAccountkaga();
                case "6":
                    Hubiwareejinaccount();
                case "7":
                    MaareyntaBankiga();
                case "8":
                    KalaBax();
                    break;
                case "9":
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
// qeyta lacag dhigashada SALAAM bank
    private static void Lacagdhigasho() {
        int maclumad = 123;
        System.out.println("Fadlan Geli macluumad: ");
        int user_code = input.nextInt();

        for (int attempts = 0; attempts < 5 && user_code != maclumad; attempts++) {
            System.out.println("Code-ga aad gelisay waa khalad. Fadlan mar kale geli:");
            maclumad = input.nextInt();

            if (user_code != maclumad) {
                System.out.println("Invalid input format (dataType)");
            }

            if (attempts == 4 && user_code != maclumad) {
                System.out.println("Waxaad gaartay isku dayadii laguu oggolaa, fadlan dib usoo gal");
                return;
            }
        }
    }
 // qeyta lacag qaadashada SALAAM bank
    private static void Lacagqaadasho() {
        System.out.print("Fadlan Geli Lacagta aad rabto inaad dhigato: $");
        int amount = input.nextInt();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        if (amount > Haraaga_Koontada) {
            System.out.println("Haraaga koontadan" + koonto + "kuma filna.");
            return;
        }
        System.out.print("ma hubtaa in aad $" + amount + "dhigato Account-kaaga bangiga? (1.Yes 2.No): ");
        String confirm = input.nextLine();
        if (confirm.equals("1")) {

            Haraaga_Koontada -= amount;
            haraaa += amount;
            System.out.println("Transfer successful.");
            System.out.println("New bank balance: $" + Haraaga_Koontada);
            System.out.println("New EVC Plus balance: $" + haraaa);
            System.out.println("Waxaad $" + amount + " dhigatay Account-kaaga bangiga. Haraagaagu waa $" + Haraaga_Koontada);
        } else {
            System.out.println("mahadsanid.");
        }
    }
// qeybtaan waxay noo qabaneysaa inaa lacag ka warejino SALAAM nabk
    private static void KaWareejiEVCPlus() {
        System.out.println("Fadlan dooro xisaabta Bangiga\n" +
                "1. SALAAM SOMALI BANK\n" +
                "2. Salaam Sch\n" +
                "3. Bank Beeraha\n" +
                "4. Darasalaam Bank\n" +
                "5. MyBank LTD");
        int xisabta_Bangiga = input.nextInt();
        if (xisabta_Bangiga < 1 | xisabta_Bangiga > 5) {
            System.out.println("Fadlan dooro number sax ah");
        }
        long macluumaad = 123456;
        System.out.println("Fadlan Geli Account");
        int input_account = input.nextInt();
        if (input_account != koonto) {
            System.out.println("Fadlan Geli account sax ah");
            return;
        }
        int input_macluumaad = 112233;
        int attempts = 0;
        for (attempts = 0; attempts < 2 && input_macluumaad != macluumaad; attempts++) {
            System.out.println("Fadlan Geli Macluumaad:");
            macluumaad = input.nextInt();
        }
        if (attempts == 2 && input_macluumaad != macluumaad) {
            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
            return;
        }
        System.out.println("Fadlan Geli lacagta:");
        int amount = input.nextInt();
        if (Haraaga_Koontada < amount) {
            System.out.println("Haraaga koontadan" + " " + koonto + " " + "kuma filna.");
            return;
        }
        System.out.println("Ma hubtaa inaad $" + amount +
                " u wareejiso Bank Account HUSNA OMAR MOHAMED (65467843)?\n1.haa\n2.maya: ");
        input.nextLine();
        String confirm2 = input.nextLine();
        if (confirm2.equals("1")) {
            Haraaga_Koontada -= amount;
            System.out.println("Waxaad $" + amount +
                    " u wareejisay Bank Account HUSNA OMAR MOHAMED (65467843)");
            System.out.println("Haraagaagu cusub waa $" + Haraaga_Koontada);
        } else {
            System.out.println("Mahadsanid");
        }

    }

//  qeybtaan waxaad lacag ka wareejin kartaa accoun to account
    public static void KaWareejiAccountkaga() {
        System.out.println("Fadlan Geli Account ama Mobile:");
        long inputAccountOrMobile = input.nextLong();

        if (inputAccountOrMobile != 123456 && inputAccountOrMobile != 11111) {
            System.out.println("Invalid Account Number.");
            return;
        }

        System.out.println("Fadlan Geli lacagta:");
        int amount = input.nextInt();

        int macluumaad = 0;
        int attempts = 0;

        while (attempts < 5) {
            System.out.println("Fadlan geli macluumaad:");
            macluumaad = input.nextInt();

            if (macluumaad == amount) {
                break;
            } else {
                System.out.println("Macluumaadka aad gelisay waa khalad.");
                attempts++;
                if (attempts == 5) {
                    System.out.println("Waxaad gaaratay inta ku noqosho laguu ogolaa, fadlan dib usoo gal.");
                    return;
                }
            }
        }


        int storedBankPin = 1234;
        int bankPin = 0;
        int pinAttempts = 0;

        while (pinAttempts < 5) {
            System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga:");
            bankPin = input.nextInt();

            if (bankPin == storedBankPin) {
                break;
            } else {
                System.out.println("Fadlan iska hubi number sireedka aad isticmaashay ee Bangiga.");
                pinAttempts++;
                if (pinAttempts == 5) {
                    System.out.println("Waxaad gaaratay inta ku noqosho laguu ogolaa, fadlan dib usoo gal.");
                    return;
                }
            }
        }

        input.nextLine();
        System.out.println("Ma hubtaa inaad USD" + amount +
                " u wareejiso Bank Account: HUSNA OMAR MOHAMED (7353733)?\n1.haa\n2.maya: ");
        String confirm = input.nextLine();

        if (confirm.equals("1")) {
            if (Haraaga_Koontada >= amount) {
                Haraaga_Koontada -= amount;
                System.out.println("Waxaad USD" + amount +
                        " u wareejisay Bank Account: HUSNA OMAR MOHAMED (37614522)");
                System.out.println("Haraagaagu cusub waa USD" + Haraaga_Koontada);
            } else {
                System.out.println("Haraaga koontadan kuma filna.");
            }
        } else {
            System.out.println("Mahadsanid");
        }
    }

    private static void Hubiwareejinaccount() {
        int OTP = 2525;
        System.out.println("Fadlan Geli OTP");
        int otp = input.nextInt();
        if (OTP == otp) {
            System.out.println("Ma hubtaa in aad aqbasho lacag diridan\n1. Haa \n2. Maya");
            int confirm2 = input.nextInt();
            if (confirm2 == 1) {
                System.out.println("Waad ku guulaysatay in aad ku dirto lacagta Account to Account");
            } else {
                System.out.println("Mahadsanid!.");
            }
        } else {
            System.out.println("OTP not found");
        }
    }
// qeybataan wexay noqabaneysaa inaa badali karno number sired kena
    public static void MaareyntaBankiga() {
        final int bankPin1 = 2200;
        final int bankPin2 = 1236;

        System.out.println("Maareynta Bankiga");
        System.out.println("1. Bedel PIN-ka Bangiga Number");
        System.out.println("2. Bedel Passwordka Ebank");
        int manageChoice = input.nextInt();

        if (manageChoice < 1 || manageChoice > 2) {
            System.out.println("Fadlan geli number sax ah");
            return;
        }

        int storedPin = (manageChoice == 1) ? bankPin1 : bankPin2;
        System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga");
        int enteredPin = input.nextInt();

        if (enteredPin != storedPin) {
            System.out.println("Fadlan iska hubi number sireed ka aad isticmaashay ee bangiga");
            return;
        }

        System.out.print("Fadlan geli PIN-ka Cusub: ");
        int newPin = input.nextInt();

        if (newPin == storedPin) {
            System.out.println("Fadlan iska hubi Number sireed ka cusub inuusan la mid ahayn Number sireed kaagi hore ee bangiga");
            return;
        }

        System.out.println("Hubi PIN-kaaga cusub:");
        int confirmPin = input.nextInt();
        int attempts = 1;

        while (newPin != confirmPin && attempts < 3) {
            System.out.println("PIN-ku isma waafaqaan. Fadlan isku day mar kale:");
            confirmPin = input.nextInt();
            attempts++;
        }

        if (newPin == confirmPin) {
            System.out.println("<-EVCPlus-> Waad ku guulaysatay in aad badesho PIN-kaaga Bangiga");
        } else {
            System.out.println("Waxaad gaartay tirada isku dayga ugu badan. Fadlan dib usoo gal.");
        }
    }


    public static void KalaBax() {
        int codsiga = 1234;
        int Usercodsiga = 0;
        boolean isVerified = false;

        for (int attempts = 0; attempts < 5; attempts++) {
            System.out.print("Fadlan geli aqoonsiga codsiga: ");
            if (input.hasNextInt()) {
                Usercodsiga = input.nextInt();
                if (Usercodsiga == codsiga) {
                    isVerified = true;
                    break;
                } else {
                    System.out.println("Aqoonsi khaldan. Isku day mar kale.");
                }
            } else {
                System.out.println("Fadlan geli lambar sax ah.");
                input.next();
            }

            if (attempts == 4) {
                System.out.println("Waxaad gaartay tiradii isku dayga ee la ogolaa. Fadlan dib u soo gal mar dambe.");
                return;
            }
        }

        if (!isVerified) return;

        System.out.print("Fadlan geli lacagta aad rabto inaad kala baxdo: ");
        int lacagta = input.nextInt();

        if (lacagta > Haraaga_Koontada) {
            System.out.println("Haraaga koontadaada kuma filna.");
            return;
        }
        System.out.print("Ma hubtaa inaad kala baxdo $" + lacagta + "? \n1. Haa\n2. Maya\nDooro: ");
        input.nextLine();
        String confirm2 = input.nextLine();

        if (confirm2.equals("1")) {
            Haraaga_Koontada -= lacagta;
            System.out.println("Waxaad kala baxday $" + lacagta + ". Haraagaaga hadda waa $" + Haraaga_Koontada);
        } else {
            System.out.println("Hawlgalka waa la joojiyay. Mahadsanid.");
        }
    }
// qeybtan waxan ku sameyn karnaa maarayn anigoo ka faidaysaneynaa menu gaan
    public static void Maaraynta() {
        System.out.println("\nEVC Plus");
        System.out.println("1. Bedel numberkaaga sirta ah");
        System.out.println("2. Bedel luqada");
        System.out.println("3. Lacag xirasho");
        System.out.println("4. Wargalin mobile lumay");
        System.out.println("5. Celi lacag qaldantay");
        System.out.print("Fadlan dooro ikhtiyaarkaaga: ");

        int optionn = input.nextInt();
        input.nextLine();

        switch (optionn) {
            case 1:
                System.out.print("Fadlan geli pinkaga cusub: ");
                int pin1 = input.nextInt();
                input.nextLine();
                System.out.print("Fadlan geli mar kale pinkaga cusub: ");
                int pin2 = input.nextInt();
                input.nextLine();
                System.out.print("Fadlan geli pinkaga hadda: ");
                int pinOld = input.nextInt();
                input.nextLine();
                if (pin1 == pin2) {
                    System.out.println("Pinkaga waa la bedelay.");
                } else {
                    System.out.println("Pinkaga lama isku waafaqin, fadlan isku day mar kale.");
                }
                break;

            case 2:
                System.out.println("Fadlan dooro luuqad:\n1. Soomaali\n2. English");
                String lang = input.nextLine();
                if (lang.equals("1")) {
                    System.out.println("Waad ku guuleysatay inaad badasho luuqada.");
                } else if (lang.equals("2")) {
                    System.out.println("Successfully! You have changed your language.");
                } else {
                    System.out.println("Luqad aan sax ahayn.");
                }
                break;

            case 3:
                System.out.print("Fadlan geli numberka qaladka ah: ");
                String wrongNumber = input.nextLine();
                System.out.print("Fadlan geli numberka loo rabay: ");
                String correctNumber = input.nextLine();
                System.out.println("Dhaqdhaqaaqii waa la joojiyay.");
                break;

            case 4:
                System.out.print("Fadlan geli mobilka lumay: ");
                String mobile = input.nextLine();
                System.out.print("Fadlan geli numberka sirta ah: ");
                int lostPin = input.nextInt();
                input.nextLine();
                System.out.print("Ma hubtaa in aad diiwaan geliso number kaan " + mobile + "?\n1. Haa\n2. Maya: ");
                String confirmLost = input.nextLine();
                if (confirmLost.equals("1")) {
                    System.out.println(mobile + " number kaan waa la diiwaan galiyay.");
                } else {
                    System.out.println("Hawlgalka waa la joojiyay.");
                }
                break;

            case 5:
                System.out.print("Fadlan geli numberka aqoonsiga lacag diraha: ");
                String numberAqoonsi = input.nextLine();
                System.out.print("Fadlan geli numberka loo rabay: ");
                String number1 = input.nextLine();
                System.out.print("Ma hubtaa in aad lacag u celiso " + number1 + "?\n1. Haa\n2. Maya: ");
                String confirmReturn = input.nextLine();
                if (confirmReturn.equals("1")) {
                    System.out.println("Waad celisay lacagtan.");
                } else {
                    System.out.println("Hawlgalka waa la joojiyay.");
                }
                break;

            default:
                System.out.println("Ikhtiyaar aan sax ahayn.");
                break;
        }
    }
// qeytan waxan ku oganeynaa haraagena billkana waan bixin karnaa
    public static void Billpayment() {
        System.out.println("\nEVC Plus");
        System.out.println("1. Itus haraaga billka");
        System.out.println("2. Wada bixi billka");
        System.out.println("3. Qeyb ka bixi biilka");
        System.out.print("Fadlan dooro ikhtiyaarkaaga: ");
        int bilOption = input.nextInt();
        input.nextLine();


        System.out.print("Fadlan geli reference number: ");
        String ref_num = input.nextLine();
        if (ref_num.isEmpty()) {
            System.out.println("Some parameters are missing. Please check your request.");
            return;
        }
        switch (bilOption) {
            case 1:
                System.out.println("Haraagaaga bill ku waa $" + haraaa);
                break;

            case 2:
                if (ref_num.isEmpty()) {
                    System.out.println("error.");
                } else {
                    System.out.print("Fadlan Geli lacagta bill ka: ");
                    double fullPayment = input.nextDouble();
                    input.nextLine();
                    if (fullPayment > 0 && fullPayment <= haraaa) {
                        System.out.print("Ma hubtaa in aad $" + fullPayment + " ugu shubto " + ref_num + "?\n1.haa\n2.maya: ");
                        String confirm = input.nextLine();
                        if (confirm.equals("1")) {
                            haraaa -= fullPayment;
                            System.out.println("Waxaad u shubtay $" + fullPayment + " " + ref_num + "\n" +
                                    "Tar:" + currenDateAndTime + " haraagaagu waa " + haraaa);
                        } else {
                            System.out.println("Hawlgalka waa la joojiyay.");
                        }
                    } else {
                        System.out.println("Sorry, haraaga kuguma filna.");
                    }
                }
            case 3:
                System.out.print("Fadlan geli lacagta bill ka: ");
                double amount = input.nextDouble();
                input.nextLine();

                if (amount > 0 && amount <= haraaa) {
                    System.out.print("Ma hubtaa in aad $" + amount + " ugu shubto " + ref_num + "?\n1.haa\n2.maya: ");
                    String confirm = input.nextLine();
                    if (confirm.equals("1")) {
                        haraaa -= amount;
                        System.out.println("Waxaad u shubtay $" + amount + " " + ref_num +
                                "\nTar: " + currenDateAndTime + " haraagaagu waa $" + haraaa);
                    } else {
                        System.out.println("Hawlgalka waa la joojiyay.");
                    }
                } else {
                    System.out.println("Sorry, haraaga kuguma filna.");
                }
                break;

            default:
                System.out.println("Ikhtiyaar aan sax ahayn.");
                break;
        }
    }
}
