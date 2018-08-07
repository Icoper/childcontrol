package com.apps.childcontrol.data.model;

public class ApplicationInfo implements IApplicationInfo {
    private String appName;
    private String appPackage;
    private long startTime;
    private long endTime;

    public ApplicationInfo(String appName, String appPackage, long startTime, long endTime) {
        this.appName = appName;
        this.appPackage = appPackage;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public String getAppName() {
        return appName;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
