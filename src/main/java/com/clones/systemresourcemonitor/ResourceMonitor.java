package com.clones.systemresourcemonitor;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.io.File;

public class ResourceMonitor {
    private static final OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();

    public static double getCpuLoad() {
        return osBean.getSystemLoadAverage();  // Returns CPU load
    }

    public static long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();  // Free RAM in bytes
    }

    public static long getTotalMemory() {
        return Runtime.getRuntime().totalMemory(); // Total RAM allocated in bytes
    }

    public static long getDiskSpace() {
        File root = new File("/");
        return root.getFreeSpace();  // Free disk space in bytes
    }
}
