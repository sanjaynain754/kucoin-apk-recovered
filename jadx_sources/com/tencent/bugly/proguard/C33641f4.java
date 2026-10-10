package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33641f4 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: A */
    public static final String f69813A = "bugly_db";

    /* JADX INFO: renamed from: B */
    public static String f69814B = "bugly_db";

    /* JADX INFO: renamed from: C */
    public static int f69815C = 29;

    /* JADX INFO: renamed from: D */
    public static final int f69816D = 5;

    /* JADX INFO: renamed from: d */
    public static final String f69817d = "t_cr";

    /* JADX INFO: renamed from: e */
    public static final String f69818e = "t_ui";

    /* JADX INFO: renamed from: f */
    public static final String f69819f = "t_lr";

    /* JADX INFO: renamed from: g */
    public static final String f69820g = "t_pf";

    /* JADX INFO: renamed from: h */
    public static final String f69821h = "dl_1002";

    /* JADX INFO: renamed from: i */
    public static final String f69822i = "ge_1002";

    /* JADX INFO: renamed from: j */
    public static final String f69823j = "st_1002";

    /* JADX INFO: renamed from: k */
    public static final String f69824k = "t_sla";

    /* JADX INFO: renamed from: l */
    public static final String f69825l = "t_p_ctx";

    /* JADX INFO: renamed from: m */
    public static final String f69826m = "_id";

    /* JADX INFO: renamed from: n */
    public static final String f69827n = "_tm";

    /* JADX INFO: renamed from: o */
    public static final String f69828o = "_tp";

    /* JADX INFO: renamed from: p */
    public static final String f69829p = "_ut";

    /* JADX INFO: renamed from: q */
    public static final String f69830q = "_dt";

    /* JADX INFO: renamed from: r */
    public static final String f69831r = "_s1";

    /* JADX INFO: renamed from: s */
    public static final String f69832s = "_up";

    /* JADX INFO: renamed from: t */
    public static final String f69833t = "_me";

    /* JADX INFO: renamed from: u */
    public static final String f69834u = "_uc";

    /* JADX INFO: renamed from: v */
    public static final String f69835v = "_pc";

    /* JADX INFO: renamed from: w */
    public static final String f69836w = "_th";

    /* JADX INFO: renamed from: x */
    public static final String f69837x = "_process_launch_id";

    /* JADX INFO: renamed from: y */
    public static final String f69838y = "_key";

    /* JADX INFO: renamed from: z */
    public static final String f69839z = "_value";

    /* JADX INFO: renamed from: b */
    public Context f69840b;

    /* JADX INFO: renamed from: c */
    public List<AbstractC33575c1> f69841c;

    /* JADX INFO: renamed from: a */
    public synchronized boolean m72998a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {f69819f, f69818e, f69820g};
            for (int i11 = 0; i11 < 3; i11++) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + strArr[i11], new String[0]);
            }
        } catch (Throwable th2) {
            if (!C34012x4.m75435a(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
        return true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase;
        readableDatabase = null;
        int i11 = 0;
        while (readableDatabase == null && i11 < 5) {
            i11++;
            try {
                readableDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                C34012x4.m75444f("[Database] Try to get db(count: %d).", Integer.valueOf(i11));
                if (i11 == 5) {
                    C34012x4.m75431a(LogState.ERROR, "[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        writableDatabase = null;
        int i11 = 0;
        while (writableDatabase == null && i11 < 5) {
            i11++;
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                C34012x4.m75444f("[Database] Try to get db(count: %d).", Integer.valueOf(i11));
                if (i11 == 5) {
                    C34012x4.m75431a(LogState.ERROR, "[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }
        if (writableDatabase == null) {
            C34012x4.m75444f("[Database] db error delay error record 1min.", new Object[0]);
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69818e);
                sb2.append(" ( ");
                sb2.append("_id");
                sb2.append(C33627eb.f69716f);
                sb2.append("INTEGER PRIMARY KEY");
                sb2.append(" , ");
                sb2.append(f69827n);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69829p);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69828o);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69830q);
                sb2.append(C33627eb.f69716f);
                sb2.append("blob");
                sb2.append(" , ");
                sb2.append(f69835v);
                sb2.append(C33627eb.f69716f);
                sb2.append("text");
                sb2.append(" ) ");
                C34012x4.m75434a(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69819f);
                sb2.append(" ( ");
                sb2.append("_id");
                sb2.append(C33627eb.f69716f);
                sb2.append("INTEGER PRIMARY KEY");
                sb2.append(" , ");
                sb2.append(f69828o);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69827n);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69835v);
                sb2.append(C33627eb.f69716f);
                sb2.append("text");
                sb2.append(" , ");
                sb2.append(f69836w);
                sb2.append(C33627eb.f69716f);
                sb2.append("text");
                sb2.append(" , ");
                sb2.append(f69830q);
                sb2.append(C33627eb.f69716f);
                sb2.append("blob");
                sb2.append(" ) ");
                C34012x4.m75434a(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69820g);
                sb2.append(" ( ");
                sb2.append("_id");
                sb2.append(C33627eb.f69716f);
                sb2.append(TypedValues.Custom.S_INT);
                sb2.append(" , ");
                sb2.append(f69828o);
                sb2.append(C33627eb.f69716f);
                sb2.append("text");
                sb2.append(" , ");
                sb2.append(f69827n);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69830q);
                sb2.append(C33627eb.f69716f);
                sb2.append("blob");
                sb2.append(",primary key(");
                sb2.append("_id");
                sb2.append(",");
                sb2.append(f69828o);
                sb2.append(" )) ");
                C34012x4.m75434a(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69817d);
                sb2.append(" ( ");
                sb2.append("_id");
                sb2.append(C33627eb.f69716f);
                sb2.append("INTEGER PRIMARY KEY");
                sb2.append(" , ");
                sb2.append(f69827n);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69831r);
                sb2.append(C33627eb.f69716f);
                sb2.append("text");
                sb2.append(" , ");
                sb2.append(f69832s);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69833t);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69834u);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69830q);
                sb2.append(C33627eb.f69716f);
                sb2.append("blob");
                sb2.append(" ) ");
                C34012x4.m75434a(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69821h);
                sb2.append(" (");
                sb2.append("_id");
                sb2.append(" integer primary key autoincrement, ");
                sb2.append("_dUrl");
                sb2.append(" varchar(100), ");
                sb2.append("_sFile");
                sb2.append(" varchar(100), ");
                sb2.append("_sLen");
                sb2.append(" INTEGER, ");
                sb2.append("_tLen");
                sb2.append(" INTEGER, ");
                sb2.append("_MD5");
                sb2.append(" varchar(100), ");
                sb2.append("_DLTIME");
                sb2.append(" INTEGER)");
                C34012x4.m75434a(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append("CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69822i);
                sb2.append(" (");
                sb2.append("_id");
                sb2.append(" integer primary key autoincrement, ");
                sb2.append("_time");
                sb2.append(" INTEGER, ");
                sb2.append("_datas");
                sb2.append(" blob)");
                C34012x4.m75434a(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69823j);
                sb2.append(" ( ");
                sb2.append("_id");
                sb2.append(C33627eb.f69716f);
                sb2.append(TypedValues.Custom.S_INT);
                sb2.append(" , ");
                sb2.append(f69828o);
                sb2.append(C33627eb.f69716f);
                sb2.append("text");
                sb2.append(" , ");
                sb2.append(f69827n);
                sb2.append(C33627eb.f69716f);
                sb2.append("int");
                sb2.append(" , ");
                sb2.append(f69830q);
                sb2.append(C33627eb.f69716f);
                sb2.append("blob");
                sb2.append(",primary key(");
                sb2.append("_id");
                sb2.append(",");
                sb2.append(f69828o);
                sb2.append(" )) ");
                C34012x4.m75434a(sb2.toString(), new Object[0]);
                sQLiteDatabase.execSQL(sb2.toString(), new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69824k);
                sb2.append(" ( ");
                sb2.append("_id");
                sb2.append(" TEXT NOT NULL , ");
                sb2.append(f69827n);
                sb2.append(" INTEGER NOT NULL , ");
                sb2.append(f69830q);
                sb2.append(" TEXT NOT NULL , ");
                sb2.append("PRIMARY KEY(");
                sb2.append("_id");
                sb2.append(")");
                sb2.append(" ) ");
                String string = sb2.toString();
                C34012x4.m75434a(string, new Object[0]);
                sQLiteDatabase.execSQL(string, new String[0]);
                sb2.setLength(0);
                sb2.append(" CREATE TABLE IF NOT EXISTS ");
                sb2.append(f69825l);
                sb2.append(" ( ");
                sb2.append(f69837x);
                sb2.append(" TEXT NOT NULL , ");
                sb2.append(f69838y);
                sb2.append(" TEXT NOT NULL , ");
                sb2.append(f69839z);
                sb2.append(" TEXT , ");
                sb2.append(f69827n);
                sb2.append(" INTEGER NOT NULL , ");
                sb2.append("PRIMARY KEY (");
                sb2.append(f69837x);
                sb2.append(",");
                sb2.append(f69838y);
                sb2.append(")");
                sb2.append(" ) ");
                String string2 = sb2.toString();
                C34012x4.m75434a(string2, new Object[0]);
                sQLiteDatabase.execSQL(string2, new String[0]);
            } catch (Throwable th2) {
                if (!C34012x4.m75435a(th2)) {
                    th2.printStackTrace();
                }
            }
            List<AbstractC33575c1> list = this.f69841c;
            if (list == null) {
                return;
            }
            Iterator<AbstractC33575c1> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().m72634a(sQLiteDatabase);
                } catch (Throwable th3) {
                    if (!C34012x4.m75435a(th3)) {
                        th3.printStackTrace();
                    }
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @TargetApi(11)
    public synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        try {
            if (C33830o4.m74394b() >= 11) {
                C34012x4.m75444f("[Database] Downgrade %d to %d drop tables.", Integer.valueOf(i11), Integer.valueOf(i12));
                List<AbstractC33575c1> list = this.f69841c;
                if (list != null) {
                    Iterator<AbstractC33575c1> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().m72635a(sQLiteDatabase, i11, i12);
                        } catch (Throwable th2) {
                            if (!C34012x4.m75432a(LogState.ERROR, th2)) {
                                th2.printStackTrace();
                            }
                        }
                    }
                }
                if (m72998a(sQLiteDatabase)) {
                    onCreate(sQLiteDatabase);
                } else {
                    C34012x4.m75431a(LogState.WARN, "[Database] Failed to drop, delete db.", new Object[0]);
                    File databasePath = this.f69840b.getDatabasePath(f69814B);
                    if (databasePath != null && databasePath.canWrite()) {
                        databasePath.delete();
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        try {
            C34012x4.m75444f("[Database] Upgrade %d to %d , drop tables!", Integer.valueOf(i11), Integer.valueOf(i12));
            List<AbstractC33575c1> list = this.f69841c;
            if (list != null) {
                Iterator<AbstractC33575c1> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().m72638b(sQLiteDatabase, i11, i12);
                    } catch (Throwable th2) {
                        if (!C34012x4.m75432a(LogState.ERROR, th2)) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
            if (m72998a(sQLiteDatabase)) {
                onCreate(sQLiteDatabase);
            } else {
                C34012x4.m75431a(LogState.WARN, "[Database] Failed to drop, delete db.", new Object[0]);
                File databasePath = this.f69840b.getDatabasePath(f69814B);
                if (databasePath != null && databasePath.canWrite()) {
                    databasePath.delete();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33641f4(Context context, List<AbstractC33575c1> list) {
        super(context, f69814B + "_", (SQLiteDatabase.CursorFactory) null, f69815C);
        Objects.requireNonNull(C33765l2.m73825a(context));
        this.f69840b = context;
        this.f69841c = list;
    }
}
