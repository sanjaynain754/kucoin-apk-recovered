package com.kubi.data.coin.info;

import com.kubi.data.coin.BizType;
import com.kubi.data.coin.QueryRet;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37901y;
import gf.InterfaceC37884h;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.C46396e;

/* JADX INFO: renamed from: com.kubi.data.coin.info.c0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderLimitInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/data/coin/info/OrderLimitInfo;", "", "<init>", "()V", "TAG", "", "tradeApi", "Lcom/kubi/data/coin/CoinApi;", "kotlin.jvm.PlatformType", "getTradeApi", "()Lcom/kubi/data/coin/CoinApi;", "tradeApi$delegate", "Lkotlin/Lazy;", "QUOTE_LIMIT_CONFIG_KEY", "getQUOTE_LIMIT_CONFIG_KEY", "()Ljava/lang/String;", "QUOTE_LIMIT_CONFIG_KEY$delegate", "fetchQuoteLimitConfig", "Lio/reactivex/disposables/Disposable;", "getQuoteLimitSize", "", "quoteCurrency", "initQuoteLimitConfig", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderLimitInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderLimitInfo.kt\ncom/kubi/data/coin/info/OrderLimitInfo\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,71:1\n251#2:72\n211#2,2:74\n216#3:73\n217#3:76\n*S KotlinDebug\n*F\n+ 1 OrderLimitInfo.kt\ncom/kubi/data/coin/info/OrderLimitInfo\n*L\n55#1:72\n41#1:74,2\n41#1:73\n41#1:76\n*E\n"})
public final class OrderLimitInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OrderLimitInfo f21441a = new OrderLimitInfo();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f21442b = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderLimitInfo.m23580p();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f21443c = LazyKt.lazy(new Function0() { // from class: com.kubi.data.coin.info.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderLimitInfo.m23575g();
        }
    });

    /* JADX INFO: renamed from: g */
    public static final String m23575g() {
        return SiteUtils.m58088c(SiteUtils.f47907a, "QUOTE_LIMIT_CONFIG", null, null, 6, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m23576i(Map map) {
        C46392a.m102319a(f21441a.m23582m());
        Intrinsics.checkNotNull(map);
        for (Map.Entry entry : map.entrySet()) {
            String plainString = ((BigDecimal) entry.getValue()).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            String strM23582m = f21441a.m23582m();
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            C46396e.m102358o(strM23582m, (String) key, plainString);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final String m23582m() {
        return (String) f21443c.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final double m23583n(@Nullable String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (!C46396e.m102345b(m23582m(), str)) {
                        C37901y.m85656a(BizType.OrderLimitQuery, QueryRet.FAILED);
                        return 0.0d;
                    }
                    BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(C46396e.m102351h(m23582m(), str, ".0"));
                    if (bigDecimalM66536f == null) {
                        C37901y.m85656a(BizType.OrderLimitQuery, QueryRet.FAILED);
                    } else {
                        C37901y.m85656a(BizType.OrderLimitQuery, QueryRet.SUCCESS);
                    }
                    return C27039d.m66647g(bigDecimalM66536f);
                }
            } catch (Exception e11) {
                C44128b.m97264h(e11);
            }
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC37884h m23584o() {
        return (InterfaceC37884h) f21442b.getValue();
    }

    /* JADX INFO: renamed from: j */
    public static final void m23577j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m23578k(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m23579l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC37884h m23580p() {
        return (InterfaceC37884h) C42597a.m93386b().create(InterfaceC37884h.class);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Disposable m23581h() {
        Observable<BaseEntity<Map<String, BigDecimal>>> observableM85561h;
        String[] strArrM102321c = C46392a.m102321c(m23582m());
        if (strArrM102321c != null && strArrM102321c.length != 0) {
            Observable<BaseEntity<Map<String, BigDecimal>>> observableM85561h2 = m23584o().m85561h();
            Intrinsics.checkNotNullExpressionValue(observableM85561h2, "getQuoteLimitConfig(...)");
            observableM85561h = FlowableCompatKt.m66392f(observableM85561h2);
        } else {
            observableM85561h = m23584o().m85561h();
        }
        Observable<R> observableCompose = observableM85561h.compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.data.coin.info.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderLimitInfo.m23576i((Map) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.data.coin.info.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderLimitInfo.m23577j(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.data.coin.info.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderLimitInfo.m23578k((Throwable) obj);
            }
        };
        return observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.data.coin.info.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderLimitInfo.m23579l(function2, obj);
            }
        });
    }
}
