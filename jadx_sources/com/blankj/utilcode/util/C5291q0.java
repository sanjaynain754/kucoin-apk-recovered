package com.blankj.utilcode.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.aspect.UtilsActivityLifecycleImplAspect;
import dh0.C36686b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;

/* JADX INFO: renamed from: com.blankj.utilcode.util.q0 */
/* JADX INFO: compiled from: UtilsActivityLifecycleImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5291q0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: h */
    public static final C5291q0 f6582h;

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ InterfaceC43175a.a f6583i;

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC43175a.a f6584j;

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC43175a.a f6585k;

    /* JADX INFO: renamed from: b */
    public final LinkedList<Activity> f6586b = new LinkedList<>();

    /* JADX INFO: renamed from: c */
    public final List<C5287o0.b> f6587c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map<Activity, List<C5287o0.a>> f6588d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public int f6589e = 0;

    /* JADX INFO: renamed from: f */
    public int f6590f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f6591g = false;

    /* JADX INFO: renamed from: com.blankj.utilcode.util.q0$a */
    /* JADX INFO: compiled from: UtilsActivityLifecycleImpl.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f6592b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C5287o0.a f6593c;

        public a(Activity activity, C5287o0.a aVar) {
            this.f6592b = activity;
            this.f6593c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5291q0.this.m6371d(this.f6592b, this.f6593c);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.q0$b */
    /* JADX INFO: compiled from: UtilsActivityLifecycleImpl.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f6595b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C5287o0.a f6596c;

        public b(Activity activity, C5287o0.a aVar) {
            this.f6595b = activity;
            this.f6596c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5291q0.this.m6385u(this.f6595b, this.f6596c);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.q0$c */
    /* JADX INFO: compiled from: UtilsActivityLifecycleImpl.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f6598b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f6599c;

        public c(Activity activity, Object obj) {
            this.f6598b = activity;
            this.f6599c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = this.f6598b.getWindow();
            if (window != null) {
                window.setSoftInputMode(((Integer) this.f6599c).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m6376k() {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e11) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e11.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final Object m6377l() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e11) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e11.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public Application m6379n() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(m6375j(), new Object[0]);
            if (objInvoke == null) {
                return null;
            }
            return (Application) objInvoke;
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
            return null;
        } catch (IllegalAccessException e12) {
            e12.printStackTrace();
            return null;
        } catch (NoSuchMethodException e13) {
            e13.printStackTrace();
            return null;
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6366f() {
        C36686b c36686b = new C36686b("UtilsActivityLifecycleImpl.java", C5291q0.class);
        f6583i = c36686b.m82128h("method-execution", c36686b.m82127g("0", "addOnAppStatusChangedListener", "com.blankj.utilcode.util.UtilsActivityLifecycleImpl", "com.blankj.utilcode.util.Utils$OnAppStatusChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "void"), 75);
        f6584j = c36686b.m82128h("method-execution", c36686b.m82127g("0", "removeOnAppStatusChangedListener", "com.blankj.utilcode.util.UtilsActivityLifecycleImpl", "com.blankj.utilcode.util.Utils$OnAppStatusChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "void"), 79);
        f6585k = c36686b.m82128h("method-execution", c36686b.m82127g("2", "postStatus", "com.blankj.utilcode.util.UtilsActivityLifecycleImpl", "android.app.Activity:boolean", "activity:isForeground", "", "void"), 275);
    }

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ void m6367r(C5291q0 c5291q0, Activity activity, boolean z11, InterfaceC43175a interfaceC43175a) {
        if (c5291q0.f6587c.isEmpty()) {
            return;
        }
        for (C5287o0.b bVar : c5291q0.f6587c) {
            if (z11) {
                bVar.onForeground(activity);
            } else {
                bVar.onBackground(activity);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m6369w() {
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                    declaredField.set(null, Float.valueOf(1.0f));
                    Log.i("UtilsActivityLifecycle", "setAnimatorsEnabled: Animators are enabled now!");
                }
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (NoSuchFieldException e12) {
                e12.printStackTrace();
            }
        }
    }

    public void addOnAppStatusChangedListener(C5287o0.b bVar) {
        UtilsActivityLifecycleImplAspect.m56548d().m56549a(new C5293r0(new Object[]{this, bVar, C36686b.m82123c(f6583i, this, this, bVar)}).linkClosureAndJoinPoint(69648));
    }

    /* JADX INFO: renamed from: c */
    public void m6370c(Activity activity, C5287o0.a aVar) {
        if (activity == null || aVar == null) {
            return;
        }
        C5299u0.m6473K(new a(activity, aVar));
    }

    /* JADX INFO: renamed from: d */
    public final void m6371d(Activity activity, C5287o0.a aVar) {
        List<C5287o0.a> arrayList = this.f6588d.get(activity);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f6588d.put(activity, arrayList);
        } else if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m6372g(Activity activity, Lifecycle.Event event) {
        List<C5287o0.a> list = this.f6588d.get(activity);
        if (list != null) {
            for (C5287o0.a aVar : list) {
                aVar.m6338g(activity, event);
                if (event.equals(Lifecycle.Event.ON_CREATE)) {
                    aVar.mo6333a(activity);
                } else if (event.equals(Lifecycle.Event.ON_START)) {
                    aVar.m6336e(activity);
                } else if (event.equals(Lifecycle.Event.ON_RESUME)) {
                    aVar.m6335d(activity);
                } else if (event.equals(Lifecycle.Event.ON_PAUSE)) {
                    aVar.m6334c(activity);
                } else if (event.equals(Lifecycle.Event.ON_STOP)) {
                    aVar.m6337f(activity);
                } else if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                    aVar.mo6297b(activity);
                }
            }
            if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                this.f6588d.remove(activity);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final List<Activity> m6373h() {
        LinkedList linkedList = new LinkedList();
        Activity activity = null;
        try {
            Object objM6375j = m6375j();
            Field declaredField = objM6375j.getClass().getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objM6375j);
            if (obj instanceof Map) {
                for (Object obj2 : ((Map) obj).values()) {
                    Class<?> cls = obj2.getClass();
                    Field declaredField2 = cls.getDeclaredField("activity");
                    declaredField2.setAccessible(true);
                    Activity activity2 = (Activity) declaredField2.get(obj2);
                    if (activity == null) {
                        Field declaredField3 = cls.getDeclaredField("paused");
                        declaredField3.setAccessible(true);
                        if (declaredField3.getBoolean(obj2)) {
                            linkedList.add(activity2);
                        } else {
                            activity = activity2;
                        }
                    } else {
                        linkedList.add(activity2);
                    }
                }
                if (activity != null) {
                    linkedList.addFirst(activity);
                }
            }
        } catch (Exception e11) {
            Log.e("UtilsActivityLifecycle", "getActivitiesByReflect: " + e11.getMessage());
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: i */
    public List<Activity> m6374i() {
        if (!this.f6586b.isEmpty()) {
            return this.f6586b;
        }
        this.f6586b.addAll(m6373h());
        return this.f6586b;
    }

    /* JADX INFO: renamed from: m */
    public final Object m6378m() {
        try {
            Field declaredField = Application.class.getDeclaredField("mLoadedApk");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(C5287o0.m6331a());
            Field declaredField2 = obj.getClass().getDeclaredField("mActivityThread");
            declaredField2.setAccessible(true);
            return declaredField2.get(obj);
        } catch (Exception e11) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInLoadedApkField: " + e11.getMessage());
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        C5299u0.m6479b(activity);
        m6369w();
        m6386x(activity);
        m6372g(activity, Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        this.f6586b.remove(activity);
        C5299u0.m6487j(activity);
        m6372g(activity, Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6372g(activity, Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) throws Throwable {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6386x(activity);
        if (this.f6591g) {
            this.f6591g = false;
            m6382q(activity, true);
        }
        m6383s(activity, false);
        m6372g(activity, Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, Bundle bundle) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (!this.f6591g) {
            m6386x(activity);
        }
        int i11 = this.f6590f;
        if (i11 < 0) {
            this.f6590f = i11 + 1;
        } else {
            this.f6589e++;
        }
        m6372g(activity, Lifecycle.Event.ON_START);
    }

    /* JADX INFO: renamed from: q */
    public final void m6382q(Activity activity, boolean z11) throws Throwable {
        UtilsActivityLifecycleImplAspect.m56548d().m56550e(new C5297t0(new Object[]{this, activity, C43179b.m94788a(z11), C36686b.m82124d(f6585k, this, this, activity, C43179b.m94788a(z11))}).linkClosureAndJoinPoint(69648));
    }

    public void removeOnAppStatusChangedListener(C5287o0.b bVar) {
        UtilsActivityLifecycleImplAspect.m56548d().m56551f(new C5295s0(new Object[]{this, bVar, C36686b.m82123c(f6584j, this, this, bVar)}).linkClosureAndJoinPoint(69648));
    }

    /* JADX INFO: renamed from: s */
    public final void m6383s(Activity activity, boolean z11) {
        if (z11) {
            activity.getWindow().getDecorView().setTag(-123, Integer.valueOf(activity.getWindow().getAttributes().softInputMode));
            activity.getWindow().setSoftInputMode(3);
        } else {
            Object tag = activity.getWindow().getDecorView().getTag(-123);
            if (tag instanceof Integer) {
                C5299u0.m6474L(new c(activity, tag), 100L);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m6384t(Activity activity, C5287o0.a aVar) {
        if (activity == null || aVar == null) {
            return;
        }
        C5299u0.m6473K(new b(activity, aVar));
    }

    /* JADX INFO: renamed from: u */
    public final void m6385u(Activity activity, C5287o0.a aVar) {
        List<C5287o0.a> list = this.f6588d.get(activity);
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(aVar);
    }

    /* JADX INFO: renamed from: x */
    public final void m6386x(Activity activity) {
        if (!this.f6586b.contains(activity)) {
            this.f6586b.addFirst(activity);
        } else {
            if (this.f6586b.getFirst().equals(activity)) {
                return;
            }
            this.f6586b.remove(activity);
            this.f6586b.addFirst(activity);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m6387y(Application application) {
        this.f6586b.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }

    static {
        m6366f();
        f6582h = new C5291q0();
    }

    /* JADX INFO: renamed from: j */
    public final Object m6375j() {
        Object objM6376k = m6376k();
        if (objM6376k != null) {
            return objM6376k;
        }
        Object objM6377l = m6377l();
        if (objM6377l != null) {
            return objM6377l;
        }
        return m6378m();
    }

    /* JADX INFO: renamed from: o */
    public Activity m6380o() {
        for (Activity activity : m6374i()) {
            if (C5299u0.m6465C(activity)) {
                return activity;
            }
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) throws Throwable {
        if (activity.isChangingConfigurations()) {
            this.f6590f--;
        } else {
            int i11 = this.f6589e - 1;
            this.f6589e = i11;
            if (i11 <= 0) {
                this.f6591g = true;
                m6382q(activity, false);
            }
        }
        m6383s(activity, true);
        m6372g(activity, Lifecycle.Event.ON_STOP);
    }

    /* JADX INFO: renamed from: p */
    public void m6381p(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }
}
