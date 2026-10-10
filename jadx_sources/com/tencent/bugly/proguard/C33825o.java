package com.tencent.bugly.proguard;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.o */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C33825o {

    /* JADX INFO: renamed from: a */
    public static final String f71215a = "Bugly.AlarmHooker";

    /* JADX INFO: renamed from: b */
    public static boolean f71216b;

    /* JADX INFO: renamed from: c */
    public static C33964ug.b f71217c;

    /* JADX INFO: renamed from: d */
    public static C33964ug f71218d;

    /* JADX INFO: renamed from: e */
    public static List<d> f71219e;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements C33964ug.b {
        @Override // com.tencent.bugly.proguard.C33964ug.b
        @Nullable
        /* JADX INFO: renamed from: a */
        public Object mo72677a(Object obj, Method method, Object[] objArr) {
            return null;
        }

        @Override // com.tencent.bugly.proguard.C33964ug.b
        /* JADX INFO: renamed from: a */
        public void mo72678a(Method method, Object[] objArr) {
            C33858pb.m74521d(C33825o.f71215a, "onServiceMethodInvoke: method name %s", method.getName());
            C33825o.m74353b(method, objArr);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o$b */
    /* JADX INFO: compiled from: BUGLY */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public PendingIntent f71220a;

        /* JADX INFO: renamed from: b */
        public AlarmManager.OnAlarmListener f71221b;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o$c */
    /* JADX INFO: compiled from: BUGLY */
    public static final class c {
        /* JADX INFO: renamed from: b */
        public static b m74357b(Object[] objArr) {
            if (objArr.length != 1) {
                C33858pb.m74522e(C33825o.f71215a, "createCancelArgs1 args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            b bVar = new b();
            Object obj = objArr[0];
            if (obj == null || (obj instanceof PendingIntent)) {
                bVar.f71220a = (PendingIntent) obj;
                return bVar;
            }
            C33858pb.m74522e(C33825o.f71215a, "createCancelArgs1 args idx 0 not PendingIntent, %s", obj);
            return null;
        }

        /* JADX INFO: renamed from: c */
        public static b m74358c(Object[] objArr) {
            if (objArr.length != 2) {
                C33858pb.m74522e(C33825o.f71215a, "createCancelArgs2 args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            b bVar = new b();
            Object obj = objArr[0];
            if (obj == null || (obj instanceof PendingIntent)) {
                bVar.f71220a = (PendingIntent) obj;
                return bVar;
            }
            C33858pb.m74522e(C33825o.f71215a, "createCancelArgs2 args idx 0 not PendingIntent, %s", obj);
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static b m74359d(Object[] objArr) {
            int length = objArr.length;
            C33858pb.m74520c(C33825o.f71215a, "createCancelArgsAccordingToArgsLength: length:%s", Integer.valueOf(length));
            return length != 1 ? m74358c(objArr) : m74357b(objArr);
        }

        /* JADX INFO: renamed from: a */
        public static b m74356a(Object[] objArr) {
            if (objArr == null) {
                C33858pb.m74522e(C33825o.f71215a, "createCancelArgs args null", new Object[0]);
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            C33858pb.m74520c(C33825o.f71215a, "createCancelArgs apiLevel:%d, codeName:%s, versionRelease:%s", Integer.valueOf(i11), Build.VERSION.CODENAME, Integer.valueOf(i11));
            return m74359d(objArr);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o$d */
    /* JADX INFO: compiled from: BUGLY */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo74360a(PendingIntent pendingIntent, AlarmManager.OnAlarmListener onAlarmListener);

        /* JADX INFO: renamed from: a */
        void mo74361a(C33804n c33804n, long j11, long j12, int i11, AlarmManager.OnAlarmListener onAlarmListener);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o$e */
    /* JADX INFO: compiled from: BUGLY */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public int f71222a;

        /* JADX INFO: renamed from: b */
        public long f71223b;

        /* JADX INFO: renamed from: c */
        public long f71224c;

        /* JADX INFO: renamed from: d */
        public long f71225d;

        /* JADX INFO: renamed from: e */
        public int f71226e;

        /* JADX INFO: renamed from: f */
        public PendingIntent f71227f;

        /* JADX INFO: renamed from: g */
        public AlarmManager.OnAlarmListener f71228g;

        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o$f */
    /* JADX INFO: compiled from: BUGLY */
    public static final class f {
        /* JADX INFO: renamed from: b */
        public static e m74363b(Object[] objArr) {
            if (objArr.length != 11) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            e eVar = new e();
            Object obj = objArr[1];
            if (!(obj instanceof Integer)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 1 not Integer, %s", obj);
                return null;
            }
            eVar.f71222a = ((Integer) obj).intValue();
            Object obj2 = objArr[2];
            if (!(obj2 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 2 not Long, %s", obj2);
                return null;
            }
            eVar.f71223b = ((Long) obj2).longValue();
            Object obj3 = objArr[3];
            if (!(obj3 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 3 not Long, %s", obj3);
                return null;
            }
            eVar.f71224c = ((Long) obj3).longValue();
            Object obj4 = objArr[4];
            if (!(obj4 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 4 not Long, %s", obj4);
                return null;
            }
            eVar.f71225d = ((Long) obj4).longValue();
            Object obj5 = objArr[5];
            if (!(obj5 instanceof Integer)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 5 not Integer, %s", obj5);
                return null;
            }
            eVar.f71226e = ((Integer) obj5).intValue();
            Object obj6 = objArr[6];
            if (obj6 == null || (obj6 instanceof PendingIntent)) {
                eVar.f71227f = (PendingIntent) obj6;
                return eVar;
            }
            C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 6 not PendingIntent, %s", obj6);
            return null;
        }

        /* JADX INFO: renamed from: c */
        public static e m74364c(Object[] objArr) {
            if (objArr.length != 3) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            e eVar = new e();
            Object obj = objArr[0];
            if (!(obj instanceof Integer)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 0 not Integer, %s", obj);
                return null;
            }
            eVar.f71222a = ((Integer) obj).intValue();
            Object obj2 = objArr[1];
            if (!(obj2 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 1 not Long, %s", obj2);
                return null;
            }
            eVar.f71223b = ((Long) obj2).longValue();
            Object obj3 = objArr[2];
            if (obj3 == null || (obj3 instanceof PendingIntent)) {
                eVar.f71227f = (PendingIntent) obj3;
                return eVar;
            }
            C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 2 not PendingIntent, %s", obj3);
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static e m74365d(Object[] objArr) {
            if (objArr.length != 4) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            e eVar = new e();
            Object obj = objArr[0];
            if (!(obj instanceof Integer)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 0 not Integer, %s", obj);
                return null;
            }
            eVar.f71222a = ((Integer) obj).intValue();
            Object obj2 = objArr[1];
            if (!(obj2 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 1 not Long, %s", obj2);
                return null;
            }
            eVar.f71223b = ((Long) obj2).longValue();
            Object obj3 = objArr[2];
            if (!(obj3 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 2 not Long, %s", obj3);
                return null;
            }
            eVar.f71225d = ((Long) obj3).longValue();
            Object obj4 = objArr[3];
            if (obj4 == null || (obj4 instanceof PendingIntent)) {
                eVar.f71227f = (PendingIntent) obj4;
                return eVar;
            }
            C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 3 not PendingIntent, %s", obj4);
            return null;
        }

        /* JADX INFO: renamed from: e */
        public static e m74366e(Object[] objArr) {
            if (objArr.length != 7 && objArr.length != 6) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            e eVar = new e();
            Object obj = objArr[0];
            if (!(obj instanceof Integer)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 0 not Integer, %s", obj);
                return null;
            }
            eVar.f71222a = ((Integer) obj).intValue();
            Object obj2 = objArr[1];
            if (!(obj2 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 1 not Long, %s", obj2);
                return null;
            }
            eVar.f71223b = ((Long) obj2).longValue();
            Object obj3 = objArr[2];
            if (!(obj3 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 2 not Long, %s", obj3);
                return null;
            }
            eVar.f71224c = ((Long) obj3).longValue();
            Object obj4 = objArr[3];
            if (!(obj4 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 3 not Long, %s", obj4);
                return null;
            }
            eVar.f71225d = ((Long) obj4).longValue();
            Object obj5 = objArr[4];
            if (obj5 == null || (obj5 instanceof PendingIntent)) {
                eVar.f71227f = (PendingIntent) obj5;
                return eVar;
            }
            C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 4 not PendingIntent, %s", obj5);
            return null;
        }

        /* JADX INFO: renamed from: f */
        public static e m74367f(Object[] objArr) {
            if (objArr.length != 8) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            e eVar = new e();
            Object obj = objArr[0];
            if (!(obj instanceof Integer)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 0 not Integer, %s", obj);
                return null;
            }
            eVar.f71222a = ((Integer) obj).intValue();
            Object obj2 = objArr[1];
            if (!(obj2 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 1 not Long, %s", obj2);
                return null;
            }
            eVar.f71223b = ((Long) obj2).longValue();
            Object obj3 = objArr[2];
            if (!(obj3 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 2 not Long, %s", obj3);
                return null;
            }
            eVar.f71224c = ((Long) obj3).longValue();
            Object obj4 = objArr[3];
            if (!(obj4 instanceof Long)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 3 not Long, %s", obj4);
                return null;
            }
            eVar.f71225d = ((Long) obj4).longValue();
            Object obj5 = objArr[4];
            if (!(obj5 instanceof Integer)) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 4 not Integer, %s", obj5);
                return null;
            }
            eVar.f71226e = ((Integer) obj5).intValue();
            Object obj6 = objArr[5];
            if (obj6 == null || (obj6 instanceof PendingIntent)) {
                eVar.f71227f = (PendingIntent) obj6;
                return eVar;
            }
            C33858pb.m74522e(C33825o.f71215a, "createSetArgs args idx 5 not PendingIntent, %s", obj6);
            return null;
        }

        /* JADX INFO: renamed from: g */
        public static e m74368g(Object[] objArr) {
            int length = objArr.length;
            C33858pb.m74520c(C33825o.f71215a, "createSetArgsAccordingToArgsLength: length:%s", Integer.valueOf(length));
            if (length == 3) {
                return m74364c(objArr);
            }
            if (length == 4) {
                return m74365d(objArr);
            }
            if (length == 6 || length == 7) {
                return m74366e(objArr);
            }
            return length != 8 ? m74363b(objArr) : m74367f(objArr);
        }

        /* JADX INFO: renamed from: a */
        public static e m74362a(Object[] objArr) {
            if (objArr == null) {
                C33858pb.m74522e(C33825o.f71215a, "createSetArgs args null", new Object[0]);
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            C33858pb.m74520c(C33825o.f71215a, "createSetArgs apiLevel:%d, codeName:%s, versionRelease:%s", Integer.valueOf(i11), Build.VERSION.CODENAME, Integer.valueOf(i11));
            return m74368g(objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m74352b(d dVar) {
        if (dVar == null) {
            return;
        }
        f71219e.remove(dVar);
        m74351b();
    }

    static {
        a aVar = new a();
        f71217c = aVar;
        f71218d = new C33964ug(NotificationCompat.CATEGORY_ALARM, "android.app.IAlarmManager", aVar);
        f71219e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m74348a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (f71219e.contains(dVar)) {
            return;
        }
        f71219e.add(dVar);
        m74347a();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m74355c() {
        f71219e.clear();
        m74351b();
    }

    /* JADX INFO: renamed from: b */
    public static void m74351b() {
        if (f71216b && f71219e.isEmpty()) {
            C33858pb.m74520c(f71215a, "checkUnHook unHookRet:%b", Boolean.valueOf(f71218d.m75188b()));
            f71216b = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74347a() {
        if (f71216b || f71219e.isEmpty()) {
            return;
        }
        C33858pb.m74520c(f71215a, "checkHook hookRet:%b", Boolean.valueOf(f71218d.m75187a()));
        f71216b = true;
    }

    /* JADX INFO: renamed from: b */
    public static void m74353b(Method method, Object[] objArr) {
        if (!method.getName().equals("set") && !method.getName().equals("setRepeating") && !method.getName().equals("setInexactRepeating")) {
            if (method.getName().equals("remove")) {
                m74350a(objArr);
                return;
            }
            return;
        }
        m74354b(objArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m74350a(Object[] objArr) {
        b bVarM74356a = c.m74356a(objArr);
        if (bVarM74356a == null) {
            C33858pb.m74522e(f71215a, "dispatchCancel cancelArgs null", new Object[0]);
            return;
        }
        synchronized (C33825o.class) {
            for (int i11 = 0; i11 < f71219e.size(); i11++) {
                try {
                    f71219e.get(i11).mo74360a(bVarM74356a.f71220a, bVarM74356a.f71221b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m74354b(Object[] objArr) {
        e eVarM74362a = f.m74362a(objArr);
        if (eVarM74362a == null) {
            C33858pb.m74522e(f71215a, "dispatchSet setArgs null", new Object[0]);
            return;
        }
        synchronized (C33825o.class) {
            try {
                C33804n c33804n = new C33804n();
                c33804n.f71006j = eVarM74362a.f71222a;
                c33804n.f71009m = eVarM74362a.f71227f;
                c33804n.f71007k = eVarM74362a.f71223b;
                c33804n.f71010n = eVarM74362a.f71228g;
                for (int i11 = 0; i11 < f71219e.size(); i11++) {
                    f71219e.get(i11).mo74361a(c33804n, eVarM74362a.f71224c, eVarM74362a.f71225d, eVarM74362a.f71226e, eVarM74362a.f71228g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
