package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.kubi.sdk.aspect.BarUtilsAspect;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;

/* JADX INFO: renamed from: com.blankj.utilcode.util.g */
/* JADX INFO: compiled from: BarUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5270g {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC43175a.a f6512a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC43175a.a f6513b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6187a() {
        C36686b c36686b = new C36686b("BarUtils.java", C5270g.class);
        f6512a = c36686b.m82128h("method-execution", c36686b.m82127g("9", "getStatusBarHeight", "com.blankj.utilcode.util.BarUtils", "", "", "", "int"), 59);
        f6513b = c36686b.m82128h("method-execution", c36686b.m82127g("9", "getNavBarHeight", "com.blankj.utilcode.util.BarUtils", "", "", "", "int"), 485);
    }

    /* JADX INFO: renamed from: c */
    public static View m6189c(Window window, int i11, boolean z11) {
        ViewGroup viewGroup = z11 ? (ViewGroup) window.getDecorView() : (ViewGroup) window.findViewById(R.id.content);
        View viewFindViewWithTag = viewGroup.findViewWithTag("TAG_STATUS_BAR");
        if (viewFindViewWithTag == null) {
            View viewM6190d = m6190d(window.getContext(), i11);
            viewGroup.addView(viewM6190d);
            return viewM6190d;
        }
        if (viewFindViewWithTag.getVisibility() == 8) {
            viewFindViewWithTag.setVisibility(0);
        }
        viewFindViewWithTag.setBackgroundColor(i11);
        return viewFindViewWithTag;
    }

    /* JADX INFO: renamed from: d */
    public static View m6190d(Context context, int i11) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, m6194h()));
        view.setBackgroundColor(i11);
        view.setTag("TAG_STATUS_BAR");
        return view;
    }

    /* JADX INFO: renamed from: e */
    public static int m6191e() {
        return BarUtilsAspect.m56517g().m56520j(new C5268f(new Object[]{C36686b.m82122b(f6513b, null, null)}).linkClosureAndJoinPoint(65536));
    }

    /* JADX INFO: renamed from: h */
    public static int m6194h() {
        return BarUtilsAspect.m56517g().m56521k(new C5266e(new Object[]{C36686b.m82122b(f6512a, null, null)}).linkClosureAndJoinPoint(65536));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6196j(@NonNull Window window) {
        boolean z11;
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                z11 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i11);
            int id2 = childAt.getId();
            if (id2 != -1 && "navigationBarBackground".equals(m6193g(id2)) && childAt.getVisibility() == 0) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (z11) {
            return (viewGroup.getSystemUiVisibility() & 2) == 0;
        }
        return z11;
    }

    /* JADX INFO: renamed from: l */
    public static void m6198l(@NonNull Activity activity, boolean z11) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6199m(activity.getWindow(), z11);
    }

    /* JADX INFO: renamed from: m */
    public static void m6199m(@NonNull Window window, boolean z11) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z11 ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m6200n(@NonNull Window window, boolean z11) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            int id2 = childAt.getId();
            if (id2 != -1 && "navigationBarBackground".equals(m6193g(id2))) {
                childAt.setVisibility(z11 ? 0 : 4);
            }
        }
        if (z11) {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4611));
        } else {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
        }
    }

    /* JADX INFO: renamed from: o */
    public static View m6201o(@NonNull Activity activity, @ColorInt int i11) {
        if (activity != null) {
            return m6202p(activity, i11, false);
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: p */
    public static View m6202p(@NonNull Activity activity, @ColorInt int i11, boolean z11) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6206t(activity);
        return m6188b(activity, i11, z11);
    }

    /* JADX INFO: renamed from: q */
    public static void m6203q(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("Argument 'fakeStatusBar' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        Activity activityM6489l = C5299u0.m6489l(view.getContext());
        if (activityM6489l == null) {
            return;
        }
        m6206t(activityM6489l);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, m6194h()));
        } else {
            layoutParams.width = -1;
            layoutParams.height = m6194h();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m6204r(@NonNull Activity activity, boolean z11) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6205s(activity.getWindow(), z11);
    }

    /* JADX INFO: renamed from: s */
    public static void m6205s(@NonNull Window window, boolean z11) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z11 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    /* JADX INFO: renamed from: u */
    public static void m6207u(Window window) {
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.setStatusBarColor(0);
    }

    static {
        m6187a();
    }

    public C5270g() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX INFO: renamed from: b */
    public static View m6188b(Activity activity, int i11, boolean z11) {
        return m6189c(activity.getWindow(), i11, z11);
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int m6192f(InterfaceC43175a interfaceC43175a) {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static String m6193g(int i11) {
        try {
            return C5287o0.m6331a().getResources().getResourceEntryName(i11);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int m6195i(InterfaceC43175a interfaceC43175a) {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6197k() {
        WindowManager windowManager = (WindowManager) C5287o0.m6331a().getSystemService(InterfaceC33953u5.f72199F);
        if (windowManager == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        if (point2.y == point.y && point2.x == point.x) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static void m6206t(Activity activity) {
        m6207u(activity.getWindow());
    }
}
