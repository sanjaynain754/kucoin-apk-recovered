package com.sensorsdata.analytics.android.sdk.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentAppEndData;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentAppPaused;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentAppStartTime;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFlushDataState;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoginId;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentRemoteSDKConfig;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
class SAProviderHelper {
    private ContentResolver contentResolver;
    private Context mContext;
    private SQLiteOpenHelper mDbHelper;
    private PersistentAppEndData persistentAppEndData;
    private PersistentAppPaused persistentAppPaused;
    private PersistentAppStartTime persistentAppStartTime;
    private PersistentFlushDataState persistentFlushDataState;
    private PersistentLoginId persistentLoginId;
    private PersistentRemoteSDKConfig persistentRemoteSDKConfig;
    private boolean isDbWritable = true;
    private boolean isFirstProcessStarted = true;
    private int startActivityCount = 0;
    private int mSessionTime = 30000;

    /* JADX INFO: loaded from: classes59.dex */
    public interface URI_CODE {
        public static final int ACTIVITY_START_COUNT = 2;
        public static final int APP_END_DATA = 4;
        public static final int APP_PAUSED_TIME = 5;
        public static final int APP_START_TIME = 3;
        public static final int CHANNEL_PERSISTENT = 8;
        public static final int DISABLE_SDK = 11;
        public static final int EVENTS = 1;
        public static final int FIRST_PROCESS_START = 10;
        public static final int FLUSH_DATA = 9;
        public static final int LOGIN_ID = 7;
        public static final int REMOTE_CONFIG = 12;
        public static final int SESSION_INTERVAL_TIME = 6;
    }

