package com.kubi.sdk.flutter.protocol;

import android.content.Context;
import android.os.Build;
import b00.InterfaceC4420f;
import com.blankj.utilcode.util.C5276j;
import com.google.common.net.HttpHeaders;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.otc.entity.OtcAd;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.FlutterConfig;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreApiInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreAppInfo;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreHttpHeader;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreInitConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreLegalPrice;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeCoreUserInfo;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24281x;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p402kf.C41016c;
import p694vk.C45590s;
import p741wy.InterfaceC45957q;
import p741wy.InterfaceC45959s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCFlutterBridgeCoreCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0002J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J.\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J.\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J<\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J.\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J4\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\"\u0010\u0013\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0016¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/flutter/protocol/KCFlutterBridgeCoreCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreCall;", "<init>", "()V", "apiInfo", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreApiInfo;", "getPriceMap", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreLegalPrice;", "appInfo", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo;", "userInfo", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreUserInfo;", "headers", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreHttpHeader;", "getApiInfo", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getAppInfo", "hasLogin", "", "getInitConfig", "types", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreInitConfig;", "getUserInfo", "requestHeader", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeCoreCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeCoreCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeCoreCallImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n*L\n1#1,241:1\n536#2:242\n521#2,6:243\n126#3:249\n153#3,3:250\n126#3:253\n153#3,3:254\n65#4:257\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeCoreCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeCoreCallImpl\n*L\n87#1:242\n87#1:243,6\n89#1:249\n89#1:250,3\n162#1:253\n162#1:254,3\n50#1:257\n*E\n"})
public final class KCFlutterBridgeCoreCallImpl implements InterfaceC4420f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f46713a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy<InterfaceC45959s> f46714b = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.protocol.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KCFlutterBridgeCoreCallImpl.m56893n();
        }
    });

    /* JADX INFO: compiled from: KCFlutterBridgeCoreCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/flutter/protocol/KCFlutterBridgeCoreCallImpl$Companion;", "", "<init>", "()V", "TYPE_APP", "", "TYPE_API", "TYPE_USER", "TYPE_HEADER", "TAG", "xTraceTransmit", "Lcom/kubi/sdk/flutter/transmit/IXTraceCookieTransmit;", "getXTraceTransmit", "()Lcom/kubi/sdk/flutter/transmit/IXTraceCookieTransmit;", "xTraceTransmit$delegate", "Lkotlin/Lazy;", "getTraceCookie", "themeMode", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m56899a() {
            C44128b.m97259c("KCFlutterBridgeCoreCallImpl", "getTraceCookie start");
            InterfaceC45959s interfaceC45959sM56900b = m56900b();
            String strM66668h = C27041f.m66668h(interfaceC45959sM56900b != null ? interfaceC45959sM56900b.mo88925d() : null);
            C44128b.m97259c("KCFlutterBridgeCoreCallImpl", "getTraceCookie end");
            return strM66668h;
        }

        /* JADX INFO: renamed from: c */
        public final long m56901c() {
            DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
            if (dayNightThemeManager.m33190o()) {
                return 0L;
            }
            return dayNightThemeManager.m33187l() ? 1L : 2L;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC45959s m56900b() {
            return (InterfaceC45959s) KCFlutterBridgeCoreCallImpl.f46714b.getValue();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC45959s m56893n() {
        return (InterfaceC45959s) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45959s.class)));
    }

    @Override // b00.InterfaceC4420f
    /* JADX INFO: renamed from: a */
    public void mo4119a(@NotNull Context ctx, @NotNull Function2<? super KCFlutterBridgeCoreUserInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(m56898m(), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, e11, null, false, 12, null));
            C44128b.m97263g("KCFlutterBridgeCoreCallImpl", e11);
        }
    }

    @Override // b00.InterfaceC4420f
    /* JADX INFO: renamed from: b */
    public void mo4120b(@NotNull Context ctx, @NotNull Function2<? super List<KCFlutterBridgeCoreHttpHeader>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(m56897l(), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, e11, null, false, 12, null));
            C44128b.m97263g("KCFlutterBridgeCoreCallImpl", e11);
        }
    }

    @Override // b00.InterfaceC4420f
    /* JADX INFO: renamed from: c */
    public void mo4121c(@NotNull Context ctx, @NotNull Function2<? super KCFlutterBridgeCoreApiInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(m56894i(), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, e11, null, false, 12, null));
            C44128b.m97263g("KCFlutterBridgeCoreCallImpl", e11);
        }
    }

    @Override // b00.InterfaceC4420f
    /* JADX INFO: renamed from: d */
    public void mo4122d(@NotNull Context ctx, @NotNull List<String> types, @NotNull Function2<? super KCFlutterBridgeCoreInitConfig, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(new KCFlutterBridgeCoreInitConfig(types.contains("app") ? m56895j() : null, types.contains("api") ? m56894i() : null, types.contains("user") ? m56898m() : null, types.contains("header") ? m56897l() : null), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, e11, null, false, 12, null));
            C44128b.m97263g("KCFlutterBridgeCoreCallImpl", e11);
        }
    }

    @Override // b00.InterfaceC4420f
    /* JADX INFO: renamed from: e */
    public void mo4123e(@NotNull Context ctx, @NotNull Function2<? super KCFlutterBridgeCoreAppInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(m56895j(), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, e11, null, false, 12, null));
            C44128b.m97263g("KCFlutterBridgeCoreCallImpl", e11);
        }
    }

    @Override // b00.InterfaceC4420f
    /* JADX INFO: renamed from: f */
    public void mo4124f(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(Boolean.valueOf(UserInfo.a.n()), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, e11, null, false, 12, null));
            C44128b.m97263g("KCFlutterBridgeCoreCallImpl", e11);
        }
    }

    /* JADX INFO: renamed from: i */
    public final KCFlutterBridgeCoreApiInfo m56894i() {
        HostManager hostManager = HostManager.a;
        return new KCFlutterBridgeCoreApiInfo(hostManager.m(), hostManager.b(), hostManager.f(), hostManager.p());
    }

    /* JADX INFO: renamed from: l */
    public final List<KCFlutterBridgeCoreHttpHeader> m56897l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(HttpHeaders.COOKIE, f46713a.m56899a());
        linkedHashMap.put("X-APP-TOKEN", C27041f.m66668h(UserInfo.a.l()));
        C45590s c45590s = C45590s.f102687a;
        linkedHashMap.put("X-APP-VERSION", c45590s.m100675Z());
        linkedHashMap.put("X-DEVICE", Build.MODEL);
        linkedHashMap.put("X-DEVICE-NO", C5276j.m6247f());
        linkedHashMap.put("X-APP_ID", c45590s.m100661L());
        linkedHashMap.put("X-SYSTEM", "android");
        linkedHashMap.put("X-REQUEST-TIME", String.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("X-SYSTEM-VERSION", Build.VERSION.RELEASE);
        linkedHashMap.put("User-Agent", "android/" + c45590s.m100675Z());
        linkedHashMap.put("LANG", MultiLanguageManager.f46811g.getLocalString());
        linkedHashMap.put("X-VERSION", c45590s.m100677b0());
        linkedHashMap.put("X-DEVICE-FRONT-ID", C5276j.m6247f());
        linkedHashMap.put("X-SENSORS-ID", SensorsDataAPI.sharedInstance().getDistinctId());
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new KCFlutterBridgeCoreHttpHeader((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final KCFlutterBridgeCoreUserInfo m56898m() {
        if (!UserInfo.a.n()) {
            return null;
        }
        LoginUserEntity loginUserEntityC = UserInfo.c();
        return new KCFlutterBridgeCoreUserInfo(loginUserEntityC.getAvatar(), loginUserEntityC.getCurrency(), loginUserEntityC.email, loginUserEntityC.id, loginUserEntityC.language, loginUserEntityC.getNicknameR(), loginUserEntityC.phone, Boolean.valueOf(loginUserEntityC.isPhoneValidate()), loginUserEntityC.getReferralCode(), loginUserEntityC.token, Boolean.valueOf(loginUserEntityC.isHasOpenLever()), Boolean.valueOf(loginUserEntityC.isHasOpenContract()), Boolean.valueOf(loginUserEntityC.isWithDrawPassword()), loginUserEntityC.getBalanceCurrency(), loginUserEntityC.mobileCode, Long.valueOf(loginUserEntityC.getType()));
    }

    /* JADX INFO: renamed from: j */
    public final KCFlutterBridgeCoreAppInfo m56895j() {
        String strM89965c = C41016c.m89965c();
        boolean zM85574m = C37885i.m85574m();
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        boolean z11 = !dayNightThemeManager.m33187l();
        String strM89966d = C41016c.m89966d();
        boolean zM33189n = dayNightThemeManager.m33189n();
        boolean zM100666Q = C45590s.f102687a.m100666Q();
        String strM56659a = FlutterConfig.f46607a.m56659a();
        List<KCFlutterBridgeCoreLegalPrice> listM56896k = m56896k();
        long jM56901c = f46713a.m56901c();
        String strM6247f = C5276j.m6247f();
        return new KCFlutterBridgeCoreAppInfo(zM85574m, zM100666Q, zM33189n, jM56901c, C24281x.m58545a(C27017c.f54310a.m66513b()), strM6247f, SensorsDataAPI.sharedInstance().getAnonymousId(), strM89965c, listM56896k, Boolean.valueOf(z11), strM89966d, strM56659a, MultiLanguageManager.f46811g.getLocalString(), C41016c.m89965c(), SiteInfoManager.f47913a.m58109c(), AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType());
    }

    /* JADX INFO: renamed from: k */
    public final List<KCFlutterBridgeCoreLegalPrice> m56896k() {
        HashMap<String, Double> mapM89968f = C41016c.m89968f();
        Intrinsics.checkNotNullExpressionValue(mapM89968f, "getCurrentPriceMap(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Double> entry : mapM89968f.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            Object value = entry2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            arrayList.add(new KCFlutterBridgeCoreLegalPrice((String) key, ((Number) value).doubleValue()));
        }
        return arrayList;
    }
}
