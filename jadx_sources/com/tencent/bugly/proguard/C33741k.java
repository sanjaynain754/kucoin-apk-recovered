package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33741k {

    /* JADX INFO: renamed from: f */
    public static final String f70448f = "RMonitor_launch_Hacker";

    /* JADX INFO: renamed from: a */
    public final b f70449a;

    /* JADX INFO: renamed from: b */
    public boolean f70450b = false;

    /* JADX INFO: renamed from: c */
    public long f70451c = 0;

    /* JADX INFO: renamed from: d */
    public a f70452d = null;

    /* JADX INFO: renamed from: e */
    public EnumC33532a0 f70453e = EnumC33532a0.UNKNOWN;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k$a */
    /* JADX INFO: compiled from: BUGLY */
    public static final class a implements Handler.Callback {

        /* JADX INFO: renamed from: f */
        public static final int f70454f = 100;

        /* JADX INFO: renamed from: g */
        public static final int f70455g = 114;

        /* JADX INFO: renamed from: h */
        public static final int f70456h = 113;

        /* JADX INFO: renamed from: i */
        public static final int f70457i = 159;

        /* JADX INFO: renamed from: j */
        public static int f70458j = 10;

        /* JADX INFO: renamed from: b */
        public final Handler.Callback f70459b;

        /* JADX INFO: renamed from: c */
        public final C33741k f70460c;

        /* JADX INFO: renamed from: d */
        public boolean f70461d = false;

        /* JADX INFO: renamed from: e */
        public Method f70462e = null;

        /* JADX INFO: renamed from: a */
        public Handler.Callback m73612a() {
            return this.f70459b;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m73616b(Message message) {
            m73615b();
            Method method = this.f70462e;
            if (method != null) {
                try {
                    List list = (List) method.invoke(message.obj, new Object[0]);
                    if (list != null && !list.isEmpty()) {
                        return list.get(0).getClass().getName().endsWith(".LaunchActivityItem");
                    }
                } catch (Exception e11) {
                    Logger.INSTANCE.exception(C33741k.f70448f, "isLaunchActivity", e11);
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public final void m73613a(boolean z11, boolean z12, boolean z13) {
            EnumC33532a0 enumC33532a0;
            if (z11 || z12 || z13) {
                if (z11) {
                    enumC33532a0 = EnumC33532a0.APP_LAUNCH_BY_ACTIVITY;
                } else if (z12) {
                    enumC33532a0 = EnumC33532a0.APP_LAUNCH_BY_SERVICE;
                } else {
                    enumC33532a0 = z13 ? EnumC33532a0.APP_LAUNCH_BY_BROADCAST : EnumC33532a0.APP_LAUNCH_BY_CONTENT_PROVIDER;
                }
                this.f70460c.m73605a(enumC33532a0);
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m73617c(Message message) {
            return message.what == 113;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m73618d(Message message) {
            return message.what == 114;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.f70460c.f70450b) {
                Handler.Callback callback = this.f70459b;
                return callback != null && callback.handleMessage(message);
            }
            boolean zM73614a = m73614a(message);
            boolean zM73618d = m73618d(message);
            boolean zM73617c = m73617c(message);
            int i11 = f70458j;
            if (i11 > 0) {
                f70458j = i11 - 1;
                Logger.INSTANCE.mo77134w(C33741k.f70448f, "handleMessage, msg.what: ", String.valueOf(message.what), ", isLaunchActivity: ", String.valueOf(zM73614a), ", isLaunchService: ", String.valueOf(zM73618d), ", isLaunchBroadcastReceiver: ", String.valueOf(zM73617c));
            }
            if (zM73614a) {
                this.f70460c.f70451c = SystemClock.uptimeMillis();
            }
            m73613a(zM73614a, zM73618d, zM73617c);
            Handler.Callback callback2 = this.f70459b;
            return callback2 != null && callback2.handleMessage(message);
        }

        public a(Handler.Callback callback, C33741k c33741k) {
            this.f70459b = callback;
            this.f70460c = c33741k;
        }

        /* JADX INFO: renamed from: b */
        public final void m73615b() {
            if (this.f70462e != null || this.f70461d) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("android.app.servertransaction.ClientTransaction").getDeclaredMethod("getCallbacks", new Class[0]);
                this.f70462e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable unused) {
                this.f70461d = true;
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m73614a(Message message) {
            return ((!AndroidVersion.isOverP() || message.what != 159 || message.obj == null) ? false : m73616b(message)) || message.what == 100;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k$b */
    /* JADX INFO: compiled from: BUGLY */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo72379a(EnumC33532a0 enumC33532a0);
    }

    /* JADX INFO: renamed from: b */
    public long m73606b() {
        return this.f70451c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m73609c() {
        return this.f70450b;
    }

    /* JADX INFO: renamed from: b */
    public void m73607b(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field fieldM73604a = m73604a(obj);
        Handler.Callback callback = (Handler.Callback) fieldM73604a.get(obj);
        a aVar = new a(callback, this);
        this.f70452d = aVar;
        fieldM73604a.set(obj, aVar);
        Logger.INSTANCE.mo77134w(f70448f, "replaceHandlerCallback, originalCallback: " + callback + ", hackCallback: " + this.f70452d);
    }

    /* JADX INFO: renamed from: c */
    public void m73608c(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field fieldM73604a = m73604a(obj);
        Handler.Callback callback = (Handler.Callback) fieldM73604a.get(obj);
        a aVar = this.f70452d;
        if (aVar == null || aVar != callback) {
            Logger.INSTANCE.mo77134w(f70448f, "resetHandlerCallback fail for current Callback is not hack Callback");
        } else {
            fieldM73604a.set(obj, aVar.f70459b);
            Logger.INSTANCE.mo77134w(f70448f, "resetHandlerCallback success.");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m73610d() {
        try {
            m73607b(m73603a());
            this.f70450b = true;
            Logger.INSTANCE.mo77134w(f70448f, "startTrace success.");
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70448f, "startTrace fail.", th2);
        }
    }

    public C33741k(b bVar) {
        this.f70449a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public final Field m73604a(Object obj) throws NoSuchFieldException {
        Class<?> superclass;
        if (obj.getClass() == Handler.class) {
            superclass = obj.getClass();
        } else {
            superclass = obj.getClass().getSuperclass();
        }
        Field declaredField = superclass.getDeclaredField("mCallback");
        declaredField.setAccessible(true);
        return declaredField;
    }

    /* JADX INFO: renamed from: e */
    public void m73611e() {
        if (!m73609c()) {
            return;
        }
        Logger.INSTANCE.mo77134w(f70448f, "stopTrace");
        try {
            m73608c(m73603a());
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70448f, "stopTrace fail.", th2);
        }
        this.f70450b = false;
        this.f70452d = null;
    }

    /* JADX INFO: renamed from: a */
    public Object m73603a() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(cls);
        Field declaredField2 = cls.getDeclaredField("mH");
        declaredField2.setAccessible(true);
        return declaredField2.get(obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m73605a(EnumC33532a0 enumC33532a0) {
        if (this.f70453e == enumC33532a0) {
            return;
        }
        this.f70453e = enumC33532a0;
        b bVar = this.f70449a;
        if (bVar != null) {
            bVar.mo72379a(enumC33532a0);
        }
    }
}
