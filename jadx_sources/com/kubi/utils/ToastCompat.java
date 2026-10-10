package com.kubi.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5270g;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5287o0;
import com.blankj.utilcode.util.C5290q;
import com.blankj.utilcode.util.C5304x;
import com.blankj.utilcode.util.ThreadUtils;
import com.kubi.sdk.aspect.ToastCompatAspect;
import com.kubi.sdk.utils.R$id;
import com.kubi.sdk.utils.R$layout;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import dh0.C36686b;
import java.lang.reflect.Field;
import o00.C42917g;
import org.aspectj.lang.InterfaceC43175a;
import ro.C44128b;
import v70.C45463a;

/* JADX INFO: loaded from: classes23.dex */
public final class ToastCompat {

    /* JADX INFO: renamed from: l */
    public static final ToastCompat f54266l = m66460q();

    /* JADX INFO: renamed from: m */
    public static InterfaceC27009e f54267m;

    /* JADX INFO: renamed from: a */
    public String f54268a;

    /* JADX INFO: renamed from: b */
    public int f54269b = -1;

    /* JADX INFO: renamed from: c */
    public int f54270c = -1;

    /* JADX INFO: renamed from: d */
    public int f54271d = -1;

    /* JADX INFO: renamed from: e */
    public int f54272e = -16777217;

    /* JADX INFO: renamed from: f */
    public int f54273f = -1;

    /* JADX INFO: renamed from: g */
    public int f54274g = -16777217;

    /* JADX INFO: renamed from: h */
    public int f54275h = -1;

    /* JADX INFO: renamed from: i */
    public boolean f54276i = false;

    /* JADX INFO: renamed from: j */
    public Drawable[] f54277j = new Drawable[4];

    /* JADX INFO: renamed from: k */
    public boolean f54278k = false;

    /* JADX INFO: loaded from: classes54.dex */
    public static final class UtilsMaxWidthConstraintLayout extends ConstraintLayout {

        /* JADX INFO: renamed from: n */
        public static final int f54279n = C5275i0.m6236a(80.0f);

        public UtilsMaxWidthConstraintLayout(Context context) {
            super(context);
        }

        public UtilsMaxWidthConstraintLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public UtilsMaxWidthConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
        }

