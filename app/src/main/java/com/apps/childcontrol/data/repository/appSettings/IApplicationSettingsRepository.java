package com.apps.childcontrol.data.repository.appSettings;

import com.apps.childcontrol.data.model.appSettings.IAppSettingsInfo;

public interface IApplicationSettingsRepository {
    IAppSettingsInfo get();

    void set(IAppSettingsInfo settingsInfo);
}
