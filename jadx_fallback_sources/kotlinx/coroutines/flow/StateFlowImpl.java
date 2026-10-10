package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u000fR\u0016\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u0010\nR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0007098\u0002X\u0082\u0004¨\u0006;"}, m90084d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/y;", "Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/internal/i;", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "d", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "()Lkotlinx/coroutines/flow/y;", "", "size", "", "o", "(I)[Lkotlinx/coroutines/flow/y;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e;", "c", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "expectedState", "newState", "q", "f", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "", "a", "()Ljava/util/List;", "replayCache", "Lkotlinx/atomicfu/AtomicRef;", "_state", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,433:1\n14#2:434\n14#2:442\n29#3:435\n29#3:439\n16#4:436\n16#4:440\n13402#5,2:437\n375#6:441\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n320#1:434\n401#1:442\n329#1:435\n357#1:439\n329#1:436\n357#1:440\n353#1:437,2\n390#1:441\n*E\n"})
public final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractC41647a<kotlinx.coroutines.flow.C41680y> implements kotlinx.coroutines.flow.InterfaceC41669n<T>, kotlinx.coroutines.flow.InterfaceC41630a<T>, kotlinx.coroutines.flow.internal.InterfaceC41655i<T> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f91649g = null;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: renamed from: f */
    public int f91650f;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1 */
    /* JADX INFO: compiled from: StateFlow.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.StateFlowImpl", m90122f = "StateFlow.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {389, 401, 406}, m90125m = "collect", m90126n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C416281 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.StateFlowImpl<T> this$0;

        public C416281(kotlinx.coroutines.flow.StateFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlowImpl.C416281> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                kotlinx.coroutines.flow.StateFlowImpl<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = r2.collect(r0, r1)
                return r2
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state$volatile"
            java.lang.Class<kotlinx.coroutines.flow.StateFlowImpl> r2 = kotlinx.coroutines.flow.StateFlowImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.flow.StateFlowImpl.f91649g = r0
            return
    }

    public StateFlowImpl(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state$volatile = r1
            return
    }

    /* JADX INFO: renamed from: p */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater m90866p() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowImpl.f91649g
            return r0
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a */
    public java.util.List<T> mo86421a() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m
    /* JADX INFO: renamed from: b */
    public void mo90853b() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MutableStateFlow.resetReplayCache is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC41655i
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: c */
    public kotlinx.coroutines.flow.InterfaceC41634e<T> mo90854c(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            kotlinx.coroutines.flow.e r1 = kotlinx.coroutines.flow.C41679x.m91012d(r0, r1, r2, r3)
            return r1
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r, kotlinx.coroutines.flow.InterfaceC41634e
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.InterfaceC41635f<? super T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r12) {
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl.C416281
            if (r0 == 0) goto L13
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl.C416281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L77
            if (r2 == r6) goto L65
            if (r2 == r5) goto L4e
            if (r2 != r4) goto L46
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.x1 r2 = (kotlinx.coroutines.InterfaceC41775x1) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.y r6 = (kotlinx.coroutines.flow.C41680y) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.InterfaceC41635f) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L43
            goto Lac
        L43:
            r11 = move-exception
            goto Lf5
        L46:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4e:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.x1 r2 = (kotlinx.coroutines.InterfaceC41775x1) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.y r6 = (kotlinx.coroutines.flow.C41680y) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.InterfaceC41635f) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L43
            goto Ldc
        L65:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            kotlinx.coroutines.flow.y r6 = (kotlinx.coroutines.flow.C41680y) r6
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.InterfaceC41635f) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L43
            goto L9d
        L77:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.flow.internal.c r12 = r10.m90972h()
            kotlinx.coroutines.flow.y r12 = (kotlinx.coroutines.flow.C41680y) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L9b
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch: java.lang.Throwable -> L97
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L97
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L97
            r0.L$2 = r12     // Catch: java.lang.Throwable -> L97
            r0.label = r6     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.m90870a(r0)     // Catch: java.lang.Throwable -> L97
            if (r2 != r1) goto L9b
            goto Lf4
        L97:
            r11 = move-exception
            r8 = r10
            r6 = r12
            goto Lf5
        L9b:
            r8 = r10
            r6 = r12
        L9d:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.x1$b r2 = kotlinx.coroutines.InterfaceC41775x1.f91878N0     // Catch: java.lang.Throwable -> L43
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r2)     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.x1 r12 = (kotlinx.coroutines.InterfaceC41775x1) r12     // Catch: java.lang.Throwable -> L43
            r7 = r11
            r2 = r12
            r11 = r3
        Lac:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = m90866p()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = r12.get(r8)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto Lb9
            kotlinx.coroutines.C41783z1.m91407m(r2)     // Catch: java.lang.Throwable -> L43
        Lb9:
            if (r11 == 0) goto Lc1
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)     // Catch: java.lang.Throwable -> L43
            if (r9 != 0) goto Ldc
        Lc1:
            og0.a0 r11 = kotlinx.coroutines.flow.internal.C41658l.f91700a     // Catch: java.lang.Throwable -> L43
            if (r12 != r11) goto Lc7
            r11 = r3
            goto Lc8
        Lc7:
            r11 = r12
        Lc8:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L43
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L43
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L43
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L43
            r0.L$4 = r12     // Catch: java.lang.Throwable -> L43
            r0.label = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch: java.lang.Throwable -> L43
            if (r11 != r1) goto Ldb
            goto Lf4
        Ldb:
            r11 = r12
        Ldc:
            boolean r12 = r6.m91018h()     // Catch: java.lang.Throwable -> L43
            if (r12 != 0) goto Lac
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L43
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L43
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L43
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L43
            r0.L$4 = r11     // Catch: java.lang.Throwable -> L43
            r0.label = r4     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = r6.m91015e(r0)     // Catch: java.lang.Throwable -> L43
            if (r12 != r1) goto Lac
        Lf4:
            return r1
        Lf5:
            r8.m90973k(r6)
            throw r11
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41669n
    public boolean compareAndSet(T r1, T r2) {
            r0 = this;
            if (r1 != 0) goto L4
            og0.a0 r1 = kotlinx.coroutines.flow.internal.C41658l.f91700a
        L4:
            if (r2 != 0) goto L8
            og0.a0 r2 = kotlinx.coroutines.flow.internal.C41658l.f91700a
        L8:
            boolean r1 = r0.m90869q(r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m
    /* JADX INFO: renamed from: d */
    public boolean mo90855d(T r1) {
            r0 = this;
            r0.setValue(r1)
            r1 = 1
            return r1
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m, kotlinx.coroutines.flow.InterfaceC41635f
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            r0.setValue(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41669n, kotlinx.coroutines.flow.InterfaceC41678w
    public T getValue() {
            r2 = this;
            og0.a0 r0 = kotlinx.coroutines.flow.internal.C41658l.f91700a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m90866p()
            java.lang.Object r1 = r1.get(r2)
            if (r1 != r0) goto Le
            r0 = 0
            return r0
        Le:
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC41647a
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractC41649c mo90856i() {
            r1 = this;
            kotlinx.coroutines.flow.y r0 = r1.m90867n()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC41647a
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractC41649c[] mo90857j(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.y[] r1 = r0.m90868o(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: n */
    public kotlinx.coroutines.flow.C41680y m90867n() {
            r1 = this;
            kotlinx.coroutines.flow.y r0 = new kotlinx.coroutines.flow.y
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: o */
    public kotlinx.coroutines.flow.C41680y[] m90868o(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.y[] r1 = new kotlinx.coroutines.flow.C41680y[r1]
            return r1
    }

    /* JADX INFO: renamed from: q */
    public final boolean m90869q(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            r0 = 1
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m90866p()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r7 == 0) goto L17
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)     // Catch: java.lang.Throwable -> L15
            if (r7 != 0) goto L17
            monitor-exit(r6)
            return r2
        L15:
            r7 = move-exception
            goto L66
        L17:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto L1f
            monitor-exit(r6)
            return r0
        L1f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = m90866p()     // Catch: java.lang.Throwable -> L15
            r7.set(r6, r8)     // Catch: java.lang.Throwable -> L15
            int r7 = r6.f91650f     // Catch: java.lang.Throwable -> L15
            r8 = r7 & 1
            if (r8 != 0) goto L60
            int r7 = r7 + r0
            r6.f91650f = r7     // Catch: java.lang.Throwable -> L15
            kotlinx.coroutines.flow.internal.c[] r8 = r6.m90975m()     // Catch: java.lang.Throwable -> L15
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L15
            monitor-exit(r6)
        L36:
            kotlinx.coroutines.flow.y[] r8 = (kotlinx.coroutines.flow.C41680y[]) r8
            if (r8 == 0) goto L47
            int r1 = r8.length
            r3 = r2
        L3c:
            if (r3 >= r1) goto L47
            r4 = r8[r3]
            if (r4 == 0) goto L45
            r4.m91017g()
        L45:
            int r3 = r3 + r0
            goto L3c
        L47:
            monitor-enter(r6)
            int r8 = r6.f91650f     // Catch: java.lang.Throwable -> L51
            if (r8 != r7) goto L53
            int r7 = r7 + r0
            r6.f91650f = r7     // Catch: java.lang.Throwable -> L51
            monitor-exit(r6)
            return r0
        L51:
            r7 = move-exception
            goto L5e
        L53:
            kotlinx.coroutines.flow.internal.c[] r7 = r6.m90975m()     // Catch: java.lang.Throwable -> L51
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L51
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L36
        L5e:
            monitor-exit(r6)
            throw r7
        L60:
            int r7 = r7 + 2
            r6.f91650f = r7     // Catch: java.lang.Throwable -> L15
            monitor-exit(r6)
            return r0
        L66:
            monitor-exit(r6)
            throw r7
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41669n
    public void setValue(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            og0.a0 r2 = kotlinx.coroutines.flow.internal.C41658l.f91700a
        L4:
            r0 = 0
            r1.m90869q(r0, r2)
            return
    }
}
