package com.kubi.home.rank.impl;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.home.api.RankEntity;
import com.kubi.home.api.RankNewCoin;
import com.kubi.home.rank.RankTradeItem;
import com.kubi.home.rank.impl.cache.RankCoinHelper;
import com.kubi.home.rank.impl.cache.RankItem;
import com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.websocket.SocketTask;
import com.kubi.sdk.websocket.WebSocketException;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.DowngradeExKt;
import g10.C37781l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0016\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002J\u001c\u0010#\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0082@¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u001aH\u0002J\u0016\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0!H\u0002J\u0012\u0010*\u001a\u00020)*\u00020)H\u0082@¢\u0006\u0002\u0010+J6\u0010,\u001a\u00020)2\u0014\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020/0.2\u0016\u00100\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\"\u0018\u000101H\u0002J\b\u00102\u001a\u00020\u001aH\u0014J\b\u00103\u001a\u00020\u001aH\u0002J\u0010\u00104\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u00105\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u00108\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J$\u0010:\u001a\u00020\u001a2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010<\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010=J\u001e\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\"2\u0006\u0010<\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010@J\b\u0010A\u001a\u00020\u0004H\u0002J\u0018\u0010B\u001a\u00020\u001a2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010!H\u0002J\f\u0010D\u001a\u00020\u001a*\u00020\u001fH\u0002J\u0016\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0094@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0094@¢\u0006\u0002\u0010HJ\u0016\u0010J\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020KH\u0082@¢\u0006\u0002\u0010LR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\"07X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010M\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/rank/impl/RankStateContract$UIState;", "type", "", "<init>", "(I)V", "getType", "()I", "setType", "needCatchException", "", "getNeedCatchException", "()Z", "rankApi", "Lcom/kubi/home/rank/impl/IRankApi;", "getRankApi", "()Lcom/kubi/home/rank/impl/IRankApi;", "rankApi$delegate", "Lkotlin/Lazy;", "rankRepository", "Lcom/kubi/home/rank/impl/RankRepository;", "getRankRepository", "()Lcom/kubi/home/rank/impl/RankRepository;", "rankRepository$delegate", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "update", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildSymbols", "", "rank", "", "Lcom/kubi/home/api/RankEntity;", "handleNewCoinRankList", "rankEntityList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDataToEmpty", "refreshData", "rankList", "Lcom/kubi/home/rank/impl/cache/RankItem;", "loadIconUrl", "(Lcom/kubi/home/rank/impl/cache/RankItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToRankItem", "pair", "Lkotlin/Pair;", "Lcom/kubi/data/entity/TradeItemBean;", "rankEntityMap", "", "onCleared", "sendEmptyEvent", "getApiType", "getTopic", "apiOrgRankDataList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listenRankData", "registerSocket", "handleRankList", "list", "fromWs", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertRankEntityToTradeItemBean", "rankEntity", "(Lcom/kubi/home/api/RankEntity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getViewType", "performRefreshFragment", "tradeItemBeans", "log", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchIntentOnIO", "handleListenRankData", "Lcom/kubi/home/rank/impl/RankStateContract$UiIntent$ListenRankData;", "(Lcom/kubi/home/rank/impl/RankStateContract$UiIntent$ListenRankData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/home/rank/impl/RankStateContract$UIState;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n+ 2 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,380:1\n220#2,2:381\n31#2,11:404\n54#2:415\n1208#3,2:383\n1236#3,4:385\n1563#3:389\n1634#3,3:390\n1563#3:416\n1634#3,3:417\n295#3,2:420\n49#4:393\n51#4:397\n46#5:394\n51#5:396\n105#6:395\n25#7:398\n26#7:400\n25#7:401\n26#7:403\n1#8:399\n1#8:402\n*S KotlinDebug\n*F\n+ 1 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n*L\n96#1:381,2\n280#1:404,11\n280#1:415\n123#1:383,2\n123#1:385,4\n124#1:389\n124#1:390,3\n289#1:416\n289#1:417,3\n324#1:420,2\n129#1:393\n129#1:397\n129#1:394\n129#1:396\n129#1:395\n141#1:398\n141#1:400\n272#1:401\n272#1:403\n141#1:399\n272#1:402\n*E\n"})
public class RankVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f26013b0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    public int f26014X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f26015Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f26016Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final CopyOnWriteArrayList<RankEntity> f26017a0;

    /* JADX INFO: compiled from: RankVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankVM$Companion;", "", "<init>", "()V", "LOG_TAG", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n*L\n1#1,328:1\n133#2:329\n*E\n"})
    public static final class C14764a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues((Integer) ((Pair) t11).getFirst(), (Integer) ((Pair) t12).getFirst());
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankVM$b */
    /* JADX INFO: compiled from: SocketEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n+ 6 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,223:1\n50#2,7:224\n57#2,10:241\n36#3:231\n137#4,5:232\n281#5,4:237\n46#6,2:251\n*S KotlinDebug\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n*L\n42#1:224,7\n42#1:241,10\n43#1:231\n43#1:232,5\n50#1:251,2\n*E\n"})
    public static final class C14765b implements Function1<String, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f26018b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ RankVM f26019c;

        /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankVM$b$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocket$1$invoke$lambda$2$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class a extends TypeToken<List<? extends RankEntity>> {
        }

        public C14765b(String str, RankVM rankVM) {
            this.f26018b = str;
            this.f26019c = rankVM;
        }

        /* JADX INFO: renamed from: a */
        public final void m29925a(String it) throws Throwable {
            Object objM103844constructorimpl;
            Object objM66914d;
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.f26018b;
            boolean zM42528a = C19241c.f35620a.m42528a();
            boolean z11 = !zM42528a;
            try {
                Result.Companion companion = Result.INSTANCE;
                try {
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(it, new a().getType());
                } catch (Throwable th2) {
                    C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                    objM66914d = null;
                }
                if (objM66914d != null) {
                    RankVM rankVM = this.f26019c;
                    rankVM.launchOnIO(new RankVM$registerSocket$1$1(rankVM, (List) objM66914d, null));
                    C44128b.m97259c("socket", "Topic->" + str + " 数据解析成功！");
                } else {
                    C44128b.m97259c("socket", "Topic->" + str + " 数据解析失败！");
                    objM66914d = Unit.INSTANCE;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(objM66914d);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f("crash_issue", "crash_issue->【Socket 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C43846g.m96568c(new WebSocketException(thM103847exceptionOrNullimpl2, "SocketEx", false, null, 8, null), null, 2, null);
                C44128b.m97262f("socket", "topic->" + thM103847exceptionOrNullimpl2 + "->【MVI bindSocket发生错误】", thM103847exceptionOrNullimpl2);
            }
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) throws Throwable {
            m29925a(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: P */
    public final String m29911P(int i11) {
        switch (i11) {
            case 1:
                return DowngradeExKt.m66551u("/app-home/home-list:%s", new Object[]{"search_hot"}, null, 2, null);
            case 2:
                return DowngradeExKt.m66551u("/app-home/home-list:%s", new Object[]{"price_change_rate_24h_up"}, null, 2, null);
            case 3:
                return "/reaper/rank:price_change_rate_1week_up";
            case 4:
                return DowngradeExKt.m66551u("/app-home/home-list:%s", new Object[]{"volume_change_rate_24h_up"}, null, 2, null);
            case 5:
                return "/reaper/rank:volume_change_rate_1week_up";
            case 6:
                return DowngradeExKt.m66551u("/app-home/home-list:%s", new Object[]{"price_change_rate_24h_down"}, null, 2, null);
            case 7:
                return "/reaper/rank:price_change_rate_1week_down";
            case 8:
                return DowngradeExKt.m66551u("/app-home/home-list:%s", new Object[]{"new_currency"}, null, 2, null);
            default:
                return "";
        }
    }

    @Override // com.kubi.mvi.state.AbstractC19290l, com.kubi.mvi.state.BaseStateVM
    public boolean getNeedCatchException() {
        return true;
    }

    /* JADX INFO: renamed from: F */
    public static final CharSequence m29881F(RankEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String symbol = it.getSymbol();
        return symbol != null ? symbol : "";
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m29882H(RankItem rankItem, RankVM rankVM, RankEntity rankEntity) {
        Object next;
        Iterator<T> it = rankVM.f26017a0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((RankEntity) next).getSymbol(), rankEntity.getSymbol()));
        RankEntity rankEntity2 = (RankEntity) next;
        rankItem.setCoinLabel(rankEntity2 != null ? rankEntity2.getCoinLabel() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Object m29883J(RankVM rankVM, InterfaceC19282d interfaceC19282d, Continuation<? super Unit> continuation) {
        if (interfaceC19282d instanceof RankStateContract$UiIntent.ListenRankData) {
            Object objM29914S = rankVM.m29914S((RankStateContract$UiIntent.ListenRankData) interfaceC19282d, continuation);
            return objM29914S == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM29914S : Unit.INSTANCE;
        }
        if (!(interfaceC19282d instanceof RankStateContract$UiIntent.UpdateListenRankData)) {
            return Unit.INSTANCE;
        }
        Object objM29924h0 = rankVM.m29924h0(((RankStateContract$UiIntent.UpdateListenRankData) interfaceC19282d).getType(), continuation);
        return objM29924h0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM29924h0 : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final RankRepository m29886a0() {
        return new RankRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final void m29888b0(final List<RankItem> list) {
        updateState(new Function1() { // from class: com.kubi.home.rank.impl.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankVM.m29889c0(list, (UIState) obj);
            }
        });
        if (((UIState) getState()).getData().isEmpty()) {
            m29922e0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final UIState m29889c0(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(list);
    }

    /* JADX INFO: renamed from: g0 */
    public static final UIState m29890g0(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: E */
    public final String m29904E(List<RankEntity> list) {
        return list == null ? "" : CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.kubi.home.rank.impl.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankVM.m29881F((RankEntity) obj);
            }
        }, 30, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m29905G(final RankEntity rankEntity, boolean z11, Continuation<? super RankItem> continuation) throws Throwable {
        RankVM$convertRankEntityToTradeItemBean$1 rankVM$convertRankEntityToTradeItemBean$1;
        if (continuation instanceof RankVM$convertRankEntityToTradeItemBean$1) {
            rankVM$convertRankEntityToTradeItemBean$1 = (RankVM$convertRankEntityToTradeItemBean$1) continuation;
            int i11 = rankVM$convertRankEntityToTradeItemBean$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rankVM$convertRankEntityToTradeItemBean$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rankVM$convertRankEntityToTradeItemBean$1 = new RankVM$convertRankEntityToTradeItemBean$1(this, continuation);
            }
        } else {
            rankVM$convertRankEntityToTradeItemBean$1 = new RankVM$convertRankEntityToTradeItemBean$1(this, continuation);
        }
        Object objM29918W = rankVM$convertRankEntityToTradeItemBean$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rankVM$convertRankEntityToTradeItemBean$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM29918W);
            int i13 = this.f26014X;
            RankTradeItem rankTradeItem = new RankTradeItem();
            rankTradeItem.setSymbol(rankEntity.getSymbol());
            String changeRate = rankEntity.getChangeRate();
            rankTradeItem.setChangeRate(changeRate != null ? Boxing.boxDouble(Double.parseDouble(changeRate)) : Boxing.boxDouble(0.0d));
            String price = rankEntity.getPrice();
            rankTradeItem.setLastDealPrice(price != null ? Double.parseDouble(price) : -1.0d);
            String value = rankEntity.getValue();
            rankTradeItem.setValue(value != null ? Double.parseDouble(value) : 0.0d);
            Unit unit = Unit.INSTANCE;
            RankItem rankItem = new RankItem(i13, rankTradeItem, rankEntity.getNewCurrencyListResponse(), m29913R());
            rankVM$convertRankEntityToTradeItemBean$1.L$0 = rankEntity;
            rankVM$convertRankEntityToTradeItemBean$1.Z$0 = z11;
            rankVM$convertRankEntityToTradeItemBean$1.label = 1;
            objM29918W = m29918W(rankItem, rankVM$convertRankEntityToTradeItemBean$1);
            if (objM29918W == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = rankVM$convertRankEntityToTradeItemBean$1.Z$0;
            rankEntity = (RankEntity) rankVM$convertRankEntityToTradeItemBean$1.L$0;
            ResultKt.throwOnFailure(objM29918W);
        }
        final RankItem rankItem2 = (RankItem) objM29918W;
        if (z11) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.home.rank.impl.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RankVM.m29882H(rankItem2, this, rankEntity);
                }
            });
            return objM29918W;
        }
        rankItem2.setCoinLabel(rankEntity.getCoinLabel());
        return objM29918W;
    }

    /* JADX INFO: renamed from: L */
    public final String m29907L(int i11) {
        switch (i11) {
            case 1:
                return "SEARCH_HOT";
            case 2:
                return "PRICE_CHANGE_24H_UP_RATE";
            case 3:
                return "PRICE_CHANGE_1WEEK_UP_RATE";
            case 4:
                return "VOLUME_CHANGE_24H_UP_RATE";
            case 5:
                return "VOLUME_CHANGE_1WEEK_UP_RATE";
            case 6:
                return "PRICE_CHANGE_24H_DOWN_RATE";
            case 7:
                return "PRICE_CHANGE_1WEEK_DOWN_RATE";
            case 8:
                return "NEW_CURRENCY";
            default:
                return "SEARCH_HOT";
        }
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }

    /* JADX INFO: renamed from: N */
    public final IRankApi m29909N() {
        Object value = this.f26015Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IRankApi) value;
    }

    /* JADX INFO: renamed from: O */
    public final RankRepository m29910O() {
        return (RankRepository) this.f26016Z.getValue();
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final int getF26014X() {
        return this.f26014X;
    }

    /* JADX INFO: renamed from: R */
    public final int m29913R() {
        return this.f26014X == 8 ? 2 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX INFO: renamed from: T */
    public final Object m29915T(List<RankEntity> list, Continuation<? super Unit> continuation) {
        RankVM$handleNewCoinRankList$1 rankVM$handleNewCoinRankList$1;
        if (continuation instanceof RankVM$handleNewCoinRankList$1) {
            rankVM$handleNewCoinRankList$1 = (RankVM$handleNewCoinRankList$1) continuation;
            int i11 = rankVM$handleNewCoinRankList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rankVM$handleNewCoinRankList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rankVM$handleNewCoinRankList$1 = new RankVM$handleNewCoinRankList$1(this, continuation);
            }
        } else {
            rankVM$handleNewCoinRankList$1 = new RankVM$handleNewCoinRankList$1(this, continuation);
        }
        Object objOnApiSuccess = rankVM$handleNewCoinRankList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rankVM$handleNewCoinRankList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objOnApiSuccess);
            if (list.isEmpty()) {
                m29888b0(CollectionsKt.emptyList());
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((RankEntity) obj).getSymbol(), obj);
            }
            objectRef.element = linkedHashMap;
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RankEntity) it.next()).getSymbol());
            }
            objectRef2.element = arrayList;
            final InterfaceC41634e<T> interfaceC41634eShowLoadingView = showLoadingView(m29909N().m29926a(m29904E(list), TtmlNode.COMBINE_ALL), ((UIState) getState()).getData().isEmpty());
            InterfaceC41634e<List<? extends RankItem>> interfaceC41634e = new InterfaceC41634e<List<? extends RankItem>>() { // from class: com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$$inlined$map$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n130#3:51\n131#3:55\n132#3:57\n134#3:59\n135#3:63\n136#3:65\n1563#4:52\n1634#4,2:53\n1636#4:56\n1056#4:58\n1563#4:60\n1634#4,2:61\n1636#4:64\n*S KotlinDebug\n*F\n+ 1 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n*L\n130#1:52\n130#1:53,2\n130#1:56\n132#1:58\n134#1:60\n134#1:61,2\n134#1:64\n*E\n"})
                public static final class C147662<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f26024b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ Ref.ObjectRef f26025c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ RankVM f26026d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ Ref.ObjectRef f26027e;

                    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$$inlined$map$1$2", m90122f = "RankVM.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C147662.this.emit(null, this);
                        }
                    }

                    public C147662(InterfaceC41635f interfaceC41635f, Ref.ObjectRef objectRef, RankVM rankVM, Ref.ObjectRef objectRef2) {
                        this.f26024b = interfaceC41635f;
                        this.f26025c = objectRef;
                        this.f26026d = rankVM;
                        this.f26027e = objectRef2;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = anonymousClass1.label;
                        if (i12 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC41635f interfaceC41635f = this.f26024b;
                            List<RankTradeItem> list = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            for (RankTradeItem rankTradeItem : list) {
                                arrayList.add(new Pair(Boxing.boxInt(((List) this.f26025c.element).indexOf(rankTradeItem.getSymbol())), rankTradeItem));
                            }
                            List listSortedWith = CollectionsKt.sortedWith(arrayList, new RankVM.C14764a());
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                            Iterator<T> it = listSortedWith.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(this.f26026d.m29906I((Pair) it.next(), (Map) this.f26027e.element));
                            }
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(arrayList2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41634e
                public Object collect(InterfaceC41635f<? super List<? extends RankItem>> interfaceC41635f, Continuation continuation2) {
                    Object objCollect = interfaceC41634eShowLoadingView.collect(new C147662(interfaceC41635f, objectRef2, this, objectRef), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            RankVM$handleNewCoinRankList$3 rankVM$handleNewCoinRankList$3 = new RankVM$handleNewCoinRankList$3(this, null);
            rankVM$handleNewCoinRankList$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
            rankVM$handleNewCoinRankList$1.L$1 = SpillingKt.nullOutSpilledVariable(objectRef);
            rankVM$handleNewCoinRankList$1.L$2 = SpillingKt.nullOutSpilledVariable(objectRef2);
            rankVM$handleNewCoinRankList$1.label = 1;
            objOnApiSuccess = onApiSuccess(interfaceC41634e, rankVM$handleNewCoinRankList$3, rankVM$handleNewCoinRankList$1);
            if (objOnApiSuccess == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOnApiSuccess);
        }
        Throwable throwable = ((C19334f) objOnApiSuccess).getThrowable();
        if (throwable != null) {
            m29923f0();
            C44128b.m97262f("rank", "listenRankData error type:" + this.f26014X, throwable);
            m29910O().m29870g(this.f26014X, "rank_exception", throwable.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c3 -> B:21:0x00cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: U */
    public final java.lang.Object m29916U(java.util.List<com.kubi.home.api.RankEntity> r18, boolean r19, p852kotlin.coroutines.Continuation<? super p852kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.home.rank.impl.RankVM.m29916U(java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final Object m29917V(int i11, Continuation<? super Unit> continuation) {
        RankVM$listenRankData$1 rankVM$listenRankData$1;
        if (continuation instanceof RankVM$listenRankData$1) {
            rankVM$listenRankData$1 = (RankVM$listenRankData$1) continuation;
            int i12 = rankVM$listenRankData$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                rankVM$listenRankData$1.label = i12 - Integer.MIN_VALUE;
            } else {
                rankVM$listenRankData$1 = new RankVM$listenRankData$1(this, continuation);
            }
        } else {
            rankVM$listenRankData$1 = new RankVM$listenRankData$1(this, continuation);
        }
        Object objOnApiSuccess = rankVM$listenRankData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = rankVM$listenRankData$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objOnApiSuccess);
            Object objShowLoadingView = showLoadingView(m29909N().m29927b(m29907L(i11)), ((UIState) getState()).getData().isEmpty());
            RankVM$listenRankData$2 rankVM$listenRankData$2 = new RankVM$listenRankData$2(this, i11, null);
            rankVM$listenRankData$1.I$0 = i11;
            rankVM$listenRankData$1.label = 1;
            objOnApiSuccess = onApiSuccess(objShowLoadingView, rankVM$listenRankData$2, rankVM$listenRankData$1);
            if (objOnApiSuccess == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = rankVM$listenRankData$1.I$0;
            ResultKt.throwOnFailure(objOnApiSuccess);
        }
        Throwable throwable = ((C19334f) objOnApiSuccess).getThrowable();
        if (throwable != null) {
            C44128b.m97262f("rank", "listenRankData error type:" + i11, throwable);
            m29923f0();
            m29910O().m29870g(i11, "rank_exception", throwable.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: W */
    public final Object m29918W(RankItem rankItem, Continuation<? super RankItem> continuation) throws Throwable {
        RankVM$loadIconUrl$1 rankVM$loadIconUrl$1;
        String baseCurrencyName;
        RankItem rankItem2;
        SymbolInfoEntity symbolInfoEntity;
        if (continuation instanceof RankVM$loadIconUrl$1) {
            rankVM$loadIconUrl$1 = (RankVM$loadIconUrl$1) continuation;
            int i11 = rankVM$loadIconUrl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rankVM$loadIconUrl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rankVM$loadIconUrl$1 = new RankVM$loadIconUrl$1(this, continuation);
            }
        } else {
            rankVM$loadIconUrl$1 = new RankVM$loadIconUrl$1(this, continuation);
        }
        Object objM29942f = rankVM$loadIconUrl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rankVM$loadIconUrl$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM29942f);
            if (rankItem.isNewCoin()) {
                return rankItem;
            }
            RankCoinHelper rankCoinHelper = RankCoinHelper.f26031a;
            TradeItemBean tradeItemBean = rankItem.getTradeItemBean();
            if (tradeItemBean == null || (symbolInfoEntity = tradeItemBean.getSymbolInfoEntity()) == null || (baseCurrencyName = symbolInfoEntity.getBaseCurrencyName()) == null) {
                baseCurrencyName = "";
            }
            rankVM$loadIconUrl$1.L$0 = rankItem;
            rankVM$loadIconUrl$1.L$1 = rankItem;
            rankVM$loadIconUrl$1.label = 1;
            objM29942f = rankCoinHelper.m29942f(baseCurrencyName, rankVM$loadIconUrl$1);
            if (objM29942f == coroutine_suspended) {
                return coroutine_suspended;
            }
            rankItem2 = rankItem;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rankItem = (RankItem) rankVM$loadIconUrl$1.L$1;
            rankItem2 = (RankItem) rankVM$loadIconUrl$1.L$0;
            ResultKt.throwOnFailure(objM29942f);
        }
        RankCoinEntity rankCoinEntity = (RankCoinEntity) objM29942f;
        rankItem.setIconUrl(rankCoinEntity != null ? rankCoinEntity.getIconUrl() : null);
        return rankItem2;
    }

    /* JADX INFO: renamed from: X */
    public final void m29919X(String str) {
        C4988a.m5286a(str, "rank");
    }

    /* JADX INFO: renamed from: Y */
    public final void m29920Y(List<RankItem> list) {
        m29919X("refreshData type:" + this.f26014X);
        if (list != null) {
            m29888b0(list);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m29922e0() {
        send(C14786k.f26059a);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m29923f0() {
        updateState(new Function1() { // from class: com.kubi.home.rank.impl.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankVM.m29890g0((UIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final Object m29924h0(int i11, Continuation<? super Unit> continuation) {
        int i12 = this.f26014X;
        if (i12 == i11) {
            return Unit.INSTANCE;
        }
        C37781l.f85093a.m85213c(m29911P(i12), this);
        this.f26014X = i11;
        Object objM29914S = m29914S(new RankStateContract$UiIntent.ListenRankData(i11), continuation);
        return objM29914S == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM29914S : Unit.INSTANCE;
    }

    public RankVM(int i11) {
        this.f26014X = i11;
        C4988a.m5286a("RankVM init type:" + this.f26014X, "rank");
        this.f26015Y = LazyKt.lazy(new Function0() { // from class: com.kubi.home.rank.impl.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankVM.m29885Z();
            }
        });
        this.f26016Z = LazyKt.lazy(new Function0() { // from class: com.kubi.home.rank.impl.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankVM.m29886a0();
            }
        });
        this.f26017a0 = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ Object m29884K(RankVM rankVM, InterfaceC19282d interfaceC19282d, Continuation<? super Unit> continuation) {
        Object objDispatchIntentOnIO = super.dispatchIntentOnIO(interfaceC19282d, continuation);
        if (objDispatchIntentOnIO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objDispatchIntentOnIO;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final IRankApi m29885Z() {
        return (IRankApi) C42597a.m93387c().create(IRankApi.class);
    }

    /* JADX INFO: renamed from: I */
    public final RankItem m29906I(Pair<Integer, ? extends TradeItemBean> pair, Map<String, RankEntity> map) {
        RankEntity rankEntity;
        TradeItemBean second = pair.getSecond();
        RankNewCoin newCurrencyListResponse = null;
        if (map != null) {
            rankEntity = map.get(pair.getSecond().getSymbol());
        } else {
            rankEntity = null;
        }
        int i11 = this.f26014X;
        if (rankEntity != null) {
            newCurrencyListResponse = rankEntity.getNewCurrencyListResponse();
        }
        return new RankItem(i11, second, newCurrencyListResponse, m29913R());
    }

    /* JADX INFO: renamed from: S */
    public final Object m29914S(RankStateContract$UiIntent.ListenRankData listenRankData, Continuation<? super Unit> continuation) {
        Object objM29917V = m29917V(listenRankData.getType(), continuation);
        if (objM29917V == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM29917V;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m29921d0(int i11) {
        String strM29911P = m29911P(i11);
        SocketTask.Companion.obtain$default(SocketTask.f48571i, strM29911P, this, null, 4, null).m58923y(null).m58911j(new C14765b(strM29911P, this));
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        return m29883J(this, interfaceC19282d, continuation);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntentOnIO(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        return m29884K(this, interfaceC19282d, continuation);
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m29919X("onCleared rank type:" + this.f26014X);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        if (this.f26014X == 8) {
            C12572a.m23695d("hide_new_coin_more", null, 0L, 6, null);
        }
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        if (this.f26014X == 8) {
            C12572a.m23695d("show_new_coin_more", null, 0L, 6, null);
        }
    }
}
