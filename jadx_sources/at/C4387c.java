package at;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.home.api.IHomeService;
import com.kubi.home.realtime.IRealTimeWidgetService;
import com.kubi.operation.lib.realtimev2.common.CommonRealtimeAdapter;
import com.kubi.operation.lib.realtimev2.common.CommonRealtimeDataHelper;
import com.kubi.operation.lib.realtimev2.common.CommonRealtimeListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ss.C44542b;

/* JADX INFO: renamed from: at.c */
/* JADX INFO: compiled from: RealtimeHelperV2.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0086\bø\u0001\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/operation/lib/realtimev2/RealtimeHelperV2;", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "<init>", "()V", "TAG", "", NotificationCompat.CATEGORY_SERVICE, "Lcom/kubi/home/realtime/IRealTimeWidgetService;", "getService$OperationLib_googleRelease", "()Lcom/kubi/home/realtime/IRealTimeWidgetService;", "service$delegate", "Lkotlin/Lazy;", "applyNewDynamicFeature", "", "getApplyNewDynamicFeature", "()Z", "applyNewDynamicFeature$delegate", "init", "", "onForeground", "activity", "Landroid/app/Activity;", "onBackground", "logD", "tag", "msg", "Lkotlin/Function0;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealtimeHelperV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealtimeHelperV2.kt\ncom/kubi/operation/lib/realtimev2/RealtimeHelperV2\n*L\n1#1,57:1\n53#1,4:58\n*S KotlinDebug\n*F\n+ 1 RealtimeHelperV2.kt\ncom/kubi/operation/lib/realtimev2/RealtimeHelperV2\n*L\n32#1:58,4\n*E\n"})
public final class C4387c implements C5287o0.b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4387c f3817a = new C4387c();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f3818b = LazyKt.lazy(new Function0() { // from class: at.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4387c.m3988g();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f3819c = LazyKt.lazy(new Function0() { // from class: at.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C4387c.m3987c());
        }
    });

    /* JADX INFO: renamed from: c */
    public static final boolean m3987c() {
        return C44542b.f98754a.m98608c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final IRealTimeWidgetService m3988g() {
        return IRealTimeWidgetService.f26087a.get();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3989d() {
        return ((Boolean) f3819c.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IRealTimeWidgetService m3990e() {
        return (IRealTimeWidgetService) f3818b.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m3991f() {
        if (IHomeService.f25434a.get().mo28952h()) {
            m3990e().mo30031a(new CommonRealtimeAdapter());
            m3990e().mo30032b(new CommonRealtimeListener());
            C5264d.registerAppStatusChangedListener(this);
        }
    }

    @Override // com.blankj.utilcode.util.C5287o0.b
    public void onBackground(@Nullable Activity activity) {
        CommonRealtimeDataHelper.f36803a.m43558i();
    }

    @Override // com.blankj.utilcode.util.C5287o0.b
    public void onForeground(@Nullable Activity activity) throws JSONException {
        CommonRealtimeDataHelper.f36803a.m43560k();
    }
}
