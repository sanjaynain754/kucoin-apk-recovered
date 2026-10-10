package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC41647a;
import kotlinx.coroutines.flow.internal.C41658l;
import kotlinx.coroutines.flow.internal.InterfaceC41655i;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u000fR\u0016\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u0010\nR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0007098\u0002X\u0082\u0004¨\u0006;"}, m90084d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/y;", "Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/internal/i;", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "d", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "()Lkotlinx/coroutines/flow/y;", "", "size", "", "o", "(I)[Lkotlinx/coroutines/flow/y;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e;", "c", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "expectedState", "newState", "q", "f", "I", JPushConstants.Operation.KEY_SEQUENCE, "getValue", "()Ljava/lang/Object;", "setValue", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "replayCache", "Lkotlinx/atomicfu/AtomicRef;", "_state", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,433:1\n14#2:434\n14#2:442\n29#3:435\n29#3:439\n16#4:436\n16#4:440\n13402#5,2:437\n375#6:441\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n320#1:434\n401#1:442\n329#1:435\n357#1:439\n329#1:436\n357#1:440\n353#1:437,2\n390#1:441\n*E\n"})
public final class StateFlowImpl<T> extends AbstractC41647a<C41680y> implements InterfaceC41669n<T>, InterfaceC41630a<T>, InterfaceC41655i<T> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91649g = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1 */
    /* JADX INFO: compiled from: StateFlow.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.StateFlowImpl", m90122f = "StateFlow.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {389, 401, 406}, m90125m = "collect", m90126n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C416281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StateFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C416281(StateFlowImpl<T> stateFlowImpl, Continuation<? super C416281> continuation) {
            super(continuation);
            this.this$0 = stateFlowImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m90869q(Object expectedState, Object newState) {
        int i11;
        C41680y[] c41680yArrM90975m;
        synchronized (this) {
            Object obj = f91649g.get(this);
            if (expectedState != null && !Intrinsics.areEqual(obj, expectedState)) {
                return false;
            }
            if (Intrinsics.areEqual(obj, newState)) {
                return true;
            }
            f91649g.set(this, newState);
            int i12 = this.sequence;
            if ((i12 & 1) != 0) {
                this.sequence = i12 + 2;
                return true;
            }
            int i13 = i12 + 1;
            this.sequence = i13;
            C41680y[] c41680yArrM90975m2 = m90975m();
            Unit unit = Unit.INSTANCE;
            while (true) {
                C41680y[] c41680yArr = c41680yArrM90975m2;
                if (c41680yArr != null) {
                    for (C41680y c41680y : c41680yArr) {
                        if (c41680y != null) {
                            c41680y.m91017g();
                        }
                    }
                }
                synchronized (this) {
                    i11 = this.sequence;
                    if (i11 == i13) {
                        this.sequence = i13 + 1;
                        return true;
                    }
                    c41680yArrM90975m = m90975m();
                    Unit unit2 = Unit.INSTANCE;
                }
                c41680yArrM90975m2 = c41680yArrM90975m;
                i13 = i11;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m
    /* JADX INFO: renamed from: b */
    public void mo90853b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: all -> 0x0043, PHI: r2 r6 r7 r8 r11
      0x00ac: PHI (r2v8 kotlinx.coroutines.x1) = (r2v6 kotlinx.coroutines.x1), (r2v7 kotlinx.coroutines.x1), (r2v7 kotlinx.coroutines.x1), (r2v13 kotlinx.coroutines.x1) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r6v7 ??) = (r6v14 ??), (r6v15 ??), (r6v16 ??), (r6v17 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r7v2 ??) = (r7v0 ??), (r7v7 ??), (r7v8 ??), (r7v9 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r8v6 kotlinx.coroutines.flow.StateFlowImpl<T>) = 
      (r8v4 kotlinx.coroutines.flow.StateFlowImpl<T>)
      (r8v5 kotlinx.coroutines.flow.StateFlowImpl<T>)
      (r8v5 kotlinx.coroutines.flow.StateFlowImpl<T>)
      (r8v12 kotlinx.coroutines.flow.StateFlowImpl<T>)
     binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v7 java.lang.Object) = (r11v5 java.lang.Object), (r11v6 java.lang.Object), (r11v6 java.lang.Object), (r11v19 java.lang.Object) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlinx.coroutines.flow.y] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.InterfaceC41673r, kotlinx.coroutines.flow.InterfaceC41634e
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.InterfaceC41635f<? super T> r11, @org.jetbrains.annotations.NotNull p852kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41669n
    public boolean compareAndSet(T expect, T update) {
        if (expect == null) {
            expect = (T) C41658l.f91700a;
        }
        if (update == null) {
            update = (T) C41658l.f91700a;
        }
        return m90869q(expect, update);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41669n, kotlinx.coroutines.flow.InterfaceC41678w
    public T getValue() {
        C43045a0 c43045a0 = C41658l.f91700a;
        T t11 = (T) f91649g.get(this);
        if (t11 == c43045a0) {
            return null;
        }
        return t11;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC41647a
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C41680y mo90856i() {
        return new C41680y();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC41647a
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C41680y[] mo90857j(int size) {
        return new C41680y[size];
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41669n
    public void setValue(T t11) {
        if (t11 == null) {
            t11 = (T) C41658l.f91700a;
        }
        m90869q(null, t11);
    }

    public StateFlowImpl(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<T> mo86421a() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC41655i
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC41634e<T> mo90854c(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return C41679x.m91012d(this, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m
    /* JADX INFO: renamed from: d */
    public boolean mo90855d(T value) {
        setValue(value);
        return true;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m, kotlinx.coroutines.flow.InterfaceC41635f
    @Nullable
    public Object emit(T t11, @NotNull Continuation<? super Unit> continuation) {
        setValue(t11);
        return Unit.INSTANCE;
    }
}
