package com.clones.systemresourcemonitor.monitor;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.io.File;

public class SystemMonitor {

    public static void main(String[] args) {
        getSystemStats();
    }

    public static void getSystemStats() {
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        System.out.println("OS Name: " + osBean.getName());
        System.out.println("CPU Load: " + osBean.getSystemLoadAverage());

        // Get Memory Usage
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Total Memory: " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");

        // Get Disk Space
        File root = new File("/");
        System.out.println("Total Disk Space: " + root.getTotalSpace() / (1024 * 1024 * 1024) + " GB");
        System.out.println("Free Disk Space: " + root.getFreeSpace() / (1024 * 1024 * 1024) + " GB");
    }
}