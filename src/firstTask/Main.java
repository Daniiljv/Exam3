package firstTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Inventory inventory = new Inventory();

        Boolean programIsWorking = true;

        while (programIsWorking) {
            System.out.print("\n1.Add product\n2.Delete product\n3.Check having of product\n4.Exit");
            System.out.print("\nPut the action - ");
            int action = scanner.nextInt();

            switch (action){
                case 1:
                    System.out.print("\nPut the name product - ");
                    scanner.nextLine();
                    String productToAdd = scanner.nextLine();

                    if(inventory.getAllInventory().contains(productToAdd)){
                        System.out.println("\nThe product is already exists");
                        break;
                    }
                    else{
                        inventory.addIntoInventory(productToAdd);
                        System.out.println("\nSuccessfully added");
                        break;
                    }
                case 2:
                    System.out.print("\nPut the name of product - ");
                    scanner.nextLine();
                    String productToDelete = scanner.nextLine();

                    if(inventory.getAllInventory().contains(productToDelete)){
                        inventory.deleteFromInventory(productToDelete);
                        System.out.println("\nSuccessfully deleted");
                        break;
                    }
                    else {
                        System.out.println("\nProduct is not exist");
                        break;
                    }
                case 3:
                    System.out.print("\nPut the name of product - ");
                    scanner.nextLine();
                    String productToCheck = scanner.nextLine();

                    System.out.println("\nResult - " + inventory.checkProductInInventory(productToCheck));
                    break;
                case 4:
                    programIsWorking = false;
                    break;
                default:
                    System.out.println("\nWrong number!");
            }
        }
        }
    }
