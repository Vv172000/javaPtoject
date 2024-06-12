package practice;

import java.util.Scanner;

public class javapract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want a phone?");
        System.out.println("1. Yes\n2. No");

        int wantPhone = 2; // Default to No
        int chances = 3; // Number of chances for invalid input

        while (chances > 0) {
            String wantPhoneInput = scanner.next().toLowerCase();
            if (wantPhoneInput.equals("yes") || wantPhoneInput.equals("1")) {
                wantPhone = 1;
                break;
            } else if (wantPhoneInput.equals("no") || wantPhoneInput.equals("2")) {
                wantPhone = 2;
                break;
            } else {
                System.out.println("Invalid input. Please choose again.");
                chances--;
            }
        }

        if (wantPhone == 1) {
            System.out.println("Which phone do you want?");
            System.out.println("1. Samsung\n2. Apple");

            int phoneBrand = 2; // Default to Apple
            chances = 3; // Reset chances for the next input

            while (chances > 0) {
                String phoneBrandInput = scanner.next().toLowerCase();
                if (phoneBrandInput.equals("samsung") || phoneBrandInput.equals("1")) {
                    phoneBrand = 1;
                    break;
                } else if (phoneBrandInput.equals("apple") || phoneBrandInput.equals("2")) {
                    phoneBrand = 2;
                    break;
                } else {
                    System.out.println("Invalid input. Please choose again.");
                    chances--;
                }
            }

            if (phoneBrand == 1) {
                displaySamsungOptions(scanner);
            } else if (phoneBrand == 2) {
                displayAppleOptions(scanner);
            } else {
                System.out.println("Invalid choice");
            }
        } else {
            System.out.println("Thank you. Please try again later.");
        }

        scanner.close();
    }

    private static void displayAppleOptions(Scanner scanner) {
        System.out.println("Which model?");
        System.out.println("1. 13\n2. 14\n3. 15");

        int appleModel = scanner.nextInt();

        switch (appleModel) {
            case 1:
                displayApple13Options1(scanner);
                break;
            case 2:
                displayApple14Options1(scanner);
                break;
            case 3:
                displayApple15Options1(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }


    private static void displayApple13Options1(Scanner scanner) {
        System.out.println("Which variant?");
        System.out.println("1. 128GB\n2. 256GB");

        int appleVariant = scanner.nextInt();

        switch (appleVariant) {
            case 1:
                displayApple13_128GBOptions(scanner);
                break;
            case 2:
                displayApple13_256GBOptions(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }}
    
    private static void displayApple13_128GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Red\n2. Blue\n3. Grey");

        int appleColor = scanner.nextInt();

        switch (appleColor) {
            case 1:
                displayApple13_128GBRed();
                break;
            case 2:
                displayApple13_128GBBlue();
                break;
            case 3:
                displayApple13_128GBGrey();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displayApple13_256GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Red\n2. Blue\n3. Grey");

        int appleColor = scanner.nextInt();

        switch (appleColor) {
            case 1:
                displayApple13_256GBRed();
                break;
            case 2:
                displayApple13_256GBBlue();
                break;
            case 3:
                displayApple13_256GBGrey();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
    
    
    
    private static void displayApple14Options1(Scanner scanner) {
        System.out.println("Which variant?");
        System.out.println("1. 128GB\n2. 256GB");

        int appleVariant = scanner.nextInt();

        switch (appleVariant) {
            case 1:
                displayApple14_128GBOptions(scanner);
                break;
            case 2:
                displayApple14_256GBOptions(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
}
    
    
    private static void displayApple14_128GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Red\n2. Blue\n3. Grey");

        int appleColor = scanner.nextInt();

        switch (appleColor) {
            case 1:
                displayApple14_128GBRed();
                break;
            case 2:
                displayApple14_128GBBlue();
                break;
            case 3:
                displayApple14_128GBGrey();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displayApple14_256GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Red\n2. Blue\n3. Grey");

        int appleColor = scanner.nextInt();

        switch (appleColor) {
            case 1:
                displayApple14_256GBRed();
                break;
            case 2:
                displayApple14_256GBBlue();
                break;
            case 3:
                displayApple14_256GBGrey();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
    
    
    
    
    

        
        
        private static void displayApple15Options1(Scanner scanner) {
            System.out.println("Which variant?");
            System.out.println("1. 128GB\n2. 256GB");

            int appleVariant = scanner.nextInt();

            switch (appleVariant) {
                case 1:
                    displayApple15_128GBOptions(scanner);
                    break;
                case 2:
                    displayApple15_256GBOptions(scanner);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
    }

    private static void displayApple15_128GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Red\n2. Blue\n3. Grey");

        int appleColor = scanner.nextInt();

        switch (appleColor) {
            case 1:
                displayApple15_128GBRed();
                break;
            case 2:
                displayApple15_128GBBlue();
                break;
            case 3:
                displayApple15_128GBGrey();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displayApple15_256GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Red\n2. Blue\n3. Grey");

        int appleColor = scanner.nextInt();

        switch (appleColor) {
            case 1:
                displayApple15_256GBRed();
                break;
            case 2:
                displayApple15_256GBBlue();
                break;
            case 3:
                displayApple15_256GBGrey();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungOptions(Scanner scanner) {
        System.out.println("Which model?");
        System.out.println("1. Galaxy S21\n2. Galaxy S22\n3. Galaxy Note 20");

        int samsungModel = scanner.nextInt();

        switch (samsungModel) {
            case 1:
                displaySamsungS21Options(scanner);
                break;
            case 2:
                displaySamsungS22Options(scanner);
                break;
            case 3:
                displaySamsungNote20Options(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungS21Options(Scanner scanner) {
        System.out.println("Which variant?");
        System.out.println("1. 128GB\n2. 256GB");

        int samsungVariant = scanner.nextInt();

        switch (samsungVariant) {
            case 1:
                displaySamsungS21_128GBOptions(scanner);
                break;
            case 2:
                displaySamsungS21_256GBOptions(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungS22Options(Scanner scanner) {
        System.out.println("Which variant?");
        System.out.println("1. 128GB\n2. 256GB");

        int samsungVariant = scanner.nextInt();

        switch (samsungVariant) {
            case 1:
                displaySamsungS22_128GBOptions(scanner);
                break;
            case 2:
                displaySamsungS22_256GBOptions(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungNote20Options(Scanner scanner) {
        System.out.println("Which variant?");
        System.out.println("1. 128GB\n2. 256GB");

        int samsungVariant = scanner.nextInt();

        switch (samsungVariant) {
            case 1:
                displaySamsungNote20_128GBOptions(scanner);
                break;
            case 2:
                displaySamsungNote20_256GBOptions(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungS21_128GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Black\n2. Blue\n3. Silver");

        int samsungColor = scanner.nextInt();

        switch (samsungColor) {
            case 1:
                displaySamsungS21_128GBBlack();
                break;
            case 2:
                displaySamsungS21_128GBBlue();
                break;
            case 3:
                displaySamsungS21_128GBSilver();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungS22_128GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Black\n2. Blue\n3. Silver");

        int samsungColor = scanner.nextInt();

        switch (samsungColor) {
            case 1:
                displaySamsungS22_128GBBlack();
                break;
            case 2:
                displaySamsungS22_128GBBlue();
                break;
            case 3:
                displaySamsungS22_128GBSilver();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungNote20_128GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Black\n2. Blue\n3. Silver");

        int samsungColor = scanner.nextInt();

        switch (samsungColor) {
            case 1:
                displaySamsungNote20_128GBBlack();
                break;
            case 2:
                displaySamsungNote20_128GBBlue();
                break;
            case 3:
                displaySamsungNote20_128GBSilver();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungS21_256GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Black\n2. Blue\n3. Silver");

        int samsungColor = scanner.nextInt();

        switch (samsungColor) {
            case 1:
                displaySamsungS21_256GBBlack();
                break;
            case 2:
                displaySamsungS21_256GBBlue();
                break;
            case 3:
                displaySamsungS21_256GBSilver();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungS22_256GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Black\n2. Blue\n3. Silver");

        int samsungColor = scanner.nextInt();

        switch (samsungColor) {
            case 1:
                displaySamsungS22_256GBBlack();
                break;
            case 2:
                displaySamsungS22_256GBBlue();
                break;
            case 3:
                displaySamsungS22_256GBSilver();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void displaySamsungNote20_256GBOptions(Scanner scanner) {
        System.out.println("Which color?");
        System.out.println("1. Black\n2. Blue\n3. Silver");

        int samsungColor = scanner.nextInt();

        switch (samsungColor) {
            case 1:
                displaySamsungNote20_256GBBlack();
                break;
            case 2:
                displaySamsungNote20_256GBBlue();
                break;
            case 3:
                displaySamsungNote20_256GBSilver();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // Display methods for Apple phones
    private static void displayApple13Options(Scanner scanner) {
        System.out.println("which variant do you want?");
        System.out.println("1. 128GB\n2. 256GB");
    }

    private static void displayApple14Options(Scanner scanner) {
    	System.out.println("which variant do you want?");
        System.out.println("1. 128GB\n2. 256GB");
    }

    private static void displayApple15Options(Scanner scanner) {
    	System.out.println("which variant do you want?");
        System.out.println("1. 128GB\n2. 256GB");
    }
    
    private static void displayApple13_128GBRed() {
        System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 13");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Red");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 49,999");
        System.out.println("Launch date: September 2021");
        System.out.println("OS/Version: iOS 16");
    }
    
    private static void displayApple13_128GBBlue() {
        System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 13");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 49,999");
        System.out.println("Launch date: September 2021");
        System.out.println("OS/Version: iOS 16");
    }
    
    private static void displayApple13_128GBGrey() {
        System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 13");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Red");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 49,999");
        System.out.println("Launch date: September 2021");
        System.out.println("OS/Version: iOS 16");
    }
    
    private static void displayApple13_256GBRed() {
        System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 13");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Red");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2021");
        System.out.println("OS/Version: iOS 16");
    }
    private static void displayApple13_256GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 13");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2021");
        System.out.println("OS/Version: iOS 16");
    }
    
    private static void displayApple13_256GBGrey() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 13");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Grey");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2021");
        System.out.println("OS/Version: iOS 16");
    }
    
    
    private static void displayApple14_128GBRed() {
        System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 14");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Red");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 52,999");
        System.out.println("Launch date: September 2022");
        System.out.println("OS/Version: iOS 16");
    }
    
    private static void displayApple14_128GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 14");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 52,999");
        System.out.println("Launch date: September 2022");
        System.out.println("OS/Version: iOS 16");
    }
    
    private static void displayApple14_128GBGrey() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 14");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Grey");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 52,999");
        System.out.println("Launch date: September 2022");
        System.out.println("OS/Version: iOS 16");
    }
    
    
    private static void displayApple14_256GBRed() {
        System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 14");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Red");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2022");
        System.out.println("OS/Version: iOS 16");
    }
    
    private static void displayApple14_256GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 14");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2022");
        System.out.println("OS/Version: iOS 16");
    }
    
    private static void displayApple14_256GBGrey() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 14");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Grey");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2022");
        System.out.println("OS/Version: iOS 16");
    }
    
    
    
    
    private static void displayApple15_128GBRed() {
        System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 15");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Red");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2023");
        System.out.println("OS/Version: iOS 16");
    }

    private static void displayApple15_128GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 15");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2023");
        System.out.println("OS/Version: iOS 16");
    }

    private static void displayApple15_128GBGrey() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 15");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Grey");
        System.out.println("Camera: Dual-lens:48MP+12MP");
        System.out.println("Battery: 4000mAh");
        System.out.println("Display: 6.1-inch OLED Display");
        System.out.println("Price: 72,999");
        System.out.println("Launch date: September 2023");
        System.out.println("OS/Version: iOS 16");
    }

    private static void displayApple15_256GBRed() {
        System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 15");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Red");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4200mAh");
        System.out.println("Display: 6.1-inch Super Retina XDR");
        System.out.println("Price: 1,12,999");
        System.out.println("Launch date: September 2023");
        System.out.println("OS/Version: iOS 16");
    }

    private static void displayApple15_256GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 15");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4200mAh");
        System.out.println("Display: 6.1-inch Super Retina XDR");
        System.out.println("Price: 1,12,999");
        System.out.println("Launch date: September 2023");
        System.out.println("OS/Version: iOS 16");
    }

    private static void displayApple15_256GBGrey() {
    	System.out.println("Specification:");
        System.out.println("Brand: Apple");
        System.out.println("Model: 15");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Grey");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4200mAh");
        System.out.println("Display: 6.1-inch Super Retina XDR");
        System.out.println("Price: 1,12,999");
        System.out.println("Launch date: September 2023");
        System.out.println("OS/Version: iOS 16");
    }

    // Display methods for Samsung phones
  /*  private static void displaySamsungS21Options(Scanner scanner) {
        System.out.println("Displaying Samsung S21 Options...");
    }

    private static void displaySamsungS22Options(Scanner scanner) {
        System.out.println("Displaying Samsung S22 Options...");
    }

    private static void displaySamsungNote20Options(Scanner scanner) {
        System.out.println("Displaying Samsung Note20 Options...");
    }*/

//  /*  private static void displaySamsungS21_128GBOptions(Scanner scanner) {
//        System.out.println("Which color?");
//        System.out.println("1. Black\n2. Blue\n3. Silver");
//
//        int samsungColor = scanner.nextInt();
//
//        switch (samsungColor) {
//            case 1:
//                displaySamsungS21_128GBBlack();
//                break;
//            case 2:
//                displaySamsungS21_128GBBlue();
//                break;
//            case 3:
//                displaySamsungS21_128GBSilver();
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }
//
//    private static void displaySamsungS22_128GBOptions(Scanner scanner) {
//        System.out.println("Which color?");
//        System.out.println("1. Black\n2. Blue\n3. Silver");
//
//        int samsungColor = scanner.nextInt();
//
//        switch (samsungColor) {
//            case 1:
//                displaySamsungS22_128GBBlack();
//                break;
//            case 2:
//                displaySamsungS22_128GBBlue();
//                break;
//            case 3:
//                displaySamsungS22_128GBSilver();
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }
//
//    private static void displaySamsungNote20_128GBOptions(Scanner scanner) {
//        System.out.println("Which color?");
//        System.out.println("1. Black\n2. Blue\n3. Silver");
//
//        int samsungColor = scanner.nextInt();
//
//        switch (samsungColor) {
//            case 1:
//                displaySamsungNote20_128GBBlack();
//                break;
//            case 2:
//                displaySamsungNote20_128GBBlue();
//                break;
//            case 3:
//                displaySamsungNote20_128GBSilver();
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }
//
//    private static void displaySamsungS21_256GBOptions(Scanner scanner) {
//        System.out.println("Which color?");
//        System.out.println("1. Black\n2. Blue\n3. Silver");
//
//        int samsungColor = scanner.nextInt();
//
//        switch (samsungColor) {
//            case 1:
//                displaySamsungS21_256GBBlack();
//                break;
//            case 2:
//                displaySamsungS21_256GBBlue();
//                break;
//            case 3:
//                displaySamsungS21_256GBSilver();
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }
//
//    private static void displaySamsungS22_256GBOptions(Scanner scanner) {
//        System.out.println("Which color?");
//        System.out.println("1. Black\n2. Blue\n3. Silver");
//
//        int samsungColor = scanner.nextInt();
//
//        switch (samsungColor) {
//            case 1:
//                displaySamsungS22_256GBBlack();
//                break;
//            case 2:
//                displaySamsungS22_256GBBlue();
//                break;
//            case 3:
//                displaySamsungS22_256GBSilver();
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }
//
//    private static void displaySamsungNote20_256GBOptions(Scanner scanner) {
//        System.out.println("Which color?");
//        System.out.println("1. Black\n2. Blue\n3. Silver");
//
//        int samsungColor = scanner.nextInt();
//
//        switch (samsungColor) {
//            case 1:
//                displaySamsungNote20_256GBBlack();
//                break;
//            case 2:
//                displaySamsungNote20_256GBBlue();
//                break;
//            case 3:
//                displaySamsungNote20_256GBSilver();
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }*/

    // Display methods for Samsung phones
    private static void displaySamsungS21_128GBBlack() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S21");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Black");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.2-inch Dynamic AMOLED");
        System.out.println("Price: 31,478");
        System.out.println("Launch date: January 2021");
        System.out.println("OS/Version: Android 11");
    }

    private static void displaySamsungS21_128GBBlue() {
        System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S21");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.2-inch Dynamic AMOLED");
        System.out.println("Price: 31,478");
        System.out.println("Launch date: January 2021");
        System.out.println("OS/Version: Android 11");
    }

    private static void displaySamsungS21_128GBSilver() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S21");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Silver");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.2-inch Dynamic AMOLED");
        System.out.println("Price: 31,478");
        System.out.println("Launch date: January 2021");
        System.out.println("OS/Version: Android 11");
    }

    private static void displaySamsungS22_128GBBlack() {
        System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S22");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Black");
        System.out.println("Camera: Quad-lens:56MP+18MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.4-inch Dynamic AMOLED");
        System.out.println("Price: 55,999");
        System.out.println("Launch date: February 2022");
        System.out.println("OS/Version: Android 12");
    }

    private static void displaySamsungS22_128GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S22");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Quad-lens:56MP+18MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.4-inch Dynamic AMOLED");
        System.out.println("Price: 55,999");
        System.out.println("Launch date: February 2022");
        System.out.println("OS/Version: Android 12");
    }

    private static void displaySamsungS22_128GBSilver() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S22");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Silver");
        System.out.println("Camera: Quad-lens:56MP+18MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.4-inch Dynamic AMOLED");
        System.out.println("Price: 55,999");
        System.out.println("Launch date: February 2022");
        System.out.println("OS/Version: Android 12");
    }

    private static void displaySamsungNote20_128GBBlack() {
        System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy Note 20");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Black");
        System.out.println("S Pen Support: Yes");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4300mAh");
        System.out.println("Display: 6.7-inch Dynamic AMOLED");
        System.out.println("Price: 49,999");
        System.out.println("Launch date: August 2020");
        System.out.println("OS/Version: Android 10");
    }

    private static void displaySamsungNote20_128GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy Note 20");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Blue");
        System.out.println("S Pen Support: Yes");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4300mAh");
        System.out.println("Display: 6.7-inch Dynamic AMOLED");
        System.out.println("Price: 49,999");
        System.out.println("Launch date: August 2020");
        System.out.println("OS/Version: Android 10");    }

    private static void displaySamsungNote20_128GBSilver() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy Note 20");
        System.out.println("Variant: 128GB");
        System.out.println("Color: Silver");
        System.out.println("S Pen Support: Yes");
        System.out.println("Camera: Triple-lens:48MP+12MP+12MP");
        System.out.println("Battery: 4300mAh");
        System.out.println("Display: 6.7-inch Dynamic AMOLED");
        System.out.println("Price: 49,999");
        System.out.println("Launch date: August 2020");
        System.out.println("OS/Version: Android 10");
    }

    private static void displaySamsungS21_256GBBlack() {
        System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S21");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Black");
        System.out.println("Camera: Triple-lens:64MP+12MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.2-inch OLED");
        System.out.println("Price: 69,999");
        System.out.println("Launch date: January 2021");
        System.out.println("OS/Version: Android 11");
    }

    private static void displaySamsungS21_256GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S21");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Blue");
        System.out.println("Camera: Triple-lens:64MP+12MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.2-inch OLED");
        System.out.println("Price: 69,999");
        System.out.println("Launch date: January 2021");
        System.out.println("OS/Version: Android 11");
    }

    private static void displaySamsungS21_256GBSilver() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S21");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Silver");
        System.out.println("Camera: Triple-lens:64MP+12MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.2-inch OLED");
        System.out.println("Price: 69,999");
        System.out.println("Launch date: January 2021");
        System.out.println("OS/Version: Android 11");
    }

    private static void displaySamsungS22_256GBBlack() {
        System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy S22");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Black");
        System.out.println("Camera: Quad-lens:64MP+12MP");
        System.out.println("Battery: 4500mAh");
        System.out.println("Display: 6.4-inch Dynamic AMOLED");
        System.out.println("Price: 67,999");
        System.out.println("Launch date: February 2022");
        System.out.println("OS/Version: Android 12");
    }

    private static void displaySamsungS22_256GBBlue() {
    	 System.out.println("Specification:");
         System.out.println("Brand: Samsung");
         System.out.println("Model: Galaxy S22");
         System.out.println("Variant: 256GB");
         System.out.println("Color: Blue");
         System.out.println("Camera: Quad-lens:64MP+12MP");
         System.out.println("Battery: 4500mAh");
         System.out.println("Display: 6.4-inch Dynamic AMOLED");
         System.out.println("Price: 67,999");
         System.out.println("Launch date: February 2022");
         System.out.println("OS/Version: Android 12");
    }

    private static void displaySamsungS22_256GBSilver() {
    	 System.out.println("Specification:");
         System.out.println("Brand: Samsung");
         System.out.println("Model: Galaxy S22");
         System.out.println("Variant: 256GB");
         System.out.println("Color: Silver");
         System.out.println("Camera: Quad-lens:64MP+12MP");
         System.out.println("Battery: 4500mAh");
         System.out.println("Display: 6.4-inch Dynamic AMOLED");
         System.out.println("Price: 67,999");
         System.out.println("Launch date: February 2022");
         System.out.println("OS/Version: Android 12");
    }

    private static void displaySamsungNote20_256GBBlack() {
        System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy Note 20");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Black");
        System.out.println("S Pen Support: Yes");
        System.out.println("Camera: Triple-lens:64mp+12mp+12mp");
        System.out.println("Battery: 4300mAh");
        System.out.println("Display: 6.7-inch Dynamic AMOLED");
        System.out.println("Price: 57,999");
        System.out.println("Launch date: August 2020");
        System.out.println("OS/Version: Android 10");
    }

    private static void displaySamsungNote20_256GBBlue() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy Note 20");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Blue");
        System.out.println("S Pen Support: Yes");
        System.out.println("Camera: Triple-lens:64mp+12mp+12mp");
        System.out.println("Battery: 4300mAh");
        System.out.println("Display: 6.7-inch Dynamic AMOLED");
        System.out.println("Price: 57,999");
        System.out.println("Launch date: August 2020");
        System.out.println("OS/Version: Android 10");
    }

    private static void displaySamsungNote20_256GBSilver() {
    	System.out.println("Specification:");
        System.out.println("Brand: Samsung");
        System.out.println("Model: Galaxy Note 20");
        System.out.println("Variant: 256GB");
        System.out.println("Color: Silver");
        System.out.println("S Pen Support: Yes");
        System.out.println("Camera: Triple-lens:64mp+12mp+12mp");
        System.out.println("Battery: 4300mAh");
        System.out.println("Display: 6.7-inch Dynamic AMOLED");
        System.out.println("Price: 57,999");
        System.out.println("Launch date: August 2020");
        System.out.println("OS/Version: Android 10");
    }
}
