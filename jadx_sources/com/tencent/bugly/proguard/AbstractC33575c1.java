package com.tencent.bugly.proguard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.c1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33575c1 {

    /* JADX INFO: renamed from: a */
    public int f69317a;

    /* JADX INFO: renamed from: b */
    public String f69318b;

    /* JADX INFO: renamed from: c */
    public String f69319c;

    /* JADX INFO: renamed from: d */
    public String f69320d;

    /* JADX INFO: renamed from: a */
    public abstract void mo72633a(Context context, boolean z11, C33555b2 c33555b2);

    /* JADX INFO: renamed from: a */
    public void m72634a(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX INFO: renamed from: a */
    public abstract String[] mo72637a();

    /* JADX INFO: renamed from: a */
    public void mo72636a(StrategyBean strategyBean) {
    }

    /* JADX INFO: renamed from: a */
    public void m72635a(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        try {
            if (mo72637a() == null) {
                return;
            }
            for (String str : mo72637a()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
            }
            m72634a(sQLiteDatabase);
        } catch (Throwable th2) {
            if (C34012x4.m75435a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72638b(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        try {
            if (mo72637a() != null) {
                for (String str : mo72637a()) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                }
                m72634a(sQLiteDatabase);
            }
        } catch (Throwable th2) {
            if (!C34012x4.m75435a(th2)) {
                th2.printStackTrace();
            }
        }
    }
}
