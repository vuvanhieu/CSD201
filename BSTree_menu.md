```cpp
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//
//    private static void generatePngFromDot(String dotFile, String pngFile) {
//        try {
//            Process process = Runtime.getRuntime().exec("dot -Tpng " + dotFile + " -o " + pngFile);
//            process.waitFor();
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    
//    
//    public static void main(String args[]) throws Exception {
//        BSTree t = new BSTree();
//
//        int choice;
//        Scanner sca = new Scanner(System.in);
//        System.out.println();
//        System.out.println(" 1. Test f1 (1 mark)");
//        System.out.println(" 2. Test f2 (1 mark)");
//        System.out.println(" 3. Test f3 (1 mark)");
//        System.out.println(" 4. Test f4 (1 mark)");
//        System.out.println(" 5. Delete by Merging"); // New option for delete by merging
//        
//        System.out.print("    Your selection (1 -> 5): ");
//        choice = sca.nextInt();
//        sca.nextLine();
//        switch (choice) {
//            case 1:
//                t.f1();
//                System.out.println("Your output:");
//                Lib.viewFile("f1.txt");
//
//                // Generate a graphical representation of the tree for f1
//                String f1DotFile = "bstree_f1.dot";
//                t.toDotFile(f1DotFile);
//                generatePngFromDot(f1DotFile, "bstree_f1.png");
//
//                break;
//            case 2:
//                t.f2();
//                System.out.println("Your output:");
//                Lib.viewFile("f2.txt");
//
//                // Generate a graphical representation of the tree for f2
//                String f2DotFile = "bstree_f2.dot";
//                t.toDotFile(f2DotFile);
//                generatePngFromDot(f2DotFile, "bstree_f2.png");
//
//                break;
//            case 3:
//                t.f3();
//                System.out.println("Your output:");
//                Lib.viewFile("f3.txt");
//                break;
//            case 4:
//                t.f4();
//                System.out.println("Your output:");
//                Lib.viewFile("f4.txt");
//
//                // Generate a graphical representation of the tree for f4
//                String f4DotFile = "bstree_f4.dot";
//                t.toDotFile(f4DotFile);
//                generatePngFromDot(f4DotFile, "bstree_f4.png");
//
//                break;
//                
//            case 5:
//                // Delete by Merging
//                System.out.print("Enter the price of the node to delete: ");
//                int priceToDelete = sca.nextInt();
//                t.deleteByMerging(priceToDelete);
//                System.out.println("Node with price " + priceToDelete + " deleted.");
//                
//                // Generate a graphical representation of the updated tree
//                String updatedDotFile = "bstree_updated.dot";
//                t.toDotFile(updatedDotFile);
//                generatePngFromDot(updatedDotFile, "bstree_updated.png");
//                System.out.println("Updated BSTree:");
//                break;
//                
//            default:
//                System.out.println("Wrong selection");
//        }
//        System.out.println();
//    }
//
//}


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static void generatePngFromDot(String dotFile, String pngFile) {
        try {
            Process process = Runtime.getRuntime().exec("dot -Tpng " + dotFile + " -o " + pngFile);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) throws Exception {
        BSTree t = new BSTree();
        boolean exit = false; // Flag to control loop
        
        while (!exit) { // Loop until the user chooses to exit
            int choice;
            Scanner sca = new Scanner(System.in);
            System.out.println();
            System.out.println(" 1. Test f1 (1 mark)");
            System.out.println(" 2. Test f2 (1 mark)");
            System.out.println(" 3. Test f3 (1 mark)");
            System.out.println(" 4. Test f4 (1 mark)");
            System.out.println(" 5. Delete by Merging"); // New option for delete by merging
            System.out.println(" 6. Delete by Copying");
            System.out.println(" 7. Search by xPrice");
            System.out.println(" 8. Exit"); // Option to exit
            System.out.print("    Your selection (1 -> 8): ");
            choice = sca.nextInt();
            sca.nextLine();
            
            switch (choice) {
                case 1:
                    t.f1();
                    System.out.println("Your output:");
                    Lib.viewFile("f1.txt");
                    // Generate a graphical representation of the tree for f1
                    String f1DotFile = "bstree_f1.dot";
                    t.toDotFile(f1DotFile);
                    generatePngFromDot(f1DotFile, "bstree_f1.png");
                    break;
                case 2:
                    t.f2();
                    System.out.println("Your output:");
                    Lib.viewFile("f2.txt");
                    // Generate a graphical representation of the tree for f2
                    String f2DotFile = "bstree_f2.dot";
                    t.toDotFile(f2DotFile);
                    generatePngFromDot(f2DotFile, "bstree_f2.png");
                    break;
                case 3:
                    t.f3();
                    System.out.println("Your output:");
                    Lib.viewFile("f3.txt");
                    break;
                case 4:
                    t.f4();
                    System.out.println("Your output:");
                    Lib.viewFile("f4.txt");
                    // Generate a graphical representation of the tree for f4
                    String f4DotFile = "bstree_f4.dot";
                    t.toDotFile(f4DotFile);
                    generatePngFromDot(f4DotFile, "bstree_f4.png");
                    break;
                case 5:
                    // Delete by Merging
                    System.out.print("Enter the price of the node to delete: ");
                    int priceToDelete = sca.nextInt();
                    t.deleteByMerging(priceToDelete);
                    System.out.println("Node with price " + priceToDelete + " deleted.");
                    // Generate a graphical representation of the updated tree
                    String updatedDotFile = "bstree_updated.dot";
                    t.toDotFile(updatedDotFile);
                    generatePngFromDot(updatedDotFile, "bstree_updated.png");
                    System.out.println("Updated BSTree:");
                    break;
                    
                case 6:
                        // Delete by Copying
                        System.out.print("Enter the price of the node to delete by copying: ");
                        int priceToDeleteCopy = sca.nextInt();
                        t.deleteByCopying(priceToDeleteCopy);
                        System.out.println("Node with price " + priceToDeleteCopy + " deleted by copying.");

                        // Generate a graphical representation of the updated tree
                        String updatedDotFileCopy = "bstree_updated_copy.dot";
                        t.toDotFile(updatedDotFileCopy);
                        generatePngFromDot(updatedDotFileCopy, "bstree_updated_copy.png");
                        System.out.println("Updated BSTree (deleted by copying):");
                        break;
                case 7:
                    // Search
                    System.out.print("Enter the price to search for: ");
                    int priceToSearch = sca.nextInt();
                    Node foundNode = t.search(priceToSearch);
                    if (foundNode != null) {
                        System.out.println("Node with price " + priceToSearch + " found: Owner = " + foundNode.info.owner);
                    } else {
                        System.out.println("Node with price " + priceToSearch + " not found.");
                    }
                    break;
                    
                case 8:
                    exit = true; // Set the exit flag to true to exit the loop
                    break;
                default:
                    System.out.println("Wrong selection");
            }
        }
        System.out.println("Exiting the program.");
    }
}
```
