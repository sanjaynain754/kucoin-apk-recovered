package com.sensorsdata.analytics.android.sdk.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class OldBDatabaseHelper extends SQLiteOpenHelper {
    public OldBDatabaseHelper(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
    }

    public JSONArray getAllEvents() {
        JSONArray jSONArray = new JSONArray();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery(String.format("SELECT * FROM %s ORDER BY %s", DbParams.TABLE_EVENTS, DbParams.KEY_CREATED_AT), null);
                while (cursorRawQuery.moveToNext()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(DbParams.KEY_CREATED_AT, cursorRawQuery.getString(cursorRawQuery.getColumnIndex(DbParams.KEY_CREATED_AT)));
                    jSONObject.put("data", cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data")));
                    jSONArray.put(jSONObject);
                }
                close();
                cursorRawQuery.close();
                return jSONArray;
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                close();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return jSONArray;
            }
        } catch (Throwable th2) {
            close();
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
