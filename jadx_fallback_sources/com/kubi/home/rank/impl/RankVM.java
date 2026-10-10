package com.kubi.home.rank.impl;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0016\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002J\u001c\u0010#\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0082@¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u001aH\u0002J\u0016\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0!H\u0002J\u0012\u0010*\u001a\u00020)*\u00020)H\u0082@¢\u0006\u0002\u0010+J6\u0010,\u001a\u00020)2\u0014\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020/0.2\u0016\u00100\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\"\u0018\u000101H\u0002J\b\u00102\u001a\u00020\u001aH\u0014J\b\u00103\u001a\u00020\u001aH\u0002J\u0010\u00104\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u00105\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u00108\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J$\u0010:\u001a\u00020\u001a2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010<\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010=J\u001e\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\"2\u0006\u0010<\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010@J\b\u0010A\u001a\u00020\u0004H\u0002J\u0018\u0010B\u001a\u00020\u001a2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010!H\u0002J\f\u0010D\u001a\u00020\u001a*\u00020\u001fH\u0002J\u0016\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0094@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020GH\u0094@¢\u0006\u0002\u0010HJ\u0016\u0010J\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020KH\u0082@¢\u0006\u0002\u0010LR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\"07X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010M\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/rank/impl/RankStateContract$UIState;", "type", "", "<init>", "(I)V", "getType", "()I", "setType", "needCatchException", "", "getNeedCatchException", "()Z", "rankApi", "Lcom/kubi/home/rank/impl/IRankApi;", "getRankApi", "()Lcom/kubi/home/rank/impl/IRankApi;", "rankApi$delegate", "Lkotlin/Lazy;", "rankRepository", "Lcom/kubi/home/rank/impl/RankRepository;", "getRankRepository", "()Lcom/kubi/home/rank/impl/RankRepository;", "rankRepository$delegate", "onShow", "", "onHide", "update", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildSymbols", "", "rank", "", "Lcom/kubi/home/api/RankEntity;", "handleNewCoinRankList", "rankEntityList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDataToEmpty", "refreshData", "rankList", "Lcom/kubi/home/rank/impl/cache/RankItem;", "loadIconUrl", "(Lcom/kubi/home/rank/impl/cache/RankItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToRankItem", "pair", "Lkotlin/Pair;", "Lcom/kubi/data/entity/TradeItemBean;", "rankEntityMap", "", "onCleared", "sendEmptyEvent", "getApiType", "getTopic", "apiOrgRankDataList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listenRankData", "registerSocket", "handleRankList", "list", "fromWs", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertRankEntityToTradeItemBean", "rankEntity", "(Lcom/kubi/home/api/RankEntity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getViewType", "performRefreshFragment", "tradeItemBeans", "log", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchIntentOnIO", "handleListenRankData", "Lcom/kubi/home/rank/impl/RankStateContract$UiIntent$ListenRankData;", "(Lcom/kubi/home/rank/impl/RankStateContract$UiIntent$ListenRankData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/home/rank/impl/RankStateContract$UIState;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n+ 2 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,380:1\n220#2,2:381\n31#2,11:404\n54#2:415\n1208#3,2:383\n1236#3,4:385\n1563#3:389\n1634#3,3:390\n1563#3:416\n1634#3,3:417\n295#3,2:420\n49#4:393\n51#4:397\n46#5:394\n51#5:396\n105#6:395\n25#7:398\n26#7:400\n25#7:401\n26#7:403\n1#8:399\n1#8:402\n*S KotlinDebug\n*F\n+ 1 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n*L\n96#1:381,2\n280#1:404,11\n280#1:415\n123#1:383,2\n123#1:385,4\n124#1:389\n124#1:390,3\n289#1:416\n289#1:417,3\n324#1:420,2\n129#1:393\n129#1:397\n129#1:394\n129#1:396\n129#1:395\n141#1:398\n141#1:400\n272#1:401\n272#1:403\n141#1:399\n272#1:402\n*E\n"})
public class RankVM extends com.kubi.mvi.state.AbstractC19291m<com.kubi.home.rank.impl.RankStateContract$UIState> {

    /* JADX INFO: renamed from: b0 */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.home.rank.impl.RankVM.Companion f26013b0 = null;

    /* JADX INFO: renamed from: X */
    public int f26014X;

    /* JADX INFO: renamed from: Y */
    @org.jetbrains.annotations.NotNull
    public final kotlin.Lazy f26015Y;

    /* JADX INFO: renamed from: Z */
    @org.jetbrains.annotations.NotNull
    public final kotlin.Lazy f26016Z;

    /* JADX INFO: renamed from: a0 */
    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.CopyOnWriteArrayList<com.kubi.home.api.RankEntity> f26017a0;

