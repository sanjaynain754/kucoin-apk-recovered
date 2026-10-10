package com.kubi.quotefacade.rank;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@kotlin.Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0094@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/rank/RankContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "rankEntityMapper", "Lcom/kubi/quotefacade/mapper/RankEntityMapper;", "getRankEntityMapper", "()Lcom/kubi/quotefacade/mapper/RankEntityMapper;", "rankEntityMapper$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/quotefacade/rank/RankContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNewAllList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkToShowRedDot", "fetchMarket", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankVM.kt\ncom/kubi/quotefacade/rank/RankVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1869#2:95\n1563#2:96\n1634#2,3:97\n1870#2:100\n*S KotlinDebug\n*F\n+ 1 RankVM.kt\ncom/kubi/quotefacade/rank/RankVM\n*L\n56#1:95\n68#1:96\n68#1:97,3\n56#1:100\n*E\n"})
public final class RankVM extends com.kubi.mvi.state.AbstractC19291m<com.kubi.quotefacade.rank.RankContract$UIState> {

    /* JADX INFO: renamed from: Z */
    @org.jetbrains.annotations.NotNull
    public static final com.kubi.quotefacade.rank.RankVM.Companion f42408Z = null;

    /* JADX INFO: renamed from: X */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.quotefacade.repository.QuoteMarketRepository f42409X;

    /* JADX INFO: renamed from: Y */
    @org.jetbrains.annotations.NotNull
    public final kotlin.Lazy f42410Y;

