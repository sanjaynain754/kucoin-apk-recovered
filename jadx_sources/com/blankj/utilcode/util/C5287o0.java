package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: com.blankj.utilcode.util.o0 */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5287o0 {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static Application f6580a;

    /* JADX INFO: renamed from: com.blankj.utilcode.util.o0$a */
    /* JADX INFO: compiled from: Utils.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static class a {
        /* JADX INFO: renamed from: a */
        public void mo6333a(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo6297b(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* JADX INFO: renamed from: c */
        public void m6334c(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* JADX INFO: renamed from: d */
        public void m6335d(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* JADX INFO: renamed from: e */
        public void m6336e(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* JADX INFO: renamed from: f */
        public void m6337f(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* JADX INFO: renamed from: g */
        public void m6338g(@NonNull Activity activity, Lifecycle.Event event) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.o0$b */
    /* JADX INFO: compiled from: Utils.java */
    public interface b {
        void onBackground(Activity activity);

        void onForeground(Activity activity);
    }

    /* JADX INFO: renamed from: a */
    public static Application m6331a() {
        Application application = f6580a;
        if (application != null) {
            return application;
        }
        m6332b(C5299u0.m6493p());
        if (f6580a == null) {
            throw new NullPointerException("reflect failed.");
        }
        Log.i("Utils", C5299u0.m6494q() + " reflect app success.");
        return f6580a;
    }

    /* JADX INFO: renamed from: b */
    public static void m6332b(Application application) {
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = f6580a;
        if (application2 == null) {
            f6580a = application;
            C5299u0.m6464B(application);
            C5299u0.m6470H();
        } else {
            if (application2.equals(application)) {
                return;
            }
            C5299u0.m6475M(f6580a);
            f6580a = application;
            C5299u0.m6464B(application);
        }
    }
}
