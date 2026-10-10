package com.kubi.quotefacade.rank.list;

import com.kubi.data.entity.WsFutureSnapshotEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.data.entity.WsRankFutureSnapshotEntity;
import com.kubi.data.entity.WsRankMarketSnapshotEntity;
import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.entity.RankFuturesEntity;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.quotefacade.rank.config.C22446g;
import com.kubi.quotefacade.rank.config.RankSubTabItemConfig;
import com.kubi.quotefacade.rank.ws.RankWsHelper;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import cv.C36548e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4392c;
import p414kv.C41994j;
import p414kv.C41995k;
import p814yz.C46614a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: RankListVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0014J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0094@¢\u0006\u0002\u0010'J.\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010.J$\u0010/\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0002\u00101J(\u00102\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0010H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u001005H\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\u001e\u00107\u001a\u00020\u001f2\f\u00108\u001a\b\u0012\u0004\u0012\u000209052\u0006\u0010,\u001a\u00020\u0010H\u0002J\u001e\u0010:\u001a\u00020\u001f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020;052\u0006\u0010,\u001a\u00020\u0010H\u0002J\u0016\u0010<\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>05H\u0002J\u0016\u0010?\u001a\u00020\u001f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@05H\u0002J\u0018\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020@H\u0002J \u0010E\u001a\b\u0012\u0004\u0012\u00020\u001305*\b\u0012\u0004\u0012\u00020\u0013052\u0006\u0010,\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006F"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/rank/list/RankListContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "rankEntityMapper", "Lcom/kubi/quotefacade/mapper/RankEntityMapper;", "rankEntityWsMapper", "Lcom/kubi/quotefacade/mapper/RankEntityWsMapper;", "wsHelper", "Lcom/kubi/quotefacade/rank/ws/RankWsHelper;", "marketWsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "TAG", "", "rankQuoteState", "", "Lcom/kubi/quotefacade/entity/RankEntity;", "activeRankCatalog", "subscribedSnapshotSymbolSet", "", "lastFetchDataListIntent", "Lcom/kubi/quotefacade/rank/list/RankListContract$UiIntent$FetchDataList;", "networkRecovery", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "initState", "getInitState", "()Lcom/kubi/quotefacade/rank/list/RankListContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onCleared", "releaseRankWsResources", "requestNetworkRecoveryRefresh", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDataList", "rankType", "subConfig", "Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "from", "market", "(Ljava/lang/String;Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryToUpdateOnFutureNewRank", "resultList", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeWs", "catalog", "snapshotSymbolsForActiveCatalog", "", "subscribeMarketSnapshotsIfSymbolSetChanged", "mergeRankFuturePush", "entities", "Lcom/kubi/data/entity/WsRankFutureSnapshotEntity;", "mergeRankSpotPush", "Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;", "mergeSpotSnapshots", "snapshots", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "mergeFutureSnapshots", "Lcom/kubi/data/entity/WsFutureSnapshotEntity;", "futureVolForRank", "Ljava/math/BigDecimal;", "item", "ws", "limitByFrom", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankListVM.kt\ncom/kubi/quotefacade/rank/list/RankListVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1563#2:397\n1634#2,3:398\n1869#2,2:401\n1563#2:403\n1634#2,3:404\n1563#2:407\n1634#2,3:408\n774#2:411\n865#2,2:412\n1563#2:414\n1634#2,3:415\n774#2:418\n865#2,2:419\n1208#2,2:421\n1236#2,4:423\n1563#2:427\n1634#2,3:428\n1208#2,2:431\n1236#2,4:433\n1563#2:437\n1634#2,3:438\n1208#2,2:441\n1236#2,4:443\n1563#2:447\n1634#2,3:448\n1208#2,2:451\n1236#2,4:453\n1563#2:457\n1634#2,3:458\n*S KotlinDebug\n*F\n+ 1 RankListVM.kt\ncom/kubi/quotefacade/rank/list/RankListVM\n*L\n155#1:397\n155#1:398,3\n162#1:401,2\n167#1:403\n167#1:404,3\n170#1:407\n170#1:408,3\n183#1:411\n183#1:412,2\n192#1:414\n192#1:415,3\n198#1:418\n198#1:419,2\n283#1:421,2\n283#1:423,4\n312#1:427\n312#1:428,3\n316#1:431,2\n316#1:433,4\n340#1:437\n340#1:438,3\n345#1:441,2\n345#1:443,4\n359#1:447\n359#1:448,3\n365#1:451,2\n365#1:453,4\n379#1:457\n379#1:458,3\n*E\n"})
public final class RankListVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public RankListContract$UiIntent.FetchDataList f42499g0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteMarketRepository f42490X = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final C41994j f42491Y = new C41994j();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final C41995k f42492Z = new C41995k();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final RankWsHelper f42493a0 = new RankWsHelper();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MarketWsHelper f42494b0 = new MarketWsHelper();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final String f42495c0 = "RankListVM";

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final List<RankEntity> f42496d0 = new ArrayList();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public String f42497e0 = "";

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public Set<String> f42498f0 = SetsKt.emptySet();

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final C46614a f42500h0 = new C46614a("RankListVM", new RankListVM$networkRecovery$1(this));

    /* JADX INFO: renamed from: A */
    public static final Unit m52887A(RankListVM rankListVM, String str, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rankListVM.m52904q(it, str);
        rankListVM.m52909w();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m52888B(RankListVM rankListVM, String str, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rankListVM.m52905r(it, str);
        rankListVM.m52909w();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m52895u() {
        RankListContract$UiIntent.FetchDataList fetchDataList = this.f42499g0;
        if (fetchDataList == null) {
            C44128b.m97266j(this.f42495c0, "network recovered: skip FetchDataList, no previous params");
            return;
        }
        C44128b.m97266j(this.f42495c0, "network recovered: send FetchDataList rankType=" + fetchDataList.getRankType() + " from=" + fetchDataList.getFrom());
        sendIntent(new RankListContract$UiIntent.FetchDataList(fetchDataList.getRankType(), fetchDataList.getSubConfig(), fetchDataList.getFrom(), fetchDataList.getMarket()));
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m52896x(RankListVM rankListVM, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rankListVM.m52903p(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m52897y(RankListVM rankListVM, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rankListVM.m52906s(it);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (!(interfaceC19282d instanceof RankListContract$UiIntent.FetchDataList)) {
            return Unit.INSTANCE;
        }
        RankListContract$UiIntent.FetchDataList fetchDataList = (RankListContract$UiIntent.FetchDataList) interfaceC19282d;
        this.f42499g0 = fetchDataList;
        String rankType = fetchDataList.getRankType();
        RankSubTabItemConfig subConfig = fetchDataList.getSubConfig();
        String from = fetchDataList.getFrom();
        String market = fetchDataList.getMarket();
        if (market == null) {
            market = "";
        }
        Object objM52899i = m52899i(rankType, subConfig, from, market, continuation);
        return objM52899i == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM52899i : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0122  */
    /* JADX WARN: Code duplicated, block: B:38:0x0135 A[LOOP:3: B:36:0x012f->B:38:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x017e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0199  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016a, code lost:
    
        if (m52898C(r12, r2, r6) == r7) goto L49;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52899i(String str, RankSubTabItemConfig rankSubTabItemConfig, String str2, String str3, Continuation<? super Unit> continuation) {
        RankListVM$fetchDataList$1 rankListVM$fetchDataList$1;
        String type;
        String str4;
        String str5;
        String str6;
        List<RankEntity> list;
        String str7;
        RankSubTabItemConfig rankSubTabItemConfig2;
        Collection<? extends RankEntity> collection;
        List list2;
        ArrayList arrayList;
        Iterator it;
        String str8 = str2;
        String str9 = str3;
        if (continuation instanceof RankListVM$fetchDataList$1) {
            rankListVM$fetchDataList$1 = (RankListVM$fetchDataList$1) continuation;
            int i11 = rankListVM$fetchDataList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rankListVM$fetchDataList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rankListVM$fetchDataList$1 = new RankListVM$fetchDataList$1(this, continuation);
            }
        } else {
            rankListVM$fetchDataList$1 = new RankListVM$fetchDataList$1(this, continuation);
        }
        RankListVM$fetchDataList$1 rankListVM$fetchDataList$2 = rankListVM$fetchDataList$1;
        Object objM53001p = rankListVM$fetchDataList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rankListVM$fetchDataList$2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                list = (List) rankListVM$fetchDataList$2.L$5;
                type = (String) rankListVM$fetchDataList$2.L$4;
                str6 = (String) rankListVM$fetchDataList$2.L$3;
                str5 = (String) rankListVM$fetchDataList$2.L$2;
                str4 = (String) rankListVM$fetchDataList$2.L$0;
                ResultKt.throwOnFailure(objM53001p);
                collection = (List) objM53001p;
                if (collection != null) {
                    list.addAll(collection);
                }
            } else if (i12 == 2) {
                list = (List) rankListVM$fetchDataList$2.L$5;
                type = (String) rankListVM$fetchDataList$2.L$4;
                String str10 = (String) rankListVM$fetchDataList$2.L$3;
                String str11 = (String) rankListVM$fetchDataList$2.L$2;
                rankSubTabItemConfig2 = (RankSubTabItemConfig) rankListVM$fetchDataList$2.L$1;
                str7 = (String) rankListVM$fetchDataList$2.L$0;
                ResultKt.throwOnFailure(objM53001p);
                str9 = str10;
                str8 = str11;
                list2 = (List) objM53001p;
                if (list2 != null) {
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.boxBoolean(list.add(this.f42491Y.mo51723a((RankFuturesEntity) it.next()))));
                    }
                }
                rankListVM$fetchDataList$2.L$0 = str7;
                rankListVM$fetchDataList$2.L$1 = SpillingKt.nullOutSpilledVariable(rankSubTabItemConfig2);
                rankListVM$fetchDataList$2.L$2 = str8;
                rankListVM$fetchDataList$2.L$3 = str9;
                rankListVM$fetchDataList$2.L$4 = type;
                rankListVM$fetchDataList$2.L$5 = list;
                rankListVM$fetchDataList$2.L$6 = SpillingKt.nullOutSpilledVariable(list2);
                rankListVM$fetchDataList$2.label = 3;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) rankListVM$fetchDataList$2.L$5;
                type = (String) rankListVM$fetchDataList$2.L$4;
                str6 = (String) rankListVM$fetchDataList$2.L$3;
                str5 = (String) rankListVM$fetchDataList$2.L$2;
                str4 = (String) rankListVM$fetchDataList$2.L$0;
                ResultKt.throwOnFailure(objM53001p);
            }
            String str12 = str5;
            str9 = str6;
            str8 = str12;
            str7 = str4;
        } else {
            ResultKt.throwOnFailure(objM53001p);
            type = rankSubTabItemConfig.getType();
            C44128b.m97266j(this.f42495c0, "[fetchDataList] rankType:" + str + ", catalog:" + type + ", from:" + str8 + ", market:" + str9);
            m52907t();
            List<RankEntity> arrayList2 = new ArrayList<>();
            int iHashCode = type.hashCode();
            if (iHashCode != 2074257) {
                if (iHashCode == 2552066) {
                    if (type.equals("SPOT")) {
                        QuoteMarketRepository quoteMarketRepository = this.f42490X;
                        rankListVM$fetchDataList$2.L$0 = str;
                        rankListVM$fetchDataList$2.L$1 = SpillingKt.nullOutSpilledVariable(rankSubTabItemConfig);
                        rankListVM$fetchDataList$2.L$2 = str8;
                        rankListVM$fetchDataList$2.L$3 = str9;
                        rankListVM$fetchDataList$2.L$4 = type;
                        rankListVM$fetchDataList$2.L$5 = arrayList2;
                        rankListVM$fetchDataList$2.label = 1;
                        objM53001p = quoteMarketRepository.m53001p(str, type, str8, str9, rankListVM$fetchDataList$2);
                        if (objM53001p != coroutine_suspended) {
                            str4 = str;
                            str5 = str2;
                            str6 = str3;
                            list = arrayList2;
                            collection = (List) objM53001p;
                            if (collection != null) {
                                list.addAll(collection);
                            }
                        }
                        return coroutine_suspended;
                    }
                } else if (iHashCode == 215679250 && type.equals("CONTRACT")) {
                    QuoteMarketRepository quoteMarketRepository2 = this.f42490X;
                    rankListVM$fetchDataList$2.L$0 = str;
                    rankListVM$fetchDataList$2.L$1 = SpillingKt.nullOutSpilledVariable(rankSubTabItemConfig);
                    rankListVM$fetchDataList$2.L$2 = str8;
                    rankListVM$fetchDataList$2.L$3 = str9;
                    rankListVM$fetchDataList$2.L$4 = type;
                    rankListVM$fetchDataList$2.L$5 = arrayList2;
                    rankListVM$fetchDataList$2.label = 2;
                    objM53001p = quoteMarketRepository2.m53000o(str, type, str8, rankListVM$fetchDataList$2);
                    if (objM53001p != coroutine_suspended) {
                        str7 = str;
                        list = arrayList2;
                        rankSubTabItemConfig2 = rankSubTabItemConfig;
                        list2 = (List) objM53001p;
                        if (list2 != null) {
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Boxing.boxBoolean(list.add(this.f42491Y.mo51723a((RankFuturesEntity) it.next()))));
                            }
                        }
                        rankListVM$fetchDataList$2.L$0 = str7;
                        rankListVM$fetchDataList$2.L$1 = SpillingKt.nullOutSpilledVariable(rankSubTabItemConfig2);
                        rankListVM$fetchDataList$2.L$2 = str8;
                        rankListVM$fetchDataList$2.L$3 = str9;
                        rankListVM$fetchDataList$2.L$4 = type;
                        rankListVM$fetchDataList$2.L$5 = list;
                        rankListVM$fetchDataList$2.L$6 = SpillingKt.nullOutSpilledVariable(list2);
                        rankListVM$fetchDataList$2.label = 3;
                    }
                    return coroutine_suspended;
                }
                str8 = str2;
                str9 = str3;
                list = arrayList2;
                str7 = str;
            } else {
                if (type.equals("COIN")) {
                    QuoteMarketRepository quoteMarketRepository3 = this.f42490X;
                    rankListVM$fetchDataList$2.L$0 = str;
                    rankListVM$fetchDataList$2.L$1 = SpillingKt.nullOutSpilledVariable(rankSubTabItemConfig);
                    rankListVM$fetchDataList$2.L$2 = str8;
                    rankListVM$fetchDataList$2.L$3 = str9;
                    rankListVM$fetchDataList$2.L$4 = type;
                    rankListVM$fetchDataList$2.L$5 = arrayList2;
                    rankListVM$fetchDataList$2.label = 1;
                    objM53001p = quoteMarketRepository3.m53001p(str, type, str8, str9, rankListVM$fetchDataList$2);
                    if (objM53001p != coroutine_suspended) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        list = arrayList2;
                        collection = (List) objM53001p;
                        if (collection != null) {
                            list.addAll(collection);
                        }
                    }
                    return coroutine_suspended;
                }
                str8 = str2;
                str9 = str3;
                list = arrayList2;
                str7 = str;
            }
            String str13 = str5;
            str9 = str6;
            str8 = str13;
            str7 = str4;
        }
        for (RankEntity rankEntity : list) {
            if (!Intrinsics.areEqual(str7, "NEW_CURRENCY_V2")) {
                rankEntity.setOpeningTime(Boxing.boxLong(0L));
            }
        }
        List<RankEntity> listM52902o = m52902o(list, str8);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM52902o, 10));
        Iterator<T> it2 = listM52902o.iterator();
        while (it2.hasNext()) {
            arrayList3.add(RankEntity.copy$default((RankEntity) it2.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        }
        this.f42496d0.clear();
        this.f42496d0.addAll(arrayList3);
        List<RankEntity> list3 = this.f42496d0;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(RankEntity.copy$default((RankEntity) it3.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        }
        send(new C22477d(arrayList4, false, 2, null));
        if (!this.f42496d0.isEmpty()) {
            m52910z(str7, type, str8, str9);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, 3, null);
    }

    /* JADX INFO: renamed from: o */
    public final List<RankEntity> m52902o(List<RankEntity> list, String str) {
        int size = Intrinsics.areEqual(str, "HOMEPAGE") ? 6 : list.size();
        return list.size() > size ? list.subList(0, size) : list;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        this.f42500h0.m102780f();
        super.onHide();
        m52907t();
    }

    /* JADX INFO: renamed from: p */
    public final void m52903p(List<WsFutureSnapshotEntity> list) {
        WsFutureSnapshotEntity wsFutureSnapshotEntity;
        if (this.f42496d0.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((WsFutureSnapshotEntity) obj).getSymbol(), obj);
        }
        int size = this.f42496d0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            RankEntity rankEntity = this.f42496d0.get(i11);
            String symbol = rankEntity.getSymbol();
            if (symbol != null && (wsFutureSnapshotEntity = (WsFutureSnapshotEntity) linkedHashMap.get(symbol)) != null) {
                this.f42496d0.set(i11, RankEntity.copy$default(rankEntity, null, null, null, null, null, BigDecimal.valueOf(wsFutureSnapshotEntity.getPriceChgPct()), BigDecimal.valueOf(wsFutureSnapshotEntity.getLastPrice()), null, null, m52900j(rankEntity, wsFutureSnapshotEntity), null, null, null, 7583, null));
                z11 = true;
            }
        }
        if (z11) {
            List<RankEntity> list2 = this.f42496d0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(RankEntity.copy$default((RankEntity) it.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
            }
            send(new C22477d(arrayList, true));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m52904q(List<WsRankFutureSnapshotEntity> list, String str) {
        String symbol;
        List<RankEntity> list2 = this.f42496d0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            String symbol2 = ((RankEntity) obj).getSymbol();
            if (symbol2 == null) {
                symbol2 = "";
            }
            linkedHashMap.put(symbol2, obj);
        }
        ArrayList arrayList = new ArrayList();
        for (WsRankFutureSnapshotEntity wsRankFutureSnapshotEntity : list) {
            RankEntity rankEntityMo51723a = this.f42492Z.mo51723a(wsRankFutureSnapshotEntity);
            if (!rankEntityMo51723a.isCountDownType() && QuoteBusinessConfigHelp.f41933a.m51846j(wsRankFutureSnapshotEntity.getFuturesMarks()) && (symbol = rankEntityMo51723a.getSymbol()) != null) {
                RankEntity rankEntity = (RankEntity) linkedHashMap.get(symbol);
                if (rankEntity != null) {
                    Integer order = rankEntityMo51723a.getOrder();
                    if (order == null) {
                        order = rankEntity.getOrder();
                    }
                    Integer num = order;
                    String currency = rankEntityMo51723a.getCurrency();
                    if (currency == null) {
                        currency = rankEntity.getCurrency();
                    }
                    String str2 = currency;
                    String symbol3 = rankEntityMo51723a.getSymbol();
                    if (symbol3 == null) {
                        symbol3 = rankEntity.getSymbol();
                    }
                    String str3 = symbol3;
                    String quote = rankEntityMo51723a.getQuote();
                    if (quote == null) {
                        quote = rankEntity.getQuote();
                    }
                    String str4 = quote;
                    Boolean inverseSymbol = rankEntityMo51723a.getInverseSymbol();
                    if (inverseSymbol == null) {
                        inverseSymbol = rankEntity.getInverseSymbol();
                    }
                    BigDecimal bigDecimalM103798getPrice = rankEntity.m103798getPrice();
                    rankEntityMo51723a = RankEntity.copy$default(rankEntity, num, str2, str3, null, str4, rankEntity.getChangeRate(), bigDecimalM103798getPrice, rankEntity.getValue(), null, rankEntity.getVolValue(), null, inverseSymbol, null, 5384, null);
                }
                arrayList.add(rankEntityMo51723a);
            }
        }
        List<RankEntity> listM52902o = m52902o(arrayList, str);
        this.f42496d0.clear();
        this.f42496d0.addAll(listM52902o);
        List<RankEntity> list3 = this.f42496d0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(RankEntity.copy$default((RankEntity) it.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        }
        send(new C22477d(arrayList2, true));
    }

    /* JADX INFO: renamed from: r */
    public final void m52905r(List<WsRankMarketSnapshotEntity> list, String str) {
        String symbolCode;
        List<RankEntity> list2 = this.f42496d0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            RankEntity rankEntity = (RankEntity) obj;
            String symbolCode2 = rankEntity.getSymbolCode();
            if (symbolCode2 == null && (symbolCode2 = rankEntity.getSymbol()) == null) {
                symbolCode2 = "";
            }
            linkedHashMap.put(symbolCode2, obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WsRankMarketSnapshotEntity> it = list.iterator();
        while (it.hasNext()) {
            RankEntity rankEntityM81814a = C36548e.m81814a(new RankEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null), it.next());
            if (!rankEntityM81814a.isCountDownType() && ((symbolCode = rankEntityM81814a.getSymbolCode()) != null || (symbolCode = rankEntityM81814a.getSymbol()) != null)) {
                RankEntity rankEntity2 = (RankEntity) linkedHashMap.get(symbolCode);
                if (rankEntity2 != null) {
                    BigDecimal bigDecimalM103798getPrice = rankEntityM81814a.m103798getPrice();
                    BigDecimal changeRate = rankEntityM81814a.getChangeRate();
                    BigDecimal volValue = rankEntityM81814a.getVolValue();
                    BigDecimal value = rankEntityM81814a.getValue();
                    BigDecimal markCap = rankEntityM81814a.getMarkCap();
                    if (markCap == null) {
                        markCap = rankEntity2.getMarkCap();
                    }
                    rankEntityM81814a = RankEntity.copy$default(rankEntity2, null, null, null, null, null, changeRate, bigDecimalM103798getPrice, value, markCap, volValue, null, null, null, 7199, null);
                }
                arrayList.add(rankEntityM81814a);
            }
        }
        List<RankEntity> listM52902o = m52902o(arrayList, str);
        this.f42496d0.clear();
        this.f42496d0.addAll(listM52902o);
        List<RankEntity> list3 = this.f42496d0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(RankEntity.copy$default((RankEntity) it2.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        }
        send(new C22477d(arrayList2, true));
    }

    /* JADX INFO: renamed from: s */
    public final void m52906s(List<WsMarketSnapshotEntity> list) {
        WsMarketSnapshotEntity wsMarketSnapshotEntity;
        if (this.f42496d0.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((WsMarketSnapshotEntity) obj).getSymbolCode(), obj);
        }
        int size = this.f42496d0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            RankEntity rankEntity = this.f42496d0.get(i11);
            String symbolCode = rankEntity.getSymbolCode();
            if (symbolCode != null && (wsMarketSnapshotEntity = (WsMarketSnapshotEntity) linkedHashMap.get(symbolCode)) != null) {
                this.f42496d0.set(i11, RankEntity.copy$default(rankEntity, null, null, null, null, null, BigDecimal.valueOf(wsMarketSnapshotEntity.getChangeRate()), BigDecimal.valueOf(wsMarketSnapshotEntity.getLastTradedPrice()), null, null, BigDecimal.valueOf(wsMarketSnapshotEntity.getVolValue()), null, null, null, 7583, null));
                z11 = true;
            }
        }
        if (z11) {
            List<RankEntity> list2 = this.f42496d0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(RankEntity.copy$default((RankEntity) it.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
            }
            send(new C22477d(arrayList, true));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m52907t() {
        this.f42493a0.m52937C();
        this.f42494b0.m32541F();
        this.f42496d0.clear();
        this.f42497e0 = "";
        this.f42498f0 = SetsKt.emptySet();
    }

    /* JADX INFO: renamed from: v */
    public final List<String> m52908v() {
        if (C4392c.m4017e(this.f42497e0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<RankEntity> it = this.f42496d0.iterator();
            while (it.hasNext()) {
                String symbol = it.next().getSymbol();
                if (symbol != null) {
                    linkedHashSet.add(symbol);
                }
            }
            return CollectionsKt.toList(linkedHashSet);
        }
        if (!C4392c.m4016d(this.f42497e0) && !C4392c.m4018f(this.f42497e0)) {
            return CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator<RankEntity> it2 = this.f42496d0.iterator();
        while (it2.hasNext()) {
            String symbolCode = it2.next().getSymbolCode();
            if (symbolCode != null) {
                linkedHashSet2.add(symbolCode);
            }
        }
        return CollectionsKt.toList(linkedHashSet2);
    }

    /* JADX INFO: renamed from: C */
    public final Object m52898C(String str, List<RankEntity> list, Continuation<? super Unit> continuation) {
        if (!C4392c.m4015c(str)) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            RankEntity rankEntity = (RankEntity) obj;
            if (rankEntity.isCountDownType() && rankEntity.getSymbol() != null) {
                IKuMexService iKuMexService = IKuMexService.f28731a.get();
                String symbol = rankEntity.getSymbol();
                Intrinsics.checkNotNull(symbol);
                if (!IKuMexService.m33251q(iKuMexService, symbol, false, 2, null)) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        String str2 = this.f42495c0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[tryToUpdateOnFutureNewRank] needFetch: ");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((RankEntity) it.next()).getSymbol());
        }
        sb2.append(arrayList2);
        C44128b.m97266j(str2, sb2.toString());
        RankEntity rankEntity2 = (RankEntity) CollectionsKt.firstOrNull((List) arrayList);
        if (rankEntity2 != null) {
            IKuMexService iKuMexService2 = IKuMexService.f28731a.get();
            String symbol2 = rankEntity2.getSymbol();
            Intrinsics.checkNotNull(symbol2);
            iKuMexService2.mo33253B(symbol2, true);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                RankEntity rankEntity3 = (RankEntity) obj2;
                if (rankEntity3.isCountDownType() && rankEntity3.getSymbol() != null) {
                    IKuMexService iKuMexService3 = IKuMexService.f28731a.get();
                    String symbol3 = rankEntity3.getSymbol();
                    Intrinsics.checkNotNull(symbol3);
                    if (!IKuMexService.m33251q(iKuMexService3, symbol3, false, 2, null)) {
                        arrayList3.add(obj2);
                    }
                }
            }
            Boxing.boxBoolean(list.removeAll(arrayList3));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final BigDecimal m52900j(RankEntity rankEntity, WsFutureSnapshotEntity wsFutureSnapshotEntity) {
        double turnover;
        if (Intrinsics.areEqual(rankEntity.getInverseSymbol(), Boolean.TRUE)) {
            turnover = wsFutureSnapshotEntity.getVolume();
        } else {
            turnover = wsFutureSnapshotEntity.getTurnover();
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(turnover);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        m52907t();
        this.f42500h0.m102779e();
        super.onCleared();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        this.f42500h0.m102781g();
    }

    /* JADX INFO: renamed from: w */
    public final void m52909w() {
        List<String> listM52908v = m52908v();
        Set<String> set = CollectionsKt.toSet(listM52908v);
        if (!Intrinsics.areEqual(set, this.f42498f0)) {
            this.f42498f0 = set;
            C44128b.m97259c(this.f42495c0, "[snapshot] symbol set changed, re-subscribe size=" + set.size());
            if (C4392c.m4017e(this.f42497e0)) {
                MarketWsHelper.m32517A(this.f42494b0, listM52908v, 0L, new Function1() { // from class: com.kubi.quotefacade.rank.list.h0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RankListVM.m52896x(this.f42525b, (List) obj);
                    }
                }, 2, null);
            } else {
                if (!C4392c.m4016d(this.f42497e0) && !C4392c.m4018f(this.f42497e0)) {
                    return;
                }
                MarketWsHelper.m32519D(this.f42494b0, listM52908v, 0L, new Function1() { // from class: com.kubi.quotefacade.rank.list.i0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RankListVM.m52897y(this.f42528b, (List) obj);
                    }
                }, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m52910z(String str, String str2, final String str3, String str4) {
        String strM52739c = C22446g.m52739c(str, str2, str3, str4);
        if (strM52739c == null) {
            C44128b.m97261e(this.f42495c0, "[subscribeWs] rankType:" + str + ",catalog:" + str2 + ", from:" + str3 + ", market:" + str4);
            return;
        }
        this.f42497e0 = str2;
        C44128b.m97259c(this.f42495c0, "[subscribeWs] rankType:" + str + ",catalog:" + str2 + ", from:" + str3 + ", market:" + str4 + ", topic:" + strM52739c);
        if (C4392c.m4017e(str2)) {
            RankWsHelper.m52935x(this.f42493a0, strM52739c, 0L, new Function1() { // from class: com.kubi.quotefacade.rank.list.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RankListVM.m52887A(this.f42519b, str3, (List) obj);
                }
            }, 2, null);
            m52909w();
        } else {
            if (!C4392c.m4016d(str2) && !C4392c.m4018f(str2)) {
                return;
            }
            RankWsHelper.m52916A(this.f42493a0, strM52739c, 0L, new Function1() { // from class: com.kubi.quotefacade.rank.list.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RankListVM.m52888B(this.f42522b, str3, (List) obj);
                }
            }, 2, null);
            m52909w();
        }
    }
}
