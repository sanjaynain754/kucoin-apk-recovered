package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Instrumentation;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33636f extends AbstractC33968v0 {

    /* JADX INFO: renamed from: e */
    public static final String f69786e = "RMonitor_MemoryLeak_ActivityIceWatcher";

    /* JADX INFO: renamed from: f */
    public static Instrumentation f69787f;

    /* JADX INFO: renamed from: g */
    public static Object f69788g;

    /* JADX INFO: renamed from: h */
    public static Field f69789h;

    /* JADX INFO: renamed from: d */
    public boolean f69790d;

    @Override // com.tencent.bugly.proguard.AbstractC33596d1, com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: a */
    public boolean mo72765a() {
        return !AndroidVersion.isOverIceScreamSandwich();
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.f$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b extends Instrumentation {
        public b() {
        }

        @Override // android.app.Instrumentation
        public void callActivityOnDestroy(@NonNull Activity activity) {
            C33636f.f69787f.callActivityOnDestroy(activity);
            C33636f.this.m75222a(activity);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72971a(Instrumentation instrumentation) {
        Object obj;
        try {
            Field field = f69789h;
            if (field == null || (obj = f69788g) == null) {
                return false;
            }
            field.set(obj, instrumentation);
            return true;
        } catch (IllegalAccessException e11) {
            Logger.INSTANCE.exception(f69786e, e11);
            return false;
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: c */
    public void mo72931c() {
        if (f69787f == null || !mo72765a()) {
            return;
        }
        m72971a(f69787f);
        this.f69790d = false;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* JADX INFO: renamed from: e */
    public final void m72972e() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            f69788g = objInvoke;
            if (objInvoke == null) {
                throw new IllegalStateException("Failed to invoke currentActivityThread");
            }
            Field declaredField = objInvoke.getClass().getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            Instrumentation instrumentation = (Instrumentation) declaredField.get(f69788g);
            if (instrumentation == null) {
                throw new IllegalStateException("Failed to get mInstrumentation.");
            }
            if (!instrumentation.getClass().equals(Instrumentation.class)) {
                throw new IllegalStateException("Not an Instrumentation instance. Maybe something is modified in this system.");
            }
            if (instrumentation.getClass().equals(b.class)) {
                throw new RuntimeException("Buddy you already hacked the system.");
            }
            f69787f = instrumentation;
            Field declaredField2 = f69788g.getClass().getDeclaredField("mInstrumentation");
            f69789h = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e11) {
            Logger.INSTANCE.exception(f69786e, e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m72973f() {
        if (this.f69790d) {
            return false;
        }
        if (f69789h == null || f69788g == null) {
            m72972e();
        }
        if (!m72971a(new b())) {
            return false;
        }
        this.f69790d = true;
        return true;
    }

    public C33636f(C33565bc c33565bc) {
        super(c33565bc);
        this.f69790d = false;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: b */
    public boolean mo72930b() {
        return m72973f();
    }
}
