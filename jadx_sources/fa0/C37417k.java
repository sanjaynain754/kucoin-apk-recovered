package fa0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: fa0.k */
/* JADX INFO: compiled from: ReactDatabaseSupplier.java */
/* JADX INFO: loaded from: classes59.dex */
public class C37417k extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: e */
    public static C37417k f83003e;

    /* JADX INFO: renamed from: b */
    public Context f83004b;

    /* JADX INFO: renamed from: c */
    public SQLiteDatabase f83005c;

    /* JADX INFO: renamed from: d */
    public long f83006d;

    public C37417k(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f83006d = C37416j.f83002a.longValue() * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        this.f83004b = context;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84164a() {
        m84168i().delete("catalystLocalStorage", null, null);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84165b() {
        SQLiteDatabase sQLiteDatabase = this.f83005c;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f83005c.close();
            this.f83005c = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m84166g() {
        m84165b();
        return this.f83004b.deleteDatabase("RKStorage");
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m84167h() {
        SQLiteDatabase sQLiteDatabase = this.f83005c;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e11 = null;
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 > 0) {
                try {
                    m84166g();
                } catch (SQLiteException e12) {
                    e11 = e12;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f83005c = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f83005c;
        if (sQLiteDatabase2 == null) {
            throw e11;
        }
        sQLiteDatabase2.setMaximumSize(this.f83006d);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public synchronized SQLiteDatabase m84168i() {
        m84167h();
        return this.f83005c;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m84169k(long j11) {
        this.f83006d = j11;
        SQLiteDatabase sQLiteDatabase = this.f83005c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.setMaximumSize(j11);
        }
    }

    /* JADX INFO: renamed from: j */
    public static C37417k m84163j(Context context) {
        if (f83003e == null) {
            f83003e = new C37417k(context.getApplicationContext());
        }
        return f83003e;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i11 != i12) {
            m84166g();
            onCreate(sQLiteDatabase);
        }
    }
}