    /* JADX INFO: compiled from: RankVM.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankVM$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

    static {
            com.kubi.quotefacade.rank.RankVM$Companion r0 = new com.kubi.quotefacade.rank.RankVM$Companion
            r1 = 0
            r0.<init>(r1)
            com.kubi.quotefacade.rank.RankVM.f42408Z = r0
            return
    }

    public RankVM() {
            r1 = this;
            r1.<init>()
            com.kubi.quotefacade.repository.QuoteMarketRepository r0 = new com.kubi.quotefacade.repository.QuoteMarketRepository
            r0.<init>()
            r1.f42409X = r0
            com.kubi.quotefacade.rank.n r0 = new com.kubi.quotefacade.rank.n
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.f42410Y = r0
            return
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ p414kv.C41994j m52698n() {
            kv.j r0 = m52702w()
            return r0
    }

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ java.lang.Object m52699o(com.kubi.quotefacade.rank.RankVM r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.m52705t(r1)
            return r0
    }

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ com.kubi.quotefacade.repository.QuoteMarketRepository m52700p(com.kubi.quotefacade.rank.RankVM r0) {
            com.kubi.quotefacade.repository.QuoteMarketRepository r0 = r0.f42409X
            return r0
    }

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ void m52701q(com.kubi.quotefacade.rank.RankVM r0, p208dr.InterfaceC36952a r1) {
            r0.send(r1)
            return
    }

    /* JADX INFO: renamed from: w */
    public static final p414kv.C41994j m52702w() {
            kv.j r0 = new kv.j
            r0.<init>()
            return r0
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @org.jetbrains.annotations.Nullable
    public java.lang.Object dispatchIntent(@org.jetbrains.annotations.NotNull com.kubi.mvi.state.InterfaceC19282d r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            boolean r0 = r2 instanceof com.kubi.quotefacade.rank.RankContract$UiIntent.FetchNewAllList
            if (r0 == 0) goto L12
            java.lang.Object r2 = r1.m52705t(r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Lf
            return r2
        Lf:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L12:
            boolean r3 = r2 instanceof com.kubi.quotefacade.rank.RankContract$UiIntent.CheckToShowNewTabRedDot
            if (r3 == 0) goto L1a
            r1.m52703r()
            goto L21
        L1a:
            boolean r2 = r2 instanceof com.kubi.quotefacade.rank.RankContract$UiIntent.FetchMarket
            if (r2 == 0) goto L21
            r1.m52704s()
        L21:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    public /* bridge */ /* synthetic */ com.kubi.mvi.state.InterfaceC19284f getInitState() {
            r1 = this;
            com.kubi.quotefacade.rank.RankContract$UIState r0 = r1.m52706u()
            return r0
    }

    /* JADX INFO: renamed from: r */
    public final void m52703r() {
            r6 = this;
            kotlinx.coroutines.m0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            com.kubi.quotefacade.rank.RankVM$checkToShowRedDot$1 r3 = new com.kubi.quotefacade.rank.RankVM$checkToShowRedDot$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.C41686h.m91046d(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: s */
    public final void m52704s() {
            r6 = this;
            kotlinx.coroutines.m0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            com.kubi.quotefacade.rank.RankVM$fetchMarket$1 r3 = new com.kubi.quotefacade.rank.RankVM$fetchMarket$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.C41686h.m91046d(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: t */
    public final java.lang.Object m52705t(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.kubi.quotefacade.rank.RankVM$fetchNewAllList$1
            if (r2 == 0) goto L17
            r2 = r1
            com.kubi.quotefacade.rank.RankVM$fetchNewAllList$1 r2 = (com.kubi.quotefacade.rank.RankVM$fetchNewAllList$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.kubi.quotefacade.rank.RankVM$fetchNewAllList$1 r2 = new com.kubi.quotefacade.rank.RankVM$fetchNewAllList$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L63
            if (r4 == r6) goto L4c
            if (r4 != r5) goto L44
            int r4 = r2.I$0
            java.lang.Object r8 = r2.L$4
            androidx.lifecycle.MutableLiveData r8 = (androidx.lifecycle.MutableLiveData) r8
            java.lang.Object r9 = r2.L$3
            com.kubi.quotefacade.rank.config.RankSubTabItemConfig r9 = (com.kubi.quotefacade.rank.config.RankSubTabItemConfig) r9
            java.lang.Object r9 = r2.L$1
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r2.L$0
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlin.ResultKt.throwOnFailure(r1)
            goto Ld9
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L4c:
            int r4 = r2.I$0
            java.lang.Object r8 = r2.L$4
            androidx.lifecycle.MutableLiveData r8 = (androidx.lifecycle.MutableLiveData) r8
            java.lang.Object r9 = r2.L$3
            com.kubi.quotefacade.rank.config.RankSubTabItemConfig r9 = (com.kubi.quotefacade.rank.config.RankSubTabItemConfig) r9
            java.lang.Object r9 = r2.L$1
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r2.L$0
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlin.ResultKt.throwOnFailure(r1)
            goto L149
        L63:
            kotlin.ResultKt.throwOnFailure(r1)
            com.kubi.quotefacade.rank.config.e r1 = com.kubi.quotefacade.rank.config.C22444e.f42417a
            com.kubi.quotefacade.rank.config.RankTabConfig r1 = r1.m52733k()
            java.util.List r1 = r1.getSubTabs()
            java.util.Iterator r4 = r1.iterator()
            r13 = r2
            r2 = r1
            r1 = r4
            r4 = r7
        L78:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L151
            java.lang.Object r8 = r1.next()
            r9 = r8
            com.kubi.quotefacade.rank.config.RankSubTabItemConfig r9 = (com.kubi.quotefacade.rank.config.RankSubTabItemConfig) r9
            com.kubi.quotefacade.rank.NewRankRedDotHelper r10 = com.kubi.quotefacade.rank.NewRankRedDotHelper.f42388a
            java.lang.String r11 = r9.getType()
            androidx.lifecycle.MutableLiveData r10 = r10.m52640h(r11)
            if (r10 == 0) goto L78
            boolean r11 = r9.isRankCoinSubTab()
            if (r11 != 0) goto L9d
            boolean r11 = r9.isRankSpotSubTab()
            if (r11 == 0) goto La0
        L9d:
            r11 = r8
            goto L10c
        La0:
            boolean r11 = r9.isRankFutureSubTab()
            if (r11 == 0) goto L78
            com.kubi.quotefacade.repository.QuoteMarketRepository r11 = r0.f42409X
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r13.L$0 = r12
            r13.L$1 = r1
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r13.L$2 = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r13.L$3 = r8
            r13.L$4 = r10
            r13.I$0 = r4
            r13.I$1 = r7
            r13.I$2 = r7
            r13.label = r5
            java.lang.String r8 = "NEW_CURRENCY_V2"
            java.lang.String r9 = "CONTRACT"
            java.lang.String r12 = "HOMEPAGE"
            java.lang.Object r8 = r11.m53000o(r8, r9, r12, r13)
            if (r8 != r3) goto Ld4
            goto L142
        Ld4:
            r9 = r1
            r1 = r8
            r8 = r10
            r10 = r2
            r2 = r13
        Ld9:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L107
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r12)
            r11.<init>(r12)
            java.util.Iterator r1 = r1.iterator()
        Lec:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L104
            java.lang.Object r12 = r1.next()
            com.kubi.quotefacade.entity.RankFuturesEntity r12 = (com.kubi.quotefacade.entity.RankFuturesEntity) r12
            kv.j r13 = r0.m52707v()
            com.kubi.quotefacade.entity.RankEntity r12 = r13.m92076b(r12)
            r11.add(r12)
            goto Lec
        L104:
            r8.postValue(r11)
        L107:
            r13 = r2
            r1 = r9
            r2 = r10
            goto L78
        L10c:
            com.kubi.quotefacade.repository.QuoteMarketRepository r8 = r0.f42409X
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r13.L$0 = r12
            r13.L$1 = r1
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r13.L$2 = r11
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r13.L$3 = r9
            r13.L$4 = r10
            r13.I$0 = r4
            r13.I$1 = r7
            r13.I$2 = r7
            r13.label = r6
            java.lang.String r9 = "NEW_CURRENCY_V2"
            r11 = r10
            java.lang.String r10 = "COIN"
            r12 = r11
            java.lang.String r11 = "HOMEPAGE"
            r14 = r12
            r12 = 0
            r15 = r14
            r14 = 8
            r16 = r15
            r15 = 0
            java.lang.Object r8 = com.kubi.quotefacade.repository.QuoteMarketRepository.m52965q(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r8 != r3) goto L143
        L142:
            return r3
        L143:
            r9 = r1
            r10 = r2
            r1 = r8
            r2 = r13
            r8 = r16
        L149:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L107
            r8.postValue(r1)
            goto L107
        L151:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: u */
    public com.kubi.quotefacade.rank.RankContract$UIState m52706u() {
            r3 = this;
            com.kubi.quotefacade.rank.RankContract$UIState r0 = new com.kubi.quotefacade.rank.RankContract$UIState
            r1 = 0
            r2 = 3
            r0.<init>(r1, r1, r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: v */
    public final p414kv.C41994j m52707v() {
            r1 = this;
            kotlin.Lazy r0 = r1.f42410Y
            java.lang.Object r0 = r0.getValue()
            kv.j r0 = (p414kv.C41994j) r0
            return r0
    }
}
