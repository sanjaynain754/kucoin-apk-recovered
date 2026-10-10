package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.blankj.utilcode.util.a */
/* JADX INFO: compiled from: ActivityUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5258a {
    /* JADX INFO: renamed from: e */
    public static Activity m6122e(Context context) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (context instanceof ContextWrapper) {
            if (!(context instanceof Activity)) {
                Activity activityM6123f = m6123f(context);
                if (activityM6123f == null) {
                    arrayList.add(context);
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == null || arrayList.contains(context)) {
                        break;
                    }
                } else {
                    return activityM6123f;
                }
            } else {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Activity m6123f(Context context) {
        if (context != null && context.getClass().getName().equals("com.android.internal.policy.DecorContext")) {
            try {
                Field declaredField = context.getClass().getDeclaredField("mActivityContext");
                declaredField.setAccessible(true);
                return (Activity) ((WeakReference) declaredField.get(context)).get();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m6119b(@NonNull Class<? extends Activity> cls) {
        if (cls == null) {
            throw new NullPointerException("Argument 'clz' of type Class<? extends Activity> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6120c(cls, false);
    }

    /* JADX INFO: renamed from: c */
    public static void m6120c(@NonNull Class<? extends Activity> cls, boolean z11) {
        if (cls == null) {
            throw new NullPointerException("Argument 'clz' of type Class<? extends Activity> (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        for (Activity activity : C5299u0.m6490m()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                if (!z11) {
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6126i(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m6129l(@NonNull Intent intent) {
        if (intent != null) {
            return m6130m(intent, C5299u0.m6503z(), null);
        }
        throw new NullPointerException("Argument 'intent' of type Intent (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: a */
    public static void m6118a(Activity activity, C5287o0.a aVar) {
        C5299u0.m6478a(activity, aVar);
    }

    /* JADX INFO: renamed from: d */
    public static Activity m6121d(Context context) {
        Activity activityM6122e = m6122e(context);
        if (!m6126i(activityM6122e)) {
            return null;
        }
        return activityM6122e;
    }

    /* JADX INFO: renamed from: g */
    public static List<Activity> m6124g() {
        return C5299u0.m6490m();
    }

    /* JADX INFO: renamed from: h */
    public static Activity m6125h() {
        return C5299u0.m6502y();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6127j(Intent intent) {
        if (C5287o0.m6331a().getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static void m6128k(Activity activity, C5287o0.a aVar) {
        C5299u0.m6472J(activity, aVar);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m6130m(Intent intent, Context context, Bundle bundle) {
        if (!m6127j(intent)) {
            Log.e("ActivityUtils", "intent is unavailable");
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (bundle != null) {
            context.startActivity(intent, bundle);
            return true;
        }
        context.startActivity(intent);
        return true;
    }
}
