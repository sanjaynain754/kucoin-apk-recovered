package com.tencent.cloud.tuikit.engine.extension.internal;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public class SQLiteDBHelper extends SQLiteOpenHelper {
    public static final int ERROR_CURSOR_NULL = -5103;
    public static final int ERROR_QUERY_FAILED = -5102;
    public static final int ERROR_SQL_EXECUTION_FAILED = -5101;
    private static final String TAG = "SQLiteDBHelper";
    private final Handler mMainHandler;
    private final long mNativeLiteavSqlite;
    private final Handler mSQLiteDBHandler;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnExecute(long j11, int i11, String str, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnQuery(long j11, int i11, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public String convertCursorToJson(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            for (int i11 = 0; i11 < cursor.getColumnCount(); i11++) {
                try {
                    jSONObject.put(cursor.getColumnName(i11), cursor.getString(i11));
                } catch (JSONException unused) {
                    LiteavLog.m76083e(TAG, "convert cursor to json error");
                }
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExecute(final int i11, final String str, final boolean z11) {
        Handler handler = this.mMainHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.SQLiteDBHelper.3
                @Override // java.lang.Runnable
                public void run() {
                    SQLiteDBHelper.nativeOnExecute(SQLiteDBHelper.this.mNativeLiteavSqlite, i11, str, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onQuery(final int i11, final String str, final String str2) {
        Handler handler = this.mMainHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.SQLiteDBHelper.4
                @Override // java.lang.Runnable
                public void run() {
                    SQLiteDBHelper.nativeOnQuery(SQLiteDBHelper.this.mNativeLiteavSqlite, i11, str, str2);
                }
            });
        }
    }

    private void runOnSQLiteDatabaseThread(Runnable runnable) {
        Handler handler = this.mSQLiteDBHandler;
        if (handler == null) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CalledByNative
    public void destroy() {
        Handler handler = this.mSQLiteDBHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mSQLiteDBHandler.getLooper().quitSafely();
        }
        Handler handler2 = this.mMainHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Exception unused) {
            LiteavLog.m76083e(TAG, "close database error");
        }
    }

    @CalledByNative
    public void execute(final String str) {
        runOnSQLiteDatabaseThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.SQLiteDBHelper.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SQLiteDBHelper.this.getWritableDatabase().execSQL(str);
                    SQLiteDBHelper.this.onExecute(TUICommonDefine.Error.SUCCESS.getValue(), "success", true);
                } catch (SQLException unused) {
                    SQLiteDBHelper.this.onExecute(SQLiteDBHelper.ERROR_SQL_EXECUTION_FAILED, "failed to execute SQL statement", false);
                }
            }
        });
    }

    @CalledByNative
    public void query(final String str) {
        runOnSQLiteDatabaseThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.SQLiteDBHelper.2
            @Override // java.lang.Runnable
            public void run() {
                Cursor cursor = null;
                try {
                    try {
                        try {
                            Cursor cursorRawQuery = SQLiteDBHelper.this.getReadableDatabase().rawQuery(str, null);
                            if (cursorRawQuery == null) {
                                SQLiteDBHelper.this.onQuery(SQLiteDBHelper.ERROR_CURSOR_NULL, "query returned null cursor", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                                if (cursorRawQuery == null) {
                                    return;
                                }
                            } else {
                                SQLiteDBHelper.this.onQuery(TUICommonDefine.Error.SUCCESS.getValue(), "success", SQLiteDBHelper.this.convertCursorToJson(cursorRawQuery));
                            }
                            cursorRawQuery.close();
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                try {
                                    cursor.close();
                                } catch (Exception unused) {
                                    LiteavLog.m76083e(SQLiteDBHelper.TAG, "cursor close error");
                                }
                            }
                            throw th2;
                        }
                    } catch (SQLException unused2) {
                        SQLiteDBHelper.this.onQuery(SQLiteDBHelper.ERROR_QUERY_FAILED, "sql query error", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                        if (0 != 0) {
                            cursor.close();
                        }
                    }
                } catch (Exception unused3) {
                    LiteavLog.m76083e(SQLiteDBHelper.TAG, "cursor close error");
                }
            }
        });
    }

    @CalledByNative
    public SQLiteDBHelper(long j11, String str) {
        super(ContextUtils.getApplicationContext(), str, (SQLiteDatabase.CursorFactory) null, 12);
        this.mNativeLiteavSqlite = j11;
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        this.mSQLiteDBHandler = new Handler(handlerThread.getLooper());
        this.mMainHandler = new Handler(Looper.getMainLooper());
        getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
