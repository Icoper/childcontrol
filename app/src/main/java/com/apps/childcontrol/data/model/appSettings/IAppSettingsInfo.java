package com.apps.childcontrol.data.model.appSettings;

public interface IAppSettingsInfo {
    String getPasscode();

    void setPasscode(String passcode);

    boolean isAutoStartPermGranted();

    void setAutoStartPermGranted(boolean autoStartPermGranted);

    boolean isServiceRunning();

    void setServiceRunning(boolean serviceRunning);

    void setReadHistoryPermGranted(boolean readHistoryPermGranted);

    boolean isReadHistoryPermGranted();
}
