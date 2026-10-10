package com.kubi.jsbridge.impl.biz.trade;

/* JADX INFO: compiled from: KCJsBridgeTrade.kt */
/* JADX INFO: loaded from: classes17.dex */
@kotlin.Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jt\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JH\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JP\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JF\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u0014\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J@\u0010\"\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JH\u0010#\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JF\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u0014\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J@\u0010'\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JH\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016JF\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u0014\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J@\u0010+\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J`\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u001c\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0016J\f\u00100\u001a\u00020\u001f*\u000201H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/biz/trade/KCJsBridgeTrade;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeModule;", "<init>", "()V", "bridgeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "openNativeMarketsSymbolDialog", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "level1", "level2", "level3", "data", "", "", "callback", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "fetchMarginCurrency", "currency", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;", "getAlphaCurrencyInfo", "currencySeq", "", "quoteCurrency", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeAlphaCurrencyInfo;", "getAlphaCurrencyInfoBatch", "", "getContractTradeUnit", "getIsolatedMarginConfig", "symbol", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;", "getIsolatedMarginConfigBatch", "getMarginConfig", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;", "getMarginCurrency", "getMarginCurrencyList", "isUtaHasOpend", "openOrderDetail", "orderId", "bussinesType", "content", "toJsAlphaCurrencyInfo", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKCJsBridgeTrade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeTrade.kt\ncom/kubi/jsbridge/impl/biz/trade/KCJsBridgeTrade\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,361:1\n1563#2:362\n1634#2,3:363\n1563#2:366\n1634#2,3:367\n1563#2:371\n1634#2,3:372\n1#3:370\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeTrade.kt\ncom/kubi/jsbridge/impl/biz/trade/KCJsBridgeTrade\n*L\n162#1:362\n162#1:363,3\n210#1:366\n210#1:367,3\n275#1:371\n275#1:372,3\n*E\n"})
public final class KCJsBridgeTrade implements d00.InterfaceC36569e0 {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.disposables.CompositeDisposable f27371a;

    public KCJsBridgeTrade() {
            r1 = this;
            r1.<init>()
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r1.f27371a = r0
            return
    }

