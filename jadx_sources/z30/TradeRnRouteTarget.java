package z30;

import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z30.g, reason: from toString */
/* JADX INFO: compiled from: TradeRnRouteAdapter.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/tradefacade/service/TradeRnRouteTarget;", "", "routeName", "", ReportDataTable.COLUMN_PARAMS, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getRouteName", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "routeWithQuery", "getRouteWithQuery", "routeWithQuery$delegate", "Lkotlin/Lazy;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeRnRouteTarget {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String routeName;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final Map<String, Object> params;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f104528c;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeRnRouteTarget)) {
            return false;
        }
        TradeRnRouteTarget tradeRnRouteTarget = (TradeRnRouteTarget) other;
        return Intrinsics.areEqual(this.routeName, tradeRnRouteTarget.routeName) && Intrinsics.areEqual(this.params, tradeRnRouteTarget.params);
    }

    public TradeRnRouteTarget(@NotNull String routeName, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(routeName, "routeName");
        Intrinsics.checkNotNullParameter(params, "params");
        this.routeName = routeName;
        this.params = params;
        this.f104528c = LazyKt.lazy(new Function0() { // from class: z30.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeRnRouteTarget.m102922e(this.f104525b);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final String m102922e(TradeRnRouteTarget tradeRnRouteTarget) {
        if (tradeRnRouteTarget.params.isEmpty()) {
            return tradeRnRouteTarget.routeName;
        }
        return URLEncoder.encode(tradeRnRouteTarget.routeName + '?' + CollectionsKt.joinToString$default(tradeRnRouteTarget.params.entrySet(), "&", null, null, 0, null, new Function1() { // from class: z30.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeRnRouteTarget.m102923f((Map.Entry) obj);
            }
        }, 30, null), Charset.forName("UTF-8").name());
    }

    /* JADX INFO: renamed from: f */
    public static final CharSequence m102923f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        return ((String) entry.getKey()) + '=' + entry.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m102924c() {
        return this.params;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m102925d() {
        Object value = this.f104528c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    public int hashCode() {
        return (this.routeName.hashCode() * 31) + this.params.hashCode();
    }

    @NotNull
    public String toString() {
        return "TradeRnRouteTarget(routeName=" + this.routeName + ", params=" + this.params + ')';
    }
}
