package com.tencent.bugly.proguard;

import android.app.PendingIntent;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.cb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C33585cb {

    /* JADX INFO: renamed from: a */
    public static final String f69412a = "Bugly.LocationHooker";

    /* JADX INFO: renamed from: b */
    public static List<b> f69413b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static boolean f69414c;

    /* JADX INFO: renamed from: d */
    public static C33964ug.b f69415d;

    /* JADX INFO: renamed from: e */
    public static C33964ug f69416e;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.cb$a */
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
            if ("requestLocationUpdates".equals(method.getName())) {
                C33585cb.m72676d(objArr);
            } else if ("removeUpdates".equals(method.getName())) {
                C33585cb.m72675c(objArr);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.cb$b */
    /* JADX INFO: compiled from: BUGLY */
    public interface b {
        @AnyThread
        /* JADX INFO: renamed from: a */
        void mo72679a(int i11, PendingIntent pendingIntent);

        @AnyThread
        /* JADX INFO: renamed from: a */
        void mo72680a(C33564bb c33564bb, long j11, float f11);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m72674c() {
        f69413b.clear();
        m72671b();
    }

    /* JADX INFO: renamed from: d */
    public static void m72676d(Object[] objArr) {
        Object obj;
        Object obj2;
        C33564bb c33564bb = new C33564bb();
        long jLongValue = -1;
        float fFloatValue = -1.0f;
        if (objArr != null) {
            for (Object obj3 : objArr) {
                if (obj3 != null && "android.location.LocationRequest".equals(obj3.getClass().getName())) {
                    try {
                        Method declaredMethod = obj3.getClass().getDeclaredMethod("getFastestInterval", new Class[0]);
                        declaredMethod.setAccessible(true);
                        jLongValue = ((Long) declaredMethod.invoke(obj3, new Object[0])).longValue();
                        Method declaredMethod2 = obj3.getClass().getDeclaredMethod("getSmallestDisplacement", new Class[0]);
                        declaredMethod2.setAccessible(true);
                        fFloatValue = ((Float) declaredMethod2.invoke(obj3, new Object[0])).floatValue();
                    } catch (Throwable th2) {
                        C33858pb.m74518a(f69412a, th2, "", new Object[0]);
                    }
                }
            }
            if (objArr.length > 1 && (obj2 = objArr[1]) != null && "android.location.LocationManager$LocationListenerTransport".equals(obj2.getClass().getName())) {
                c33564bb.f69165k = objArr[1].hashCode();
            }
            if (objArr.length > 2 && (obj = objArr[2]) != null && "android.app.PendingIntent".equals(obj.getClass().getName())) {
                c33564bb.f69164j = (PendingIntent) objArr[2];
            }
        }
        if (c33564bb.f69164j == null && c33564bb.f69165k == 0) {
            return;
        }
        Iterator<b> it = f69413b.iterator();
        while (it.hasNext()) {
            it.next().mo72680a(c33564bb, jLongValue, fFloatValue);
        }
    }

    static {
        a aVar = new a();
        f69415d = aVar;
        f69416e = new C33964ug(FirebaseAnalytics.Param.LOCATION, "android.location.ILocationManager", aVar);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m72669a(b bVar) {
        if (bVar == null) {
            return;
        }
        if (f69413b.contains(bVar)) {
            return;
        }
        f69413b.add(bVar);
        m72668a();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m72672b(b bVar) {
        if (bVar == null) {
            return;
        }
        f69413b.remove(bVar);
        m72671b();
    }

    /* JADX INFO: renamed from: c */
    public static void m72675c(Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length < 1) {
            return;
        }
        if (objArr[0] != null) {
            Iterator<b> it = f69413b.iterator();
            while (it.hasNext()) {
                it.next().mo72679a(objArr[0].hashCode(), null);
            }
        } else {
            if (objArr.length <= 1 || (obj = objArr[1]) == null || !"android.app.PendingIntent".equals(obj.getClass().getName())) {
                return;
            }
            Iterator<b> it2 = f69413b.iterator();
            while (it2.hasNext()) {
                it2.next().mo72679a(0, (PendingIntent) objArr[1]);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m72671b() {
        if (f69414c && f69413b.isEmpty()) {
            C33858pb.m74520c(f69412a, "checkUnHook unHookRet:%b", Boolean.valueOf(f69416e.m75188b()));
            f69414c = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72668a() {
        if (f69414c || f69413b.isEmpty()) {
            return;
        }
        C33858pb.m74520c(f69412a, "checkHook hookRet:%b", Boolean.valueOf(f69416e.m75187a()));
        f69414c = true;
    }
}