    /* JADX INFO: renamed from: A */
    public static final void m31568A(kotlin.jvm.internal.Ref.BooleanRef r1, kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r2, java.lang.String r3, com.kubi.sdk.protocol.ProtocolException r4) {
            boolean r0 = r1.element
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.element = r0
            r2.invoke(r3, r4)
            return
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ kotlin.Unit m31569p(kotlin.jvm.functions.Function2 r0, java.util.List r1) {
            kotlin.Unit r0 = m31576w(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m31570q(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            m31577x(r0, r1)
            return
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m31571r(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            m31579z(r0, r1)
            return
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ kotlin.Unit m31572s(kotlin.jvm.functions.Function2 r0, java.lang.Throwable r1) {
            kotlin.Unit r0 = m31578y(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m31573t(kotlin.jvm.internal.Ref.ObjectRef r0, io.reactivex.disposables.CompositeDisposable r1) {
            m31575v(r0, r1)
            return
    }

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ void m31574u(kotlin.jvm.internal.Ref.BooleanRef r0, kotlin.jvm.functions.Function2 r1, java.lang.String r2, com.kubi.sdk.protocol.ProtocolException r3) {
            m31568A(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: v */
    public static final void m31575v(kotlin.jvm.internal.Ref.ObjectRef r0, io.reactivex.disposables.CompositeDisposable r1) {
            T r0 = r0.element
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            if (r0 == 0) goto L9
            r1.remove(r0)
        L9:
            return
    }

    /* JADX INFO: renamed from: w */
    public static final kotlin.Unit m31576w(kotlin.jvm.functions.Function2 r5, java.util.List r6) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r6.next()
            com.kubi.loan.api.entity.LeverCoinConfig r1 = (com.kubi.loan.api.entity.LeverCoinConfig) r1
            com.kubi.jsbridge.impl.biz.trade.j r2 = com.kubi.jsbridge.impl.biz.trade.C15226j.f27387a
            gf.n r3 = gf.C37890n.f85269a
            java.lang.String r4 = r1.getCurrency()
            com.kubi.data.entity.CoinInfoEntity r3 = r3.m85613u(r4)
            java.lang.String r4 = ""
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency r1 = r2.m31610d(r1, r3, r4)
            r0.add(r1)
            goto L12
        L34:
            r6 = 0
            r5.invoke(r0, r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }

    /* JADX INFO: renamed from: x */
    public static final void m31577x(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            r0.invoke(r1)
            return
    }

    /* JADX INFO: renamed from: y */
    public static final kotlin.Unit m31578y(kotlin.jvm.functions.Function2 r7, java.lang.Throwable r8) {
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            r5 = 12
            r6 = 0
            java.lang.String r1 = "getMarginCurrencyList failed"
            r3 = 0
            r4 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = 0
            r7.invoke(r8, r0)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }

    /* JADX INFO: renamed from: z */
    public static final void m31579z(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            r0.invoke(r1)
            return
    }

    /* JADX INFO: renamed from: B */
    public final com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo m31580B(com.kubi.data.entity.AlphaCurrencyInfoEntity r30) {
            r29 = this;
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo r0 = new com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo
            java.lang.Long r1 = r30.getCurrencySeq()
            r2 = -1
            if (r1 == 0) goto Lf
            long r4 = r1.longValue()
            goto L10
        Lf:
            r4 = r2
        L10:
            java.lang.String r1 = r30.getSiteType()
            java.lang.String r6 = ""
            if (r1 != 0) goto L19
            r1 = r6
        L19:
            java.lang.Long r7 = r30.getChainSeq()
            if (r7 == 0) goto L24
            long r7 = r7.longValue()
            goto L25
        L24:
            r7 = r2
        L25:
            java.lang.String r9 = r30.getChainLogo()
            if (r9 != 0) goto L2c
            r9 = r6
        L2c:
            java.lang.String r10 = r30.getTokenIcon()
            if (r10 != 0) goto L33
            r10 = r6
        L33:
            java.lang.String r11 = r30.getTokenName()
            if (r11 != 0) goto L3a
            r11 = r6
        L3a:
            java.lang.String r12 = r30.getTokenFullName()
            if (r12 != 0) goto L41
            r12 = r6
        L41:
            java.lang.Integer r13 = r30.getTokenDecimal()
            if (r13 == 0) goto L4d
            int r13 = r13.intValue()
            long r13 = (long) r13
            goto L4f
        L4d:
            r13 = 8
        L4f:
            java.lang.String r15 = r30.getTokenAddress()
            if (r15 != 0) goto L56
            r15 = r6
        L56:
            java.lang.Long r16 = r30.getTokenBridgeId()
            if (r16 == 0) goto L60
            long r2 = r16.longValue()
        L60:
            java.lang.Boolean r16 = r30.isQuoteCurrency()
            if (r16 == 0) goto L6b
            boolean r16 = r16.booleanValue()
            goto L6d
        L6b:
            r16 = 0
        L6d:
            java.lang.Long r17 = r30.getOpeningTime()
            r18 = 0
            if (r17 == 0) goto L7a
            long r20 = r17.longValue()
            goto L7c
        L7a:
            r20 = r18
        L7c:
            java.lang.Long r17 = r30.getCreatedAt()
            if (r17 == 0) goto L87
            long r22 = r17.longValue()
            goto L89
        L87:
            r22 = r18
        L89:
            java.lang.Integer r17 = r30.getUpgradeStatus()
            r24 = r0
            if (r17 == 0) goto L9b
            int r0 = r17.intValue()
            r17 = r1
            long r0 = (long) r0
            r18 = r0
            goto L9d
        L9b:
            r17 = r1
        L9d:
            java.lang.String r0 = r30.getChainId()
            r25 = r22
            if (r0 != 0) goto Lc0
            r22 = r6
            r0 = r24
            r6 = r9
            r9 = r12
            r12 = r15
            r15 = r16
        Lae:
            r27 = r7
            r7 = r10
            r8 = r11
            r10 = r13
            r13 = r2
            r1 = r4
            r4 = r27
            r3 = r17
            r16 = r20
            r20 = r18
            r18 = r25
            goto Lca
        Lc0:
            r22 = r0
            r6 = r9
            r9 = r12
            r12 = r15
            r15 = r16
            r0 = r24
            goto Lae
        Lca:
            r0.<init>(r1, r3, r4, r6, r7, r8, r9, r10, r12, r13, r15, r16, r18, r20, r22)
            return r0
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: a */
    public void mo31581a(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.util.List<com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig>, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r11) {
            r7 = this;
            java.lang.String r9 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r8 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L41
            com.kubi.margin.api.IMarginService$Companion r8 = com.kubi.margin.api.IMarginService.f32724a     // Catch: java.lang.Throwable -> L41
            com.kubi.margin.api.IMarginService r8 = r8.get()     // Catch: java.lang.Throwable -> L41
            java.util.List r8 = r8.mo37903A()     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L41
            r10 = 10
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r10)     // Catch: java.lang.Throwable -> L41
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L41
        L2a:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r10 == 0) goto L4c
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L41
            com.kubi.margin.api.entity.IsolatedMarginBridgeConfig r10 = (com.kubi.margin.api.entity.IsolatedMarginBridgeConfig) r10     // Catch: java.lang.Throwable -> L41
            com.kubi.jsbridge.impl.biz.trade.j r0 = com.kubi.jsbridge.impl.biz.trade.C15226j.f27387a     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r10.getSymbol()     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L44
            java.lang.String r1 = ""
            goto L44
        L41:
            r0 = move-exception
            r8 = r0
            goto L51
        L44:
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig r10 = r0.m31608b(r10, r1)     // Catch: java.lang.Throwable -> L41
            r9.add(r10)     // Catch: java.lang.Throwable -> L41
            goto L2a
        L4c:
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r9)     // Catch: java.lang.Throwable -> L41
            goto L5b
        L51:
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)
        L5b:
            boolean r9 = kotlin.Result.m103851isSuccessimpl(r8)
            r10 = 0
            if (r9 == 0) goto L68
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            r11.invoke(r9, r10)
        L68:
            java.lang.Throwable r2 = kotlin.Result.m103847exceptionOrNullimpl(r8)
            if (r2 == 0) goto L7d
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            r5 = 12
            r6 = 0
            java.lang.String r1 = "getIsolatedMarginConfigBatch failed"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.invoke(r10, r0)
        L7d:
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: b */
    public void mo31582b(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.util.List<com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo>, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r11) {
            r7 = this;
            java.lang.String r9 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r8 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3a
            gf.n r8 = gf.C37890n.f85269a     // Catch: java.lang.Throwable -> L3a
            java.util.List r8 = r8.m85612t()     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r10 = 10
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r10)     // Catch: java.lang.Throwable -> L3a
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L3a
        L26:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r10 == 0) goto L3d
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L3a
            com.kubi.data.entity.AlphaCurrencyInfoEntity r10 = (com.kubi.data.entity.AlphaCurrencyInfoEntity) r10     // Catch: java.lang.Throwable -> L3a
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo r10 = r7.m31580B(r10)     // Catch: java.lang.Throwable -> L3a
            r9.add(r10)     // Catch: java.lang.Throwable -> L3a
            goto L26
        L3a:
            r0 = move-exception
            r8 = r0
            goto L42
        L3d:
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r9)     // Catch: java.lang.Throwable -> L3a
            goto L4c
        L42:
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)
        L4c:
            boolean r9 = kotlin.Result.m103851isSuccessimpl(r8)
            r10 = 0
            if (r9 == 0) goto L59
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            r11.invoke(r9, r10)
        L59:
            java.lang.Throwable r2 = kotlin.Result.m103847exceptionOrNullimpl(r8)
            if (r2 == 0) goto L6e
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            r5 = 12
            r6 = 0
            java.lang.String r1 = "getAlphaCurrencyInfoBatch failed"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.invoke(r10, r0)
        L6e:
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: c */
    public void mo31583c(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r12) {
            r7 = this;
            java.lang.String r9 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r8 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "symbol"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r8)
            java.lang.String r8 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2b
            com.kubi.margin.api.IMarginService$Companion r8 = com.kubi.margin.api.IMarginService.f32724a     // Catch: java.lang.Throwable -> L2b
            com.kubi.margin.api.IMarginService r8 = r8.get()     // Catch: java.lang.Throwable -> L2b
            com.kubi.margin.api.entity.IsolatedMarginBridgeConfig r8 = r8.mo37919S(r11)     // Catch: java.lang.Throwable -> L2b
            com.kubi.jsbridge.impl.biz.trade.j r9 = com.kubi.jsbridge.impl.biz.trade.C15226j.f27387a     // Catch: java.lang.Throwable -> L2b
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig r8 = r9.m31608b(r8, r11)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)     // Catch: java.lang.Throwable -> L2b
            goto L37
        L2b:
            r0 = move-exception
            r8 = r0
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)
        L37:
            boolean r9 = kotlin.Result.m103851isSuccessimpl(r8)
            r10 = 0
            if (r9 == 0) goto L44
            r9 = r8
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig r9 = (com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig) r9
            r12.invoke(r9, r10)
        L44:
            java.lang.Throwable r2 = kotlin.Result.m103847exceptionOrNullimpl(r8)
            if (r2 == 0) goto L59
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            r5 = 12
            r6 = 0
            java.lang.String r1 = "getIsolatedMarginConfig failed"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.invoke(r10, r0)
        L59:
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: d */
    public void mo31584d(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeSymbolOfflineInfo, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r5) {
            r0 = this;
            d00.InterfaceC36569e0.a.m81860b(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: e */
    public void mo31585e(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r4) {
            r0 = this;
            java.lang.String r2 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r1 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            com.kubi.unify.api.IUnifyAccountService$Companion r1 = com.kubi.unify.api.IUnifyAccountService.f53155a
            com.kubi.unify.api.IUnifyAccountService r1 = r1.get()
            boolean r1 = r1.mo64991e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r4.invoke(r1, r2)
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: f */
    public void mo31586f(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r5) {
            r0 = this;
            java.lang.String r2 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r1 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "currency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            java.lang.String r1 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            com.kubi.loan.api.ILoanService$Companion r1 = com.kubi.loan.api.ILoanService.f32363a
            com.kubi.loan.api.ILoanService r1 = r1.get()
            r2 = 1
            com.kubi.loan.api.entity.LeverCoinConfig r1 = r1.mo37707f(r4, r2)
            com.kubi.jsbridge.impl.biz.trade.j r2 = com.kubi.jsbridge.impl.biz.trade.C15226j.f27387a
            gf.n r3 = gf.C37890n.f85269a
            com.kubi.data.entity.CoinInfoEntity r3 = r3.m85613u(r4)
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency r1 = r2.m31610d(r1, r3, r4)
            r2 = 0
            r5.invoke(r1, r2)
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: g */
    public void mo31587g(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r15) {
            r7 = this;
            java.lang.String r9 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r9 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r9)
            java.lang.String r9 = "orderId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r9)
            java.lang.String r9 = "symbol"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r9)
            java.lang.String r9 = "bussinesType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r9)
            java.lang.String r9 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r9)
            java.lang.String r9 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3d
            java.lang.String r9 = "FUTURES"
            r10 = 1
            boolean r9 = kotlin.text.StringsKt.equals(r9, r13, r10)     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto L40
            com.kubi.unify.api.IUnifyAccountService$Companion r9 = com.kubi.unify.api.IUnifyAccountService.f53155a     // Catch: java.lang.Throwable -> L3d
            com.kubi.unify.api.IUnifyAccountService r0 = r9.get()     // Catch: java.lang.Throwable -> L3d
            r1 = r8
            r2 = r11
            r3 = r12
            r5 = r13
            r4 = r14
            r0.mo65004t(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L3d
            goto L4d
        L3d:
            r0 = move-exception
            r8 = r0
            goto L54
        L40:
            r10 = r14
            r14 = r13
            r13 = r10
            r10 = r8
            com.kubi.utaspot.api.IUtaSpotService$Companion r8 = com.kubi.utaspot.api.IUtaSpotService.f54014a     // Catch: java.lang.Throwable -> L3d
            com.kubi.utaspot.api.IUtaSpotService r9 = r8.get()     // Catch: java.lang.Throwable -> L3d
            r9.mo65988a(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L3d
        L4d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)     // Catch: java.lang.Throwable -> L3d
            goto L5e
        L54:
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)
        L5e:
            boolean r9 = kotlin.Result.m103851isSuccessimpl(r8)
            if (r9 == 0) goto L6d
            r9 = r8
            kotlin.Unit r9 = (kotlin.Unit) r9
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r10 = 0
            r15.invoke(r9, r10)
        L6d:
            java.lang.Throwable r2 = kotlin.Result.m103847exceptionOrNullimpl(r8)
            if (r2 == 0) goto L84
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            r5 = 12
            r6 = 0
            java.lang.String r1 = "openOrderDetail failed"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.invoke(r8, r0)
        L84:
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: h */
    public void mo31588h(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r4) {
            r0 = this;
            d00.InterfaceC36569e0.a.m81861c(r0, r1, r2, r3, r4)
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: i */
    public void mo31589i(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.util.List<com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeSymbolOfflineInfo>, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r4) {
            r0 = this;
            d00.InterfaceC36569e0.a.m81859a(r0, r1, r2, r3, r4)
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: j */
    public void mo31590j(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r8) {
            r0 = this;
            java.lang.String r2 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r1 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "level1"
            kotlin.Pair r1 = kotlin.TuplesKt.m90091to(r1, r4)
            java.lang.String r2 = "level2"
            kotlin.Pair r2 = kotlin.TuplesKt.m90091to(r2, r5)
            java.lang.String r3 = "level3"
            kotlin.Pair r3 = kotlin.TuplesKt.m90091to(r3, r6)
            r4 = 0
            java.lang.String r5 = "symbolCode"
            if (r7 == 0) goto L31
            java.lang.Object r6 = r7.get(r5)
            if (r6 == 0) goto L31
            java.lang.String r6 = r6.toString()
            goto L32
        L31:
            r6 = r4
        L32:
            kotlin.Pair r5 = kotlin.TuplesKt.m90091to(r5, r6)
            java.lang.String r6 = "leverage"
            if (r7 == 0) goto L44
            java.lang.Object r7 = r7.get(r6)
            if (r7 == 0) goto L44
            java.lang.String r4 = r7.toString()
        L44:
            kotlin.Pair r4 = kotlin.TuplesKt.m90091to(r6, r4)
            kotlin.Pair[] r4 = new kotlin.Pair[]{r5, r4}
            java.util.Map r4 = kotlin.collections.MapsKt.mapOf(r4)
            java.lang.String r5 = "data"
            kotlin.Pair r4 = kotlin.TuplesKt.m90091to(r5, r4)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1, r2, r3, r4}
            java.util.Map r4 = kotlin.collections.MapsKt.mapOf(r1)
            kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
            r3.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r5 = new kotlin.jvm.internal.Ref$BooleanRef
            r5.<init>()
            com.kubi.jsbridge.impl.biz.trade.KCJsBridgeTrade$openNativeMarketsSymbolDialog$1 r2 = new com.kubi.jsbridge.impl.biz.trade.KCJsBridgeTrade$openNativeMarketsSymbolDialog$1
            r7 = 0
            r6 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            com.kubi.mvi.common.MviExKt.m42518n(r2)
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: k */
    public void mo31591k(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r11) {
            r7 = this;
            java.lang.String r9 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r8 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L20
            com.kubi.kumex.api.IKuMexService$Companion r8 = com.kubi.kumex.api.IKuMexService.f28731a     // Catch: java.lang.Throwable -> L20
            com.kubi.kumex.api.IKuMexService r8 = r8.get()     // Catch: java.lang.Throwable -> L20
            java.lang.String r8 = r8.mo33288r()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)     // Catch: java.lang.Throwable -> L20
            goto L2c
        L20:
            r0 = move-exception
            r8 = r0
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)
        L2c:
            boolean r9 = kotlin.Result.m103851isSuccessimpl(r8)
            r10 = 0
            if (r9 == 0) goto L39
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r11.invoke(r9, r10)
        L39:
            java.lang.Throwable r2 = kotlin.Result.m103847exceptionOrNullimpl(r8)
            if (r2 == 0) goto L4e
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            r5 = 12
            r6 = 0
            java.lang.String r1 = "getContractTradeUnit failed"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.invoke(r10, r0)
        L4e:
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: l */
    public void mo31592l(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.util.List<com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency>, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r7) {
            r3 = this;
            java.lang.String r5 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.String r5 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            boolean r5 = r4 instanceof com.kubi.sdk.BaseActivity
            r6 = 0
            if (r5 == 0) goto L17
            com.kubi.sdk.BaseActivity r4 = (com.kubi.sdk.BaseActivity) r4
            goto L18
        L17:
            r4 = r6
        L18:
            if (r4 != 0) goto L26
            android.app.Activity r4 = com.blankj.utilcode.util.C5258a.m6125h()
            boolean r5 = r4 instanceof com.kubi.sdk.BaseActivity
            if (r5 == 0) goto L25
            com.kubi.sdk.BaseActivity r4 = (com.kubi.sdk.BaseActivity) r4
            goto L26
        L25:
            r4 = r6
        L26:
            if (r4 == 0) goto L2f
            io.reactivex.disposables.CompositeDisposable r4 = r4.getDestroyDisposable()
            if (r4 == 0) goto L2f
            goto L31
        L2f:
            io.reactivex.disposables.CompositeDisposable r4 = r3.f27371a
        L31:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            com.kubi.loan.api.ILoanService$Companion r0 = com.kubi.loan.api.ILoanService.f32363a
            com.kubi.loan.api.ILoanService r0 = r0.get()
            r1 = 0
            r2 = 1
            io.reactivex.Observable r6 = com.kubi.loan.api.ILoanService.m37702d(r0, r1, r2, r6)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r6 = r6.observeOn(r0)
            com.kubi.jsbridge.impl.biz.trade.b r0 = new com.kubi.jsbridge.impl.biz.trade.b
            r0.<init>(r5, r4)
            io.reactivex.Observable r6 = r6.doFinally(r0)
            com.kubi.jsbridge.impl.biz.trade.c r0 = new com.kubi.jsbridge.impl.biz.trade.c
            r0.<init>(r7)
            com.kubi.jsbridge.impl.biz.trade.d r1 = new com.kubi.jsbridge.impl.biz.trade.d
            r1.<init>(r0)
            com.kubi.jsbridge.impl.biz.trade.e r0 = new com.kubi.jsbridge.impl.biz.trade.e
            r0.<init>(r7)
            com.kubi.jsbridge.impl.biz.trade.f r7 = new com.kubi.jsbridge.impl.biz.trade.f
            r7.<init>(r0)
            io.reactivex.disposables.Disposable r6 = r6.subscribe(r1, r7)
            r5.element = r6
            io.reactivex.disposables.Disposable r6 = (io.reactivex.disposables.Disposable) r6
            if (r6 == 0) goto L74
            r4.add(r6)
        L74:
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: m */
    public void mo31593m(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginConfig, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r4) {
            r0 = this;
            java.lang.String r2 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r1 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            com.kubi.margin.api.IMarginService$Companion r1 = com.kubi.margin.api.IMarginService.f32724a
            com.kubi.margin.api.IMarginService r1 = r1.get()
            com.kubi.margin.api.entity.MarginBridgeConfig r1 = r1.mo37906E()
            com.kubi.jsbridge.impl.biz.trade.j r2 = com.kubi.jsbridge.impl.biz.trade.C15226j.f27387a
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginConfig r1 = r2.m31609c(r1)
            r2 = 0
            r4.invoke(r1, r2)
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: n */
    public void mo31594n(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull java.lang.String r10, long r11, boolean r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r14) {
            r7 = this;
            java.lang.String r9 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r8 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L24
            gf.n r8 = gf.C37890n.f85269a     // Catch: java.lang.Throwable -> L24
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> L24
            com.kubi.data.entity.AlphaCurrencyInfoEntity r8 = r8.m85611s(r9, r10)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)     // Catch: java.lang.Throwable -> L24
            goto L30
        L24:
            r0 = move-exception
            r8 = r0
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)
        L30:
            boolean r9 = kotlin.Result.m103851isSuccessimpl(r8)
            r10 = 0
            if (r9 == 0) goto L68
            r9 = r8
            com.kubi.data.entity.AlphaCurrencyInfoEntity r9 = (com.kubi.data.entity.AlphaCurrencyInfoEntity) r9
            if (r9 != 0) goto L61
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "getAlphaCurrencyInfo failed: currency "
            r9.append(r13)
            r9.append(r11)
            java.lang.String r11 = " not found"
            r9.append(r11)
            java.lang.String r1 = r9.toString()
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.invoke(r10, r0)
            goto L68
        L61:
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo r9 = r7.m31580B(r9)
            r14.invoke(r9, r10)
        L68:
            java.lang.Throwable r2 = kotlin.Result.m103847exceptionOrNullimpl(r8)
            if (r2 == 0) goto L7d
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            r5 = 12
            r6 = 0
            java.lang.String r1 = "getAlphaCurrencyInfo failed"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.invoke(r10, r0)
        L7d:
            return
    }

    @Override // d00.InterfaceC36569e0
    /* JADX INFO: renamed from: o */
    public void mo31595o(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency, ? super com.kubi.sdk.protocol.ProtocolException, kotlin.Unit> r12) {
            r7 = this;
            java.lang.String r9 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r8 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "currency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r8)
            java.lang.String r8 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L26
            com.kubi.loan.api.ILoanService$Companion r8 = com.kubi.loan.api.ILoanService.f32363a     // Catch: java.lang.Throwable -> L26
            com.kubi.loan.api.ILoanService r8 = r8.get()     // Catch: java.lang.Throwable -> L26
            r9 = 0
            com.kubi.loan.api.entity.LeverCoinConfig r8 = r8.mo37707f(r11, r9)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)     // Catch: java.lang.Throwable -> L26
            goto L32
        L26:
            r0 = move-exception
            r8 = r0
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m103844constructorimpl(r8)
        L32:
            boolean r9 = kotlin.Result.m103851isSuccessimpl(r8)
            r10 = 0
            if (r9 == 0) goto L53
            r9 = r8
            com.kubi.loan.api.entity.LeverCoinConfig r9 = (com.kubi.loan.api.entity.LeverCoinConfig) r9
            if (r9 == 0) goto L4f
            com.kubi.jsbridge.impl.biz.trade.j r0 = com.kubi.jsbridge.impl.biz.trade.C15226j.f27387a
            gf.n r1 = gf.C37890n.f85269a
            java.lang.String r2 = r9.getCurrency()
            com.kubi.data.entity.CoinInfoEntity r1 = r1.m85613u(r2)
            com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency r9 = r0.m31610d(r9, r1, r11)
            goto L50
        L4f:
            r9 = r10
        L50:
            r12.invoke(r9, r10)
        L53:
            java.lang.Throwable r2 = kotlin.Result.m103847exceptionOrNullimpl(r8)
            if (r2 == 0) goto L68
            com.kubi.sdk.protocol.ProtocolException r0 = new com.kubi.sdk.protocol.ProtocolException
            r5 = 12
            r6 = 0
            java.lang.String r1 = "getMarginCurrency failed"
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.invoke(r10, r0)
        L68:
            return
    }
}
