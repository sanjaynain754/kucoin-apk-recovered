package aq;

import com.kubi.market.monitor.lib.p100ui.floating.window.util.FloatingWindowHelper;
import com.kubi.sdk.BaseApplication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: aq.e */
/* JADX INFO: compiled from: FloatingWindowManager.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0013JB\u0010\u001e\u001a\u00020\u00152\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110 ¢\u0006\u0002\b!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00150 J\b\u0010&\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006'"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowManager;", "", "<init>", "()V", "WINDOW_CREAT_FAIL", "", "WINDOW_CREAT_SHOWFAIL", "WINDOW_CREAT_CREATEORSHOW_SUCCESS", "WINDOW_SHOWING", "floatingWindowHelper", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper;", "getFloatingWindowHelper", "()Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper;", "setFloatingWindowHelper", "(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper;)V", "create", "config", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "windowShowing", "", "showWindowView", "", "dismissView", "dismissViewAndWindow", "defaultDisplayHeight", "windowFrameLayoutHeight", "updatefloatingWindowParams", "viewWidth", "isStayLeft", "isStayTop", "updataFloatingConfig", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "updataView", "Lkotlin/ParameterName;", "name", "data", "getFloatConfig", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4376e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4376e f3773a = new C4376e();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static FloatingWindowHelper f3774b;

    /* JADX INFO: renamed from: a */
    public final int m3911a(@NotNull WindowStatus config) {
        Intrinsics.checkNotNullParameter(config, "config");
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            return floatingWindowHelper.m41213r(config);
        }
        FloatingWindowHelper floatingWindowHelper2 = new FloatingWindowHelper(BaseApplication.INSTANCE.get(), config);
        f3774b = floatingWindowHelper2;
        return floatingWindowHelper2.m41203g();
    }

    /* JADX INFO: renamed from: b */
    public final int m3912b() {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            return floatingWindowHelper.m41204h();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m3913c() throws Throwable {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            floatingWindowHelper.m41217w();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3914d() throws Throwable {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            floatingWindowHelper.m41217w();
        }
        f3774b = null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final WindowStatus m3915e() {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            return floatingWindowHelper.m41207k();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3916f() {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            return floatingWindowHelper.m41219y();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3917g() {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            return floatingWindowHelper.m41220z();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m3918h() throws Throwable {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            floatingWindowHelper.m41215t();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3919i(@NotNull Function1<? super WindowStatus, WindowStatus> block, @NotNull Function1<? super WindowStatus, Unit> updataView) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(updataView, "updataView");
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            floatingWindowHelper.m41212q(block, updataView);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3920j(int i11) {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            floatingWindowHelper.m41214s(i11);
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m3921k() {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            return floatingWindowHelper.m41216u();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3922l() {
        FloatingWindowHelper floatingWindowHelper = f3774b;
        if (floatingWindowHelper != null) {
            return floatingWindowHelper.m41218x();
        }
        return false;
    }
}
