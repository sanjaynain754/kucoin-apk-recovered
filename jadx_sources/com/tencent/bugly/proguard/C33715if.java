package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Printer;
import android.view.Choreographer;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.if */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33715if {

    /* JADX INFO: renamed from: a */
    public static final String f70284a = "RMonitor_util_ReflectUtil";

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, b> f70285b = new HashMap<>(5);

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.if$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Class<?> f70286a;

        /* JADX INFO: renamed from: b */
        public final String f70287b;

        /* JADX INFO: renamed from: c */
        public Field f70288c;

        /* JADX INFO: renamed from: d */
        public boolean f70289d;

        public b(Class<?> cls, String str) {
            this.f70288c = null;
            this.f70289d = false;
            this.f70286a = cls;
            this.f70287b = str;
        }

        /* JADX INFO: renamed from: a */
        public Field m73432a() {
            if (this.f70288c == null && !this.f70289d) {
                try {
                    Field declaredField = this.f70286a.getDeclaredField(this.f70287b);
                    this.f70288c = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable th2) {
                    Logger.INSTANCE.mo77131e(C33715if.f70284a, this.f70287b, th2.getMessage());
                }
                this.f70289d = true;
            }
            return this.f70288c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Handler m73424a(Choreographer choreographer) {
        Object objM73429a = m73429a(choreographer, "mHandler", true);
        if (objM73429a instanceof Handler) {
            return (Handler) objM73429a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static MessageQueue m73431b(Looper looper) {
        Object objM73429a = m73429a(looper, "mQueue", true);
        if (objM73429a instanceof MessageQueue) {
            return (MessageQueue) objM73429a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Message m73425a(Message message) {
        Object objM73429a = m73429a(message, "next", true);
        if (objM73429a instanceof Message) {
            return (Message) objM73429a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Printer m73427a(Looper looper) {
        Object objM73429a = m73429a(looper, "mLogging", true);
        if (objM73429a instanceof Printer) {
            return (Printer) objM73429a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Message m73426a(MessageQueue messageQueue) {
        Object objM73429a = m73429a(messageQueue, "mMessages", true);
        if (objM73429a instanceof Message) {
            return (Message) objM73429a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Object m73428a(Object obj, String str) {
        return m73429a(obj, str, false);
    }

    /* JADX INFO: renamed from: a */
    public static Object m73429a(Object obj, String str, boolean z11) {
        Field declaredField;
        try {
            if (obj == null) {
                declaredField = null;
            } else if (z11) {
                declaredField = m73430a(obj.getClass(), str);
            } else {
                declaredField = obj.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
            }
            if (declaredField != null) {
                return declaredField.get(obj);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70284a, "getInstancePrivateField", th2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Field m73430a(Class<?> cls, String str) {
        b bVar;
        String str2 = String.format("%s#%s", cls.getSimpleName(), str);
        HashMap<String, b> map = f70285b;
        synchronized (map) {
            try {
                bVar = map.get(str2);
                if (bVar == null) {
                    bVar = new b(cls, str);
                    map.put(str2, bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar.m73432a();
    }
}
