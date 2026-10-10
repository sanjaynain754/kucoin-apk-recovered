package com.kubi.router.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.Map;
import p812yx.C46610a;
import ro.C44127a;

/* JADX INFO: renamed from: com.kubi.router.utils.b */
/* JADX INFO: compiled from: ContextUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C23636b {

    /* JADX INFO: renamed from: a */
    public static final a f46212a = new a();

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static Application f46213b;

    /* JADX INFO: renamed from: com.kubi.router.utils.b$a */
    /* JADX INFO: compiled from: ContextUtils.java */
    public static class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b */
        public final LinkedList<Activity> f46214b = new LinkedList<>();

        /* JADX INFO: renamed from: c */
        public int f46215c = 0;

        /* JADX INFO: renamed from: d */
        public int f46216d = 0;

        /* JADX INFO: renamed from: e */
        public boolean f46217e = true;

        /* JADX INFO: renamed from: b */
        public synchronized Activity m56293b() {
            if (!this.f46214b.isEmpty()) {
                for (int size = this.f46214b.size() - 1; size >= 0; size--) {
                    Activity activity = this.f46214b.get(size);
                    if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                        return activity;
                    }
                }
            }
            Activity activityM56294c = m56294c();
            if (activityM56294c != null) {
                m56295d(activityM56294c);
            }
            return activityM56294c;
        }

        /* JADX INFO: renamed from: c */
        public final Activity m56294c() {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mActivityList");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(objInvoke);
                if (map == null) {
                    return null;
                }
                for (Object obj : map.values()) {
                    Class<?> cls2 = obj.getClass();
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj)) {
                        Field declaredField3 = cls2.getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        return (Activity) declaredField3.get(obj);
                    }
                }
            } catch (Throwable unused) {
                C44127a.m97245e("Router", "反射获取当前context失败");
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final synchronized void m56295d(Activity activity) {
            try {
                if (!this.f46214b.contains(activity)) {
                    this.f46214b.addLast(activity);
                } else if (!this.f46214b.getLast().equals(activity)) {
                    this.f46214b.remove(activity);
                    this.f46214b.addLast(activity);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityDestroyed(Activity activity) {
            this.f46214b.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (!this.f46217e) {
                m56295d(activity);
            }
            int i11 = this.f46216d;
            if (i11 < 0) {
                this.f46216d = i11 + 1;
            } else {
                this.f46215c++;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            m56295d(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            m56295d(activity);
            if (this.f46217e) {
                this.f46217e = false;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity.isChangingConfigurations()) {
                this.f46216d--;
                return;
            }
            int i11 = this.f46215c - 1;
            this.f46215c = i11;
            if (i11 <= 0) {
                this.f46217e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Application m56287a() {
        Application application = f46213b;
        if (application != null) {
            return application;
        }
        Application applicationM56288b = m56288b();
        m56290d(applicationM56288b);
        return applicationM56288b;
    }

    /* JADX INFO: renamed from: b */
    public static Application m56288b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (objInvoke != null) {
                return (Application) objInvoke;
            }
            throw new NullPointerException("u should init first");
        } catch (ClassNotFoundException e11) {
            e = e11;
            e.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (IllegalAccessException e12) {
            e = e12;
            e.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (NoSuchMethodException e13) {
            e = e13;
            e.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (InvocationTargetException e14) {
            e = e14;
            e.printStackTrace();
            throw new NullPointerException("u should init first");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Context m56289c() {
        try {
            a aVar = f46212a;
            if (aVar.f46217e) {
                return m56287a();
            }
            Activity activityM56293b = aVar.m56293b();
            return activityM56293b == null ? m56287a() : activityM56293b;
        } catch (Exception e11) {
            C46610a.m102762a(e11, "Router");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m56290d(Application application) {
        if (f46213b == null) {
            if (application == null) {
                f46213b = m56288b();
            } else {
                f46213b = application;
            }
            f46213b.registerActivityLifecycleCallbacks(f46212a);
            return;
        }
        if (application == null || application.getClass() == f46213b.getClass()) {
            return;
        }
        Application application2 = f46213b;
        a aVar = f46212a;
        application2.unregisterActivityLifecycleCallbacks(aVar);
        aVar.f46214b.clear();
        f46213b = application;
        application.registerActivityLifecycleCallbacks(aVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m56291e(Context context) {
        if (context == null) {
            m56290d(m56288b());
        } else {
            m56290d((Application) context.getApplicationContext());
        }
    }
}
