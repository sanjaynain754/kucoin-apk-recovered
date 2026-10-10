package sy;

import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import androidx.autofill.HintConstants;
import com.blankj.utilcode.util.C5276j;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.fingerprint.C12598b;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.FlutterConfig;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.flutter.handler.IMethodHandler;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p402kf.C41016c;
import p569qq.C43846g;
import p609ry.C44199a;
import p694vk.C45590s;
import p741wy.InterfaceC45948h;
import p741wy.InterfaceC45957q;
import p741wy.InterfaceC45959s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: sy.k */
/* JADX INFO: compiled from: InitConfigHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J[\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001d2A\b\u0002\u0010\u001e\u001a;\u0012/\u0012-\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!`%¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001fH\u0002J \u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014¨\u0006-"}, m90084d2 = {"Lcom/kubi/sdk/flutter/handler/InitConfigHandler;", "Lcom/kubi/sdk/flutter/handler/IMethodHandler;", "<init>", "()V", "TYPE_APP", "", "TYPE_API", "TYPE_USER", "TYPE_HEADER", "TAG", "xTraceTransmit", "Lcom/kubi/sdk/flutter/transmit/IXTraceCookieTransmit;", "getXTraceTransmit", "()Lcom/kubi/sdk/flutter/transmit/IXTraceCookieTransmit;", "xTraceTransmit$delegate", "Lkotlin/Lazy;", "getTraceCookie", "kumexTransmit", "Lcom/kubi/sdk/flutter/transmit/IKumexGetMaxLeverageTransmit;", "getKumexTransmit", "()Lcom/kubi/sdk/flutter/transmit/IKumexGetMaxLeverageTransmit;", "kumexTransmit$delegate", "getMaxLeverage", "", "themeMode", "", "setupConfig", "", "types", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Ljava/util/HashMap;", "", "Lkotlin/ParameterName;", "name", "config", "Lkotlin/collections/HashMap;", "handleMethod", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInitConfigHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitConfigHandler.kt\ncom/kubi/sdk/flutter/handler/InitConfigHandler\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n+ 3 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,189:1\n65#2:190\n65#2:191\n44#3,15:192\n*S KotlinDebug\n*F\n+ 1 InitConfigHandler.kt\ncom/kubi/sdk/flutter/handler/InitConfigHandler\n*L\n43#1:190\n52#1:191\n185#1:192,15\n*E\n"})
public final class C44586k implements IMethodHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44586k f98869a = new C44586k();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f98870b = LazyKt.lazy(new Function0() { // from class: sy.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44586k.m98683l();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f98871c = LazyKt.lazy(new Function0() { // from class: sy.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44586k.m98682i();
        }
    });

    /* JADX INFO: renamed from: g */
    public static final void m98680g(MethodCall methodCall, final MethodChannel.Result result) {
        try {
            List list = (List) methodCall.argument("types");
            f98869a.m98686j(list != null ? CollectionsKt.toSet(list) : null, new Function1() { // from class: sy.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C44586k.m98681h(result, (HashMap) obj);
                }
            });
        } catch (Exception e11) {
            C44128b.m97263g("InitConfigHandler", e11);
            String message = e11.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(e11, "InitConfigHandler");
            } else {
                C43846g.m96568c(new FlutterIssueException(e11, "InitConfigHandler", true, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m98686j(Set<String> set, Function1<? super HashMap<String, Object>, Unit> function1) {
        HashMap map = new HashMap();
        if (set == null || set.contains("api")) {
            HashMap map2 = new HashMap();
            HostManager hostManager = HostManager.a;
            map2.put("api", hostManager.f());
            map2.put("web", hostManager.m());
            map2.put("host", hostManager.b());
            map.put("apiInfo", map2);
            C44128b.m97259c("InitConfigHandler", "getInitConfig apiInfo");
        }
        if (set == null || set.contains("app")) {
            HashMap map3 = new HashMap();
            map3.put("legal", C41016c.m89965c());
            map3.put("isUseDealVolUnit", Boolean.valueOf(C37885i.m85574m()));
            DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
            map3.put("darkMode", Boolean.valueOf(!dayNightThemeManager.m33187l()));
            map3.put("legalSymbol", C41016c.m89966d());
            map3.put("cstyle", Boolean.valueOf(dayNightThemeManager.m33189n()));
            C45590s c45590s = C45590s.f102687a;
            map3.put("isNativeDebug", Boolean.valueOf(c45590s.m100666Q()));
            map3.put("localTimezone", FlutterConfig.f46607a.m56659a());
            String defaultHost = Proxy.getDefaultHost();
            if (defaultHost != null && defaultHost.length() != 0) {
                map3.put("proxyAddress", Proxy.getDefaultHost());
            }
            map3.put("legalPrice", C41016c.m89968f());
            map3.put("isNativeDebug", Boolean.valueOf(c45590s.m100666Q()));
            map3.put("themeMode", Long.valueOf(m98687k()));
            map3.put("uniqueDeviceId", C5276j.m6247f());
            map.put("appInfo", map3);
            C44128b.m97259c("InitConfigHandler", "getInitConfig appInfo");
        }
        if (set == null || set.contains("user")) {
            HashMap map4 = new HashMap();
            if (UserInfo.a.n()) {
                LoginUserEntity loginUserEntityC = UserInfo.c();
                map4.put(FirebaseAnalytics.Param.CURRENCY, loginUserEntityC.getCurrency());
                map4.put("email", loginUserEntityC.email);
                map4.put("id", loginUserEntityC.id);
                map4.put("language", loginUserEntityC.language);
                map4.put("nickname", loginUserEntityC.getNicknameR());
                map4.put(HintConstants.AUTOFILL_HINT_PHONE, loginUserEntityC.phone);
                map4.put("phoneValidate", Boolean.valueOf(loginUserEntityC.isPhoneValidate()));
                map4.put("referralCode", loginUserEntityC.getReferralCode());
                map4.put(InterfaceC33826o0.f71244p, loginUserEntityC.token);
                map4.put("hasMarginLoan", Boolean.valueOf(loginUserEntityC.isHasOpenLever()));
                map4.put("hasOpenFutures", Boolean.valueOf(loginUserEntityC.isHasOpenContract()));
                map4.put("withDrawPassword", Boolean.valueOf(loginUserEntityC.isWithDrawPassword()));
                map4.put("balanceCurrency", loginUserEntityC.getBalanceCurrency());
                map4.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, C27041f.m66668h(loginUserEntityC.mobileCode));
            } else {
                map4.put("language", MultiLanguageManager.f46811g.getLocalString());
                map4.put("balanceCurrency", C41016c.m89965c());
            }
            map.put("userInfo", map4);
            C44128b.m97259c("InitConfigHandler", "getInitConfig userInfo");
        }
        if (set == null || (set.contains("header") && UserInfo.a.n())) {
            HashMap map5 = new HashMap();
            map5.put(HttpHeaders.COOKIE, m98684e());
            map5.put("X-APP-TOKEN", C27041f.m66668h(UserInfo.a.l()));
            C45590s c45590s2 = C45590s.f102687a;
            map5.put("X-APP-VERSION", c45590s2.m100675Z());
            map5.put("X-DEVICE", Build.MODEL);
            map5.put("X-DEVICE-NO", C5276j.m6247f());
            map5.put("X-APP_ID", c45590s2.m100661L());
            map5.put("X-SYSTEM", "android");
            map5.put("X-REQUEST-TIME", String.valueOf(System.currentTimeMillis()));
            map5.put("X-SYSTEM-VERSION", Build.VERSION.RELEASE);
            map5.put("User-Agent", "android/" + c45590s2.m100675Z());
            map5.put("LANG", MultiLanguageManager.f46811g.getLocalString());
            map5.put("X-VERSION", c45590s2.m100677b0());
            map5.put("X-DEVICE-FRONT-ID", C5276j.m6247f());
            map5.put("X-SENSORS-ID", SensorsDataAPI.sharedInstance().getDistinctId());
            Pair<String, String> pairM23781i = C12598b.f21975a.m23781i("flutter_api");
            if (pairM23781i != null) {
                map5.put(pairM23781i.getFirst(), pairM23781i.getSecond());
            }
            map.put("requestHeaders", map5);
            C44128b.m97259c("InitConfigHandler", "getInitConfig requestHeader");
        }
        if (function1 != null) {
            function1.invoke(map);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m98681h(MethodChannel.Result result, HashMap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM66606i = C27029c.m66606i(it);
        C44128b.m97259c("InitConfigHandler", "getInitConfig toJson cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        result.success(strM66606i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC45948h m98682i() {
        return (InterfaceC45948h) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45948h.class)));
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC45959s m98683l() {
        return (InterfaceC45959s) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45959s.class)));
    }

    /* JADX INFO: renamed from: e */
    public final String m98684e() {
        C44128b.m97259c("InitConfigHandler", "getTraceCookie start");
        InterfaceC45959s interfaceC45959sM98685f = m98685f();
        String strM66668h = C27041f.m66668h(interfaceC45959sM98685f != null ? interfaceC45959sM98685f.mo88925d() : null);
        C44128b.m97259c("InitConfigHandler", "getTraceCookie end");
        return strM66668h;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC45959s m98685f() {
        return (InterfaceC45959s) f98870b.getValue();
    }

    @Override // com.kubi.sdk.flutter.handler.IMethodHandler
    public void handleMethod(@NotNull Context context, @NotNull final MethodCall call, @NotNull final MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        C42917g.m94135a().execute(new Runnable() { // from class: sy.i
            @Override // java.lang.Runnable
            public final void run() {
                C44586k.m98680g(call, result);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final long m98687k() {
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        if (dayNightThemeManager.m33190o()) {
            return 0L;
        }
        return dayNightThemeManager.m33187l() ? 1L : 2L;
    }
}
