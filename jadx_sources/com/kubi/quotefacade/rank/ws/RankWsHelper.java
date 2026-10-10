package com.kubi.quotefacade.rank.ws;

import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.data.entity.WsRankFutureSnapshotEntity;
import com.kubi.data.entity.WsRankMarketSnapshotEntity;
import com.kubi.kucoin.manager.KCSocketProvider;
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

/* JADX INFO: compiled from: RankWsHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020%0+J2\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001e\u0012\u0004\u0012\u00020%0+J2\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001e\u0012\u0004\u0012\u00020%0+J\u0006\u0010.\u001a\u00020%R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001e\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001e\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/ws/RankWsHelper;", "", "<init>", "()V", "spotWsApi", "Lcom/kubi/quotefacade/rank/ws/IRankWsApi;", "getSpotWsApi", "()Lcom/kubi/quotefacade/rank/ws/IRankWsApi;", "spotWsApi$delegate", "Lkotlin/Lazy;", "futureWsApi", "getFutureWsApi", "futureWsApi$delegate", "spotPbWsApi", "Lcom/kubi/quotefacade/rank/ws/IRankPbWsApi;", "getSpotPbWsApi", "()Lcom/kubi/quotefacade/rank/ws/IRankPbWsApi;", "spotPbWsApi$delegate", "alphaPbWsApi", "Lcom/kubi/quotefacade/rank/ws/IAlphaRankPbWsApi;", "getAlphaPbWsApi", "()Lcom/kubi/quotefacade/rank/ws/IAlphaRankPbWsApi;", "alphaPbWsApi$delegate", "futuresPbWsApi", "Lcom/kubi/quotefacade/rank/ws/IFuturesRankPbWsApi;", "getFuturesPbWsApi", "()Lcom/kubi/quotefacade/rank/ws/IFuturesRankPbWsApi;", "futuresPbWsApi$delegate", "spotRankProvider", "Lcom/kubi/kucoin/manager/KCSocketProvider;", "", "Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;", "futureRankProvider", "Lcom/kubi/data/entity/WsRankFutureSnapshotEntity;", "alphaRankProvider", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "subscribeSpot", "", "topic", "", "bufferTime", "", "onWsData", "Lkotlin/Function1;", "subscribeAlpha", "subscribeFuture", "unSubscribe", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankWsHelper {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f42573i = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f42574a = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.ws.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankWsHelper.m52932s();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f42575b = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.ws.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankWsHelper.m52929k();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f42576c = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.ws.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankWsHelper.m52931r();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f42577d = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.ws.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankWsHelper.m52928j();
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f42578e = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.ws.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankWsHelper.m52930l();
        }
    });

    /* JADX INFO: renamed from: f */
    @Nullable
    public KCSocketProvider<List<WsRankMarketSnapshotEntity>> f42579f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public KCSocketProvider<List<WsRankFutureSnapshotEntity>> f42580g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public KCSocketProvider<List<WsAlphaSnapshotEntity>> f42581h;

    /* JADX INFO: compiled from: RankWsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/ws/RankWsHelper$Companion;", "", "<init>", "()V", "TAG", "", "BUFFER_TIME", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m52916A(RankWsHelper rankWsHelper, String str, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1200;
        }
        rankWsHelper.m52945z(str, j11, function1);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m52917B(Function1 function1, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        List listEmptyList = (List) CollectionsKt.firstOrNull(map.values());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        function1.invoke(listEmptyList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m52918D(RankWsHelper rankWsHelper) {
        KCSocketProvider<List<WsRankMarketSnapshotEntity>> kCSocketProvider = rankWsHelper.f42579f;
        if (kCSocketProvider != null) {
            kCSocketProvider.m32515l();
        }
        KCSocketProvider<List<WsRankFutureSnapshotEntity>> kCSocketProvider2 = rankWsHelper.f42580g;
        if (kCSocketProvider2 != null) {
            kCSocketProvider2.m32515l();
        }
        KCSocketProvider<List<WsAlphaSnapshotEntity>> kCSocketProvider3 = rankWsHelper.f42581h;
        if (kCSocketProvider3 != null) {
            kCSocketProvider3.m32515l();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final IRankWsApi m52929k() {
        return (IRankWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(IRankWsApi.class);
    }

    /* JADX INFO: renamed from: s */
    public static final IRankWsApi m52932s() {
        return (IRankWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38006h()).m42776a().m42772b(IRankWsApi.class);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m52933u(RankWsHelper rankWsHelper, String str, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1200;
        }
        rankWsHelper.m52943t(str, j11, function1);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m52934v(Function1 function1, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        List listEmptyList = (List) CollectionsKt.firstOrNull(map.values());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        function1.invoke(listEmptyList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m52935x(RankWsHelper rankWsHelper, String str, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1200;
        }
        rankWsHelper.m52944w(str, j11, function1);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m52936y(Function1 function1, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        List listEmptyList = (List) CollectionsKt.firstOrNull(map.values());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        function1.invoke(listEmptyList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final void m52937C() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.ws.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankWsHelper.m52918D(this.f42584b);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final IAlphaRankPbWsApi m52938m() {
        return (IAlphaRankPbWsApi) this.f42577d.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final IRankWsApi m52939n() {
        return (IRankWsApi) this.f42575b.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final IFuturesRankPbWsApi m52940o() {
        return (IFuturesRankPbWsApi) this.f42578e.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final IRankPbWsApi m52941p() {
        return (IRankPbWsApi) this.f42576c.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final IRankWsApi m52942q() {
        return (IRankWsApi) this.f42574a.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final void m52943t(@NotNull String topic, long j11, @NotNull final Function1<? super List<WsAlphaSnapshotEntity>, Unit> onWsData) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(onWsData, "onWsData");
        if (topic.length() == 0) {
            return;
        }
        KCSocketProvider<List<WsAlphaSnapshotEntity>> kCSocketProvider = this.f42581h;
        if (kCSocketProvider != null) {
            kCSocketProvider.m32515l();
        }
        RankAlphaTopicDescriptor rankAlphaTopicDescriptor = new RankAlphaTopicDescriptor(m52942q(), m52938m(), topic);
        KCSocketProvider<List<WsAlphaSnapshotEntity>> kCSocketProvider2 = new KCSocketProvider<>();
        this.f42581h = kCSocketProvider2;
        Intrinsics.checkNotNull(kCSocketProvider2);
        kCSocketProvider2.m32513j(rankAlphaTopicDescriptor, j11, new Function1() { // from class: com.kubi.quotefacade.rank.ws.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankWsHelper.m52934v(onWsData, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m52944w(@NotNull String topic, long j11, @NotNull final Function1<? super List<WsRankFutureSnapshotEntity>, Unit> onWsData) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(onWsData, "onWsData");
        if (!C24129b.m58030b(SiteVisibleConfigKey.Futures) || topic.length() == 0) {
            return;
        }
        KCSocketProvider<List<WsRankFutureSnapshotEntity>> kCSocketProvider = this.f42580g;
        if (kCSocketProvider != null) {
            kCSocketProvider.m32515l();
        }
        RankFutureTopicDescriptor rankFutureTopicDescriptor = new RankFutureTopicDescriptor(m52939n(), m52940o(), topic);
        KCSocketProvider<List<WsRankFutureSnapshotEntity>> kCSocketProvider2 = new KCSocketProvider<>();
        this.f42580g = kCSocketProvider2;
        Intrinsics.checkNotNull(kCSocketProvider2);
        kCSocketProvider2.m32513j(rankFutureTopicDescriptor, j11, new Function1() { // from class: com.kubi.quotefacade.rank.ws.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankWsHelper.m52936y(onWsData, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m52945z(@NotNull String topic, long j11, @NotNull final Function1<? super List<WsRankMarketSnapshotEntity>, Unit> onWsData) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(onWsData, "onWsData");
        if (topic.length() == 0) {
            return;
        }
        KCSocketProvider<List<WsRankMarketSnapshotEntity>> kCSocketProvider = this.f42579f;
        if (kCSocketProvider != null) {
            kCSocketProvider.m32515l();
        }
        RankSpotTopicDescriptor rankSpotTopicDescriptor = new RankSpotTopicDescriptor(m52942q(), m52941p(), topic);
        KCSocketProvider<List<WsRankMarketSnapshotEntity>> kCSocketProvider2 = new KCSocketProvider<>();
        this.f42579f = kCSocketProvider2;
        Intrinsics.checkNotNull(kCSocketProvider2);
        kCSocketProvider2.m32513j(rankSpotTopicDescriptor, j11, new Function1() { // from class: com.kubi.quotefacade.rank.ws.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankWsHelper.m52917B(onWsData, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final IAlphaRankPbWsApi m52928j() {
        return C22515e.m52952a();
    }

    /* JADX INFO: renamed from: l */
    public static final IFuturesRankPbWsApi m52930l() {
        return C22515e.m52953b();
    }

    /* JADX INFO: renamed from: r */
    public static final IRankPbWsApi m52931r() {
        return C22515e.m52954c();
    }
}
