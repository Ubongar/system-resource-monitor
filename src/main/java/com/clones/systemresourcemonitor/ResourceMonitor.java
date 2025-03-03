package com.clones.systemresourcemonitor;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.io.File;
import java.text.DecimalFormat;

public class ResourceMonitor {
    private static final OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
    private static final DecimalFormat df = new DecimalFormat("#.##");

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

    // Converts bytes into human-readable format
    public static String formatBytes(long bytes) {
        if (bytes < 1024) return bytes + " B";
        double kb = bytes / 1024.0;
        if (kb < 1024) return df.format(kb) + " KB";
        double mb = kb / 1024.0;
        if (mb < 1024) return df.format(mb) + " MB";
        double gb = mb / 1024.0;
        if (gb < 1024) return df.format(gb) + " GB";
        double tb = gb / 1024.0;
        return df.format(tb) + " TB";
    }
}
