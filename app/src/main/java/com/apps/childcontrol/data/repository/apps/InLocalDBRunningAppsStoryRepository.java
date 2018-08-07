package com.apps.childcontrol.data.repository.apps;

import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.apps.childcontrol.data.model.appInfo.ApplicationInfo;
import com.apps.childcontrol.data.model.appInfo.IApplicationInfo;
import com.apps.childcontrol.data.repository.apps.sqldb.AppsBaseDataHelper;

import java.util.ArrayList;
import java.util.List;

public class InLocalDBRunningAppsStoryRepository implements IRunningAppsStoryRepository {

    private final PackageManager packageManager;
    private final AppsBaseDataHelper dataHelper;

    private SQLiteDatabase database;

    public InLocalDBRunningAppsStoryRepository(
            PackageManager packageManager,
            AppsBaseDataHelper dataHelper) {

        this.packageManager = packageManager;
        this.dataHelper = dataHelper;
    }

    @Override
    public void add(IApplicationInfo applicationInfo) {
        // TODO: 07.08.2018  
    }

    @Override
    public void repeatLastAppInfo(IApplicationInfo applicationInfo) {
        // TODO: 07.08.2018  
    }

    @Override
    public List<IApplicationInfo> getAll() {
        List<IApplicationInfo> infoArrayList = new ArrayList<>();

        if (database == null || !database.isOpen()) {
            database = dataHelper.getWritableDatabase();
        }
        String query = "SELECT  * FROM " +
                AppsBaseDataHelper.Application.TABLE_NAME;

        Cursor cursor = database.rawQuery(query, null);


        try {
            cursor.moveToFirst();

            while (!cursor.isAfterLast()) {
                IApplicationInfo app =
                        new ApplicationInfo(
                                cursor.getString(cursor.getColumnIndexOrThrow(AppsBaseDataHelper.Application.APP_NAME)),
                                cursor.getString(cursor.getColumnIndexOrThrow(AppsBaseDataHelper.Application.APP_PACKAGE)),
                                cursor.getLong(cursor.getColumnIndexOrThrow(AppsBaseDataHelper.Application.APP_TIME_START)),
                                cursor.getLong(cursor.getColumnIndexOrThrow(AppsBaseDataHelper.Application.APP_TIME_END)));

                infoArrayList.add(app);
                cursor.moveToNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        dataHelper.close();
        cursor.close();

        return infoArrayList;
    }

    @Override
    public void deleteAll() {
        // TODO: 07.08.2018  
    }
}
