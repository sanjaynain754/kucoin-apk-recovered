package com.blankj.utilcode.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationManagerCompat;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.blankj.utilcode.util.m0 */
/* JADX INFO: compiled from: ToastUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5283m0 {

    /* JADX INFO: renamed from: a */
    public static c f6557a = null;

    /* JADX INFO: renamed from: b */
    public static int f6558b = -1;

    /* JADX INFO: renamed from: c */
    public static int f6559c = -1;

    /* JADX INFO: renamed from: d */
    public static int f6560d = -1;

    /* JADX INFO: renamed from: e */
    public static int f6561e = -16777217;

    /* JADX INFO: renamed from: f */
    public static int f6562f = -1;

    /* JADX INFO: renamed from: g */
    public static int f6563g = -16777217;

    /* JADX INFO: renamed from: h */
    public static int f6564h = -1;

    /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$a */
    /* JADX INFO: compiled from: ToastUtils.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CharSequence f6565b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f6566c;

        public a(CharSequence charSequence, int i11) {
            this.f6565b = charSequence;
            this.f6566c = i11;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"ShowToast"})
        public void run() {
            C5283m0.m6282i();
            c unused = C5283m0.f6557a = e.m6292b(C5287o0.m6331a(), this.f6565b, this.f6566c);
            View view = C5283m0.f6557a.getView();
            if (view == null) {
                return;
            }
            TextView textView = (TextView) view.findViewById(R.id.message);
            if (C5283m0.f6563g != -16777217) {
                textView.setTextColor(C5283m0.f6563g);
            }
            if (C5283m0.f6564h != -1) {
                textView.setTextSize(C5283m0.f6564h);
            }
            if (C5283m0.f6558b != -1 || C5283m0.f6559c != -1 || C5283m0.f6560d != -1) {
                C5283m0.f6557a.mo6290a(C5283m0.f6558b, C5283m0.f6559c, C5283m0.f6560d);
            }
            C5283m0.m6283j(textView);
            C5283m0.f6557a.show();
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$b */
    /* JADX INFO: compiled from: ToastUtils.java */
    public static abstract class b implements c {

        /* JADX INFO: renamed from: a */
        public Toast f6567a;

        @Override // com.blankj.utilcode.util.C5283m0.c
        /* JADX INFO: renamed from: a */
        public void mo6290a(int i11, int i12, int i13) {
            this.f6567a.setGravity(i11, i12, i13);
        }

        @Override // com.blankj.utilcode.util.C5283m0.c
        public View getView() {
            return this.f6567a.getView();
        }

        public b(Toast toast) {
            this.f6567a = toast;
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$c */
    /* JADX INFO: compiled from: ToastUtils.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo6290a(int i11, int i12, int i13);

        void cancel();

        View getView();

        void show();
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$d */
    /* JADX INFO: compiled from: ToastUtils.java */
    public static class d extends b {

        /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$d$a */
        /* JADX INFO: compiled from: ToastUtils.java */
        public static class a extends Handler {

            /* JADX INFO: renamed from: a */
            public Handler f6568a;

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                try {
                    this.f6568a.dispatchMessage(message);
                } catch (Exception e11) {
                    Log.e("ToastUtils", e11.toString());
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                this.f6568a.handleMessage(message);
            }

            public a(Handler handler) {
                this.f6568a = handler;
            }
        }

        @Override // com.blankj.utilcode.util.C5283m0.c
        public void cancel() {
            this.f6567a.cancel();
        }

        @Override // com.blankj.utilcode.util.C5283m0.c
        public void show() {
            this.f6567a.show();
        }

        public d(Toast toast) {
            super(toast);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(toast);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new a((Handler) declaredField2.get(obj)));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$e */
    /* JADX INFO: compiled from: ToastUtils.java */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static Toast m6291a(Context context, CharSequence charSequence, int i11) {
            Toast toastMakeText = Toast.makeText(context, "", i11);
            toastMakeText.setText(charSequence);
            return toastMakeText;
        }

        /* JADX INFO: renamed from: b */
        public static c m6292b(Context context, CharSequence charSequence, int i11) {
            if (NotificationManagerCompat.from(context).areNotificationsEnabled() && !C5299u0.m6466D()) {
                return new d(m6291a(context, charSequence, i11));
            }
            return new f(m6291a(context, charSequence, i11));
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$f */
    /* JADX INFO: compiled from: ToastUtils.java */
    public static class f extends b {

        /* JADX INFO: renamed from: b */
        public View f6569b;

        /* JADX INFO: renamed from: c */
        public WindowManager f6570c;

        /* JADX INFO: renamed from: d */
        public WindowManager.LayoutParams f6571d;

        /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$f$a */
        /* JADX INFO: compiled from: ToastUtils.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.m6295d();
            }
        }

        /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$f$b */
        /* JADX INFO: compiled from: ToastUtils.java */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.cancel();
            }
        }

        /* JADX INFO: renamed from: com.blankj.utilcode.util.m0$f$c */
        /* JADX INFO: compiled from: ToastUtils.java */
        public class c extends C5287o0.a {
            public c() {
            }

            @Override // com.blankj.utilcode.util.C5287o0.a
            /* JADX INFO: renamed from: b */
            public void mo6297b(@NonNull Activity activity) {
                if (activity == null) {
                    throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
                }
                if (C5283m0.f6557a == null) {
                    return;
                }
                activity.getWindow().getDecorView().setVisibility(8);
                C5283m0.f6557a.cancel();
            }
        }

        /* JADX INFO: renamed from: c */
        public final C5287o0.a m6294c() {
            return new c();
        }

        @Override // com.blankj.utilcode.util.C5283m0.c
        public void cancel() {
            try {
                WindowManager windowManager = this.f6570c;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.f6569b);
                }
            } catch (Exception unused) {
            }
            this.f6569b = null;
            this.f6570c = null;
            this.f6567a = null;
        }

        /* JADX INFO: renamed from: d */
        public final void m6295d() {
            Toast toast = this.f6567a;
            if (toast == null) {
                return;
            }
            View view = toast.getView();
            this.f6569b = view;
            if (view == null) {
                return;
            }
            Context context = this.f6567a.getView().getContext();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 25) {
                this.f6570c = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
                this.f6571d.type = 2005;
            } else if (C5299u0.m6466D()) {
                this.f6570c = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
                if (i11 >= 26) {
                    this.f6571d.type = 2038;
                } else {
                    this.f6571d.type = 2002;
                }
            } else {
                Context contextM6503z = C5299u0.m6503z();
                if (!(contextM6503z instanceof Activity)) {
                    Log.w("ToastUtils", "Couldn't get top Activity.");
                    new d(this.f6567a).show();
                    return;
                }
                Activity activity = (Activity) contextM6503z;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    Log.w("ToastUtils", activity + " is useless");
                    new d(this.f6567a).show();
                    return;
                }
                this.f6570c = activity.getWindowManager();
                this.f6571d.type = 99;
                C5299u0.m6478a(activity, m6294c());
            }
            m6296e();
            try {
                WindowManager windowManager = this.f6570c;
                if (windowManager != null) {
                    windowManager.addView(this.f6569b, this.f6571d);
                }
            } catch (Exception unused) {
            }
            C5299u0.m6474L(new b(), this.f6567a.getDuration() == 0 ? 2000L : 3500L);
        }

        /* JADX INFO: renamed from: e */
        public final void m6296e() {
            WindowManager.LayoutParams layoutParams = this.f6571d;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation.Toast;
            layoutParams.setTitle("ToastWithoutNotification");
            WindowManager.LayoutParams layoutParams2 = this.f6571d;
            layoutParams2.flags = 152;
            layoutParams2.packageName = C5287o0.m6331a().getPackageName();
            this.f6571d.gravity = this.f6567a.getGravity();
            WindowManager.LayoutParams layoutParams3 = this.f6571d;
            int i11 = layoutParams3.gravity;
            if ((i11 & 7) == 7) {
                layoutParams3.horizontalWeight = 1.0f;
            }
            if ((i11 & 112) == 112) {
                layoutParams3.verticalWeight = 1.0f;
            }
            layoutParams3.x = this.f6567a.getXOffset();
            this.f6571d.y = this.f6567a.getYOffset();
            this.f6571d.horizontalMargin = this.f6567a.getHorizontalMargin();
            this.f6571d.verticalMargin = this.f6567a.getVerticalMargin();
        }

        @Override // com.blankj.utilcode.util.C5283m0.c
        public void show() {
            C5299u0.m6474L(new a(), 300L);
        }

        public f(Toast toast) {
            super(toast);
            this.f6571d = new WindowManager.LayoutParams();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m6284k(int i11, int i12) {
        m6285l(i11, i12, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m6288o(@StringRes int i11) {
        m6284k(i11, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m6289p(String str, Object... objArr) {
        m6287n(str, 0, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m6282i() {
        c cVar = f6557a;
        if (cVar != null) {
            cVar.cancel();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m6283j(TextView textView) {
        if (f6562f != -1) {
            f6557a.getView().setBackgroundResource(f6562f);
            textView.setBackgroundColor(0);
            return;
        }
        if (f6561e != -16777217) {
            View view = f6557a.getView();
            Drawable background = view.getBackground();
            Drawable background2 = textView.getBackground();
            if (background != null && background2 != null) {
                background.setColorFilter(new PorterDuffColorFilter(f6561e, PorterDuff.Mode.SRC_IN));
                textView.setBackgroundColor(0);
            } else if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(f6561e, PorterDuff.Mode.SRC_IN));
            } else if (background2 != null) {
                background2.setColorFilter(new PorterDuffColorFilter(f6561e, PorterDuff.Mode.SRC_IN));
            } else {
                view.setBackgroundColor(f6561e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m6286m(CharSequence charSequence, int i11) {
        C5299u0.m6473K(new a(charSequence, i11));
    }

    /* JADX INFO: renamed from: n */
    public static void m6287n(String str, int i11, Object... objArr) {
        if (str == null) {
            str = "null";
        } else if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        m6286m(str, i11);
    }

    /* JADX INFO: renamed from: l */
    public static void m6285l(int i11, int i12, Object... objArr) {
        try {
            CharSequence text = C5287o0.m6331a().getResources().getText(i11);
            if (objArr != null && objArr.length > 0) {
                text = String.format(text.toString(), objArr);
            }
            m6286m(text, i12);
        } catch (Exception unused) {
            m6286m(String.valueOf(i11), i12);
        }
    }
}
