package com.clones.systemresourcemonitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("System Resource Monitor");
        System.out.println("------------------------");

        System.out.println("CPU Load: " + ResourceMonitor.getCpuLoad());
        System.out.println("Free Memory: " + ResourceMonitor.formatBytes(ResourceMonitor.getFreeMemory()));
        System.out.println("Total Memory: " + ResourceMonitor.formatBytes(ResourceMonitor.getTotalMemory()));
        System.out.println("Free Disk Space: " + ResourceMonitor.formatBytes(ResourceMonitor.getDiskSpace()));
    }
}