    /* JADX INFO: compiled from: RankVM.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankVM$Companion;", "", "<init>", "()V", "LOG_TAG", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankVM$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n*L\n1#1,328:1\n133#2:329\n*E\n"})
    public static final class C14764a<T> implements java.util.Comparator {
        public C14764a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r1 = r1.getFirst()
                java.lang.Integer r1 = (java.lang.Integer) r1
                kotlin.Pair r2 = (kotlin.Pair) r2
                java.lang.Object r2 = r2.getFirst()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r1 = kotlin.comparisons.ComparisonsKt.compareValues(r1, r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankVM$b */
    /* JADX INFO: compiled from: SocketEx.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSocketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 RankVM.kt\ncom/kubi/home/rank/impl/RankVM\n+ 6 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,223:1\n50#2,7:224\n57#2,10:241\n36#3:231\n137#4,5:232\n281#5,4:237\n46#6,2:251\n*S KotlinDebug\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n*L\n42#1:224,7\n42#1:241,10\n43#1:231\n43#1:232,5\n50#1:251,2\n*E\n"})
    public static final class C14765b implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ java.lang.String f26018b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ com.kubi.home.rank.impl.RankVM f26019c;

        /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankVM$b$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @kotlin.Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocket$1$invoke$lambda$2$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class a extends com.google.gson.reflect.TypeToken<java.util.List<? extends com.kubi.home.api.RankEntity>> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public C14765b(java.lang.String r1, com.kubi.home.rank.impl.RankVM r2) {
                r0 = this;
                r0.f26018b = r1
                r0.f26019c = r2
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: a */
        public final void m29925a(java.lang.String r14) {
                r13 = this;
                java.lang.String r1 = "socket"
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.lang.String r2 = r13.f26018b
                com.kubi.mvi.common.c r0 = com.kubi.mvi.common.C19241c.f35620a
                boolean r3 = r0.m42528a()
                r4 = r3 ^ 1
                r5 = 0
                kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L56
                com.kubi.utils.x r0 = com.kubi.utils.C27099x.f54458a     // Catch: java.lang.Throwable -> L24
                com.kubi.home.rank.impl.RankVM$b$a r0 = new com.kubi.home.rank.impl.RankVM$b$a     // Catch: java.lang.Throwable -> L24
                r0.<init>()     // Catch: java.lang.Throwable -> L24
                java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Throwable -> L24
                java.lang.Object r14 = com.kubi.utils.C27099x.m66914d(r14, r0)     // Catch: java.lang.Throwable -> L24
                goto L2d
            L24:
                r0 = move-exception
                r14 = r0
                java.lang.String r0 = "GsonUtils"
                r6 = 4
                p569qq.C43846g.m96569d(r14, r0, r5, r6, r5)     // Catch: java.lang.Throwable -> L56
                r14 = r5
            L2d:
                java.lang.String r0 = "Topic->"
                if (r14 == 0) goto L59
                r6 = r14
                java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L56
                com.kubi.home.rank.impl.RankVM r7 = r13.f26019c     // Catch: java.lang.Throwable -> L56
                com.kubi.home.rank.impl.RankVM$registerSocket$1$1 r8 = new com.kubi.home.rank.impl.RankVM$registerSocket$1$1     // Catch: java.lang.Throwable -> L56
                r8.<init>(r7, r6, r5)     // Catch: java.lang.Throwable -> L56
                com.kubi.home.rank.impl.RankVM.m29902y(r7, r8)     // Catch: java.lang.Throwable -> L56
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
                r6.<init>()     // Catch: java.lang.Throwable -> L56
                r6.append(r0)     // Catch: java.lang.Throwable -> L56
                r6.append(r2)     // Catch: java.lang.Throwable -> L56
                java.lang.String r0 = " 数据解析成功！"
                r6.append(r0)     // Catch: java.lang.Throwable -> L56
                java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L56
                ro.C44128b.m97259c(r1, r0)     // Catch: java.lang.Throwable -> L56
                goto L72
            L56:
                r0 = move-exception
                r14 = r0
                goto L77
            L59:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
                r14.<init>()     // Catch: java.lang.Throwable -> L56
                r14.append(r0)     // Catch: java.lang.Throwable -> L56
                r14.append(r2)     // Catch: java.lang.Throwable -> L56
                java.lang.String r0 = " 数据解析失败！"
                r14.append(r0)     // Catch: java.lang.Throwable -> L56
                java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L56
                ro.C44128b.m97259c(r1, r14)     // Catch: java.lang.Throwable -> L56
                kotlin.Unit r14 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L56
            L72:
                java.lang.Object r14 = kotlin.Result.m103844constructorimpl(r14)     // Catch: java.lang.Throwable -> L56
                goto L81
            L77:
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Object r14 = kotlin.ResultKt.createFailure(r14)
                java.lang.Object r14 = kotlin.Result.m103844constructorimpl(r14)
            L81:
                java.lang.Throwable r0 = kotlin.Result.m103847exceptionOrNullimpl(r14)
                if (r0 == 0) goto Lb8
                if (r3 != 0) goto Lb7
                boolean r2 = r0 instanceof java.util.concurrent.CancellationException
                if (r2 != 0) goto Lb6
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "crash_issue"
                r2.append(r3)
                java.lang.String r6 = "->【"
                r2.append(r6)
                java.lang.String r6 = "Socket"
                r2.append(r6)
                java.lang.String r6 = " 发生错误:needCatch->"
                r2.append(r6)
                r2.append(r4)
                r4 = 12305(0x3011, float:1.7243E-41)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                ro.C44128b.m97262f(r3, r2, r0)
                goto Lb8
            Lb6:
                throw r0
            Lb7:
                throw r0
            Lb8:
                java.lang.Throwable r7 = kotlin.Result.m103847exceptionOrNullimpl(r14)
                if (r7 == 0) goto Le7
                com.kubi.sdk.websocket.WebSocketException r6 = new com.kubi.sdk.websocket.WebSocketException
                r11 = 8
                r12 = 0
                java.lang.String r8 = "SocketEx"
                r9 = 0
                r10 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r14 = 2
                p569qq.C43846g.m96568c(r6, r5, r14, r5)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r0 = "topic->"
                r14.append(r0)
                r14.append(r7)
                java.lang.String r0 = "->【MVI bindSocket发生错误】"
                r14.append(r0)
                java.lang.String r14 = r14.toString()
                ro.C44128b.m97262f(r1, r14, r7)
            Le7:
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.m29925a(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    static {
            com.kubi.home.rank.impl.RankVM$Companion r0 = new com.kubi.home.rank.impl.RankVM$Companion
            r1 = 0
            r0.<init>(r1)
            com.kubi.home.rank.impl.RankVM.f26013b0 = r0
            return
    }

    public RankVM(int r2) {
            r1 = this;
            r1.<init>()
            r1.f26014X = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "RankVM init type:"
            r2.append(r0)
            int r0 = r1.f26014X
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "rank"
            p058cj.C4988a.m5286a(r2, r0)
            com.kubi.home.rank.impl.m r2 = new com.kubi.home.rank.impl.m
            r2.<init>()
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            r1.f26015Y = r2
            com.kubi.home.rank.impl.n r2 = new com.kubi.home.rank.impl.n
            r2.<init>()
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            r1.f26016Z = r2
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            r1.f26017a0 = r2
            return
    }

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ java.lang.Object m29877A(com.kubi.home.rank.impl.RankVM r0, com.kubi.home.rank.impl.cache.RankItem r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m29918W(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ void m29878B(com.kubi.home.rank.impl.RankVM r0, java.lang.String r1) {
            r0.m29919X(r1)
            return
    }

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ void m29879C(com.kubi.home.rank.impl.RankVM r0, java.util.List r1) {
            r0.m29888b0(r1)
            return
    }

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ void m29880D(com.kubi.home.rank.impl.RankVM r0, int r1) {
            r0.m29921d0(r1)
            return
    }

    /* JADX INFO: renamed from: F */
    public static final java.lang.CharSequence m29881F(com.kubi.home.api.RankEntity r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = r1.getSymbol()
            if (r1 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r1 = ""
            return r1
    }

    /* JADX INFO: renamed from: H */
    public static final kotlin.Unit m29882H(com.kubi.home.rank.impl.cache.RankItem r4, com.kubi.home.rank.impl.RankVM r5, com.kubi.home.api.RankEntity r6) {
            java.util.concurrent.CopyOnWriteArrayList<com.kubi.home.api.RankEntity> r5 = r5.f26017a0
            java.util.Iterator r5 = r5.iterator()
        L6:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.kubi.home.api.RankEntity r2 = (com.kubi.home.api.RankEntity) r2
            java.lang.String r2 = r2.getSymbol()
            java.lang.String r3 = r6.getSymbol()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L6
            goto L24
        L23:
            r0 = r1
        L24:
            com.kubi.home.api.RankEntity r0 = (com.kubi.home.api.RankEntity) r0
            if (r0 == 0) goto L2c
            java.lang.String r1 = r0.getCoinLabel()
        L2c:
            r4.setCoinLabel(r1)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ java.lang.Object m29883J(com.kubi.home.rank.impl.RankVM r1, com.kubi.mvi.state.InterfaceC19282d r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            boolean r0 = r2 instanceof com.kubi.home.rank.impl.RankStateContract$UiIntent.ListenRankData
            if (r0 == 0) goto L14
            com.kubi.home.rank.impl.RankStateContract$UiIntent$ListenRankData r2 = (com.kubi.home.rank.impl.RankStateContract$UiIntent.ListenRankData) r2
            java.lang.Object r1 = r1.m29914S(r2, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L11
            return r1
        L11:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L14:
            boolean r0 = r2 instanceof com.kubi.home.rank.impl.RankStateContract$UiIntent.UpdateListenRankData
            if (r0 == 0) goto L2c
            com.kubi.home.rank.impl.RankStateContract$UiIntent$UpdateListenRankData r2 = (com.kubi.home.rank.impl.RankStateContract$UiIntent.UpdateListenRankData) r2
            int r2 = r2.getType()
            java.lang.Object r1 = r1.m29924h0(r2, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L29
            return r1
        L29:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L2c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ java.lang.Object m29884K(com.kubi.home.rank.impl.RankVM r0, com.kubi.mvi.state.InterfaceC19282d r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = super.dispatchIntentOnIO(r1, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lb
            return r0
        Lb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: Z */
    public static final com.kubi.home.rank.impl.InterfaceC14767a m29885Z() {
            retrofit2.Retrofit r0 = mr.C42597a.m93387c()
            java.lang.Class<com.kubi.home.rank.impl.a> r1 = com.kubi.home.rank.impl.InterfaceC14767a.class
            java.lang.Object r0 = r0.create(r1)
            com.kubi.home.rank.impl.a r0 = (com.kubi.home.rank.impl.InterfaceC14767a) r0
            return r0
    }

    /* JADX INFO: renamed from: a0 */
    public static final com.kubi.home.rank.impl.RankRepository m29886a0() {
            com.kubi.home.rank.impl.RankRepository r0 = new com.kubi.home.rank.impl.RankRepository
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ com.kubi.home.rank.impl.RankStateContract$UIState m29887b(com.kubi.home.rank.impl.RankStateContract$UIState r0) {
            com.kubi.home.rank.impl.RankStateContract$UIState r0 = m29890g0(r0)
            return r0
    }

    /* JADX INFO: renamed from: b0 */
    private final void m29888b0(java.util.List<com.kubi.home.rank.impl.cache.RankItem> r2) {
            r1 = this;
            com.kubi.home.rank.impl.p r0 = new com.kubi.home.rank.impl.p
            r0.<init>(r2)
            r1.updateState(r0)
            com.kubi.mvi.state.f r2 = r1.getState()
            com.kubi.home.rank.impl.RankStateContract$UIState r2 = (com.kubi.home.rank.impl.RankStateContract$UIState) r2
            java.util.List r2 = r2.getData()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1b
            r1.m29922e0()
        L1b:
            return
    }

    /* JADX INFO: renamed from: c0 */
    public static final com.kubi.home.rank.impl.RankStateContract$UIState m29889c0(java.util.List r1, com.kubi.home.rank.impl.RankStateContract$UIState r2) {
            java.lang.String r0 = "$this$updateState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.kubi.home.rank.impl.RankStateContract$UIState r1 = r2.copy(r1)
            return r1
    }

    /* JADX INFO: renamed from: g0 */
    public static final com.kubi.home.rank.impl.RankStateContract$UIState m29890g0(com.kubi.home.rank.impl.RankStateContract$UIState r1) {
            java.lang.String r0 = "$this$updateState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            com.kubi.home.rank.impl.RankStateContract$UIState r1 = r1.copy(r0)
            return r1
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ com.kubi.home.rank.impl.RankRepository m29891n() {
            com.kubi.home.rank.impl.RankRepository r0 = m29886a0()
            return r0
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ kotlin.Unit m29892o(com.kubi.home.rank.impl.cache.RankItem r0, com.kubi.home.rank.impl.RankVM r1, com.kubi.home.api.RankEntity r2) {
            kotlin.Unit r0 = m29882H(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ com.kubi.home.rank.impl.RankStateContract$UIState m29893p(java.util.List r0, com.kubi.home.rank.impl.RankStateContract$UIState r1) {
            com.kubi.home.rank.impl.RankStateContract$UIState r0 = m29889c0(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ java.lang.CharSequence m29894q(com.kubi.home.api.RankEntity r0) {
            java.lang.CharSequence r0 = m29881F(r0)
            return r0
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ com.kubi.home.rank.impl.InterfaceC14767a m29895r() {
            com.kubi.home.rank.impl.a r0 = m29885Z()
            return r0
    }

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ java.lang.Object m29896s(com.kubi.home.rank.impl.RankVM r0, com.kubi.home.api.RankEntity r1, boolean r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.m29905G(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ com.kubi.home.rank.impl.cache.RankItem m29897t(com.kubi.home.rank.impl.RankVM r0, kotlin.Pair r1, java.util.Map r2) {
            com.kubi.home.rank.impl.cache.RankItem r0 = r0.m29906I(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList m29898u(com.kubi.home.rank.impl.RankVM r0) {
            java.util.concurrent.CopyOnWriteArrayList<com.kubi.home.api.RankEntity> r0 = r0.f26017a0
            return r0
    }

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ int m29899v(com.kubi.home.rank.impl.RankVM r0) {
            int r0 = r0.m29913R()
            return r0
    }

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ java.lang.Object m29900w(com.kubi.home.rank.impl.RankVM r0, java.util.List r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m29915T(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ java.lang.Object m29901x(com.kubi.home.rank.impl.RankVM r0, java.util.List r1, boolean r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.m29916U(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ kotlinx.coroutines.InterfaceC41775x1 m29902y(com.kubi.home.rank.impl.RankVM r0, kotlin.jvm.functions.Function2 r1) {
            kotlinx.coroutines.x1 r0 = r0.launchOnIO(r1)
            return r0
    }

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ java.lang.Object m29903z(com.kubi.home.rank.impl.RankVM r0, int r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m29917V(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: E */
    public final java.lang.String m29904E(java.util.List<com.kubi.home.api.RankEntity> r10) {
            r9 = this;
            if (r10 != 0) goto L5
            java.lang.String r10 = ""
            return r10
        L5:
            com.kubi.home.rank.impl.q r6 = new com.kubi.home.rank.impl.q
            r6.<init>()
            r7 = 30
            r8 = 0
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r10
            java.lang.String r10 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    /* JADX INFO: renamed from: G */
    public final java.lang.Object m29905G(com.kubi.home.api.RankEntity r10, boolean r11, kotlin.coroutines.Continuation<? super com.kubi.home.rank.impl.cache.RankItem> r12) {
            r9 = this;
            boolean r0 = r12 instanceof com.kubi.home.rank.impl.RankVM$convertRankEntityToTradeItemBean$1
            if (r0 == 0) goto L13
            r0 = r12
            com.kubi.home.rank.impl.RankVM$convertRankEntityToTradeItemBean$1 r0 = (com.kubi.home.rank.impl.RankVM$convertRankEntityToTradeItemBean$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.home.rank.impl.RankVM$convertRankEntityToTradeItemBean$1 r0 = new com.kubi.home.rank.impl.RankVM$convertRankEntityToTradeItemBean$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r11 = r0.Z$0
            java.lang.Object r10 = r0.L$0
            com.kubi.home.api.RankEntity r10 = (com.kubi.home.api.RankEntity) r10
            kotlin.ResultKt.throwOnFailure(r12)
            goto L99
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.ResultKt.throwOnFailure(r12)
            int r12 = r9.f26014X
            com.kubi.home.rank.RankTradeItem r2 = new com.kubi.home.rank.RankTradeItem
            r2.<init>()
            java.lang.String r4 = r10.getSymbol()
            r2.setSymbol(r4)
            java.lang.String r4 = r10.getChangeRate()
            r5 = 0
            if (r4 == 0) goto L59
            double r7 = java.lang.Double.parseDouble(r4)
            java.lang.Double r4 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r7)
            goto L5d
        L59:
            java.lang.Double r4 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r5)
        L5d:
            r2.setChangeRate(r4)
            java.lang.String r4 = r10.getPrice()
            if (r4 == 0) goto L6b
            double r7 = java.lang.Double.parseDouble(r4)
            goto L6d
        L6b:
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L6d:
            r2.setLastDealPrice(r7)
            java.lang.String r4 = r10.getValue()
            if (r4 == 0) goto L7a
            double r5 = java.lang.Double.parseDouble(r4)
        L7a:
            r2.setValue(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            com.kubi.home.api.RankNewCoin r4 = r10.getNewCurrencyListResponse()
            int r5 = r9.m29913R()
            com.kubi.home.rank.impl.cache.RankItem r6 = new com.kubi.home.rank.impl.cache.RankItem
            r6.<init>(r12, r2, r4, r5)
            r0.L$0 = r10
            r0.Z$0 = r11
            r0.label = r3
            java.lang.Object r12 = r9.m29918W(r6, r0)
            if (r12 != r1) goto L99
            return r1
        L99:
            r0 = r12
            com.kubi.home.rank.impl.cache.RankItem r0 = (com.kubi.home.rank.impl.cache.RankItem) r0
            if (r11 == 0) goto La7
            com.kubi.home.rank.impl.o r11 = new com.kubi.home.rank.impl.o
            r11.<init>(r0, r9, r10)
            com.kubi.utils.C27100x0.m66924e(r11)
            return r12
        La7:
            java.lang.String r10 = r10.getCoinLabel()
            r0.setCoinLabel(r10)
            return r12
    }

    /* JADX INFO: renamed from: I */
    public final com.kubi.home.rank.impl.cache.RankItem m29906I(kotlin.Pair<java.lang.Integer, ? extends com.kubi.data.entity.TradeItemBean> r4, java.util.Map<java.lang.String, com.kubi.home.api.RankEntity> r5) {
            r3 = this;
            java.lang.Object r0 = r4.getSecond()
            com.kubi.data.entity.TradeItemBean r0 = (com.kubi.data.entity.TradeItemBean) r0
            r1 = 0
            if (r5 == 0) goto L1a
            java.lang.Object r4 = r4.getSecond()
            com.kubi.data.entity.TradeItemBean r4 = (com.kubi.data.entity.TradeItemBean) r4
            java.lang.String r4 = r4.getSymbol()
            java.lang.Object r4 = r5.get(r4)
            com.kubi.home.api.RankEntity r4 = (com.kubi.home.api.RankEntity) r4
            goto L1b
        L1a:
            r4 = r1
        L1b:
            com.kubi.home.rank.impl.cache.RankItem r5 = new com.kubi.home.rank.impl.cache.RankItem
            int r2 = r3.f26014X
            if (r4 == 0) goto L25
            com.kubi.home.api.RankNewCoin r1 = r4.getNewCurrencyListResponse()
        L25:
            int r4 = r3.m29913R()
            r5.<init>(r2, r0, r1, r4)
            return r5
    }

    /* JADX INFO: renamed from: L */
    public final java.lang.String m29907L(int r2) {
            r1 = this;
            java.lang.String r0 = "SEARCH_HOT"
            switch(r2) {
                case 1: goto L1b;
                case 2: goto L18;
                case 3: goto L15;
                case 4: goto L12;
                case 5: goto Lf;
                case 6: goto Lc;
                case 7: goto L9;
                case 8: goto L6;
                default: goto L5;
            }
        L5:
            return r0
        L6:
            java.lang.String r2 = "NEW_CURRENCY"
            return r2
        L9:
            java.lang.String r2 = "PRICE_CHANGE_1WEEK_DOWN_RATE"
            return r2
        Lc:
            java.lang.String r2 = "PRICE_CHANGE_24H_DOWN_RATE"
            return r2
        Lf:
            java.lang.String r2 = "VOLUME_CHANGE_1WEEK_UP_RATE"
            return r2
        L12:
            java.lang.String r2 = "VOLUME_CHANGE_24H_UP_RATE"
            return r2
        L15:
            java.lang.String r2 = "PRICE_CHANGE_1WEEK_UP_RATE"
            return r2
        L18:
            java.lang.String r2 = "PRICE_CHANGE_24H_UP_RATE"
            return r2
        L1b:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: M */
    public com.kubi.home.rank.impl.RankStateContract$UIState m29908M() {
            r3 = this;
            com.kubi.home.rank.impl.RankStateContract$UIState r0 = new com.kubi.home.rank.impl.RankStateContract$UIState
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: N */
    public final com.kubi.home.rank.impl.InterfaceC14767a m29909N() {
            r2 = this;
            kotlin.Lazy r0 = r2.f26015Y
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "getValue(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.kubi.home.rank.impl.a r0 = (com.kubi.home.rank.impl.InterfaceC14767a) r0
            return r0
    }

    /* JADX INFO: renamed from: O */
    public final com.kubi.home.rank.impl.RankRepository m29910O() {
            r1 = this;
            kotlin.Lazy r0 = r1.f26016Z
            java.lang.Object r0 = r0.getValue()
            com.kubi.home.rank.impl.RankRepository r0 = (com.kubi.home.rank.impl.RankRepository) r0
            return r0
    }

    /* JADX INFO: renamed from: P */
    public final java.lang.String m29911P(int r4) {
            r3 = this;
            r0 = 2
            java.lang.String r1 = "/app-home/home-list:%s"
            r2 = 0
            switch(r4) {
                case 1: goto L3f;
                case 2: goto L34;
                case 3: goto L31;
                case 4: goto L26;
                case 5: goto L23;
                case 6: goto L18;
                case 7: goto L15;
                case 8: goto La;
                default: goto L7;
            }
        L7:
            java.lang.String r4 = ""
            return r4
        La:
            java.lang.String r4 = "new_currency"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = com.kubi.utils.extensions.DowngradeExKt.m66551u(r1, r4, r2, r0, r2)
            return r4
        L15:
            java.lang.String r4 = "/reaper/rank:price_change_rate_1week_down"
            return r4
        L18:
            java.lang.String r4 = "price_change_rate_24h_down"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = com.kubi.utils.extensions.DowngradeExKt.m66551u(r1, r4, r2, r0, r2)
            return r4
        L23:
            java.lang.String r4 = "/reaper/rank:volume_change_rate_1week_up"
            return r4
        L26:
            java.lang.String r4 = "volume_change_rate_24h_up"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = com.kubi.utils.extensions.DowngradeExKt.m66551u(r1, r4, r2, r0, r2)
            return r4
        L31:
            java.lang.String r4 = "/reaper/rank:price_change_rate_1week_up"
            return r4
        L34:
            java.lang.String r4 = "price_change_rate_24h_up"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = com.kubi.utils.extensions.DowngradeExKt.m66551u(r1, r4, r2, r0, r2)
            return r4
        L3f:
            java.lang.String r4 = "search_hot"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = com.kubi.utils.extensions.DowngradeExKt.m66551u(r1, r4, r2, r0, r2)
            return r4
    }

    /* JADX INFO: renamed from: Q */
    public final int m29912Q() {
            r1 = this;
            int r0 = r1.f26014X
            return r0
    }

    /* JADX INFO: renamed from: R */
    public final int m29913R() {
            r2 = this;
            int r0 = r2.f26014X
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 2
            return r0
        L8:
            r0 = 3
            return r0
    }

    /* JADX INFO: renamed from: S */
    public final java.lang.Object m29914S(com.kubi.home.rank.impl.RankStateContract$UiIntent.ListenRankData r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            int r1 = r1.getType()
            java.lang.Object r1 = r0.m29917V(r1, r2)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto Lf
            return r1
        Lf:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    /* JADX INFO: renamed from: T */
    public final java.lang.Object m29915T(java.util.List<com.kubi.home.api.RankEntity> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r8 = this;
            boolean r0 = r10 instanceof com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$1
            if (r0 == 0) goto L13
            r0 = r10
            com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$1 r0 = (com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$1 r0 = new com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r9 = r0.L$0
            java.util.List r9 = (java.util.List) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lf1
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L4e
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
            r8.m29888b0(r10)
        L4e:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r2 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r2)
            int r4 = kotlin.collections.MapsKt.mapCapacity(r4)
            r5 = 16
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r4)
            java.util.Iterator r4 = r9.iterator()
        L6c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L81
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.kubi.home.api.RankEntity r7 = (com.kubi.home.api.RankEntity) r7
            java.lang.String r7 = r7.getSymbol()
            r5.put(r7, r6)
            goto L6c
        L81:
            r10.element = r5
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r2)
            r5.<init>(r2)
            java.util.Iterator r2 = r9.iterator()
        L95:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto La9
            java.lang.Object r6 = r2.next()
            com.kubi.home.api.RankEntity r6 = (com.kubi.home.api.RankEntity) r6
            java.lang.String r6 = r6.getSymbol()
            r5.add(r6)
            goto L95
        La9:
            r4.element = r5
            com.kubi.home.rank.impl.a r2 = r8.m29909N()
            java.lang.String r5 = r8.m29904E(r9)
            java.lang.String r6 = "all"
            kotlinx.coroutines.flow.e r2 = r2.m29926a(r5, r6)
            com.kubi.mvi.state.f r5 = r8.getState()
            com.kubi.home.rank.impl.RankStateContract$UIState r5 = (com.kubi.home.rank.impl.RankStateContract$UIState) r5
            java.util.List r5 = r5.getData()
            boolean r5 = r5.isEmpty()
            kotlinx.coroutines.flow.e r2 = r8.showLoadingView(r2, r5)
            com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$$inlined$map$1 r5 = new com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$$inlined$map$1
            r5.<init>(r2, r4, r8, r10)
            com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$3 r2 = new com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$3
            r6 = 0
            r2.<init>(r8, r6)
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.L$0 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r0.L$1 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r10 = r8.onApiSuccess(r5, r2, r0)
            if (r10 != r1) goto Lf1
            return r1
        Lf1:
            com.kubi.network.retrofit.utils.f r10 = (com.kubi.network.retrofit.utils.C19334f) r10
            java.lang.Throwable r9 = r10.m42847b()
            if (r9 == 0) goto L123
            r8.m29923f0()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "listenRankData error type:"
            r10.append(r0)
            int r0 = r8.f26014X
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "rank"
            ro.C44128b.m97262f(r0, r10, r9)
            com.kubi.home.rank.impl.RankRepository r10 = r8.m29910O()
            int r0 = r8.f26014X
            java.lang.String r1 = "rank_exception"
            java.lang.String r9 = r9.getMessage()
            r10.m29870g(r0, r1, r9)
        L123:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }

    /* JADX INFO: renamed from: U */
    public final java.lang.Object m29916U(java.util.List<com.kubi.home.api.RankEntity> r18, boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof com.kubi.home.rank.impl.RankVM$handleRankList$1
            if (r2 == 0) goto L17
            r2 = r1
            com.kubi.home.rank.impl.RankVM$handleRankList$1 r2 = (com.kubi.home.rank.impl.RankVM$handleRankList$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.kubi.home.rank.impl.RankVM$handleRankList$1 r2 = new com.kubi.home.rank.impl.RankVM$handleRankList$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L64
            if (r4 != r6) goto L5c
            int r4 = r2.I$1
            int r7 = r2.I$0
            boolean r8 = r2.Z$0
            java.lang.Object r9 = r2.L$7
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r10 = r2.L$6
            com.kubi.home.api.RankEntity r10 = (com.kubi.home.api.RankEntity) r10
            java.lang.Object r10 = r2.L$4
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r2.L$3
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r2.L$2
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r2.L$1
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r2.L$0
            java.util.List r14 = (java.util.List) r14
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = r8
            r8 = r2
            r2 = r12
            r12 = r11
            r11 = r7
            r7 = r14
            r14 = r10
            r10 = r4
            r4 = r16
            goto Lcb
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L64:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            r7 = r18
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r4)
            r1.<init>(r4)
            java.util.Iterator r4 = r7.iterator()
            r11 = r1
            r8 = r2
            r12 = r4
            r9 = r5
            r10 = r9
            r1 = r7
            r2 = r1
            r4 = r19
        L81:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Ld6
            java.lang.Object r13 = r12.next()
            r14 = r13
            com.kubi.home.api.RankEntity r14 = (com.kubi.home.api.RankEntity) r14
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r8.L$0 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r8.L$1 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r8.L$2 = r15
            r8.L$3 = r11
            r8.L$4 = r12
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$5 = r13
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$6 = r13
            r8.L$7 = r11
            r8.Z$0 = r4
            r8.I$0 = r10
            r8.I$1 = r9
            r8.I$2 = r5
            r8.label = r6
            java.lang.Object r13 = r0.m29905G(r14, r4, r8)
            if (r13 != r3) goto Lc3
            return r3
        Lc3:
            r14 = r13
            r13 = r1
            r1 = r14
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r12
        Lcb:
            com.kubi.home.rank.impl.cache.RankItem r1 = (com.kubi.home.rank.impl.cache.RankItem) r1
            r9.add(r1)
            r9 = r10
            r10 = r11
            r11 = r12
            r1 = r13
            r12 = r14
            goto L81
        Ld6:
            java.util.List r11 = (java.util.List) r11
            if (r4 != 0) goto Lf1
            int r1 = r0.f26014X
            if (r1 != r6) goto Lf1
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto Le8
            r0.m29922e0()
            goto Lf4
        Le8:
            com.kubi.home.rank.impl.j r1 = new com.kubi.home.rank.impl.j
            r1.<init>(r11)
            r0.send(r1)
            goto Lf4
        Lf1:
            r0.m29920Y(r11)
        Lf4:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    /* JADX INFO: renamed from: V */
    public final java.lang.Object m29917V(int r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r5 = this;
            boolean r0 = r7 instanceof com.kubi.home.rank.impl.RankVM$listenRankData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.kubi.home.rank.impl.RankVM$listenRankData$1 r0 = (com.kubi.home.rank.impl.RankVM$listenRankData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.home.rank.impl.RankVM$listenRankData$1 r0 = new com.kubi.home.rank.impl.RankVM$listenRankData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r6 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L65
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            com.kubi.home.rank.impl.a r7 = r5.m29909N()
            java.lang.String r2 = r5.m29907L(r6)
            kotlinx.coroutines.flow.e r7 = r7.m29927b(r2)
            com.kubi.mvi.state.f r2 = r5.getState()
            com.kubi.home.rank.impl.RankStateContract$UIState r2 = (com.kubi.home.rank.impl.RankStateContract$UIState) r2
            java.util.List r2 = r2.getData()
            boolean r2 = r2.isEmpty()
            kotlinx.coroutines.flow.e r7 = r5.showLoadingView(r7, r2)
            com.kubi.home.rank.impl.RankVM$listenRankData$2 r2 = new com.kubi.home.rank.impl.RankVM$listenRankData$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.onApiSuccess(r7, r2, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            com.kubi.network.retrofit.utils.f r7 = (com.kubi.network.retrofit.utils.C19334f) r7
            java.lang.Throwable r7 = r7.m42847b()
            if (r7 == 0) goto L93
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "listenRankData error type:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "rank"
            ro.C44128b.m97262f(r1, r0, r7)
            r5.m29923f0()
            com.kubi.home.rank.impl.RankRepository r0 = r5.m29910O()
            java.lang.String r1 = "rank_exception"
            java.lang.String r7 = r7.getMessage()
            r0.m29870g(r6, r1, r7)
        L93:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    /* JADX INFO: renamed from: W */
    public final java.lang.Object m29918W(com.kubi.home.rank.impl.cache.RankItem r5, kotlin.coroutines.Continuation<? super com.kubi.home.rank.impl.cache.RankItem> r6) {
            r4 = this;
            boolean r0 = r6 instanceof com.kubi.home.rank.impl.RankVM$loadIconUrl$1
            if (r0 == 0) goto L13
            r0 = r6
            com.kubi.home.rank.impl.RankVM$loadIconUrl$1 r0 = (com.kubi.home.rank.impl.RankVM$loadIconUrl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.home.rank.impl.RankVM$loadIconUrl$1 r0 = new com.kubi.home.rank.impl.RankVM$loadIconUrl$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            com.kubi.home.rank.impl.cache.RankItem r5 = (com.kubi.home.rank.impl.cache.RankItem) r5
            java.lang.Object r0 = r0.L$0
            com.kubi.home.rank.impl.cache.RankItem r0 = (com.kubi.home.rank.impl.cache.RankItem) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L66
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.isNewCoin()
            if (r6 != 0) goto L74
            com.kubi.home.rank.impl.cache.RankCoinHelper r6 = com.kubi.home.rank.impl.cache.RankCoinHelper.f26031a
            com.kubi.data.entity.TradeItemBean r2 = r5.getTradeItemBean()
            if (r2 == 0) goto L56
            com.kubi.data.entity.SymbolInfoEntity r2 = r2.getSymbolInfoEntity()
            if (r2 == 0) goto L56
            java.lang.String r2 = r2.getBaseCurrencyName()
            if (r2 != 0) goto L58
        L56:
            java.lang.String r2 = ""
        L58:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m29942f(r2, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            r0 = r5
        L66:
            com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity r6 = (com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity) r6
            if (r6 == 0) goto L6f
            java.lang.String r6 = r6.getIconUrl()
            goto L70
        L6f:
            r6 = 0
        L70:
            r5.setIconUrl(r6)
            return r0
        L74:
            return r5
    }

    /* JADX INFO: renamed from: X */
    public final void m29919X(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "rank"
            p058cj.C4988a.m5286a(r2, r0)
            return
    }

    /* JADX INFO: renamed from: Y */
    public final void m29920Y(java.util.List<com.kubi.home.rank.impl.cache.RankItem> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refreshData type:"
            r0.append(r1)
            int r1 = r2.f26014X
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.m29919X(r0)
            if (r3 == 0) goto L1b
            r2.m29888b0(r3)
        L1b:
            return
    }

    /* JADX INFO: renamed from: d0 */
    public final void m29921d0(int r7) {
            r6 = this;
            java.lang.String r1 = r6.m29911P(r7)
            com.kubi.sdk.websocket.SocketTask$Companion r0 = com.kubi.sdk.websocket.SocketTask.f48571i
            r4 = 4
            r5 = 0
            r3 = 0
            r2 = r6
            com.kubi.sdk.websocket.SocketTask r7 = com.kubi.sdk.websocket.SocketTask.Companion.obtain$default(r0, r1, r2, r3, r4, r5)
            r0 = 0
            com.kubi.sdk.websocket.SocketTask r7 = r7.m58923y(r0)
            com.kubi.home.rank.impl.RankVM$b r0 = new com.kubi.home.rank.impl.RankVM$b
            r0.<init>(r1, r6)
            r7.m58911j(r0)
            return
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @org.jetbrains.annotations.Nullable
    public java.lang.Object dispatchIntent(@org.jetbrains.annotations.NotNull com.kubi.mvi.state.InterfaceC19282d r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = m29883J(r0, r1, r2)
            return r1
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @org.jetbrains.annotations.Nullable
    public java.lang.Object dispatchIntentOnIO(@org.jetbrains.annotations.NotNull com.kubi.mvi.state.InterfaceC19282d r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = m29884K(r0, r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: e0 */
    public final void m29922e0() {
            r1 = this;
            com.kubi.home.rank.impl.k r0 = com.kubi.home.rank.impl.C14786k.f26059a
            r1.send(r0)
            return
    }

    /* JADX INFO: renamed from: f0 */
    public final void m29923f0() {
            r1 = this;
            com.kubi.home.rank.impl.r r0 = new com.kubi.home.rank.impl.r
            r0.<init>()
            r1.updateState(r0)
            return
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    public /* bridge */ /* synthetic */ com.kubi.mvi.state.InterfaceC19284f getInitState() {
            r1 = this;
            com.kubi.home.rank.impl.RankStateContract$UIState r0 = r1.m29908M()
            return r0
    }

    @Override // com.kubi.mvi.state.AbstractC19290l, com.kubi.mvi.state.BaseStateVM
    public boolean getNeedCatchException() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: h0 */
    public final java.lang.Object m29924h0(int r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            int r0 = r2.f26014X
            if (r0 == r3) goto L22
            java.lang.String r0 = r2.m29911P(r0)
            g10.l r1 = g10.C37781l.f85093a
            r1.m85213c(r0, r2)
            r2.f26014X = r3
            com.kubi.home.rank.impl.RankStateContract$UiIntent$ListenRankData r0 = new com.kubi.home.rank.impl.RankStateContract$UiIntent$ListenRankData
            r0.<init>(r3)
            java.lang.Object r3 = r2.m29914S(r0, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L1f
            return r3
        L1f:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L22:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
            r2 = this;
            super.onCleared()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCleared rank type:"
            r0.append(r1)
            int r1 = r2.f26014X
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.m29919X(r0)
            return
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
            r8 = this;
            super.onHide()
            int r0 = r8.f26014X
            r1 = 8
            if (r0 != r1) goto L13
            r6 = 6
            r7 = 0
            java.lang.String r2 = "hide_new_coin_more"
            r3 = 0
            r4 = 0
            com.kubi.event.api.C12572a.m23695d(r2, r3, r4, r6, r7)
        L13:
            return
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() {
            r8 = this;
            super.onShow()
            int r0 = r8.f26014X
            r1 = 8
            if (r0 != r1) goto L13
            r6 = 6
            r7 = 0
            java.lang.String r2 = "show_new_coin_more"
            r3 = 0
            r4 = 0
            com.kubi.event.api.C12572a.m23695d(r2, r3, r4, r6, r7)
        L13:
            return
    }
}