        @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C5267e0.m6180b() - f54279n, Integer.MIN_VALUE), i12);
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$a */
    /* JADX INFO: loaded from: classes54.dex */
    public class RunnableC27005a implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f54281c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CharSequence f54282d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f54283e;

        public RunnableC27005a(View view, CharSequence charSequence, int i11) {
            this.f54281c = view;
            this.f54282d = charSequence;
            this.f54283e = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToastCompat.m66456m();
            InterfaceC27009e unused = ToastCompat.f54267m = ToastCompat.m66461r(ToastCompat.this);
            if (this.f54281c != null) {
                ToastCompat.f54267m.mo66471a(this.f54281c);
            } else {
                ToastCompat.f54267m.mo66472c(this.f54282d);
            }
            ToastCompat.f54267m.mo66478b(this.f54283e);
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$b */
    /* JADX INFO: loaded from: classes54.dex */
    public class RunnableC27006b implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Window f54285c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CharSequence f54286d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f54287e;

        public RunnableC27006b(Window window, CharSequence charSequence, int i11) {
            this.f54285c = window;
            this.f54286d = charSequence;
            this.f54287e = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToastCompat.m66456m();
            InterfaceC27009e unused = ToastCompat.f54267m = new C27008d(ToastCompat.this, this.f54285c);
            ToastCompat.f54267m.mo66472c(this.f54286d);
            ToastCompat.f54267m.mo66478b(this.f54287e);
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$c */
    /* JADX INFO: loaded from: classes54.dex */
    public static abstract class AbstractC27007c implements InterfaceC27009e {

        /* JADX INFO: renamed from: a */
        public Toast f54288a = new Toast(C5287o0.m6331a());

        /* JADX INFO: renamed from: b */
        public ToastCompat f54289b;

        /* JADX INFO: renamed from: c */
        public View f54290c;

        @Override // com.kubi.utils.ToastCompat.InterfaceC27009e
        /* JADX INFO: renamed from: a */
        public void mo66471a(View view) {
            this.f54290c = view;
            this.f54288a.setView(view);
        }

        @Override // com.kubi.utils.ToastCompat.InterfaceC27009e
        /* JADX INFO: renamed from: c */
        public void mo66472c(CharSequence charSequence) {
            View viewM66466J = this.f54289b.m66466J(charSequence);
            if (viewM66466J != null) {
                mo66471a(viewM66466J);
                return;
            }
            View view = this.f54288a.getView();
            this.f54290c = view;
            if (view == null || view.findViewById(R.id.message) == null) {
                mo66471a(ToastCompat.m66459p(R$layout.toast_view));
            }
            TextView textView = (TextView) this.f54290c.findViewById(R.id.message);
            textView.setText(charSequence);
            if (this.f54289b.f54274g != -16777217) {
                textView.setTextColor(this.f54289b.f54274g);
            }
            if (this.f54289b.f54275h != -1) {
                textView.setTextSize(this.f54289b.f54275h);
            }
            m66473d(textView);
        }

        @Override // com.kubi.utils.ToastCompat.InterfaceC27009e
        @CallSuper
        public void cancel() {
            try {
                Toast toast = this.f54288a;
                if (toast != null) {
                    toast.setView(new View(C5287o0.m6331a()));
                    this.f54288a.cancel();
                }
                this.f54288a = null;
                this.f54290c = null;
            } catch (Exception e11) {
                C45463a.m100408a(e11, "ToastCompat_AbsToast");
            }
        }

        /* JADX INFO: renamed from: d */
        public void m66473d(TextView textView) {
            if (this.f54289b.f54273f != -1) {
                this.f54290c.setBackgroundResource(this.f54289b.f54273f);
                textView.setBackgroundColor(0);
                return;
            }
            if (this.f54289b.f54272e != -16777217) {
                Drawable background = this.f54290c.getBackground();
                Drawable background2 = textView.getBackground();
                if (background != null && background2 != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f54289b.f54272e, PorterDuff.Mode.SRC_IN));
                    textView.setBackgroundColor(0);
                } else if (background != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f54289b.f54272e, PorterDuff.Mode.SRC_IN));
                } else if (background2 != null) {
                    background2.mutate().setColorFilter(new PorterDuffColorFilter(this.f54289b.f54272e, PorterDuff.Mode.SRC_IN));
                } else {
                    this.f54290c.setBackgroundColor(this.f54289b.f54272e);
                }
            }
        }

        public AbstractC27007c(ToastCompat toastCompat) {
            this.f54289b = toastCompat;
            if (toastCompat.f54269b == -1 && this.f54289b.f54270c == -1 && this.f54289b.f54271d == -1) {
                return;
            }
            this.f54288a.setGravity(this.f54289b.f54269b, this.f54289b.f54270c, this.f54289b.f54271d);
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$d */
    /* JADX INFO: loaded from: classes54.dex */
    public static final class C27008d extends AbstractC27007c {

        /* JADX INFO: renamed from: f */
        public static int f54291f;

        /* JADX INFO: renamed from: g */
        public static final Activity f54292g;

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ InterfaceC43175a.a f54293h;

        /* JADX INFO: renamed from: d */
        public C5287o0.a f54294d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final Window f54295e;

        /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                C27008d.this.cancel();
            }
        }

        /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$d$b */
        public class b extends C5287o0.a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f54297a;

            public b(int i11) {
                this.f54297a = i11;
            }

            @Override // com.blankj.utilcode.util.C5287o0.a
            /* JADX INFO: renamed from: a */
            public void mo6333a(@NonNull Activity activity) {
                Window window;
                if (!C27008d.this.m66480j() || (window = activity.getWindow()) == null) {
                    return;
                }
                C27008d.this.m66484n((ViewGroup) window.getDecorView(), this.f54297a, false);
            }
        }

        public C27008d(ToastCompat toastCompat) {
            this(toastCompat, null);
        }

        public C27008d(ToastCompat toastCompat, @Nullable Window window) {
            super(toastCompat);
            this.f54295e = window;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m66476g() {
            C36686b c36686b = new C36686b("ToastCompat.java", C27008d.class);
            f54293h = c36686b.m82128h("method-execution", c36686b.m82127g("1", "cancel", "com.kubi.utils.ToastCompat$ActivityToast", "", "", "", "void"), 854);
        }

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ void m66477h(C27008d c27008d, InterfaceC43175a interfaceC43175a) {
            Window window;
            ViewGroup viewGroup;
            Window window2 = c27008d.f54295e;
            if (window2 != null && (viewGroup = (ViewGroup) window2.getDecorView()) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TAG_TOAST");
                sb2.append(f54291f - 1);
                View viewFindViewWithTag = viewGroup.findViewWithTag(sb2.toString());
                if (viewFindViewWithTag != null) {
                    try {
                        viewGroup.removeView(viewFindViewWithTag);
                    } catch (Exception e11) {
                        C44128b.m97263g("TAG_TOAST", e11);
                    }
                }
            }
            if (c27008d.m66480j()) {
                c27008d.m66485o();
                for (Activity activity : C5258a.m6124g()) {
                    if (C5258a.m6126i(activity) && (window = activity.getWindow()) != null) {
                        ViewGroup viewGroup2 = (ViewGroup) window.getDecorView();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("TAG_TOAST");
                        sb3.append(f54291f - 1);
                        View viewFindViewWithTag2 = viewGroup2.findViewWithTag(sb3.toString());
                        if (viewFindViewWithTag2 != null) {
                            try {
                                viewGroup2.removeView(viewFindViewWithTag2);
                            } catch (Exception e12) {
                                C44128b.m97263g("TAG_TOAST", e12);
                            }
                        }
                    }
                }
            }
            super.cancel();
        }

        @Override // com.kubi.utils.ToastCompat.InterfaceC27009e
        /* JADX INFO: renamed from: b */
        public void mo66478b(int i11) {
            if (this.f54288a == null) {
                return;
            }
            Window window = this.f54295e;
            if (window != null && window.getDecorView().isAttachedToWindow()) {
                m66484n((ViewGroup) this.f54295e.getDecorView(), f54291f, true);
                m66482l(i11);
                f54291f++;
                return;
            }
            if (!C5264d.m6168n()) {
                m66483m(i11);
                return;
            }
            boolean z11 = false;
            for (Activity activity : C5258a.m6124g()) {
                if (C5258a.m6126i(activity)) {
                    Window window2 = activity.getWindow();
                    if (window2 != null) {
                        m66484n((ViewGroup) window2.getDecorView(), f54291f, true);
                    }
                    z11 = true;
                }
            }
            if (!z11) {
                m66483m(i11);
                return;
            }
            m66481k();
            m66482l(i11);
            f54291f++;
        }

        @Override // com.kubi.utils.ToastCompat.AbstractC27007c, com.kubi.utils.ToastCompat.InterfaceC27009e
        public void cancel() throws Throwable {
            ToastCompatAspect.m56544b().m56545c(new C27104z0(new Object[]{this, C36686b.m82122b(f54293h, this, this)}).linkClosureAndJoinPoint(69648));
        }

        /* JADX INFO: renamed from: i */
        public final View m66479i(int i11) {
            Bitmap bitmapM6362m = C5290q.m6362m(this.f54290c);
            ImageView imageView = new ImageView(C5287o0.m6331a());
            imageView.setTag("TAG_TOAST" + i11);
            imageView.setImageBitmap(bitmapM6362m);
            return imageView;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m66480j() {
            return this.f54294d != null;
        }

        /* JADX INFO: renamed from: k */
        public final void m66481k() {
            b bVar = new b(f54291f);
            this.f54294d = bVar;
            C5258a.m6118a(f54292g, bVar);
        }

        /* JADX INFO: renamed from: l */
        public final void m66482l(int i11) {
            ThreadUtils.m6115h(new a(), i11 == 0 ? 2000L : 3500L);
        }

        /* JADX INFO: renamed from: m */
        public final void m66483m(int i11) {
            C27010f c27010f = new C27010f(this.f54289b);
            c27010f.f54288a = this.f54288a;
            c27010f.mo66478b(i11);
        }

        /* JADX INFO: renamed from: n */
        public final void m66484n(ViewGroup viewGroup, int i11, boolean z11) {
            if (viewGroup == null) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.f54288a.getGravity();
            layoutParams.bottomMargin = this.f54288a.getYOffset() + C5270g.m6191e();
            layoutParams.leftMargin = this.f54288a.getXOffset();
            View viewM66479i = m66479i(i11);
            if (z11) {
                viewM66479i.setAlpha(0.0f);
                viewM66479i.animate().alpha(1.0f).setDuration(200L).start();
            }
            viewGroup.addView(viewM66479i, layoutParams);
        }

        /* JADX INFO: renamed from: o */
        public final void m66485o() {
            C5258a.m6128k(f54292g, this.f54294d);
            this.f54294d = null;
        }

        static {
            m66476g();
            f54291f = 0;
            f54292g = new Activity();
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$e */
    /* JADX INFO: loaded from: classes54.dex */
    public interface InterfaceC27009e {
        /* JADX INFO: renamed from: a */
        void mo66471a(View view);

        /* JADX INFO: renamed from: b */
        void mo66478b(int i11);

        /* JADX INFO: renamed from: c */
        void mo66472c(CharSequence charSequence);

        void cancel();
    }

    /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$f */
    /* JADX INFO: loaded from: classes54.dex */
    public static final class C27010f extends AbstractC27007c {

        /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$f$a */
        public static class a extends Handler {

            /* JADX INFO: renamed from: a */
            public Handler f54299a;

            @Override // android.os.Handler
            public void dispatchMessage(@NonNull Message message) {
                try {
                    this.f54299a.dispatchMessage(message);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // android.os.Handler
            public void handleMessage(@NonNull Message message) {
                this.f54299a.handleMessage(message);
            }

            public a(Handler handler) {
                this.f54299a = handler;
            }
        }

        @Override // com.kubi.utils.ToastCompat.InterfaceC27009e
        /* JADX INFO: renamed from: b */
        public void mo66478b(int i11) {
            Toast toast = this.f54288a;
            if (toast == null) {
                return;
            }
            toast.setDuration(i11);
            this.f54288a.show();
        }

        public C27010f(ToastCompat toastCompat) {
            super(toastCompat);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f54288a);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new a((Handler) declaredField2.get(obj)));
                } catch (Exception e11) {
                    C44128b.m97263g("TAG_TOAST", e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$g */
    /* JADX INFO: loaded from: classes54.dex */
    public static final class C27011g extends AbstractC27007c {

        /* JADX INFO: renamed from: d */
        public WindowManager f54300d;

        /* JADX INFO: renamed from: e */
        public WindowManager.LayoutParams f54301e;

        /* JADX INFO: renamed from: com.kubi.utils.ToastCompat$g$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C27011g.this.cancel();
            }
        }

        @Override // com.kubi.utils.ToastCompat.InterfaceC27009e
        /* JADX INFO: renamed from: b */
        public void mo66478b(int i11) {
            if (this.f54288a == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = this.f54301e;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation.Toast;
            layoutParams.setTitle("ToastWithoutNotification");
            WindowManager.LayoutParams layoutParams2 = this.f54301e;
            layoutParams2.flags = 152;
            layoutParams2.packageName = C5287o0.m6331a().getPackageName();
            this.f54301e.gravity = this.f54288a.getGravity();
            WindowManager.LayoutParams layoutParams3 = this.f54301e;
            int i12 = layoutParams3.gravity;
            if ((i12 & 7) == 7) {
                layoutParams3.horizontalWeight = 1.0f;
            }
            if ((i12 & 112) == 112) {
                layoutParams3.verticalWeight = 1.0f;
            }
            layoutParams3.x = this.f54288a.getXOffset();
            this.f54301e.y = this.f54288a.getYOffset();
            this.f54301e.horizontalMargin = this.f54288a.getHorizontalMargin();
            this.f54301e.verticalMargin = this.f54288a.getVerticalMargin();
            WindowManager windowManager = (WindowManager) C5287o0.m6331a().getSystemService(InterfaceC33953u5.f72199F);
            this.f54300d = windowManager;
            if (windowManager != null) {
                try {
                    windowManager.addView(this.f54290c, this.f54301e);
                } catch (Exception e11) {
                    C44128b.m97263g("TAG_TOAST", e11);
                }
            }
            ThreadUtils.m6115h(new a(), i11 == 0 ? 2000L : 3500L);
        }

        @Override // com.kubi.utils.ToastCompat.AbstractC27007c, com.kubi.utils.ToastCompat.InterfaceC27009e
        public void cancel() {
            try {
                WindowManager windowManager = this.f54300d;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.f54290c);
                    this.f54300d = null;
                }
            } catch (Exception e11) {
                C44128b.m97263g("TAG_TOAST", e11);
            }
            super.cancel();
        }

        public C27011g(ToastCompat toastCompat, int i11) {
            super(toastCompat);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f54301e = layoutParams;
            layoutParams.type = i11;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m66437C(@StringRes int i11) {
        m66463x(m66442H(i11, new Object[0]), 0, f54266l);
    }

    /* JADX INFO: renamed from: F */
    public static void m66440F(CharSequence charSequence) {
        m66463x(charSequence, 0, f54266l);
    }

    /* JADX INFO: renamed from: x */
    public static void m66463x(CharSequence charSequence, int i11, ToastCompat toastCompat) {
        m66462w(null, m66458o(charSequence), i11, toastCompat);
    }

    /* JADX INFO: renamed from: z */
    public static void m66465z(@StringRes int i11) {
        m66463x(m66442H(i11, new Object[0]), 1, f54266l);
    }

    /* JADX INFO: renamed from: I */
    public static CharSequence m66443I(String str, Object... objArr) {
        if (str == null) {
            return "toast null";
        }
        return (objArr == null || objArr.length <= 0) ? str : String.format(str, objArr);
    }

    /* JADX INFO: renamed from: m */
    public static void m66456m() {
        InterfaceC27009e interfaceC27009e = f54267m;
        if (interfaceC27009e != null) {
            interfaceC27009e.cancel();
            f54267m = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static ToastCompat m66457n() {
        return f54266l;
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m66458o(CharSequence charSequence) {
        if (charSequence == null) {
            return "toast null";
        }
        return charSequence.length() == 0 ? "toast nothing" : charSequence;
    }

    /* JADX INFO: renamed from: q */
    public static ToastCompat m66460q() {
        return new ToastCompat();
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC27009e m66461r(ToastCompat toastCompat) {
        if (!toastCompat.f54278k && NotificationManagerCompat.from(C5287o0.m6331a()).areNotificationsEnabled() && !C5304x.m6513a()) {
            return new C27010f(toastCompat);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 25) {
            return new C27011g(toastCompat, 2005);
        }
        if (C5304x.m6513a()) {
            if (i11 >= 26) {
                new C27011g(toastCompat, 2038);
            } else {
                new C27011g(toastCompat, 2002);
            }
        }
        return new C27008d(toastCompat);
    }

    /* JADX INFO: renamed from: J */
    public final View m66466J(CharSequence charSequence) {
        if (!"dark".equals(this.f54268a) && !"light".equals(this.f54268a)) {
            Drawable[] drawableArr = this.f54277j;
            if (drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                return null;
            }
        }
        View viewM66459p = m66459p(R$layout.toast_view);
        TextView textView = (TextView) viewM66459p.findViewById(R.id.message);
        if ("dark".equals(this.f54268a)) {
            ((GradientDrawable) viewM66459p.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
            textView.setTextColor(-1);
        }
        textView.setText(charSequence);
        if (this.f54277j[0] != null) {
            View viewFindViewById = viewM66459p.findViewById(R$id.utvLeftIconView);
            ViewCompat.setBackground(viewFindViewById, this.f54277j[0]);
            viewFindViewById.setVisibility(0);
        }
        if (this.f54277j[1] != null) {
            View viewFindViewById2 = viewM66459p.findViewById(R$id.utvTopIconView);
            ViewCompat.setBackground(viewFindViewById2, this.f54277j[1]);
            viewFindViewById2.setVisibility(0);
        }
        if (this.f54277j[2] != null) {
            View viewFindViewById3 = viewM66459p.findViewById(R$id.utvRightIconView);
            ViewCompat.setBackground(viewFindViewById3, this.f54277j[2]);
            viewFindViewById3.setVisibility(0);
        }
        if (this.f54277j[3] != null) {
            View viewFindViewById4 = viewM66459p.findViewById(R$id.utvBottomIconView);
            ViewCompat.setBackground(viewFindViewById4, this.f54277j[3]);
            viewFindViewById4.setVisibility(0);
        }
        return viewM66459p;
    }

    /* JADX INFO: renamed from: s */
    public final ToastCompat m66467s(@DrawableRes int i11) {
        this.f54273f = i11;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final ToastCompat m66468t(int i11, int i12, int i13) {
        this.f54269b = i11;
        this.f54270c = i12;
        this.f54271d = i13;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final ToastCompat m66469u(@ColorInt int i11) {
        this.f54274g = i11;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final ToastCompat m66470v(int i11) {
        this.f54275h = i11;
        return this;
    }

    /* JADX INFO: renamed from: A */
    public static void m66435A(@NonNull Window window, String str, Object... objArr) {
        m66464y(window, m66443I(str, objArr), 1, f54266l);
    }

    /* JADX INFO: renamed from: B */
    public static void m66436B(String str, Object... objArr) {
        m66463x(m66443I(str, objArr), 1, f54266l);
    }

    /* JADX INFO: renamed from: D */
    public static void m66438D(@StringRes int i11, Object... objArr) {
        m66463x(m66442H(i11, objArr), 0, f54266l);
    }

    /* JADX INFO: renamed from: E */
    public static void m66439E(@NonNull Window window, String str, Object... objArr) {
        m66464y(window, m66443I(str, objArr), 0, f54266l);
    }

    /* JADX INFO: renamed from: G */
    public static void m66441G(String str, Object... objArr) {
        m66463x(m66443I(str, objArr), 0, f54266l);
    }

    /* JADX INFO: renamed from: H */
    public static CharSequence m66442H(int i11, Object... objArr) {
        try {
            CharSequence text = C5287o0.m6331a().getResources().getText(i11);
            if (objArr != null && objArr.length > 0) {
                return String.format(text.toString(), objArr);
            }
            return text;
        } catch (Exception unused) {
            return String.valueOf(i11);
        }
    }

    /* JADX INFO: renamed from: p */
    public static View m66459p(@LayoutRes int i11) {
        return ((LayoutInflater) C5287o0.m6331a().getSystemService("layout_inflater")).inflate(i11, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: w */
    public static void m66462w(@Nullable View view, CharSequence charSequence, int i11, ToastCompat toastCompat) {
        if (charSequence != "toast null" && charSequence != "toast nothing") {
            C42917g.m94139e().execute(toastCompat.new RunnableC27005a(view, charSequence, i11));
        } else {
            C45463a.m100409b("text is null or empty", "ToastCompat");
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m66464y(@NonNull Window window, CharSequence charSequence, int i11, ToastCompat toastCompat) {
        CharSequence charSequenceM66458o = m66458o(charSequence);
        if (!charSequenceM66458o.equals("toast null") && !charSequenceM66458o.equals("toast nothing")) {
            C42917g.m94139e().execute(toastCompat.new RunnableC27006b(window, charSequenceM66458o, i11));
        } else {
            C45463a.m100409b("text is null or empty", "ToastCompat");
        }
    }
}
