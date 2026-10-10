package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import android.content.Context;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.encrypt.SensorsDataEncrypt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class DbAdapter {
    private static DbAdapter instance;
    private final DbParams mDbParams;
    private DataOperation mPersistentOperation;
    private DataOperation mTrackEventOperation;

    public static DbAdapter getInstance(Context context, String str, SensorsDataEncrypt sensorsDataEncrypt) {
        if (instance == null) {
            instance = new DbAdapter(context, str, sensorsDataEncrypt);
        }
        return instance;
    }

    public int getSessionIntervalTime() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getSessionTimeUri(), 1);
            if (strArrQueryData != null && strArrQueryData.length > 0) {
                return Integer.parseInt(strArrQueryData[0]);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return 0;
    }

    public boolean isFirstChannelEvent(String str) {
        try {
            return this.mTrackEventOperation.queryDataCount(this.mDbParams.getChannelPersistentUri(), null, "event_name = ? ", new String[]{str}, null) <= 0;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public boolean isFirstProcess() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getFirstProcessUri(), 1);
            return strArrQueryData == null || strArrQueryData.length <= 0 || Integer.parseInt(strArrQueryData[0]) == 1;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return true;
    }

    public boolean isSubProcessFlushing() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getSubProcessUri(), 1);
            return strArrQueryData == null || strArrQueryData.length <= 0 || Integer.parseInt(strArrQueryData[0]) == 1;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return true;
    }

    public void addChannelEvent(String str) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("event_name", str);
            contentValues.put(DbParams.KEY_CHANNEL_RESULT, Boolean.TRUE);
            this.mTrackEventOperation.insertData(this.mDbParams.getChannelPersistentUri(), contentValues);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public int addJSON(JSONObject jSONObject) {
        int iInsertData = this.mTrackEventOperation.insertData(this.mDbParams.getEventUri(), jSONObject);
        return iInsertData == 0 ? this.mTrackEventOperation.queryDataCount(this.mDbParams.getEventUri()) : iInsertData;
    }

    public int cleanupEvents(String str) {
        this.mTrackEventOperation.deleteData(this.mDbParams.getEventUri(), str);
        return this.mTrackEventOperation.queryDataCount(this.mDbParams.getEventUri());
    }

    public void commitActivityCount(int i11) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getActivityStartCountUri(), new JSONObject().put("value", i11));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void commitAppEndData(String str) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getAppEndDataUri(), new JSONObject().put("value", str));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void commitAppEndTime(long j11) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getAppPausedUri(), new JSONObject().put("value", j11));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void commitAppStartTime(long j11) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getAppStartTimeUri(), new JSONObject().put("value", j11));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void commitFirstProcessState(boolean z11) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getFirstProcessUri(), new JSONObject().put("value", z11));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void commitLoginId(String str) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getLoginIdUri(), new JSONObject().put("value", str));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void commitRemoteConfig(String str) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getRemoteConfigUri(), new JSONObject().put("value", str));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void commitSessionIntervalTime(int i11) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getSessionTimeUri(), new JSONObject().put("value", i11));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void commitSubProcessFlushState(boolean z11) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getSubProcessUri(), new JSONObject().put("value", z11));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void deleteAllEvents() {
        this.mTrackEventOperation.deleteData(this.mDbParams.getEventUri(), "DB_DELETE_ALL");
    }

    public String[] generateDataString(String str, int i11) {
        try {
            return this.mTrackEventOperation.queryData(this.mDbParams.getEventUri(), i11);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    public int getActivityCount() {
        String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getActivityStartCountUri(), 1);
        if (strArrQueryData == null || strArrQueryData.length <= 0) {
            return 0;
        }
        return Integer.parseInt(strArrQueryData[0]);
    }

    public String getAppEndData() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getAppEndDataUri(), 1);
            return (strArrQueryData == null || strArrQueryData.length <= 0) ? "" : strArrQueryData[0];
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    public long getAppEndTime() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getAppPausedUri(), 1);
            if (strArrQueryData == null || strArrQueryData.length <= 0) {
                return 0L;
            }
            return Long.parseLong(strArrQueryData[0]);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return 0L;
        }
    }

    public long getAppStartTime() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getAppStartTimeUri(), 1);
            if (strArrQueryData == null || strArrQueryData.length <= 0) {
                return 0L;
            }
            return Long.parseLong(strArrQueryData[0]);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return 0L;
        }
    }

    public String getLoginId() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getLoginIdUri(), 1);
            return (strArrQueryData == null || strArrQueryData.length <= 0) ? "" : strArrQueryData[0];
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    public String getRemoteConfig() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getRemoteConfigUri(), 1);
            return (strArrQueryData == null || strArrQueryData.length <= 0) ? "" : strArrQueryData[0];
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    private DbAdapter(Context context, String str, SensorsDataEncrypt sensorsDataEncrypt) {
        this.mDbParams = DbParams.getInstance(str);
        if (sensorsDataEncrypt != null) {
            this.mTrackEventOperation = new EncryptDataOperation(context.getApplicationContext(), sensorsDataEncrypt);
        } else {
            this.mTrackEventOperation = new EventDataOperation(context.getApplicationContext());
        }
        this.mPersistentOperation = new PersistentDataOperation(context.getApplicationContext());
    }

    public static DbAdapter getInstance() {
        DbAdapter dbAdapter = instance;
        if (dbAdapter != null) {
            return dbAdapter;
        }
        throw new IllegalStateException("The static method getInstance(Context context, String packageName) should be called before calling getInstance()");
    }
}
