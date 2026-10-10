package com.tencent.qcloud.tim.push.components;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.imsdk.offlinepush.OfflinePushEventItem;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tim.push.utils.TIMPushUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public class StatisticDataStorage extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d */
    public static final String f74874d = "StatisticDataStorage";

    /* JADX INFO: renamed from: e */
    public static String f74875e = "timpushreport.db";

    /* JADX INFO: renamed from: f */
    public static String f74876f = "timreport";

    /* JADX INFO: renamed from: g */
    public static int f74877g = 1;

    /* JADX INFO: renamed from: h */
    public static final String f74878h = "id";

    /* JADX INFO: renamed from: i */
    public static final String f74879i = "type";

    /* JADX INFO: renamed from: j */
    public static final String f74880j = "time";

    /* JADX INFO: renamed from: k */
    public static final String f74881k = "status";

    /* JADX INFO: renamed from: l */
    public static final String f74882l = "data";

    /* JADX INFO: renamed from: m */
    public static String f74883m = "create table timreport (id integer primary key autoincrement, type integer, time integer, status integer, data text)";

    /* JADX INFO: renamed from: n */
    public static final int f74884n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f74885o = 2;

    /* JADX INFO: renamed from: a */
    public HandlerThread f74886a;

    /* JADX INFO: renamed from: b */
    public Handler f74887b;

    /* JADX INFO: renamed from: c */
    public Handler f74888c;

    public StatisticDataStorage(Context context) {
        super(context, f74875e, (SQLiteDatabase.CursorFactory) null, f74877g);
        HandlerThread handlerThread = new HandlerThread("statistic_data_storage");
        this.f74886a = handlerThread;
        handlerThread.start();
        this.f74888c = new Handler(this.f74886a.getLooper());
        this.f74887b = new Handler(Looper.getMainLooper());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f74883m);
    }

    /* JADX INFO: renamed from: a */
    public void m76839a(final TIMPushCallback tIMPushCallback) {
        this.f74888c.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                final ArrayList arrayList = new ArrayList();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase readableDatabase = StatisticDataStorage.this.getReadableDatabase();
                        try {
                            Cursor cursorQuery = readableDatabase.query(StatisticDataStorage.f74876f, new String[]{"id", "type", "time", "status", "data"}, "status = ?", new String[]{"0"}, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                int i11 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("id"));
                                int i12 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("type"));
                                int i13 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("time"));
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("data"));
                                int i14 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status"));
                                OfflinePushEventItem offlinePushEventItem = new OfflinePushEventItem();
                                offlinePushEventItem.setId(i11);
                                offlinePushEventItem.setEventType(i12);
                                offlinePushEventItem.setEventTime(i13);
                                offlinePushEventItem.setPushId(string);
                                offlinePushEventItem.setStatus(i14);
                                arrayList.add(offlinePushEventItem);
                            }
                            cursorQuery.close();
                            StatisticDataStorage.this.m76838a(readableDatabase);
                            StatisticDataStorage.this.f74887b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TIMPushLog.m77016d(StatisticDataStorage.f74874d, "report size:" + arrayList.size());
                                    TIMPushUtils.m77026a(tIMPushCallback, arrayList);
                                }
                            });
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteDatabase = readableDatabase;
                            TIMPushLog.m77017e(StatisticDataStorage.f74874d, "query exception = " + e);
                            StatisticDataStorage.this.m76838a(sQLiteDatabase);
                            StatisticDataStorage.this.f74887b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TIMPushLog.m77016d(StatisticDataStorage.f74874d, "report size:" + arrayList.size());
                                    TIMPushUtils.m77026a(tIMPushCallback, arrayList);
                                }
                            });
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteDatabase = readableDatabase;
                            StatisticDataStorage.this.m76838a(sQLiteDatabase);
                            StatisticDataStorage.this.f74887b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TIMPushLog.m77016d(StatisticDataStorage.f74874d, "report size:" + arrayList.size());
                                    TIMPushUtils.m77026a(tIMPushCallback, arrayList);
                                }
                            });
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m76841a(List<OfflinePushEventItem> list, final TIMPushCallback tIMPushCallback) {
        if (list != null && !list.isEmpty()) {
            final ArrayList arrayList = new ArrayList(list);
            this.f74888c.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.2
                /* JADX WARN: Code duplicated, block: B:25:0x00af  */
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    SQLiteDatabase writableDatabase;
                    Throwable th2;
                    SQLException e11;
                    try {
                        writableDatabase = StatisticDataStorage.this.getWritableDatabase();
                        try {
                            try {
                                writableDatabase.beginTransaction();
                                for (OfflinePushEventItem offlinePushEventItem : arrayList) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("type", Integer.valueOf(offlinePushEventItem.getEventType()));
                                    contentValues.put("time", Long.valueOf(offlinePushEventItem.getEventTime()));
                                    contentValues.put("data", offlinePushEventItem.getPushId());
                                    contentValues.put("status", Integer.valueOf(offlinePushEventItem.getStatus()));
                                    writableDatabase.insert(StatisticDataStorage.f74876f, null, contentValues);
                                }
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                StatisticDataStorage.this.m76838a(writableDatabase);
                                StatisticDataStorage.this.f74887b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.2.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        TIMPushUtils.m77026a(tIMPushCallback, null);
                                    }
                                });
                            } catch (SQLException e12) {
                                e11 = e12;
                                TIMPushLog.m77017e(StatisticDataStorage.f74874d, "insert exception = " + e11);
                                if (writableDatabase != null) {
                                    writableDatabase.endTransaction();
                                }
                                StatisticDataStorage.this.m76838a(writableDatabase);
                                StatisticDataStorage.this.f74887b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.2.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        TIMPushUtils.m77026a(tIMPushCallback, null);
                                    }
                                });
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (writableDatabase != null) {
                                writableDatabase.endTransaction();
                            }
                            StatisticDataStorage.this.m76838a(writableDatabase);
                            StatisticDataStorage.this.f74887b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TIMPushUtils.m77026a(tIMPushCallback, null);
                                }
                            });
                            throw th2;
                        }
                    } catch (SQLException e13) {
                        writableDatabase = null;
                        e11 = e13;
                    } catch (Throwable th4) {
                        writableDatabase = null;
                        th2 = th4;
                        if (writableDatabase != null) {
                            writableDatabase.endTransaction();
                        }
                        StatisticDataStorage.this.m76838a(writableDatabase);
                        StatisticDataStorage.this.f74887b.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TIMPushUtils.m77026a(tIMPushCallback, null);
                            }
                        });
                        throw th2;
                    }
                }
            });
        } else {
            TIMPushLog.m77017e(f74874d, "insert param is null");
            TIMPushUtils.m77026a(tIMPushCallback, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76840a(List<OfflinePushEventItem> list, final int i11) {
        if (list != null && !list.isEmpty()) {
            final ArrayList arrayList = new ArrayList(list);
            this.f74888c.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.StatisticDataStorage.3
                @Override // java.lang.Runnable
                public void run() {
                    SQLiteDatabase readableDatabase = null;
                    try {
                        try {
                            readableDatabase = StatisticDataStorage.this.getReadableDatabase();
                            readableDatabase.beginTransaction();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("status", (Integer) 1);
                            if (i11 == 2) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    readableDatabase.update(StatisticDataStorage.f74876f, contentValues, "data = ?", new String[]{((OfflinePushEventItem) it.next()).getPushId()});
                                }
                            } else {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    readableDatabase.update(StatisticDataStorage.f74876f, contentValues, "id = ?", new String[]{String.valueOf(((OfflinePushEventItem) it2.next()).getId())});
                                }
                            }
                            readableDatabase.setTransactionSuccessful();
                            readableDatabase.endTransaction();
                            StatisticDataStorage.this.m76838a(readableDatabase);
                        } catch (SQLException e11) {
                            TIMPushLog.m77017e(StatisticDataStorage.f74874d, "update exception = " + e11);
                            if (readableDatabase != null) {
                                readableDatabase.endTransaction();
                            }
                            StatisticDataStorage.this.m76838a(readableDatabase);
                        }
                    } catch (Throwable th2) {
                        if (readableDatabase != null) {
                            readableDatabase.endTransaction();
                        }
                        StatisticDataStorage.this.m76838a(readableDatabase);
                        throw th2;
                    }
                }
            });
        } else {
            TIMPushLog.m77017e(f74874d, "update param is null");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76838a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            } catch (Exception e11) {
                TIMPushLog.m77017e(f74874d, "close exception = " + e11);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
