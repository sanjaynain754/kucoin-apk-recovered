package com.kubi.payment.interceptor.route;

import android.net.Uri;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.payment.helper.RemoteConfigHelper;
import com.kubi.payment.interceptor.route.FastTradeRouteInterceptor;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import cu.InterfaceC36535f;
import il.C38661c;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FastTradeRouteInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0002R'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "Lcom/kubi/payment/interceptor/route/IFastTradeRNRouter;", "<init>", "()V", "go2RNToggleKeys", "", "", "getGo2RNToggleKeys", "()Ljava/util/Map;", "go2RNToggleKeys$delegate", "Lkotlin/Lazy;", "notify2RNToggleKeys", "getNotify2RNToggleKeys", "notify2RNToggleKeys$delegate", "togglesCache", "", "", "isRNSwitchOpen", "Lkotlin/Pair;", "Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;", "path", "intercept", "chain", "Lcom/kubi/router/interceptor/IChain;", "notify2RNPage", "oriPath", "bundle", "Landroid/os/Bundle;", "routeName", "Companion", "InterceptType", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastTradeRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/FastTradeRouteInterceptor\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,221:1\n382#2,3:222\n385#2,4:232\n35#3,4:225\n39#3:231\n44#4,2:229\n29#5:236\n*S KotlinDebug\n*F\n+ 1 FastTradeRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/FastTradeRouteInterceptor\n*L\n122#1:222,3\n122#1:232,4\n123#1:225,4\n123#1:231\n123#1:229,2\n155#1:236\n*E\n"})
public final class FastTradeRouteInterceptor extends C38661c implements InterfaceC36535f {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f39554d = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f39555a = LazyKt.lazy(new Function0() { // from class: cu.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FastTradeRouteInterceptor.m48265g();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f39556b = LazyKt.lazy(new Function0() { // from class: cu.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FastTradeRouteInterceptor.m48266j();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<String, Boolean> f39557c = new LinkedHashMap();

    /* JADX INFO: compiled from: FastTradeRouteInterceptor.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$Companion;", "", "<init>", "()V", "FAST_TRADE_RN_TOGGLE_KEY", "", "FIAT_RECHARGE_RN_NEW_KEY", "FIAT_WITHDRAW_RN_NEW_KEY", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: FastTradeRouteInterceptor.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/FastTradeRouteInterceptor$InterceptType;", "", "<init>", "(Ljava/lang/String;I)V", "GO_2_RN", "NOTIFY_RN", "DEFAULT", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum InterceptType {
        GO_2_RN,
        NOTIFY_RN,
        DEFAULT;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f39559c = EnumEntriesKt.enumEntries(m48272a());

        @NotNull
        public static EnumEntries<InterceptType> getEntries() {
            return f39559c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.interceptor.route.FastTradeRouteInterceptor$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21024a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: i */
    public final boolean m48270i(String str, Bundle bundle) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1802375731) {
                if (iHashCode != 799830425) {
                    if (iHashCode == 1526585607 && str.equals("payment/channel/recharge/ivyConfirm") && C27041f.m66668h(RouteExKt.m56284y(bundle, "rechargeId")).length() > 0) {
                        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
                        HashMap<String, Object> mapM56243d0 = RouteExKt.m56243d0(bundle);
                        iReactNativeService.nativeNotifyRn("jumpRechargeResultPage", mapM56243d0 != null ? mapM56243d0 : null);
                        return true;
                    }
                } else if (str.equals("payment/fast/recurring/result") && C27041f.m66668h(RouteExKt.m56284y(bundle, "orderId")).length() > 0) {
                    IReactNativeService iReactNativeService2 = IReactNativeService.INSTANCE.get();
                    HashMap<String, Object> mapM56243d1 = RouteExKt.m56243d0(bundle);
                    iReactNativeService2.nativeNotifyRn("jumpFastRecurringResultPage", mapM56243d1 != null ? mapM56243d1 : null);
                    return true;
                }
            } else if (str.equals("payment/fastTrade/buy/ivyConfirm") && C27041f.m66668h(RouteExKt.m56284y(bundle, "fastBuyOrderId")).length() > 0) {
                IReactNativeService iReactNativeService3 = IReactNativeService.INSTANCE.get();
                HashMap<String, Object> mapM56243d2 = RouteExKt.m56243d0(bundle);
                iReactNativeService3.nativeNotifyRn("jumpIvyFastResultPage", mapM56243d2 != null ? mapM56243d2 : null);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final Map m48265g() {
        return MapsKt.mapOf(TuplesKt.m90091to("payment/fastTrade", "payment_android_fast_rn_new"), TuplesKt.m90091to("otc/fiat/recharge", "payment_android_fiatRecharge_rn_new"), TuplesKt.m90091to("otc/fiat/withdraw", "payment_android_fiatWithdraw_rn_new"), TuplesKt.m90091to("otc/orderList", "payment_android_fast_rn_new"), TuplesKt.m90091to("otc/fiat/orderList", "payment_android_fiatRecharge_rn_new"), TuplesKt.m90091to("otc/fiat/recharge/orderDetail", "payment_android_fiatRecharge_rn_new"), TuplesKt.m90091to("otc/fiat/withdraw/orderDetail", "payment_android_fiatWithdraw_rn_new"));
    }

    /* JADX INFO: renamed from: j */
    public static final Map m48266j() {
        return MapsKt.mapOf(TuplesKt.m90091to("payment/channel/recharge/ivyConfirm", "payment_android_fiatRecharge_rn_new"), TuplesKt.m90091to("payment/fastTrade/buy/ivyConfirm", "payment_android_fast_rn_new"), TuplesKt.m90091to("payment/fast/recurring/result", "payment_android_fast_rn_new"));
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!OtcDepend.f38138a.m45466o()) {
            return super.mo4304b(chain);
        }
        C4400a postcard = chain.getPostcard();
        String strM56216G = RouteExKt.m56216G(postcard.getUri());
        Pair<Boolean, InterceptType> pairM48269h = m48269h(strM56216G);
        boolean zBooleanValue = pairM48269h.component1().booleanValue();
        InterceptType interceptTypeComponent2 = pairM48269h.component2();
        if (zBooleanValue && interceptTypeComponent2 == InterceptType.GO_2_RN) {
            m81799a(postcard, m48271k(strM56216G));
            return true;
        }
        if (zBooleanValue && interceptTypeComponent2 == InterceptType.NOTIFY_RN && m48270i(strM56216G, postcard.getBundle())) {
            return true;
        }
        if (!Intrinsics.areEqual(strM56216G, "payment/fastTrade")) {
            return chain.mo103413a(chain.getPostcard());
        }
        if (RemoteConfigHelper.f39546a.m48249a()) {
            return chain.mo103413a(chain.getPostcard());
        }
        Uri uri = Uri.parse(postcard.getUri().getScheme() + "://otc");
        Bundle bundle = postcard.getBundle();
        bundle.putString("type", "2");
        new C4400a(uri, bundle).m4048k();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, String> m48267e() {
        return (Map) this.f39555a.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m48268f() {
        return (Map) this.f39556b.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final Pair<Boolean, InterceptType> m48269h(String str) {
        InterceptType interceptType;
        String str2;
        if (str == null || str.length() == 0) {
            return new Pair<>(Boolean.FALSE, InterceptType.DEFAULT);
        }
        InterceptType interceptType2 = InterceptType.DEFAULT;
        Object objM20457a = null;
        if (m48267e().containsKey(str)) {
            interceptType = InterceptType.GO_2_RN;
            str2 = m48267e().get(str);
        } else if (m48268f().containsKey(str)) {
            interceptType = InterceptType.NOTIFY_RN;
            str2 = m48268f().get(str);
        } else {
            interceptType = interceptType2;
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            return new Pair<>(Boolean.FALSE, interceptType2);
        }
        Map<String, Boolean> map = this.f39557c;
        Boolean boolValueOf = map.get(str2);
        if (boolValueOf == null) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C21024a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a(str2, type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            }
            boolValueOf = Boolean.valueOf(C27025c.m66567e((Boolean) objM20457a, false));
            map.put(str2, boolValueOf);
        }
        return new Pair<>(boolValueOf, interceptType);
    }

    /* JADX INFO: renamed from: k */
    public final String m48271k(String str) {
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case -1277707374:
                return !str.equals("otc/fiat/withdraw") ? "" : "FiatWithdrawPage";
            case -1143656657:
                return !str.equals("otc/fiat/recharge") ? "" : "FiatRechargePage";
            case 372483650:
                return !str.equals("otc/fiat/withdraw/orderDetail") ? "" : "FiatWithdrawOrderDetailPage";
            case 497527199:
                return !str.equals("payment/fastTrade") ? "" : "FastTradeHomePage";
            case 754423391:
                return !str.equals("otc/fiat/recharge/orderDetail") ? "" : "FiatRechargeOrderDetailPage";
            case 1038154587:
                return !str.equals("otc/orderList") ? "" : "OrderListPage";
            case 2031662468:
                return !str.equals("otc/fiat/orderList") ? "" : "FiatFundingRecordPage";
            default:
                return "";
        }
    }
}
