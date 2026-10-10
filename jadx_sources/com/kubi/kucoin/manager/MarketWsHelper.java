package com.kubi.kucoin.manager;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.data.entity.WsFutureSnapshotEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.network.restful.C19321b;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.C27100x0;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketWsHelper.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0002\u0010+\u001a\u00020,2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0)\u0012\u0004\u0012\u00020'0.J8\u0010/\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0002\u0010+\u001a\u00020,2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0)\u0012\u0004\u0012\u00020'0.JB\u00100\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0002\u00101\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0)\u0012\u0004\u0012\u00020'0.J\u009e\u0001\u00102\u001a\u00020'2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020*0)2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020*0)2\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0002\u00106\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u001a\b\u0002\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0)\u0012\u0004\u0012\u00020'0.2\u001a\b\u0002\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0)\u0012\u0004\u0012\u00020'0.2\u001a\b\u0002\u00109\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0)\u0012\u0004\u0012\u00020'0.J\u0006\u0010:\u001a\u00020'R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/kucoin/manager/MarketWsHelper;", "", "<init>", "()V", "spotWsApi", "Lcom/kubi/kucoin/manager/IWsApi;", "getSpotWsApi", "()Lcom/kubi/kucoin/manager/IWsApi;", "spotWsApi$delegate", "Lkotlin/Lazy;", "futureWsApi", "getFutureWsApi", "futureWsApi$delegate", "alphaWsApi", "getAlphaWsApi", "alphaWsApi$delegate", "spotPbWsApi", "Lcom/kubi/kucoin/manager/IMarketTickerPbWsApi;", "getSpotPbWsApi", "()Lcom/kubi/kucoin/manager/IMarketTickerPbWsApi;", "spotPbWsApi$delegate", "futurePbWsApi", "Lcom/kubi/kucoin/manager/IMarketSnapShortPbWsApi;", "getFuturePbWsApi", "()Lcom/kubi/kucoin/manager/IMarketSnapShortPbWsApi;", "futurePbWsApi$delegate", "alphaPbWsApi", "Lcom/kubi/kucoin/manager/IMarketAlphaTickerPbWsApi;", "getAlphaPbWsApi", "()Lcom/kubi/kucoin/manager/IMarketAlphaTickerPbWsApi;", "alphaPbWsApi$delegate", "spotProvider", "Lcom/kubi/kucoin/manager/KCSocketProvider;", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "futureProvider", "Lcom/kubi/data/entity/WsFutureSnapshotEntity;", "alphaProvider", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "subscribeSpot", "", "symbols", "", "", "bufferTime", "", "onWsData", "Lkotlin/Function1;", "subscribeFuture", "subscribeAlpha", TtmlNode.TAG_SPAN, "subscribeMarkets", "spotSymbols", "futureSymbols", "alphaSymbols", "alphaSpan", "onSpotData", "onFutureData", "onAlphaData", "unSubscribe", "Companion", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketWsHelper {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f28083j = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f28084a = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.manager.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketWsHelper.m32537v();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f28085b = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.manager.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketWsHelper.m32535n();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f28086c = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.manager.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketWsHelper.m32533l();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f28087d = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.manager.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketWsHelper.m32536u();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f28088e = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.manager.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketWsHelper.m32534m();
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f28089f = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.manager.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketWsHelper.m32532k();
        }
    });

    /* JADX INFO: renamed from: g */
    @Nullable
    public KCSocketProvider<WsMarketSnapshotEntity> f28090g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public KCSocketProvider<WsFutureSnapshotEntity> f28091h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public KCSocketProvider<WsAlphaSnapshotEntity> f28092i;

    /* JADX INFO: compiled from: MarketWsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/manager/MarketWsHelper$Companion;", "", "<init>", "()V", "TAG", "", "BUFFER_TIME", "", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m32540C(@NotNull List<String> symbols, long j11, @NotNull final Function1<? super List<WsMarketSnapshotEntity>, Unit> onWsData) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Intrinsics.checkNotNullParameter(onWsData, "onWsData");
        KCSocketProvider<WsMarketSnapshotEntity> kCSocketProvider = this.f28090g;
        if (kCSocketProvider != null) {
            kCSocketProvider.m32515l();
        }
        if (symbols.isEmpty()) {
            return;
        }
        SpotSnapshotTopicDescriptor spotSnapshotTopicDescriptor = new SpotSnapshotTopicDescriptor(m32547t(), m32546s());
        spotSnapshotTopicDescriptor.m32564h(CollectionsKt.joinToString$default(symbols, ",", null, null, 0, null, null, 62, null));
        KCSocketProvider<WsMarketSnapshotEntity> kCSocketProvider2 = new KCSocketProvider<>();
        this.f28090g = kCSocketProvider2;
        Intrinsics.checkNotNull(kCSocketProvider2);
        kCSocketProvider2.m32514k(spotSnapshotTopicDescriptor, j11, new Function1() { // from class: com.kubi.kucoin.manager.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketWsHelper.m32520E(onWsData, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m32549z(@NotNull List<String> symbols, long j11, @NotNull final Function1<? super List<WsFutureSnapshotEntity>, Unit> onWsData) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Intrinsics.checkNotNullParameter(onWsData, "onWsData");
        if (C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            KCSocketProvider<WsFutureSnapshotEntity> kCSocketProvider = this.f28091h;
            if (kCSocketProvider != null) {
                kCSocketProvider.m32515l();
            }
            if (symbols.isEmpty()) {
                return;
            }
            FutureSnapshotTopicDescriptor futureSnapshotTopicDescriptor = new FutureSnapshotTopicDescriptor(m32545r(), m32544q());
            futureSnapshotTopicDescriptor.m32507h(CollectionsKt.joinToString$default(symbols, ",", null, null, 0, null, null, 62, null));
            KCSocketProvider<WsFutureSnapshotEntity> kCSocketProvider2 = new KCSocketProvider<>();
            this.f28091h = kCSocketProvider2;
            Intrinsics.checkNotNull(kCSocketProvider2);
            kCSocketProvider2.m32514k(futureSnapshotTopicDescriptor, j11, new Function1() { // from class: com.kubi.kucoin.manager.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketWsHelper.m32518B(onWsData, (Map) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m32517A(MarketWsHelper marketWsHelper, List list, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1200;
        }
        marketWsHelper.m32549z(list, j11, function1);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m32518B(Function1 function1, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        function1.invoke(CollectionsKt.toList(map.values()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m32519D(MarketWsHelper marketWsHelper, List list, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1200;
        }
        marketWsHelper.m32540C(list, j11, function1);
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m32520E(Function1 function1, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        function1.invoke(CollectionsKt.toList(map.values()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m32521G(MarketWsHelper marketWsHelper) {
        KCSocketProvider<WsMarketSnapshotEntity> kCSocketProvider = marketWsHelper.f28090g;
        if (kCSocketProvider != null) {
            kCSocketProvider.m32515l();
        }
        KCSocketProvider<WsFutureSnapshotEntity> kCSocketProvider2 = marketWsHelper.f28091h;
        if (kCSocketProvider2 != null) {
            kCSocketProvider2.m32515l();
        }
        KCSocketProvider<WsAlphaSnapshotEntity> kCSocketProvider3 = marketWsHelper.f28092i;
        if (kCSocketProvider3 != null) {
            kCSocketProvider3.m32515l();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final IWsApi m32533l() {
        return (IWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38006h()).m42776a().m42772b(IWsApi.class);
    }

    /* JADX INFO: renamed from: n */
    public static final IWsApi m32535n() {
        return (IWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(IWsApi.class);
    }

    /* JADX INFO: renamed from: v */
    public static final IWsApi m32537v() {
        return (IWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38006h()).m42776a().m42772b(IWsApi.class);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m32538x(MarketWsHelper marketWsHelper, List list, String str, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "24h";
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            j11 = 1200;
        }
        marketWsHelper.m32548w(list, str2, j11, function1);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m32539y(Function1 function1, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        function1.invoke(CollectionsKt.toList(map.values()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final void m32541F() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.manager.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketWsHelper.m32521G(this.f28146b);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final IMarketAlphaTickerPbWsApi m32542o() {
        return (IMarketAlphaTickerPbWsApi) this.f28089f.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final IWsApi m32543p() {
        return (IWsApi) this.f28086c.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final IMarketSnapShortPbWsApi m32544q() {
        return (IMarketSnapShortPbWsApi) this.f28088e.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final IWsApi m32545r() {
        return (IWsApi) this.f28085b.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final IMarketTickerPbWsApi m32546s() {
        return (IMarketTickerPbWsApi) this.f28087d.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final IWsApi m32547t() {
        return (IWsApi) this.f28084a.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final void m32548w(@NotNull List<String> symbols, @NotNull String span, long j11, @NotNull final Function1<? super List<WsAlphaSnapshotEntity>, Unit> onWsData) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(onWsData, "onWsData");
        if (C24129b.m58030b(SiteVisibleConfigKey.Alpha)) {
            KCSocketProvider<WsAlphaSnapshotEntity> kCSocketProvider = this.f28092i;
            if (kCSocketProvider != null) {
                kCSocketProvider.m32515l();
            }
            if (symbols.isEmpty()) {
                return;
            }
            AlphaSnapshotTopicDescriptor alphaSnapshotTopicDescriptor = new AlphaSnapshotTopicDescriptor(m32543p(), m32542o(), null, 4, null);
            alphaSnapshotTopicDescriptor.m32505i(CollectionsKt.joinToString$default(symbols, ",", null, null, 0, null, null, 62, null));
            alphaSnapshotTopicDescriptor.m32504h(span);
            KCSocketProvider<WsAlphaSnapshotEntity> kCSocketProvider2 = new KCSocketProvider<>();
            this.f28092i = kCSocketProvider2;
            Intrinsics.checkNotNull(kCSocketProvider2);
            kCSocketProvider2.m32514k(alphaSnapshotTopicDescriptor, j11, new Function1() { // from class: com.kubi.kucoin.manager.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketWsHelper.m32539y(onWsData, (Map) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public static final IMarketAlphaTickerPbWsApi m32532k() {
        return C15506i.m32605a();
    }

    /* JADX INFO: renamed from: m */
    public static final IMarketSnapShortPbWsApi m32534m() {
        return C15508j.m32610a();
    }

    /* JADX INFO: renamed from: u */
    public static final IMarketTickerPbWsApi m32536u() {
        return C15510k.m32612a();
    }
}
