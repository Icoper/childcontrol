package com.apps.childcontrol.data.repository.apps;

import com.apps.childcontrol.data.model.IApplicationInfo;

import java.util.List;

public interface IRunningAppsStoryRepository {
    void add(IApplicationInfo applicationInfo);

    void update(IApplicationInfo applicationInfo);

    List<IApplicationInfo> getAll();

    void deleteAll();
}
