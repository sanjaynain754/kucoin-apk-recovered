package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
class PersistentDataOperation extends DataOperation {
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    private String[] handleQueryUri(Uri uri) throws Throwable {
        Cursor cursorQuery;
        ?? r11 = 0;
        if (uri == null) {
            return null;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        try {
            try {
                String strSubstring = path.substring(1);
                cursorQuery = this.contentResolver.query(uri, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            switch (strSubstring) {
                                case "activity_started_count":
                                case "sub_process_flush_data":
                                case "first_process_start":
                                    String[] strArr = {String.valueOf(cursorQuery.getInt(0))};
                                    cursorQuery.close();
                                    return strArr;
                                case "app_end_data":
                                case "events_login_id":
                                case "remote_config":
                                    String[] strArr2 = {cursorQuery.getString(0)};
                                    cursorQuery.close();
                                    return strArr2;
                                case "app_end_time":
                                case "session_interval_time":
                                case "app_start_time":
                                    String[] strArr3 = {String.valueOf(cursorQuery.getLong(0))};
                                    cursorQuery.close();
                                    return strArr3;
                                default:
                                    cursorQuery.close();
                                    return null;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        SALog.printStackTrace(e);
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                th = th2;
                r11 = uri;
                if (r11 != 0) {
                    r11.close();
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r11 != 0) {
                r11.close();
            }
            throw th;
        }
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, JSONObject jSONObject) {
        return handleInsertUri(uri, jSONObject);
    }

    private int handleInsertUri(Uri uri, JSONObject jSONObject) {
        if (uri == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                byte b11 = 1;
                String strSubstring = path.substring(1);
                switch (strSubstring.hashCode()) {
                    case -1437430111:
                        b11 = !strSubstring.equals(DbParams.TABLE_ACTIVITY_START_COUNT) ? (byte) -1 : (byte) 0;
                        break;
                    case -1436067305:
                        b11 = !strSubstring.equals("events_login_id") ? (byte) -1 : (byte) 5;
                        break;
                    case -1173524450:
                        b11 = !strSubstring.equals(DbParams.TABLE_SESSION_INTERVAL_TIME) ? (byte) -1 : (byte) 4;
                        break;
                    case -1109940413:
                        b11 = !strSubstring.equals(DbParams.TABLE_FIRST_PROCESS_START) ? (byte) -1 : (byte) 7;
                        break;
                    case 204459355:
                        b11 = !strSubstring.equals(DbParams.TABLE_REMOTE_CONFIG) ? (byte) -1 : (byte) 8;
                        break;
                    case 791585128:
                        b11 = !strSubstring.equals("app_start_time") ? (byte) -1 : (byte) 3;
                        break;
                    case 1521941740:
                        if (!strSubstring.equals("app_end_data")) {
                            b11 = -1;
                        }
                        break;
                    case 1522425871:
                        b11 = !strSubstring.equals("app_end_time") ? (byte) -1 : (byte) 2;
                        break;
                    case 1964784692:
                        b11 = !strSubstring.equals("sub_process_flush_data") ? (byte) -1 : (byte) 6;
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                switch (b11) {
                    case 0:
                        contentValues.put(DbParams.TABLE_ACTIVITY_START_COUNT, Integer.valueOf(jSONObject.optInt("value")));
                        break;
                    case 1:
                        contentValues.put("app_end_data", jSONObject.optString("value"));
                        break;
                    case 2:
                        contentValues.put("app_end_time", Long.valueOf(jSONObject.optLong("value")));
                        break;
                    case 3:
                        contentValues.put("app_start_time", Long.valueOf(jSONObject.optLong("value")));
                        break;
                    case 4:
                        contentValues.put(DbParams.TABLE_SESSION_INTERVAL_TIME, Long.valueOf(jSONObject.optLong("value")));
                        break;
                    case 5:
                        contentValues.put("events_login_id", jSONObject.optString("value"));
                        break;
                    case 6:
                        contentValues.put("sub_process_flush_data", Boolean.valueOf(jSONObject.optBoolean("value")));
                        break;
                    case 7:
                        contentValues.put(DbParams.TABLE_FIRST_PROCESS_START, Boolean.valueOf(jSONObject.optBoolean("value")));
                        break;
                    case 8:
                        contentValues.put(DbParams.TABLE_REMOTE_CONFIG, jSONObject.optString("value"));
                        break;
                    default:
                        return -1;
                }
                try {
                    this.contentResolver.insert(uri, contentValues);
                } catch (Exception e11) {
                    e = e11;
                    SALog.printStackTrace(e);
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        return 0;
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, ContentValues contentValues) {
        this.contentResolver.insert(uri, contentValues);
        return 0;
    }

    public PersistentDataOperation(Context context) {
        super(context);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, int i11) {
        return handleQueryUri(uri);
    }
}
