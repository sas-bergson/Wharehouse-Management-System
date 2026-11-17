package com.onlinewarehouse;

import java.util.Scanner;

/**
 * Phase 1 entry point: the Online Warehouse console application.
 *
 * <p>Students replace the TODO branches with real in-memory logic backed by
 * collections. See {@code docs/phase-1-console/README.md} for the brief.</p>
 */
public class OnlineWarehouseApp {

    public static void main(String[] args) {
        System.out.println("=== Online Warehouse — Phase 1 Console ===");
        try (Scanner in = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                printMenu();
                System.out.print("> ");
                String choice = in.nextLine().trim();
                switch (choice) {
                    case "1" -> System.out.println("[TODO] Receive stock");
                    case "2" -> System.out.println("[TODO] Issue stock");
                    case "3" -> System.out.println("[TODO] List products");
                    case "4" -> System.out.println("[TODO] Low-stock report");
                    case "0" -> running = false;
                    default  -> System.out.println("Unknown option: " + choice);
                }
            }
        }
        System.out.println("Goodbye.");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("1) Receive stock");
        System.out.println("2) Issue stock");
        System.out.println("3) List products");
        System.out.println("4) Low-stock report");
        System.out.println("0) Exit");
    }
}
