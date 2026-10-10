package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
class EventDataOperation extends DataOperation {
    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, JSONObject jSONObject) {
        try {
            if (deleteDataLowMemory(uri) != 0) {
                return -2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", jSONObject.toString() + "\t" + jSONObject.toString().hashCode());
            contentValues.put(DbParams.KEY_CREATED_AT, Long.valueOf(System.currentTimeMillis()));
            this.contentResolver.insert(uri, contentValues);
            return 0;
        } catch (Throwable th2) {
            SALog.m68587d(this.TAG, th2.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, int i11) throws Throwable {
        Throwable th2;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        String string;
        String string2;
        ?? r11 = 0;
        try {
            try {
                cursorQuery = this.contentResolver.query(uri, null, null, null, "created_at ASC LIMIT " + i11);
                if (cursorQuery != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        String str = ",";
                        sb2.append("[");
                        string2 = null;
                        while (cursorQuery.moveToNext()) {
                            if (cursorQuery.isLast()) {
                                str = "]";
                                string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
                            }
                            String str2 = string2;
                            String str3 = str;
                            try {
                                String data = parseData(cursorQuery.getString(cursorQuery.getColumnIndex("data")));
                                if (!TextUtils.isEmpty(data)) {
                                    sb2.append((CharSequence) data, 0, data.length() - 1);
                                    sb2.append(",\"_flush_time\":");
                                    sb2.append(System.currentTimeMillis());
                                    sb2.append("}");
                                    sb2.append(str3);
                                }
                            } catch (Exception e11) {
                                SALog.printStackTrace(e11);
                            }
                            str = str3;
                            string2 = str2;
                        }
                        string = sb2.toString();
                    } catch (SQLiteException e12) {
                        sQLiteException = e12;
                        SALog.m68590i(this.TAG, "Could not pull records for SensorsData out of database events. Waiting to send.", sQLiteException);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        string = null;
                        string2 = null;
                    }
                } else {
                    string = null;
                    string2 = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th3) {
                th2 = th3;
                r11 = uri;
                if (r11 != 0) {
                    throw th2;
                }
                r11.close();
                throw th2;
            }
        } catch (SQLiteException e13) {
            sQLiteException = e13;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (r11 != 0) {
                throw th2;
            }
            r11.close();
            throw th2;
        }
        if (string2 != null) {
            return new String[]{string2, string, "1"};
        }
        return null;
    }

    public EventDataOperation(Context context) {
        super(context);
        this.TAG = "EventDataOperation";
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public void deleteData(Uri uri, String str) {
        super.deleteData(uri, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, ContentValues contentValues) {
        try {
            if (deleteDataLowMemory(uri) != 0) {
                return -2;
            }
            this.contentResolver.insert(uri, contentValues);
            return 0;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return 0;
        }
    }
}
