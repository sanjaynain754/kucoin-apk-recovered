package yb0;

import ac0.C0233c;
import ac0.C0234d;
import ac0.C0237g;
import ac0.C0238h;
import ac0.InterfaceC0235e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.sqlite.CursorWrapper;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yb0.k */
/* JADX INFO: compiled from: Database.java */
/* JADX INFO: loaded from: classes23.dex */
public class C46443k {

    /* JADX INFO: renamed from: n */
    public static Boolean f104143n;

    /* JADX INFO: renamed from: a */
    public final boolean f104144a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final String f104145b;

    /* JADX INFO: renamed from: c */
    public final int f104146c;

    /* JADX INFO: renamed from: d */
    public final int f104147d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Context f104148e;

    /* JADX INFO: renamed from: h */
    public InterfaceC46448p f104151h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public SQLiteDatabase f104152i;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Integer f104155l;

    /* JADX INFO: renamed from: f */
    public final List<C0237g> f104149f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final Map<Integer, C46453u> f104150g = new HashMap();

    /* JADX INFO: renamed from: j */
    public int f104153j = 0;

    /* JADX INFO: renamed from: k */
    public int f104154k = 0;

    /* JADX INFO: renamed from: m */
    public int f104156m = 0;

    /* JADX INFO: renamed from: yb0.k$a */
    /* JADX INFO: compiled from: Database.java */
    /* JADX INFO: loaded from: classes59.dex */
    public class a implements DatabaseErrorHandler {
        public a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    /* JADX INFO: renamed from: F */
    public synchronized boolean m102458F() {
        return this.f104153j > 0;
    }

