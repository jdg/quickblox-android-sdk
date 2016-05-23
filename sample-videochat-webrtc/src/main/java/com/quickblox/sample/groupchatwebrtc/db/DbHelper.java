package com.quickblox.sample.groupchatwebrtc.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.quickblox.sample.groupchatwebrtc.utils.Consts;

/**
 * Created by tereha on 17.05.16.
 */
public class DbHelper extends SQLiteOpenHelper {

    private String TAG = DbHelper.class.getSimpleName();
    private static final String DB_NAME = "groupchatwebrtcDB";

    public DbHelper(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "--- onCreate database ---");
        db.execSQL("create table " + Consts.DB_TABLE_NAME + " ("
                + Consts.DB_COLUMN_ID + " integer primary key autoincrement,"
                + Consts.DB_COLUMN_USER_ID + " integer,"
                + Consts.DB_COLUMN_USER_LOGIN + " text,"
                + Consts.DB_COLUMN_USER_PASSWORD + " text,"
                + Consts.DB_COLUMN_USER_FULL_NAME + " text,"
                + Consts.DB_COLUMN_USER_TAG + " text"
                + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}