    public void insertPersistent(int i11, Uri uri, ContentValues contentValues) {
        try {
            switch (i11) {
                case 2:
                    this.startActivityCount = contentValues.getAsInteger(DbParams.TABLE_ACTIVITY_START_COUNT).intValue();
                    break;
                case 3:
                    this.persistentAppStartTime.commit(contentValues.getAsLong("app_start_time"));
                    break;
                case 4:
                    this.persistentAppEndData.commit(contentValues.getAsString("app_end_data"));
                    break;
                case 5:
                    this.persistentAppPaused.commit(contentValues.getAsLong("app_end_time"));
                    break;
                case 6:
                    this.mSessionTime = contentValues.getAsInteger(DbParams.TABLE_SESSION_INTERVAL_TIME).intValue();
                    this.contentResolver.notifyChange(uri, null);
                    break;
                case 7:
                    this.persistentLoginId.commit(contentValues.getAsString("events_login_id"));
                    this.contentResolver.notifyChange(uri, null);
                    break;
                case 9:
                    this.persistentFlushDataState.commit(contentValues.getAsBoolean("sub_process_flush_data"));
                    break;
                case 10:
                    this.isFirstProcessStarted = contentValues.getAsBoolean(DbParams.TABLE_FIRST_PROCESS_START).booleanValue();
                    break;
                case 12:
                    this.persistentRemoteSDKConfig.commit(contentValues.getAsString(DbParams.TABLE_REMOTE_CONFIG));
                    break;
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public Cursor queryPersistent(int i11) {
        Object objValueOf;
        String str;
        int i12;
        try {
            switch (i11) {
                case 2:
                    objValueOf = Integer.valueOf(this.startActivityCount);
                    str = DbParams.TABLE_ACTIVITY_START_COUNT;
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{str});
                    matrixCursor.addRow(new Object[]{objValueOf});
                    return matrixCursor;
                case 3:
                    objValueOf = this.persistentAppStartTime.get();
                    str = "app_start_time";
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{str});
                    matrixCursor2.addRow(new Object[]{objValueOf});
                    return matrixCursor2;
                case 4:
                    objValueOf = this.persistentAppEndData.get();
                    str = "app_end_data";
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str});
                    matrixCursor3.addRow(new Object[]{objValueOf});
                    return matrixCursor3;
                case 5:
                    objValueOf = this.persistentAppPaused.get();
                    str = "app_end_time";
                    MatrixCursor matrixCursor4 = new MatrixCursor(new String[]{str});
                    matrixCursor4.addRow(new Object[]{objValueOf});
                    return matrixCursor4;
                case 6:
                    objValueOf = Integer.valueOf(this.mSessionTime);
                    str = DbParams.TABLE_SESSION_INTERVAL_TIME;
                    MatrixCursor matrixCursor5 = new MatrixCursor(new String[]{str});
                    matrixCursor5.addRow(new Object[]{objValueOf});
                    return matrixCursor5;
                case 7:
                    objValueOf = this.persistentLoginId.get();
                    str = "events_login_id";
                    MatrixCursor matrixCursor6 = new MatrixCursor(new String[]{str});
                    matrixCursor6.addRow(new Object[]{objValueOf});
                    return matrixCursor6;
                case 8:
                case 11:
                default:
                    objValueOf = null;
                    str = null;
                    MatrixCursor matrixCursor7 = new MatrixCursor(new String[]{str});
                    matrixCursor7.addRow(new Object[]{objValueOf});
                    return matrixCursor7;
                case 9:
                    synchronized (SensorsDataContentProvider.class) {
                        try {
                            if (this.persistentFlushDataState.get().booleanValue()) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                                this.persistentFlushDataState.commit(Boolean.TRUE);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    objValueOf = i12;
                    str = "sub_process_flush_data";
                    MatrixCursor matrixCursor8 = new MatrixCursor(new String[]{str});
                    matrixCursor8.addRow(new Object[]{objValueOf});
                    return matrixCursor8;
                case 10:
                    objValueOf = Integer.valueOf(this.isFirstProcessStarted ? 1 : 0);
                    str = DbParams.TABLE_FIRST_PROCESS_START;
                    MatrixCursor matrixCursor9 = new MatrixCursor(new String[]{str});
                    matrixCursor9.addRow(new Object[]{objValueOf});
                    return matrixCursor9;
                case 12:
                    objValueOf = this.persistentRemoteSDKConfig.get();
                    str = null;
                    MatrixCursor matrixCursor10 = new MatrixCursor(new String[]{str});
                    matrixCursor10.addRow(new Object[]{objValueOf});
                    return matrixCursor10;
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    private boolean isDBExist() {
        return this.mContext.getDatabasePath(DbParams.DATABASE_NAME).exists();
    }

    public void appendUri(UriMatcher uriMatcher, String str) {
        try {
            uriMatcher.addURI(str, DbParams.TABLE_EVENTS, 1);
            uriMatcher.addURI(str, DbParams.TABLE_ACTIVITY_START_COUNT, 2);
            uriMatcher.addURI(str, "app_start_time", 3);
            uriMatcher.addURI(str, "app_end_data", 4);
            uriMatcher.addURI(str, "app_end_time", 5);
            uriMatcher.addURI(str, DbParams.TABLE_SESSION_INTERVAL_TIME, 6);
            uriMatcher.addURI(str, "events_login_id", 7);
            uriMatcher.addURI(str, DbParams.TABLE_CHANNEL_PERSISTENT, 8);
            uriMatcher.addURI(str, "sub_process_flush_data", 9);
            uriMatcher.addURI(str, DbParams.TABLE_FIRST_PROCESS_START, 10);
            uriMatcher.addURI(str, DbParams.TABLE_DATA_DISABLE_SDK, 11);
            uriMatcher.addURI(str, DbParams.TABLE_REMOTE_CONFIG, 12);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public int deleteEvents(String str, String[] strArr) {
        if (!this.isDbWritable) {
            return 0;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                return writableDatabase.delete(DbParams.TABLE_EVENTS, str, strArr);
            }
        } catch (SQLiteException e11) {
            this.isDbWritable = false;
            SALog.printStackTrace(e11);
        }
        return 0;
    }

    public Cursor queryByTable(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        if (!this.isDbWritable) {
            return null;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                return writableDatabase.query(str, strArr, str2, strArr2, null, null, str3);
            }
        } catch (SQLiteException e11) {
            this.isDbWritable = false;
            SALog.printStackTrace(e11);
        }
        return null;
    }

    public SAProviderHelper(Context context, SQLiteOpenHelper sQLiteOpenHelper) {
        try {
            this.mDbHelper = sQLiteOpenHelper;
            this.mContext = context;
            this.contentResolver = context.getContentResolver();
            PersistentLoader.initLoader(context);
            this.persistentAppEndData = (PersistentAppEndData) PersistentLoader.loadPersistent("app_end_data");
            this.persistentAppStartTime = (PersistentAppStartTime) PersistentLoader.loadPersistent("app_start_time");
            this.persistentAppPaused = (PersistentAppPaused) PersistentLoader.loadPersistent("app_end_time");
            this.persistentLoginId = (PersistentLoginId) PersistentLoader.loadPersistent("events_login_id");
            this.persistentFlushDataState = (PersistentFlushDataState) PersistentLoader.loadPersistent("sub_process_flush_data");
            this.persistentRemoteSDKConfig = (PersistentRemoteSDKConfig) PersistentLoader.loadPersistent(PersistentLoader.PersistentName.REMOTE_CONFIG);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SQLiteDatabase getWritableDatabase() {
        try {
            if (!isDBExist()) {
                this.mDbHelper.close();
                this.isDbWritable = true;
            }
            return this.mDbHelper.getWritableDatabase();
        } catch (SQLiteException e11) {
            SALog.printStackTrace(e11);
            this.isDbWritable = false;
            return null;
        }
    }

    public Uri insertChannelPersistent(Uri uri, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && contentValues.containsKey("event_name") && contentValues.containsKey(DbParams.KEY_CHANNEL_RESULT)) {
                return ContentUris.withAppendedId(uri, writableDatabase.insertWithOnConflict(DbParams.TABLE_CHANNEL_PERSISTENT, null, contentValues, 5));
            }
            return uri;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return uri;
        }
    }

    public Uri insertEvent(Uri uri, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && contentValues.containsKey("data") && contentValues.containsKey(DbParams.KEY_CREATED_AT)) {
                return ContentUris.withAppendedId(uri, writableDatabase.insert(DbParams.TABLE_EVENTS, "_id", contentValues));
            }
            return uri;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return uri;
        }
    }

    public void migratingDB(final Context context, final String str) {
        try {
            if (AppInfoUtils.getAppInfoBundle(context).getBoolean("com.sensorsdata.analytics.android.EnableMigratingDB", true)) {
                new Thread(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.data.SAProviderHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (context.getDatabasePath(str).exists()) {
                                OldBDatabaseHelper oldBDatabaseHelper = new OldBDatabaseHelper(context, str);
                                SQLiteDatabase writableDatabase = SAProviderHelper.this.getWritableDatabase();
                                if (writableDatabase != null) {
                                    JSONArray allEvents = oldBDatabaseHelper.getAllEvents();
                                    for (int i11 = 0; i11 < allEvents.length(); i11++) {
                                        JSONObject jSONObject = allEvents.getJSONObject(i11);
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("data", jSONObject.getString("data"));
                                        contentValues.put(DbParams.KEY_CREATED_AT, jSONObject.getString(DbParams.KEY_CREATED_AT));
                                        writableDatabase.insert(DbParams.TABLE_EVENTS, "_id", contentValues);
                                    }
                                }
                            }
                            if (SAProviderHelper.this.isDbWritable) {
                                context.deleteDatabase(str);
                            }
                        } catch (Exception e11) {
                            SALog.printStackTrace(e11);
                        }
                    }
                }).start();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
