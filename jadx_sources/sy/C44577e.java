package sy;

import android.content.Context;
import android.net.Proxy;
import com.blankj.utilcode.util.C5276j;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.FlutterConfig;
import com.kubi.sdk.flutter.handler.IMethodHandler;
import com.kubi.sdk.mode.AppMode;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27029c;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import gf.C37885i;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p402kf.C41016c;
import p694vk.C45590s;
import p741wy.InterfaceC45948h;
import p741wy.InterfaceC45957q;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: sy.e */
/* JADX INFO: compiled from: GetAppInfoHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/flutter/handler/GetAppInfoHandler;", "Lcom/kubi/sdk/flutter/handler/IMethodHandler;", "<init>", "()V", "handleMethod", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "themeMode", "", "iTransmit", "Lcom/kubi/sdk/flutter/transmit/IKumexGetMaxLeverageTransmit;", "getITransmit", "()Lcom/kubi/sdk/flutter/transmit/IKumexGetMaxLeverageTransmit;", "iTransmit$delegate", "Lkotlin/Lazy;", "getMaxLeverage", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGetAppInfoHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetAppInfoHandler.kt\ncom/kubi/sdk/flutter/handler/GetAppInfoHandler\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n*L\n1#1,67:1\n65#2:68\n*S KotlinDebug\n*F\n+ 1 GetAppInfoHandler.kt\ncom/kubi/sdk/flutter/handler/GetAppInfoHandler\n*L\n63#1:68\n*E\n"})
public final class C44577e implements IMethodHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44577e f98859a = new C44577e();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f98860b = LazyKt.lazy(new Function0() { // from class: sy.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44577e.m98657d();
        }
    });

    /* JADX INFO: renamed from: d */
    public static final InterfaceC45948h m98657d() {
        return (InterfaceC45948h) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45948h.class)));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC45948h m98658b() {
        return (InterfaceC45948h) f98860b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final int m98660e() {
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        if (dayNightThemeManager.m33190o()) {
            return 0;
        }
        return dayNightThemeManager.m33187l() ? 1 : 2;
    }

    @Override // com.kubi.sdk.flutter.handler.IMethodHandler
    public void handleMethod(@NotNull Context context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        HashMap map = new HashMap();
        map.put("legal", C41016c.m89965c());
        map.put("isUseDealVolUnit", Boolean.valueOf(C37885i.m85574m()));
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        map.put("darkMode", Boolean.valueOf(!dayNightThemeManager.m33187l()));
        map.put("legalSymbol", C41016c.m89966d());
        map.put("cstyle", Boolean.valueOf(dayNightThemeManager.m33189n()));
        C45590s c45590s = C45590s.f102687a;
        map.put("isNativeDebug", Boolean.valueOf(c45590s.m100666Q()));
        map.put("localTimezone", FlutterConfig.f46607a.m56659a());
        String defaultHost = Proxy.getDefaultHost();
        if (defaultHost != null && defaultHost.length() != 0) {
            map.put("proxyIP", Proxy.getDefaultHost());
        }
        map.put("legalPrice", C41016c.m89968f());
        map.put("isNativeDebug", Boolean.valueOf(c45590s.m100666Q()));
        map.put("kumexMaxLeverage", String.valueOf(m98659c()));
        map.put("themeMode", Integer.valueOf(m98660e()));
        map.put("uniqueDeviceId", C5276j.m6247f());
        map.put("anonymousId", SensorsDataAPI.sharedInstance().getAnonymousId());
        map.put("appMode", AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType());
        result.success(C27029c.m66606i(map));
    }

    /* JADX INFO: renamed from: c */
    public final int m98659c() {
        Integer numValueOf;
        InterfaceC45948h interfaceC45948hM98658b = m98658b();
        if (interfaceC45948hM98658b != null) {
            numValueOf = Integer.valueOf(interfaceC45948hM98658b.mo33748e());
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 100);
    }
}
