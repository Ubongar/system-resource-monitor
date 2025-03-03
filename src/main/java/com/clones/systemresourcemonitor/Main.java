package com.clones.systemresourcemonitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("System Resource Monitor");
        System.out.println("------------------------");

        System.out.println("CPU Load: " + ResourceMonitor.getCpuLoad());
        System.out.println("Free Memory: " + ResourceMonitor.getFreeMemory() + " bytes");
        System.out.println("Total Memory: " + ResourceMonitor.getTotalMemory() + " bytes");
        System.out.println("Free Disk Space: " + ResourceMonitor.getDiskSpace() + " bytes");
    }
}
