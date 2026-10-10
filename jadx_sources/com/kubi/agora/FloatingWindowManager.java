package com.kubi.agora;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.kubi.widget.web.ui.KWebContainer;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatingWindowManager.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/agora/FloatingWindowManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "windowManager", "Landroid/view/WindowManager;", "floatingView", "Landroid/view/View;", "floatLP", "Landroid/view/WindowManager$LayoutParams;", "isShowing", "", "()Z", "showWithWebView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onExpand", "Ljava/lang/Runnable;", "tryMoveViewToFloatWindow", "root", "createFloatLayoutParams", "createFloatView", "detachWebViewBeforeDismiss", "dismiss", "Companion", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatingWindowManager {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f15193e = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static int f15194f;

    /* JADX INFO: renamed from: g */
    public static int f15195g;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f15196a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final WindowManager f15197b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public View f15198c;

    /* JADX INFO: renamed from: d */
    public WindowManager.LayoutParams f15199d;

    /* JADX INFO: compiled from: FloatingWindowManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/agora/FloatingWindowManager$Companion;", "", "<init>", "()V", "floatX", "", "getFloatX", "()I", "setFloatX", "(I)V", "floatY", "getFloatY", "setFloatY", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int getFloatX() {
            return FloatingWindowManager.f15194f;
        }

        public final int getFloatY() {
            return FloatingWindowManager.f15195g;
        }

        public final void setFloatX(int i11) {
            FloatingWindowManager.f15194f = i11;
        }

        public final void setFloatY(int i11) {
            FloatingWindowManager.f15195g = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.agora.FloatingWindowManager$a */
    /* JADX INFO: compiled from: FloatingWindowManager.kt */
    @Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m90084d2 = {"com/kubi/agora/FloatingWindowManager$createFloatView$1", "Landroid/view/View$OnTouchListener;", "initY", "", "getInitY", "()I", "setInitY", "(I)V", "initTouchY", "", "getInitTouchY", "()F", "setInitTouchY", "(F)V", "moved", "", "getMoved", "()Z", "setMoved", "(Z)V", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewOnTouchListenerC9380a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b */
        public int f15200b;

        /* JADX INFO: renamed from: c */
        public float f15201c;

        /* JADX INFO: renamed from: d */
        public boolean f15202d;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f15204f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Runnable f15205g;

        public ViewOnTouchListenerC9380a(View view, Runnable runnable) {
            this.f15204f = view;
            this.f15205g = runnable;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v11, MotionEvent event) {
            Runnable runnable;
            Intrinsics.checkNotNullParameter(event, "event");
            int action = event.getAction();
            WindowManager.LayoutParams layoutParams = null;
            if (action == 0) {
                WindowManager.LayoutParams layoutParams2 = FloatingWindowManager.this.f15199d;
                if (layoutParams2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("floatLP");
                } else {
                    layoutParams = layoutParams2;
                }
                this.f15200b = layoutParams.y;
                this.f15201c = event.getRawY();
                this.f15202d = false;
                return true;
            }
            if (action == 1) {
                if (!this.f15202d && (runnable = this.f15205g) != null) {
                    runnable.run();
                }
                return true;
            }
            if (action != 2) {
                return false;
            }
            int rawY = (int) (event.getRawY() - this.f15201c);
            if (Math.abs(rawY) > 5) {
                this.f15202d = true;
            }
            Companion companion = FloatingWindowManager.f15193e;
            companion.setFloatY(companion.getFloatY() + rawY);
            WindowManager.LayoutParams layoutParams3 = FloatingWindowManager.this.f15199d;
            if (layoutParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatLP");
                layoutParams3 = null;
            }
            layoutParams3.y = companion.getFloatY();
            this.f15201c = event.getRawY();
            WindowManager windowManager = FloatingWindowManager.this.f15197b;
            View view = this.f15204f;
            WindowManager.LayoutParams layoutParams4 = FloatingWindowManager.this.f15199d;
            if (layoutParams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatLP");
            } else {
                layoutParams = layoutParams4;
            }
            windowManager.updateViewLayout(view, layoutParams);
            return true;
        }
    }

    public FloatingWindowManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15196a = context;
        Object systemService = context.getSystemService(InterfaceC33953u5.f72199F);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f15197b = (WindowManager) systemService;
    }

    /* JADX INFO: renamed from: g */
    public final WindowManager.LayoutParams m14861g() {
        DisplayMetrics displayMetrics = this.f15196a.getResources().getDisplayMetrics();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 32, -3);
        layoutParams.gravity = 8388659;
        if (f15194f == 0 && f15195g == 0) {
            f15194f = displayMetrics.widthPixels;
            f15195g = C43881b.m96650a(89);
        }
        layoutParams.x = f15194f;
        layoutParams.y = f15195g;
        return layoutParams;
    }

    /* JADX INFO: renamed from: h */
    public final View m14862h(Runnable runnable) {
        View viewInflate = LayoutInflater.from(this.f15196a).inflate(R$layout.layout_agora_screen_share_floating, (ViewGroup) null);
        viewInflate.setOnTouchListener(new ViewOnTouchListenerC9380a(viewInflate, runnable));
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: i */
    public final void m14863i() {
        View childAt;
        View view = this.f15198c;
        if (view instanceof LinearLayout) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) view;
            int childCount = linearLayout.getChildCount();
            do {
                childCount--;
                if (-1 >= childCount) {
                    return;
                } else {
                    childAt = linearLayout.getChildAt(childCount);
                }
            } while (!(childAt instanceof KWebContainer));
            linearLayout.removeView(childAt);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m14864j() {
        View view = this.f15198c;
        if (view != null) {
            try {
                this.f15197b.removeView(view);
            } catch (Exception unused) {
            }
        }
        this.f15198c = null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m14865k() {
        return this.f15198c != null;
    }

    /* JADX INFO: renamed from: l */
    public final void m14866l(@NotNull View view, @Nullable Runnable runnable) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (m14865k()) {
            return;
        }
        View viewM14862h = m14862h(runnable);
        this.f15199d = m14861g();
        m14867m(view, viewM14862h);
        WindowManager windowManager = this.f15197b;
        WindowManager.LayoutParams layoutParams = this.f15199d;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatLP");
            layoutParams = null;
        }
        windowManager.addView(viewM14862h, layoutParams);
        this.f15198c = viewM14862h;
    }

    /* JADX INFO: renamed from: m */
    public final void m14867m(View view, View view2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(0, 0);
        if (view2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) view2;
        }
        if (viewGroup2 != null) {
            viewGroup2.addView(view, layoutParams);
        }
    }
}
