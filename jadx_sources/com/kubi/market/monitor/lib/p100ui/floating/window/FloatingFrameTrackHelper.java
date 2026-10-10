package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.app.Activity;
import aq.C4373b;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.mvi.common.MviExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import java.util.UUID;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: FloatingFrameTrackHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrameTrackHelper;", "", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "job", "Lkotlinx/coroutines/Job;", "appStatusChangedListener", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "showTime", "", "unRegisterAppStatusChangedListener", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroy", "onBackground", "onForeground", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatingFrameTrackHelper {

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC41775x1 f34441b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C5287o0.b f34442c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41709m0 f34440a = MviExKt.m42508d("FloatingFrameTrackHelper", null, 2, null);

    /* JADX INFO: renamed from: d */
    public long f34443d = System.currentTimeMillis();

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingFrameTrackHelper$a */
    /* JADX INFO: compiled from: FloatingFrameTrackHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/window/FloatingFrameTrackHelper$1", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onBackground", "", "activity", "Landroid/app/Activity;", "onForeground", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18736a implements C5287o0.b {
        public C18736a() {
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            FloatingFrameTrackHelper.this.m41029b();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            FloatingFrameTrackHelper.this.m41031e();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m41028d(long j11, JSONObject trackExpose) throws JSONException {
        Intrinsics.checkNotNullParameter(trackExpose, "$this$trackExpose");
        trackExpose.put("allItemAmount", j11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m41029b() {
        InterfaceC41775x1 interfaceC41775x1 = this.f34441b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        C44128b.m97259c("FloatingFrameTrackHelper", "onBackground");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f34441b = MviExKt.m42522r(this.f34440a, Integer.MAX_VALUE, 60000L, null, null, null, new FloatingFrameTrackHelper$onBackground$1(string, null), 28, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m41030c() {
        C44128b.m97259c("FloatingFrameTrackHelper", "onDestroy");
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f34443d;
        C4373b.m3910l("B1window", "1", null, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingFrameTrackHelper.m41028d(jCurrentTimeMillis, (JSONObject) obj);
            }
        }, 4, null);
        InterfaceC41775x1 interfaceC41775x1 = this.f34441b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        m41034h();
    }

    /* JADX INFO: renamed from: e */
    public final void m41031e() {
        InterfaceC41775x1 interfaceC41775x1 = this.f34441b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m41034h() {
        C5287o0.b bVar = this.f34442c;
        if (bVar != null) {
            C5264d.unregisterAppStatusChangedListener(bVar);
        }
    }

    public FloatingFrameTrackHelper() {
        C44128b.m97259c("FloatingFrameTrackHelper", "init");
        C18736a c18736a = new C18736a();
        this.f34442c = c18736a;
        C5264d.registerAppStatusChangedListener(c18736a);
    }

    /* JADX INFO: renamed from: g */
    public final void m41033g() {
        this.f34443d = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    public final void m41032f() {
    }
}
