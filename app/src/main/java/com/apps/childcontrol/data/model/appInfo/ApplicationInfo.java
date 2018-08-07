package com.apps.childcontrol.data.model.appInfo;

public class ApplicationInfo implements IApplicationInfo {
    private String appName;
    private String appPackage;
    private long startTime;
    private long endTime;

    public ApplicationInfo(
            String appName,
            String appPackage,
            long startTime,
            long endTime) {

        this.appName = appName;
        this.appPackage = appPackage;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String getAppName() {
        return appName;
    }

    @Override
    public String getAppPackage() {
        return appPackage;
    }

    @Override
    public long getStartTime() {
        return startTime;
    }

    @Override
    public long getEndTime() {
        return endTime;
    }
}