    /* JADX INFO: renamed from: n */
    public final Map<String, Object> m102470n(Cursor cursor, @Nullable Integer num) {
        HashMap map = null;
        int columnCount = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (map == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap map2 = new HashMap();
                columnCount = cursor.getColumnCount();
                map2.put("columns", Arrays.asList(cursor.getColumnNames()));
                map2.put("rows", arrayList2);
                arrayList = arrayList2;
                map = map2;
            }
            arrayList.add(C46438f0.m102437a(cursor, columnCount));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m102476u(Boolean bool) {
        try {
            if (Boolean.TRUE.equals(bool)) {
                this.f104153j++;
            } else if (Boolean.FALSE.equals(bool)) {
                this.f104153j--;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: j */
    public static boolean m102449j(Context context) {
        return m102448i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    /* JADX INFO: renamed from: o */
    public static void m102450o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m102451x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public String m102453A() {
        return "[" + m102454B() + "] ";
    }

    /* JADX INFO: renamed from: C */
    public SQLiteDatabase m102455C() {
        return this.f104152i;
    }

    /* JADX INFO: renamed from: D */
    public void m102456D(Exception exc, InterfaceC0235e interfaceC0235e) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            interfaceC0235e.error("sqlite_error", "open_failed " + this.f104145b, null);
            return;
        }
        if (exc instanceof SQLException) {
            interfaceC0235e.error("sqlite_error", exc.getMessage(), C0238h.m871a(interfaceC0235e));
        } else {
            interfaceC0235e.error("sqlite_error", exc.getMessage(), C0238h.m871a(interfaceC0235e));
        }
    }

    /* JADX INFO: renamed from: E */
    public void m102457E(final InterfaceC0235e interfaceC0235e) {
        m102465M(interfaceC0235e, new Runnable() { // from class: yb0.g
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f104137b.m102472q(interfaceC0235e);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m102459G() {
        if (f104143n == null) {
            Boolean boolValueOf = Boolean.valueOf(m102449j(this.f104148e));
            f104143n = boolValueOf;
            if (boolValueOf.booleanValue() && C46451s.m102502c(this.f104147d)) {
                Log.d("Sqflite", m102453A() + "[sqflite] WAL enabled");
            }
        }
        this.f104152i = SQLiteDatabase.openDatabase(this.f104145b, null, f104143n.booleanValue() ? 805306368 : 268435456);
    }

    /* JADX INFO: renamed from: H */
    public void m102460H() {
        this.f104152i = SQLiteDatabase.openDatabase(this.f104145b, null, 1, new a());
    }

    /* JADX INFO: renamed from: I */
    public void m102461I(@NonNull final InterfaceC0235e interfaceC0235e) {
        m102465M(interfaceC0235e, new Runnable() { // from class: yb0.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f104131b.m102473r(interfaceC0235e);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m102462J(@NonNull final InterfaceC0235e interfaceC0235e) {
        m102465M(interfaceC0235e, new Runnable() { // from class: yb0.d
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f104110b.m102474s(interfaceC0235e);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m102463K() {
        while (!this.f104149f.isEmpty() && this.f104155l == null) {
            this.f104149f.get(0).m870a();
            this.f104149f.remove(0);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m102464L(@NonNull final InterfaceC0235e interfaceC0235e) {
        m102465M(interfaceC0235e, new Runnable() { // from class: yb0.f
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f104135b.m102475t(interfaceC0235e);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public void m102466h(MethodCall methodCall, MethodChannel.Result result) {
        C0234d c0234d = new C0234d(methodCall, result);
        boolean zMo857f = c0234d.mo857f();
        boolean zM860i = c0234d.m860i();
        List list = (List) c0234d.mo863a("operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0233c c0233c = new C0233c((Map) it.next(), zMo857f);
            String method = c0233c.getMethod();
            method.getClass();
            switch (method) {
                case "execute":
                    if (!m102471p(c0233c)) {
                        if (!zM860i) {
                            c0233c.m867o(result);
                            return;
                        }
                        c0233c.m868p(arrayList);
                        break;
                    } else {
                        c0233c.m869q(arrayList);
                        break;
                    }
                    break;
                case "insert":
                    if (!m102472q(c0233c)) {
                        if (!zM860i) {
                            c0233c.m867o(result);
                            return;
                        }
                        c0233c.m868p(arrayList);
                        break;
                    } else {
                        c0233c.m869q(arrayList);
                        break;
                    }
                    break;
                case "update":
                    if (!m102475t(c0233c)) {
                        if (!zM860i) {
                            c0233c.m867o(result);
                            return;
                        }
                        c0233c.m868p(arrayList);
                        break;
                    } else {
                        c0233c.m869q(arrayList);
                        break;
                    }
                    break;
                case "query":
                    if (!m102473r(c0233c)) {
                        if (!zM860i) {
                            c0233c.m867o(result);
                            return;
                        }
                        c0233c.m868p(arrayList);
                        break;
                    } else {
                        c0233c.m869q(arrayList);
                        break;
                    }
                    break;
                default:
                    result.error("bad_param", "Batch method '" + method + "' not supported", null);
                    return;
            }
        }
        if (zMo857f) {
            result.success(null);
        } else {
            result.success(arrayList);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m102467k() {
        if (!this.f104150g.isEmpty() && C46451s.m102501b(this.f104147d)) {
            Log.d("Sqflite", m102453A() + this.f104150g.size() + " cursor(s) are left opened");
        }
        this.f104152i.close();
    }

    /* JADX INFO: renamed from: l */
    public final void m102468l(int i11) {
        C46453u c46453u = this.f104150g.get(Integer.valueOf(i11));
        if (c46453u != null) {
            m102469m(c46453u);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m102469m(@NonNull C46453u c46453u) {
        try {
            int i11 = c46453u.f104183a;
            if (C46451s.m102502c(this.f104147d)) {
                Log.d("Sqflite", m102453A() + "closing cursor " + i11);
            }
            this.f104150g.remove(Integer.valueOf(i11));
            c46453u.f104185c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m102473r(@NonNull InterfaceC0235e interfaceC0235e) throws Throwable {
        Cursor cursorRawQueryWithFactory;
        Integer num = (Integer) interfaceC0235e.mo863a("cursorPageSize");
        final C46436e0 c46436e0Mo854c = interfaceC0235e.mo854c();
        if (C46451s.m102501b(this.f104147d)) {
            Log.d("Sqflite", m102453A() + c46436e0Mo854c);
        }
        C46453u c46453u = null;
        try {
            cursorRawQueryWithFactory = m102479z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: yb0.i
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return C46443k.m102446f(c46436e0Mo854c, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, c46436e0Mo854c.m102434c(), C46427a.f104100a, null);
            try {
                try {
                    Map<String, Object> mapM102470n = m102470n(cursorRawQueryWithFactory, num);
                    if (num != null && !cursorRawQueryWithFactory.isLast() && !cursorRawQueryWithFactory.isAfterLast()) {
                        int i11 = this.f104156m + 1;
                        this.f104156m = i11;
                        mapM102470n.put("cursorId", Integer.valueOf(i11));
                        C46453u c46453u2 = new C46453u(i11, num.intValue(), cursorRawQueryWithFactory);
                        try {
                            this.f104150g.put(Integer.valueOf(i11), c46453u2);
                            c46453u = c46453u2;
                        } catch (Exception e11) {
                            e = e11;
                            c46453u = c46453u2;
                            m102456D(e, interfaceC0235e);
                            if (c46453u != null) {
                                m102469m(c46453u);
                            }
                            if (c46453u != null || cursorRawQueryWithFactory == null) {
                                return false;
                            }
                            cursorRawQueryWithFactory.close();
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            c46453u = c46453u2;
                            if (c46453u == null && cursorRawQueryWithFactory != null) {
                                cursorRawQueryWithFactory.close();
                            }
                            throw th;
                        }
                    }
                    interfaceC0235e.success(mapM102470n);
                    if (c46453u == null && cursorRawQueryWithFactory != null) {
                        cursorRawQueryWithFactory.close();
                    }
                    return true;
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e13) {
            e = e13;
            cursorRawQueryWithFactory = null;
        } catch (Throwable th4) {
            th = th4;
            cursorRawQueryWithFactory = null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m102474s(@NonNull InterfaceC0235e interfaceC0235e) throws Throwable {
        boolean z11;
        Integer num = (Integer) interfaceC0235e.mo863a("cursorId");
        int iIntValue = num.intValue();
        boolean zEquals = Boolean.TRUE.equals(interfaceC0235e.mo863a("cancel"));
        if (C46451s.m102502c(this.f104147d)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m102453A());
            sb2.append("cursor ");
            sb2.append(iIntValue);
            sb2.append(zEquals ? " cancel" : " next");
            Log.d("Sqflite", sb2.toString());
        }
        C46453u c46453u = null;
        if (zEquals) {
            m102468l(iIntValue);
            interfaceC0235e.success(null);
            return true;
        }
        C46453u c46453u2 = this.f104150g.get(num);
        int i11 = 0;
        try {
            try {
                if (c46453u2 == null) {
                    throw new IllegalStateException("Cursor " + iIntValue + " not found");
                }
                Cursor cursor = c46453u2.f104185c;
                Map<String, Object> mapM102470n = m102470n(cursor, Integer.valueOf(c46453u2.f104184b));
                z11 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
                if (z11) {
                    try {
                        mapM102470n.put("cursorId", num);
                    } catch (Exception e11) {
                        e = e11;
                        m102456D(e, interfaceC0235e);
                        if (c46453u2 != null) {
                            m102469m(c46453u2);
                        } else {
                            c46453u = c46453u2;
                        }
                        if (!z11 && c46453u != null) {
                            m102469m(c46453u);
                        }
                        return false;
                    }
                }
                interfaceC0235e.success(mapM102470n);
                if (!z11) {
                    m102469m(c46453u2);
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                i11 = iIntValue;
                if (i11 == 0 && c46453u2 != null) {
                    m102469m(c46453u2);
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            z11 = false;
        } catch (Throwable th3) {
            th = th3;
            if (i11 == 0) {
                m102469m(c46453u2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m102477v(@NonNull final InterfaceC0235e interfaceC0235e) {
        m102465M(interfaceC0235e, new Runnable() { // from class: yb0.h
            @Override // java.lang.Runnable
            public final void run() {
                C46443k.m102445e(this.f104139b, interfaceC0235e);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public SQLiteDatabase m102479z() {
        return this.f104152i;
    }

    public C46443k(Context context, String str, int i11, boolean z11, int i12) {
        this.f104148e = context;
        this.f104145b = str;
        this.f104144a = z11;
        this.f104146c = i11;
        this.f104147d = i12;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m102445e(C46443k c46443k, InterfaceC0235e interfaceC0235e) {
        boolean z11;
        c46443k.getClass();
        Boolean boolMo856e = interfaceC0235e.mo856e();
        if (Boolean.TRUE.equals(boolMo856e) && interfaceC0235e.mo855d()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int i11 = c46443k.f104154k + 1;
            c46443k.f104154k = i11;
            c46443k.f104155l = Integer.valueOf(i11);
        }
        if (!c46443k.m102478w(interfaceC0235e)) {
            if (z11) {
                c46443k.f104155l = null;
            }
        } else if (z11) {
            HashMap map = new HashMap();
            map.put("transactionId", c46443k.f104155l);
            interfaceC0235e.success(map);
        } else {
            if (Boolean.FALSE.equals(boolMo856e)) {
                c46443k.f104155l = null;
            }
            interfaceC0235e.success(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Cursor m102446f(C46436e0 c46436e0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c46436e0.m102432a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: i */
    public static boolean m102448i(Context context, String str, boolean z11) {
        ApplicationInfo applicationInfoM102452y;
        try {
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfoM102452y = context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L));
            } else {
                applicationInfoM102452y = m102452y(context, packageName, 128);
            }
            if (applicationInfoM102452y.metaData.getBoolean(str, z11)) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static ApplicationInfo m102452y(Context context, String str, int i11) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getApplicationInfo(str, i11);
    }

    /* JADX INFO: renamed from: B */
    public String m102454B() {
        Thread threadCurrentThread = Thread.currentThread();
        return this.f104146c + "," + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
    }

    /* JADX INFO: renamed from: M */
    public final void m102465M(@NonNull InterfaceC0235e interfaceC0235e, Runnable runnable) {
        Integer numMo858g = interfaceC0235e.mo858g();
        Integer num = this.f104155l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (numMo858g != null && (numMo858g.equals(num) || numMo858g.intValue() == -1)) {
            runnable.run();
            if (this.f104155l == null && !this.f104149f.isEmpty()) {
                this.f104151h.m102494d(this, new Runnable() { // from class: yb0.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f104142b.m102463K();
                    }
                });
                return;
            }
            return;
        }
        this.f104149f.add(new C0237g(interfaceC0235e, runnable));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m102471p(InterfaceC0235e interfaceC0235e) {
        if (!m102478w(interfaceC0235e)) {
            return false;
        }
        interfaceC0235e.success(null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final boolean m102472q(InterfaceC0235e interfaceC0235e) throws Throwable {
        Exception e11;
        Cursor cursorRawQuery;
        if (!m102478w(interfaceC0235e)) {
            return false;
        }
        CursorWrapper cursorWrapper = 0;
        if (interfaceC0235e.mo857f()) {
            interfaceC0235e.success(null);
            return true;
        }
        try {
            try {
                cursorRawQuery = m102455C().rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            if (cursorRawQuery.getInt(0) == 0) {
                                if (C46451s.m102501b(this.f104147d)) {
                                    Log.d("Sqflite", m102453A() + "no changes (id was " + cursorRawQuery.getLong(1) + ")");
                                }
                                interfaceC0235e.success(null);
                                cursorRawQuery.close();
                                return true;
                            }
                            long j11 = cursorRawQuery.getLong(1);
                            if (C46451s.m102501b(this.f104147d)) {
                                Log.d("Sqflite", m102453A() + "inserted " + j11);
                            }
                            interfaceC0235e.success(Long.valueOf(j11));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e12) {
                        e11 = e12;
                        m102456D(e11, interfaceC0235e);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return false;
                    }
                }
                Log.e("Sqflite", m102453A() + "fail to read changes for Insert");
                interfaceC0235e.success(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                cursorWrapper = "SELECT changes(), last_insert_rowid()";
                if (cursorWrapper != 0) {
                    cursorWrapper.close();
                }
                throw th;
            }
        } catch (Exception e13) {
            e11 = e13;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursorWrapper != 0) {
                cursorWrapper.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m102475t(InterfaceC0235e interfaceC0235e) throws Throwable {
        if (!m102478w(interfaceC0235e)) {
            return false;
        }
        Cursor cursor = null;
        if (interfaceC0235e.mo857f()) {
            interfaceC0235e.success(null);
            return true;
        }
        try {
            try {
                Cursor cursorRawQuery = m102455C().rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i11 = cursorRawQuery.getInt(0);
                            if (C46451s.m102501b(this.f104147d)) {
                                Log.d("Sqflite", m102453A() + "changed " + i11);
                            }
                            interfaceC0235e.success(Integer.valueOf(i11));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        cursor = cursorRawQuery;
                        m102456D(e, interfaceC0235e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", m102453A() + "fail to read changes for Update/Delete");
                interfaceC0235e.success(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m102478w(InterfaceC0235e interfaceC0235e) {
        C46436e0 c46436e0Mo854c = interfaceC0235e.mo854c();
        if (C46451s.m102501b(this.f104147d)) {
            Log.d("Sqflite", m102453A() + c46436e0Mo854c);
        }
        Boolean boolMo856e = interfaceC0235e.mo856e();
        try {
            m102455C().execSQL(c46436e0Mo854c.m102434c(), c46436e0Mo854c.m102435d());
            m102476u(boolMo856e);
            return true;
        } catch (Exception e11) {
            m102456D(e11, interfaceC0235e);
            return false;
        }
    }
}
