package com.kubi.payment.interceptor.route;

import android.net.Uri;
import androidx.core.os.BundleKt;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.payment.interceptor.route.Flutter2RNRouter;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27025c;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import cu.InterfaceC36535f;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p569qq.C43846g;
import p741wy.InterfaceC45953m;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Flutter2RNRouter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/Flutter2RNRouter;", "Lcom/kubi/router/interceptor/IInterceptor;", "Lcom/kubi/payment/interceptor/route/IFastTradeRNRouter;", "<init>", "()V", "rnFiatRechargeToggle", "", "getRnFiatRechargeToggle", "()Z", "rnFiatRechargeToggle$delegate", "Lkotlin/Lazy;", "routeConfigs", "", "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteConfig;", "getRouteConfigs", "()Ljava/util/List;", "routeConfigs$delegate", "rnNotifyTransmit", "Lcom/kubi/sdk/flutter/transmit/IRNNotifyTransmit;", "getRnNotifyTransmit", "()Lcom/kubi/sdk/flutter/transmit/IRNNotifyTransmit;", "rnNotifyTransmit$delegate", "intercept", "chain", "Lcom/kubi/router/interceptor/IChain;", "interceptForRN", "postcard", "Lcom/kubi/router/model/Postcard;", "RouteTarget", "RouteConfig", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutter2RNRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flutter2RNRouter.kt\ncom/kubi/payment/interceptor/route/Flutter2RNRouter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,101:1\n295#2,2:102\n29#3:104\n29#3:107\n216#4,2:105\n35#5,4:108\n39#5:114\n44#6,2:112\n*S KotlinDebug\n*F\n+ 1 Flutter2RNRouter.kt\ncom/kubi/payment/interceptor/route/Flutter2RNRouter\n*L\n76#1:102,2\n82#1:104\n88#1:107\n87#1:105,2\n34#1:108,4\n34#1:114\n34#1:112,2\n*E\n"})
public final class Flutter2RNRouter implements InterfaceC46936b, InterfaceC36535f {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f39560d = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f39561a = LazyKt.lazy(new Function0() { // from class: cu.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(Flutter2RNRouter.m48276j());
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f39562b = LazyKt.lazy(new Function0() { // from class: cu.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Flutter2RNRouter.m48278l();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f39563c = LazyKt.lazy(new Function0() { // from class: cu.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Flutter2RNRouter.m48277k();
        }
    });

    /* JADX INFO: compiled from: Flutter2RNRouter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$Companion;", "", "<init>", "()V", "FIAT_RECHARGE_RN_KEY", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.interceptor.route.Flutter2RNRouter$a, reason: from toString */
    /* JADX INFO: compiled from: Flutter2RNRouter.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteConfig;", "", "routePath", "", "target", "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget;", "<init>", "(Ljava/lang/String;Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget;)V", "getRoutePath", "()Ljava/lang/String;", "getTarget", "()Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RouteConfig {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String routePath;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final AbstractC21026b target;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteConfig)) {
                return false;
            }
            RouteConfig routeConfig = (RouteConfig) other;
            return Intrinsics.areEqual(this.routePath, routeConfig.routePath) && Intrinsics.areEqual(this.target, routeConfig.target);
        }

        public RouteConfig(@NotNull String routePath, @NotNull AbstractC21026b target) {
            Intrinsics.checkNotNullParameter(routePath, "routePath");
            Intrinsics.checkNotNullParameter(target, "target");
            this.routePath = routePath;
            this.target = target;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRoutePath() {
            return this.routePath;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC21026b getTarget() {
            return this.target;
        }

        public int hashCode() {
            return (this.routePath.hashCode() * 31) + this.target.hashCode();
        }

        @NotNull
        public String toString() {
            return "RouteConfig(routePath=" + this.routePath + ", target=" + this.target + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.interceptor.route.Flutter2RNRouter$b */
    /* JADX INFO: compiled from: Flutter2RNRouter.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget;", "", "<init>", "()V", "NotifyRN", "GotoRN", "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget$GotoRN;", "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget$NotifyRN;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC21026b {

        /* JADX INFO: renamed from: com.kubi.payment.interceptor.route.Flutter2RNRouter$b$a, reason: from toString */
        /* JADX INFO: compiled from: Flutter2RNRouter.kt */
        @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget$GotoRN;", "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget;", "routeName", "", ReportDataTable.COLUMN_PARAMS, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getRouteName", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class GotoRN extends AbstractC21026b {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String routeName;

            /* JADX INFO: renamed from: b, reason: from toString */
            @NotNull
            public final Map<String, String> params;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GotoRN)) {
                    return false;
                }
                GotoRN gotoRN = (GotoRN) other;
                return Intrinsics.areEqual(this.routeName, gotoRN.routeName) && Intrinsics.areEqual(this.params, gotoRN.params);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GotoRN(@NotNull String routeName, @NotNull Map<String, String> params) {
                super(null);
                Intrinsics.checkNotNullParameter(routeName, "routeName");
                Intrinsics.checkNotNullParameter(params, "params");
                this.routeName = routeName;
                this.params = params;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Map<String, String> m48285a() {
                return this.params;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getRouteName() {
                return this.routeName;
            }

            public int hashCode() {
                return (this.routeName.hashCode() * 31) + this.params.hashCode();
            }

            @NotNull
            public String toString() {
                return "GotoRN(routeName=" + this.routeName + ", params=" + this.params + ')';
            }
        }

        /* JADX INFO: renamed from: com.kubi.payment.interceptor.route.Flutter2RNRouter$b$b, reason: from toString */
        /* JADX INFO: compiled from: Flutter2RNRouter.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget$NotifyRN;", "Lcom/kubi/payment/interceptor/route/Flutter2RNRouter$RouteTarget;", "event", "", "<init>", "(Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class NotifyRN extends AbstractC21026b {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String event;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotifyRN) && Intrinsics.areEqual(this.event, ((NotifyRN) other).event);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotifyRN(@NotNull String event) {
                super(null);
                Intrinsics.checkNotNullParameter(event, "event");
                this.event = event;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getEvent() {
                return this.event;
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            @NotNull
            public String toString() {
                return "NotifyRN(event=" + this.event + ')';
            }
        }

        public /* synthetic */ AbstractC21026b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC21026b() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.interceptor.route.Flutter2RNRouter$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21027c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m48276j() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C21027c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_fiatRecharge_rn_new", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC45953m m48277k() {
        return (InterfaceC45953m) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45953m.class));
    }

    /* JADX INFO: renamed from: l */
    public static final List m48278l() {
        return CollectionsKt.listOf((Object[]) new RouteConfig[]{new RouteConfig("payment/channel/recharge/result", new AbstractC21026b.NotifyRN("jumpRechargeResultPage")), new RouteConfig("payment/lite/fast/buy/selectPaymentMethod", new AbstractC21026b.GotoRN("FastTradeLitePaymentListPage", MapsKt.mapOf(TuplesKt.m90091to("tradeType", "FAST_BUY"), TuplesKt.m90091to("inputMode", "FIAT")))), new RouteConfig("payment/lite/fast/sell/selectPaymentMethod", new AbstractC21026b.GotoRN("FastTradeLitePaymentListPage", MapsKt.mapOf(TuplesKt.m90091to("tradeType", "FAST_SELL"), TuplesKt.m90091to("inputMode", "CRYPTO"))))});
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        if (m48282i(postcard)) {
            return true;
        }
        return chain.mo103413a(postcard);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m48279f() {
        return ((Boolean) this.f39561a.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC45953m m48280g() {
        return (InterfaceC45953m) this.f39563c.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final List<RouteConfig> m48281h() {
        return (List) this.f39562b.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m48282i(C4400a c4400a) {
        String queryParameter;
        HashMap<String, Object> map;
        Object next;
        if ((!Intrinsics.areEqual(RouteExKt.m56216G(c4400a.getUri()), ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER) && !Intrinsics.areEqual(RouteExKt.m56216G(c4400a.getUri()), "/flutter")) || (queryParameter = c4400a.getUri().getQueryParameter("route")) == null) {
            return false;
        }
        Iterator<T> it = m48281h().iterator();
        do {
            map = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!StringsKt.contains((CharSequence) queryParameter, (CharSequence) ((RouteConfig) next).getRoutePath(), true));
        RouteConfig routeConfig = (RouteConfig) next;
        if (routeConfig == null || !m48279f()) {
            return false;
        }
        AbstractC21026b target = routeConfig.getTarget();
        if (target instanceof AbstractC21026b.NotifyRN) {
            InterfaceC45953m interfaceC45953mM48280g = m48280g();
            if (interfaceC45953mM48280g != null) {
                String event = ((AbstractC21026b.NotifyRN) target).getEvent();
                HashMap<String, Object> mapM56243d0 = RouteExKt.m56243d0(RouteExKt.m56242d(BundleKt.bundleOf(), Uri.parse(queryParameter)));
                if (mapM56243d0 != null) {
                    map = mapM56243d0;
                }
                interfaceC45953mM48280g.sendEventToRN(event, map);
            }
        } else if (target instanceof AbstractC21026b.GotoRN) {
            AbstractC21026b.GotoRN gotoRN = (AbstractC21026b.GotoRN) target;
            for (Map.Entry<String, String> entry : gotoRN.m48285a().entrySet()) {
                c4400a.getBundle().putString(entry.getKey(), entry.getValue());
            }
            RouteExKt.m56242d(c4400a.getBundle(), Uri.parse(queryParameter));
            c4400a.getBundle().remove("route");
            m81799a(c4400a, gotoRN.getRouteName());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }
}
