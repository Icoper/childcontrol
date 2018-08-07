package com.apps.childcontrol.data.repository.appSettings;

import android.content.SharedPreferences;

import com.apps.childcontrol.data.model.appSettings.AppSettingsInfo;
import com.apps.childcontrol.data.model.appSettings.IAppSettingsInfo;

public class LocalApplicationSettingsRepository implements IApplicationSettingsRepository {
    private final SharedPreferences sharedPreferences;

    private final String APP_PASSCODE = "passcode";
    private final String AUTO_START_PERMISSION_GRANTED = "auto_start";
    private final String READ_HISTORY_PERMISSION_GRANTED = "auto_start";
    private final String SERVICE_RUNNING = "service_running";

    public LocalApplicationSettingsRepository(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    @Override
    public IAppSettingsInfo get() {
        return new AppSettingsInfo(
                sharedPreferences.getString(APP_PASSCODE, ""),
                sharedPreferences.getBoolean(AUTO_START_PERMISSION_GRANTED, false),
                sharedPreferences.getBoolean(READ_HISTORY_PERMISSION_GRANTED, false),
                sharedPreferences.getBoolean(SERVICE_RUNNING, false));
    }

    @Override
    public void set(IAppSettingsInfo settingsInfo) {
        sharedPreferences
                .edit()
                .putString(
                        APP_PASSCODE,
                        settingsInfo.getPasscode())
                .putBoolean(
                        AUTO_START_PERMISSION_GRANTED,
                        settingsInfo.isAutoStartPermGranted())
                .putBoolean(
                        SERVICE_RUNNING,
                        settingsInfo.isServiceRunning())
                .putBoolean(
                        READ_HISTORY_PERMISSION_GRANTED,
                        settingsInfo.isReadHistoryPermGranted())
                .apply();
    }
}
