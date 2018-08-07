package com.apps.childcontrol.data.model.appSettings;

import java.io.Serializable;

public class AppSettingsInfo implements IAppSettingsInfo, Serializable{
    private String passcode;
    private boolean isAutoStartPermGranted;
    private boolean isReadHistoryPermGranted;
    private boolean isServiceRunning;

    public AppSettingsInfo() {
    }

    public AppSettingsInfo(String passcode,
                           boolean isAutoStartPermGranted,
                           boolean isReadHistoryPermGranted,
                           boolean isServiceRunning) {

        this.passcode = passcode;
        this.isAutoStartPermGranted = isAutoStartPermGranted;
        this.isReadHistoryPermGranted = isReadHistoryPermGranted;
        this.isServiceRunning = isServiceRunning;
    }

@Override
    public String getPasscode() {
        return passcode;
    }

    @Override
    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    @Override
    public boolean isAutoStartPermGranted() {
        return isAutoStartPermGranted;
    }

    @Override
    public void setAutoStartPermGranted(boolean autoStartPermGranted) {
        isAutoStartPermGranted = autoStartPermGranted;
    }

    @Override
    public boolean isServiceRunning() {
        return isServiceRunning;
    }

    @Override
    public void setServiceRunning(boolean serviceRunning) {
        isServiceRunning = serviceRunning;
    }

    @Override
    public boolean isReadHistoryPermGranted() {
        return isReadHistoryPermGranted;
    }

    @Override
    public void setReadHistoryPermGranted(boolean readHistoryPermGranted) {
        isReadHistoryPermGranted = readHistoryPermGranted;
    }
}
