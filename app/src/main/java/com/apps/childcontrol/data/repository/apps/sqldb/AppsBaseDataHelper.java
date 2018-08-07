package com.apps.childcontrol.data.repository.apps.sqldb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class AppsBaseDataHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "apps_events";
    public static final int DB_VERSION = 1;

    public static class Application implements BaseColumns {
        public static final String TABLE_NAME = "apps";
        public static final String APP_NAME = "name";
        public static final String APP_TIME_START = "time_start";
        public static final String APP_TIME_END = "time_end";
        public static final String APP_PACKAGE = "app_package";

    }

    static String SCRIPT_CREATE_TBL_EVENT = " CREATE TABLE " +
            Application.TABLE_NAME + " ( " +
            Application._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            Application.APP_NAME + " TEXT, " +
            Application.APP_PACKAGE + " TEXT, " +
            Application.APP_TIME_START + " TEXT, " +
            Application.APP_TIME_END + " TEXT );";

    public AppsBaseDataHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SCRIPT_CREATE_TBL_EVENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE " + Application.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
