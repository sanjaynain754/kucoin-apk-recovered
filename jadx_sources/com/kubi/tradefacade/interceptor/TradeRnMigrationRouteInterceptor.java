package com.kubi.tradefacade.interceptor;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.Constants;
import com.kubi.router.utils.RouteExKt;
import com.kubi.tradefacade.interceptor.TradeRnMigrationRouteInterceptor;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;
import ro.C44128b;
import z30.C46685c;

/* JADX INFO: compiled from: TradeRnMigrationRouteInterceptor.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0006H\u0002J\u001c\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J$\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J&\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradefacade/interceptor/TradeRnMigrationRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "migrationRoutes", "", "", "Lcom/kubi/tradefacade/interceptor/TradeRnMigrationRouteInterceptor$MigrationRoute;", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "parseMigrationRoute", "uri", "Landroid/net/Uri;", "toRnRoute", "Lcom/kubi/tradefacade/interceptor/TradeRnMigrationRouteInterceptor$RnRoute;", "buildMarginBorrowRepayNativeUrl", ReportDataTable.COLUMN_PARAMS, "buildOrderCenterNativeUrl", "type", "appendQuery", "baseUrl", "MigrationRoute", "RnRoute", "Companion", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeRnMigrationRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeRnMigrationRouteInterceptor.kt\ncom/kubi/tradefacade/interceptor/TradeRnMigrationRouteInterceptor\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n29#2:146\n774#3:147\n865#3,2:148\n1193#3,2:150\n1267#3,4:152\n774#3:156\n865#3,2:157\n*S KotlinDebug\n*F\n+ 1 TradeRnMigrationRouteInterceptor.kt\ncom/kubi/tradefacade/interceptor/TradeRnMigrationRouteInterceptor\n*L\n49#1:146\n78#1:147\n78#1:148,2\n79#1:150,2\n79#1:152,4\n111#1:156\n111#1:157,2\n*E\n"})
public final class TradeRnMigrationRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f51971b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<String, MigrationRoute> f51972a;

    /* JADX INFO: compiled from: TradeRnMigrationRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/tradefacade/interceptor/TradeRnMigrationRouteInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "KRN_ROUTER_PATH", "KRN_TRANSPARENT_ROUTER_PATH", "TRADE_CENTER_BIZ", "TRADE_CENTER_COMPONENT", "ROUTE_MARGIN_BORROW_REPAY", "ROUTE_SPOT_ORDER_CENTER", "ROUTE_MARGIN_ORDER_CENTER", "NATIVE_MARGIN_BORROW_REPAY", "NATIVE_TRADE_DELEGATE_RECORD", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.interceptor.TradeRnMigrationRouteInterceptor$a, reason: from toString */
    /* JADX INFO: compiled from: TradeRnMigrationRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J!\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003JK\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR)\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradefacade/interceptor/TradeRnMigrationRouteInterceptor$MigrationRoute;", "", "rnRouteName", "", "routeParams", "", "nativeUrlBuilder", "Lkotlin/Function1;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "getRnRouteName", "()Ljava/lang/String;", "getRouteParams", "()Ljava/util/Map;", "getNativeUrlBuilder", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class MigrationRoute {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String rnRouteName;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final Map<String, String> routeParams;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final Function1<Map<String, String>, String> nativeUrlBuilder;

        /* JADX WARN: Multi-variable type inference failed */
        public MigrationRoute(@NotNull String rnRouteName, @NotNull Map<String, String> routeParams, @NotNull Function1<? super Map<String, String>, String> nativeUrlBuilder) {
            Intrinsics.checkNotNullParameter(rnRouteName, "rnRouteName");
            Intrinsics.checkNotNullParameter(routeParams, "routeParams");
            Intrinsics.checkNotNullParameter(nativeUrlBuilder, "nativeUrlBuilder");
            this.rnRouteName = rnRouteName;
            this.routeParams = routeParams;
            this.nativeUrlBuilder = nativeUrlBuilder;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MigrationRoute)) {
                return false;
            }
            MigrationRoute migrationRoute = (MigrationRoute) other;
            return Intrinsics.areEqual(this.rnRouteName, migrationRoute.rnRouteName) && Intrinsics.areEqual(this.routeParams, migrationRoute.routeParams) && Intrinsics.areEqual(this.nativeUrlBuilder, migrationRoute.nativeUrlBuilder);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ MigrationRoute m63604b(MigrationRoute migrationRoute, String str, Map map, Function1 function1, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = migrationRoute.rnRouteName;
            }
            if ((i11 & 2) != 0) {
                map = migrationRoute.routeParams;
            }
            if ((i11 & 4) != 0) {
                function1 = migrationRoute.nativeUrlBuilder;
            }
            return migrationRoute.m63605a(str, map, function1);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final MigrationRoute m63605a(@NotNull String rnRouteName, @NotNull Map<String, String> routeParams, @NotNull Function1<? super Map<String, String>, String> nativeUrlBuilder) {
            Intrinsics.checkNotNullParameter(rnRouteName, "rnRouteName");
            Intrinsics.checkNotNullParameter(routeParams, "routeParams");
            Intrinsics.checkNotNullParameter(nativeUrlBuilder, "nativeUrlBuilder");
            return new MigrationRoute(rnRouteName, routeParams, nativeUrlBuilder);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Function1<Map<String, String>, String> m63606c() {
            return this.nativeUrlBuilder;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRnRouteName() {
            return this.rnRouteName;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Map<String, String> m63608e() {
            return this.routeParams;
        }

        public int hashCode() {
            return (((this.rnRouteName.hashCode() * 31) + this.routeParams.hashCode()) * 31) + this.nativeUrlBuilder.hashCode();
        }

        @NotNull
        public String toString() {
            return "MigrationRoute(rnRouteName=" + this.rnRouteName + ", routeParams=" + this.routeParams + ", nativeUrlBuilder=" + this.nativeUrlBuilder + ')';
        }

        public /* synthetic */ MigrationRoute(String str, Map map, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? MapsKt.emptyMap() : map, function1);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.interceptor.TradeRnMigrationRouteInterceptor$b, reason: from toString */
    /* JADX INFO: compiled from: TradeRnMigrationRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/tradefacade/interceptor/TradeRnMigrationRouteInterceptor$RnRoute;", "", "name", "", ReportDataTable.COLUMN_PARAMS, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RnRoute {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final Map<String, String> params;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RnRoute)) {
                return false;
            }
            RnRoute rnRoute = (RnRoute) other;
            return Intrinsics.areEqual(this.name, rnRoute.name) && Intrinsics.areEqual(this.params, rnRoute.params);
        }

        public RnRoute(@NotNull String name, @NotNull Map<String, String> params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(params, "params");
            this.name = name;
            this.params = params;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Map<String, String> m63610b() {
            return this.params;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "RnRoute(name=" + this.name + ", params=" + this.params + ')';
        }
    }

    /* JADX INFO: renamed from: g */
    public static final CharSequence m63596g(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        return Uri.encode((String) entry.getKey()) + '=' + Uri.encode((String) entry.getValue());
    }

    /* JADX INFO: renamed from: j */
    public static final String m63597j(TradeRnMigrationRouteInterceptor tradeRnMigrationRouteInterceptor, Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return tradeRnMigrationRouteInterceptor.m63601i("0", params);
    }

    /* JADX INFO: renamed from: k */
    public static final String m63598k(TradeRnMigrationRouteInterceptor tradeRnMigrationRouteInterceptor, Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return tradeRnMigrationRouteInterceptor.m63601i("1", params);
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        MigrationRoute migrationRouteM63602l = m63602l(postcard.getUri());
        if (migrationRouteM63602l == null) {
            return chain.mo103413a(postcard);
        }
        if (C46685c.f104522a.m102909a()) {
            return chain.mo103413a(postcard);
        }
        String strInvoke = migrationRouteM63602l.m63606c().invoke(migrationRouteM63602l.m63608e());
        C44128b.m97266j("TradeRnMigrationRouteInterceptor", "intercept: fallback disabled RN route=" + migrationRouteM63602l.getRnRouteName() + ", fallbackUrl=" + strInvoke);
        return chain.mo103413a(new C4400a(Uri.parse(strInvoke), postcard.getBundle()));
    }

    /* JADX INFO: renamed from: h */
    public final String m63600h(Map<String, String> map) {
        return m63599f("kucoin://lever/borrow-repay", MapsKt.mapOf(TuplesKt.m90091to("symbol", map.get("symbol")), TuplesKt.m90091to("bizType", map.get(TUIConstants.TIMPush.NOTIFICATION.ACTION)), TuplesKt.m90091to("coin", map.get(FirebaseAnalytics.Param.CURRENCY)), TuplesKt.m90091to("positionType", map.get("marginMode"))));
    }

    /* JADX INFO: renamed from: i */
    public final String m63601i(String str, Map<String, String> map) {
        return m63599f("kucoin://trade/delegate/record", MapsKt.mapOf(TuplesKt.m90091to("type", str), TuplesKt.m90091to("symbol", map.get("symbol"))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TradeRnMigrationRouteInterceptor() {
        Pair pairM90091to = TuplesKt.m90091to("MarginBorrowRepayPage", new MigrationRoute(null, null, new TradeRnMigrationRouteInterceptor$migrationRoutes$1(this), 3, null));
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this.f51972a = MapsKt.mapOf(pairM90091to, TuplesKt.m90091to("SpotOrderCenterPage", new MigrationRoute(objArr, null, new Function1() { // from class: y30.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeRnMigrationRouteInterceptor.m63597j(this.f103981b, (Map) obj);
            }
        }, 3, null)), TuplesKt.m90091to("MarginOrderCenterPage", new MigrationRoute(objArr2, null, new Function1() { // from class: y30.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeRnMigrationRouteInterceptor.m63598k(this.f103982b, (Map) obj);
            }
        }, 3, null)));
    }

    /* JADX INFO: renamed from: f */
    public final String m63599f(String str, Map<String, String> map) {
        boolean z11;
        Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            String str2 = (String) ((Map.Entry) obj).getValue();
            if (str2 != null && !StringsKt.isBlank(str2)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                arrayList.add(obj);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, new Function1() { // from class: y30.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TradeRnMigrationRouteInterceptor.m63596g((Map.Entry) obj2);
            }
        }, 30, null);
        if (StringsKt.isBlank(strJoinToString$default)) {
            return str;
        }
        return str + '?' + strJoinToString$default;
    }

    /* JADX INFO: renamed from: l */
    public final MigrationRoute m63602l(Uri uri) {
        String queryParameter;
        RnRoute rnRouteM63603m;
        MigrationRoute migrationRoute;
        if (uri.isOpaque()) {
            return null;
        }
        String strTrimStart = StringsKt.trimStart(RouteExKt.m56216G(uri), '/');
        if ((!Intrinsics.areEqual(strTrimStart, "krn/router") && !Intrinsics.areEqual(strTrimStart, "krn/transparent_router")) || !Intrinsics.areEqual(uri.getQueryParameter(Constants.BIZ), "trade_center") || !Intrinsics.areEqual(uri.getQueryParameter(Constants.COMPONENT), "kc_trade_center_next") || (queryParameter = uri.getQueryParameter("route")) == null || (rnRouteM63603m = m63603m(queryParameter)) == null || (migrationRoute = this.f51972a.get(rnRouteM63603m.getName())) == null) {
            return null;
        }
        return MigrationRoute.m63604b(migrationRoute, rnRouteM63603m.getName(), rnRouteM63603m.m63610b(), null, 4, null);
    }

    /* JADX INFO: renamed from: m */
    public final RnRoute m63603m(String str) {
        String strDecode = Uri.decode(str);
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        String strTrimStart = StringsKt.trimStart(StringsKt.trim((CharSequence) strDecode).toString(), '/');
        String strSubstringBefore$default = StringsKt.substringBefore$default(StringsKt.substringBefore$default(strTrimStart, '?', (String) null, 2, (Object) null), Typography.amp, (String) null, 2, (Object) null);
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.substringAfter(strTrimStart, '?', ""), new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (StringsKt.contains$default((CharSequence) obj, (CharSequence) "=", false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (String str2 : arrayList) {
            Pair pairM90091to = TuplesKt.m90091to(Uri.decode(StringsKt.substringBefore$default(str2, "=", (String) null, 2, (Object) null)), Uri.decode(StringsKt.substringAfter$default(str2, "=", (String) null, 2, (Object) null)));
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return new RnRoute(strSubstringBefore$default, linkedHashMap);
    }
}
