package com.tencent.bugly.proguard;

import android.os.Build;
import android.os.IBinder;
import android.os.WorkSource;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ge */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C33672ge {

    /* JADX INFO: renamed from: a */
    public static final String f69970a = "Bugly.PowerHooker";

    /* JADX INFO: renamed from: b */
    public static List<d> f69971b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static boolean f69972c;

    /* JADX INFO: renamed from: d */
    public static C33964ug.b f69973d;

    /* JADX INFO: renamed from: e */
    public static C33964ug f69974e;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ge$a */
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
            C33858pb.m74521d(C33672ge.f69970a, "onServiceMethodInvoke: method name %s", method.getName());
            C33672ge.m73185b(method, objArr);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ge$b */
    /* JADX INFO: compiled from: BUGLY */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public IBinder f69975a;

        /* JADX INFO: renamed from: b */
        public int f69976b;

        /* JADX INFO: renamed from: c */
        public String f69977c;

        /* JADX INFO: renamed from: d */
        public String f69978d;

        /* JADX INFO: renamed from: e */
        public WorkSource f69979e;

        /* JADX INFO: renamed from: f */
        public String f69980f;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ge$c */
    /* JADX INFO: compiled from: BUGLY */
    public static final class c {
        /* JADX INFO: renamed from: b */
        public static b m73189b(Object[] objArr) {
            if (objArr.length != 4) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs4 args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            b bVar = new b();
            Object obj = objArr[2];
            if (obj != null && !(obj instanceof String)) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 2 not String, %s", obj);
                return null;
            }
            bVar.f69977c = (String) obj;
            Object obj2 = objArr[3];
            if (obj2 != null && !(obj2 instanceof WorkSource)) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 3 not WorkSource, %s", obj2);
                return null;
            }
            bVar.f69979e = (WorkSource) obj2;
            Object obj3 = objArr[0];
            if (obj3 instanceof Integer) {
                bVar.f69976b = ((Integer) obj3).intValue();
                Object obj4 = objArr[1];
                if (obj4 instanceof IBinder) {
                    bVar.f69975a = (IBinder) obj4;
                    return bVar;
                }
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 1 not IBinder, %s", obj4);
                return null;
            }
            if (!(obj3 instanceof IBinder)) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs4 args idx 0 not IBinder an Integer, %s", obj3);
                return null;
            }
            bVar.f69975a = (IBinder) obj3;
            Object obj5 = objArr[1];
            if (obj5 instanceof Integer) {
                bVar.f69976b = ((Integer) obj5).intValue();
                return bVar;
            }
            C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs4 args idx 1 not Integer, %s", obj5);
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static b m73191d(Object[] objArr) {
            int length = objArr.length;
            C33858pb.m74520c(C33672ge.f69970a, "createAcquireWakeLockArgsAccordingToArgsLength: length:%s", Integer.valueOf(length));
            return length != 4 ? m73190c(objArr) : m73189b(objArr);
        }

        /* JADX INFO: renamed from: a */
        public static b m73188a(Object[] objArr) {
            if (objArr == null) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs args null", new Object[0]);
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            C33858pb.m74520c(C33672ge.f69970a, "createAcquireWakeLockArgs apiLevel:%d, codeName:%s, versionRelease:%s", Integer.valueOf(i11), Build.VERSION.CODENAME, Integer.valueOf(i11));
            return m73191d(objArr);
        }

        /* JADX INFO: renamed from: c */
        public static b m73190c(Object[] objArr) {
            b bVar = new b();
            Object obj = objArr[0];
            if (!(obj instanceof IBinder)) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 0 not IBinder, %s", obj);
                return null;
            }
            bVar.f69975a = (IBinder) obj;
            Object obj2 = objArr[1];
            if (!(obj2 instanceof Integer)) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 1 not Integer, %s", obj2);
                return null;
            }
            bVar.f69976b = ((Integer) obj2).intValue();
            Object obj3 = objArr[2];
            if (obj3 != null && !(obj3 instanceof String)) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 2 not String, %s", obj3);
                return null;
            }
            bVar.f69977c = (String) obj3;
            Object obj4 = objArr[3];
            if (obj4 != null && !(obj4 instanceof String)) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 3 not String, %s", obj4);
                return null;
            }
            bVar.f69978d = (String) obj4;
            Object obj5 = objArr[4];
            if (obj5 != null && !(obj5 instanceof WorkSource)) {
                C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 4 not WorkSource, %s", obj5);
                return null;
            }
            bVar.f69979e = (WorkSource) obj5;
            if (objArr.length == 5) {
                return bVar;
            }
            Object obj6 = objArr[5];
            if (obj6 == null || (obj6 instanceof String)) {
                bVar.f69980f = (String) obj6;
                return bVar;
            }
            C33858pb.m74522e(C33672ge.f69970a, "createAcquireWakeLockArgs6 args idx 5 not String, %s", obj6);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ge$d */
    /* JADX INFO: compiled from: BUGLY */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo73192a(IBinder iBinder, int i11);

        /* JADX INFO: renamed from: a */
        void mo73193a(C33676gi c33676gi, String str, @Nullable WorkSource workSource, @Nullable String str2);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ge$e */
    /* JADX INFO: compiled from: BUGLY */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public IBinder f69981a;

        /* JADX INFO: renamed from: b */
        public int f69982b;

        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ge$f */
    /* JADX INFO: compiled from: BUGLY */
    public static final class f {
        /* JADX INFO: renamed from: b */
        public static e m73195b(Object[] objArr) {
            if (objArr.length != 2) {
                C33858pb.m74522e(C33672ge.f69970a, "createReleaseWakeLockArgs2 args length invalid : %d", Integer.valueOf(objArr.length));
                return null;
            }
            e eVar = new e();
            Object obj = objArr[0];
            if (!(obj instanceof IBinder)) {
                C33858pb.m74522e(C33672ge.f69970a, "createReleaseWakeLockArgs2 args idx 0 not IBinder, %s", obj);
                return null;
            }
            eVar.f69981a = (IBinder) obj;
            Object obj2 = objArr[1];
            if (obj2 instanceof Integer) {
                eVar.f69982b = ((Integer) obj2).intValue();
                return eVar;
            }
            C33858pb.m74522e(C33672ge.f69970a, "createReleaseWakeLockArgs2 args idx 1 not Integer, %s", obj2);
            return null;
        }

        /* JADX INFO: renamed from: c */
        public static e m73196c(Object[] objArr) {
            C33858pb.m74520c(C33672ge.f69970a, "createReleaseWakeLockArgsAccordingToArgsLength: length:%s", Integer.valueOf(objArr.length));
            return m73195b(objArr);
        }

        /* JADX INFO: renamed from: a */
        public static e m73194a(Object[] objArr) {
            if (objArr == null) {
                C33858pb.m74522e(C33672ge.f69970a, "createReleaseWakeLockArgs args null", new Object[0]);
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            C33858pb.m74520c(C33672ge.f69970a, "createReleaseWakeLockArgs apiLevel:%d, codeName:%s, versionRelease:%s", Integer.valueOf(i11), Build.VERSION.CODENAME, Integer.valueOf(i11));
            return m73196c(objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m73184b(d dVar) {
        if (dVar == null) {
            return;
        }
        f69971b.remove(dVar);
        m73183b();
    }

    static {
        a aVar = new a();
        f69973d = aVar;
        f69974e = new C33964ug("power", "android.os.IPowerManager", aVar);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m73180a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (f69971b.contains(dVar)) {
            return;
        }
        f69971b.add(dVar);
        m73179a();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m73187c() {
        f69971b.clear();
        m73183b();
    }

    /* JADX INFO: renamed from: b */
    public static void m73183b() {
        if (f69972c && f69971b.isEmpty()) {
            C33858pb.m74520c(f69970a, "checkUnHook unHookRet:%b", Boolean.valueOf(f69974e.m75188b()));
            f69972c = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73179a() {
        if (f69972c || f69971b.isEmpty()) {
            return;
        }
        C33858pb.m74520c(f69970a, "checkHook hookRet:%b", Boolean.valueOf(f69974e.m75187a()));
        f69972c = true;
    }

    /* JADX INFO: renamed from: b */
    public static void m73185b(Method method, Object[] objArr) {
        if (method.getName().equals("acquireWakeLock")) {
            m73182a(objArr);
        } else if (method.getName().equals("releaseWakeLock")) {
            m73186b(objArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73182a(Object[] objArr) {
        b bVarM73188a = c.m73188a(objArr);
        if (bVarM73188a == null) {
            C33858pb.m74522e(f69970a, "dispatchAcquireWakeLock AcquireWakeLockArgs null", new Object[0]);
            return;
        }
        synchronized (C33672ge.class) {
            try {
                C33676gi c33676gi = new C33676gi();
                c33676gi.f70022j = bVarM73188a.f69976b;
                c33676gi.f70023k = bVarM73188a.f69977c;
                c33676gi.f70024l = bVarM73188a.f69975a;
                for (int i11 = 0; i11 < f69971b.size(); i11++) {
                    f69971b.get(i11).mo73193a(c33676gi, bVarM73188a.f69978d, bVarM73188a.f69979e, bVarM73188a.f69980f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73186b(Object[] objArr) {
        e eVarM73194a = f.m73194a(objArr);
        if (eVarM73194a == null) {
            C33858pb.m74522e(f69970a, "dispatchReleaseWakeLock AcquireWakeLockArgs null", new Object[0]);
            return;
        }
        synchronized (C33672ge.class) {
            for (int i11 = 0; i11 < f69971b.size(); i11++) {
                try {
                    f69971b.get(i11).mo73192a(eVarM73194a.f69981a, eVarM73194a.f69982b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
