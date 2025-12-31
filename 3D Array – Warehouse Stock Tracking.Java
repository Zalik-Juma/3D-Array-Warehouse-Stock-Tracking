/*
*Name:Zalik Barasa Juma
*Reg No: J77-10594-2024m
*Description: Program for 3D Array – Warehouse Stock Tracking
*/
public class WarehouseStock {
    public static void main(String[] args) {
        // Declare and initialize the 3D array
        // Dimensions: [warehouses][sections][products]
        int[][][] stock = {
            { // Warehouse 1
                {50, 30, 20}, // Section 1: Product 1, 2, 3
                {40, 25, 15}  // Section 2: Product 1, 2, 3
            },
            { // Warehouse 2
                {60, 35, 25}, // Section 1: Product 1, 2, 3
                {55, 28, 18}  // Section 2: Product 1, 2, 3
            }
        };
        
        // 1. Print all stock values using 3 nested loops
        System.out.println("WAREHOUSE STOCK INVENTORY");
        System.out.println("=========================");
        
        for (int warehouse = 0; warehouse < stock.length; warehouse++) {
            System.out.println("\nWAREHOUSE " + (warehouse + 1));
            System.out.println("-----------");
            
            for (int section = 0; section < stock[warehouse].length; section++) {
                System.out.println("  Section " + (section + 1) + ":");
                System.out.print("    Products: ");
                
                for (int product = 0; product < stock[warehouse][section].length; product++) {
                    System.out.print("P" + (product + 1) + " = " + 
                                   stock[warehouse][section][product]);
                    if (product < stock[warehouse][section].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
        
        // 2. Calculate and display total stock in Warehouse 2
        System.out.println("\n\nCALCULATING TOTAL STOCK FOR WAREHOUSE 2");
        System.out.println("========================================");
        
        int warehouse2Index = 1; // Warehouse 2 is at index 1
        int totalWarehouse2 = 0;
        
        System.out.println("Warehouse 2 Stock Breakdown:");
        
        for (int section = 0; section < stock[warehouse2Index].length; section++) {
            System.out.print("  Section " + (section + 1) + ": ");
            int sectionTotal = 0;
            
            for (int product = 0; product < stock[warehouse2Index][section].length; product++) {
                System.out.print(stock[warehouse2Index][section][product]);
                sectionTotal += stock[warehouse2Index][section][product];
                totalWarehouse2 += stock[warehouse2Index][section][product];
                
                if (product < stock[warehouse2Index][section].length - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sectionTotal);
        }
        
        System.out.println("\nTotal stock in Warehouse 2: " + totalWarehouse2);
    }
}