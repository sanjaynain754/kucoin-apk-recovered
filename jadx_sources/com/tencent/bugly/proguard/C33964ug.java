package com.tencent.bugly.proguard;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ug */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C33964ug {

    /* JADX INFO: renamed from: f */
    public static final String f72259f = "Bugly.SystemServiceBinderHooker";

    /* JADX INFO: renamed from: a */
    public final String f72260a;

    /* JADX INFO: renamed from: b */
    public final String f72261b;

    /* JADX INFO: renamed from: c */
    public final b f72262c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public IBinder f72263d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public IBinder f72264e;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ug$a */
    /* JADX INFO: compiled from: BUGLY */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final IBinder f72265a;

        /* JADX INFO: renamed from: b */
        public final Object f72266b;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ug$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BUGLY */
        public class C46996a implements InvocationHandler {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ b f72267a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f72268b;

            public C46996a(b bVar, Object obj) {
                this.f72267a = bVar;
                this.f72268b = obj;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                b bVar = this.f72267a;
                if (bVar != null) {
                    bVar.mo72678a(method, objArr);
                    Object objMo72677a = this.f72267a.mo72677a(this.f72268b, method, objArr);
                    if (objMo72677a != null) {
                        return objMo72677a;
                    }
                }
                return method.invoke(this.f72268b, objArr);
            }
        }

        /* JADX INFO: renamed from: a */
        public IBinder m75191a() throws Exception {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return (IBinder) Proxy.newProxyInstance(classLoader, new Class[]{IBinder.class}, this);
            }
            throw new IllegalStateException("Can not get ClassLoader of ".concat(cls.getName()));
        }

        /* JADX INFO: renamed from: b */
        public IBinder m75192b() {
            return this.f72265a;
        }

        public a(String str, String str2, b bVar) throws Exception {
            IBinder iBinderM75189a = m75189a(str);
            this.f72265a = iBinderM75189a;
            this.f72266b = m75190a(str2, iBinderM75189a, bVar);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("queryLocalInterface".equals(method.getName())) {
                return this.f72266b;
            }
            return method.invoke(this.f72265a, objArr);
        }

        /* JADX INFO: renamed from: a */
        public static IBinder m75189a(String str) throws Exception {
            return (IBinder) Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class).invoke(null, str);
        }

        /* JADX INFO: renamed from: a */
        public static Object m75190a(String str, IBinder iBinder, b bVar) throws Exception {
            Class<?> cls = Class.forName(str);
            Class<?> cls2 = Class.forName(str + "$Stub");
            ClassLoader classLoader = cls2.getClassLoader();
            if (classLoader != null) {
                return Proxy.newProxyInstance(classLoader, new Class[]{IBinder.class, IInterface.class, cls}, new C46996a(bVar, cls2.getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder)));
            }
            throw new IllegalStateException("get service manager ClassLoader fail!");
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ug$b */
    /* JADX INFO: compiled from: BUGLY */
    public interface b {
        @Nullable
        /* JADX INFO: renamed from: a */
        Object mo72677a(Object obj, Method method, Object[] objArr) throws Throwable;

        /* JADX INFO: renamed from: a */
        void mo72678a(Method method, Object[] objArr);
    }

    /* JADX INFO: renamed from: a */
    public boolean m75187a() {
        C33858pb.m74520c(f72259f, "doHook: serviceName:%s, serviceClsName:%s", this.f72260a, this.f72261b);
        try {
            a aVar = new a(this.f72260a, this.f72261b, this.f72262c);
            IBinder iBinderM75191a = aVar.m75191a();
            Field declaredField = Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
            declaredField.setAccessible(true);
            ((Map) declaredField.get(null)).put(this.f72260a, iBinderM75191a);
            this.f72264e = iBinderM75191a;
            this.f72263d = aVar.f72265a;
            return true;
        } catch (Throwable th2) {
            C33858pb.m74519b(f72259f, "#doHook exp: " + th2.getLocalizedMessage(), new Object[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m75188b() {
        if (this.f72263d == null) {
            C33858pb.m74522e(f72259f, "#doUnHook mOriginServiceBinder null", new Object[0]);
            return false;
        }
        if (this.f72264e == null) {
            C33858pb.m74522e(f72259f, "#doUnHook mDelegateServiceBinder null", new Object[0]);
            return false;
        }
        try {
            if (this.f72264e != a.m75189a(this.f72260a)) {
                C33858pb.m74522e(f72259f, "#doUnHook mDelegateServiceBinder != currentBinder", new Object[0]);
                return false;
            }
            Field declaredField = Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
            declaredField.setAccessible(true);
            ((Map) declaredField.get(null)).put(this.f72260a, this.f72263d);
            return true;
        } catch (Throwable th2) {
            C33858pb.m74519b(f72259f, "#doUnHook exp: " + th2.getLocalizedMessage(), new Object[0]);
            return false;
        }
    }

    public C33964ug(String str, String str2, b bVar) {
        this.f72260a = str;
        this.f72261b = str2;
        this.f72262c = bVar;
    }
}
