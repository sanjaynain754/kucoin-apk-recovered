package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
abstract class DataOperation {
    String TAG = "EventDataOperation";
    ContentResolver contentResolver;
    private Context mContext;
    private final File mDatabaseFile;

    public abstract int insertData(Uri uri, ContentValues contentValues);

    public abstract int insertData(Uri uri, JSONObject jSONObject);

    public abstract String[] queryData(Uri uri, int i11);

    public int queryDataCount(Uri uri) {
        return queryDataCount(uri, null, null, null, null);
    }

    private boolean belowMemThreshold() {
        return this.mDatabaseFile.exists() && this.mDatabaseFile.length() >= getMaxCacheSize(this.mContext);
    }

    public void deleteData(Uri uri, String str) {
        try {
            if ("DB_DELETE_ALL".equals(str)) {
                this.contentResolver.delete(uri, null, null);
            } else {
                this.contentResolver.delete(uri, "_id <= ?", new String[]{str});
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public String parseData(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int iLastIndexOf = str.lastIndexOf("\t");
            if (iLastIndexOf <= -1) {
                return str;
            }
            String strReplaceFirst = str.substring(iLastIndexOf).replaceFirst("\t", "");
            str = str.substring(0, iLastIndexOf);
            return (TextUtils.isEmpty(str) || TextUtils.isEmpty(strReplaceFirst) || !strReplaceFirst.equals(String.valueOf(str.hashCode()))) ? "" : str;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return str;
        }
    }

    public int queryDataCount(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.contentResolver.query(uri, strArr, str, strArr2, str2);
                if (cursorQuery != null) {
                    int count = cursorQuery.getCount();
                    cursorQuery.close();
                    return count;
                }
                if (cursorQuery == null) {
                    return 0;
                }
                cursorQuery.close();
                return 0;
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                if (cursorQuery == null) {
                    return 0;
                }
            }
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    public DataOperation(Context context) {
        this.mContext = context;
        this.contentResolver = context.getContentResolver();
        this.mDatabaseFile = context.getDatabasePath(DbParams.DATABASE_NAME);
    }

    private long getMaxCacheSize(Context context) {
        try {
            return SensorsDataAPI.sharedInstance(context).getMaxCacheSize();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return 33554432L;
        }
    }

    public int deleteDataLowMemory(Uri uri) {
        if (belowMemThreshold()) {
            SALog.m68589i(this.TAG, "There is not enough space left on the device to store events, so will delete 100 oldest events");
            String[] strArrQueryData = queryData(uri, 100);
            if (strArrQueryData == null) {
                return -2;
            }
            deleteData(uri, strArrQueryData[0]);
            if (queryDataCount(uri) <= 0) {
                return -2;
            }
        }
        return 0;
    }
}
