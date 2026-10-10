package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41717o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.InterfaceC41576o;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R6\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/i;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/e;", "j", "()Lkotlinx/coroutines/flow/e;", "c", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "i", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/channels/m;", "scope", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/channels/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/channels/o;", "m", "(Lkotlinx/coroutines/m0;)Lkotlinx/coroutines/channels/o;", "Lkotlinx/coroutines/flow/f;", "collector", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "toString", "b", "Lkotlin/coroutines/CoroutineContext;", "I", "d", "Lkotlinx/coroutines/channels/BufferOverflow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "k", "()Lkotlin/jvm/functions/Function2;", "collectToFun", CmcdData.Factory.STREAM_TYPE_LIVE, "()I", "produceCapacity", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
public abstract class ChannelFlow<T> implements InterfaceC41655i<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final int capacity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m90122f = "ChannelFlow.kt", m90123i = {}, m90124l = {119}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C416392 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41635f<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C416392(InterfaceC41635f<? super T> interfaceC41635f, ChannelFlow<T> channelFlow, Continuation<? super C416392> continuation) {
            super(2, continuation);
            this.$collector = interfaceC41635f;
            this.this$0 = channelFlow;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C416392 c416392 = new C416392(this.$collector, this.this$0, continuation);
            c416392.L$0 = obj;
            return c416392;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C416392) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                InterfaceC41635f<T> interfaceC41635f = this.$collector;
                InterfaceC41576o<T> interfaceC41576oMo90874m = this.this$0.mo90874m(interfaceC41709m0);
                this.label = 1;
                if (C41636g.m90877A(interfaceC41635f, interfaceC41576oMo90874m, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public String mo90872f() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public abstract Object mo90741h(@NotNull InterfaceC41574m<? super T> interfaceC41574m, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract ChannelFlow<T> mo90742i(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow);

    @Nullable
    /* JADX INFO: renamed from: j */
    public InterfaceC41634e<T> mo90873j() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ <T> Object m90950g(ChannelFlow<T> channelFlow, InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
        Object objM91130f = C41713n0.m91130f(new C416392(interfaceC41635f, channelFlow, null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // kotlinx.coroutines.flow.internal.InterfaceC41655i
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC41634e<T> mo90854c(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        CoroutineContext coroutineContextPlus = context.plus(this.context);
        if (onBufferOverflow == BufferOverflow.SUSPEND) {
            int i11 = this.capacity;
            if (i11 != -3) {
                if (capacity == -3) {
                    capacity = i11;
                } else if (i11 != -2) {
                    if (capacity == -2) {
                        capacity = i11;
                    } else {
                        capacity += i11;
                        if (capacity < 0) {
                            capacity = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (Intrinsics.areEqual(coroutineContextPlus, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : mo90742i(coroutineContextPlus, capacity, onBufferOverflow);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Function2<InterfaceC41574m<? super T>, Continuation<? super Unit>, Object> m90951k() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    /* JADX INFO: renamed from: l */
    public final int m90952l() {
        int i11 = this.capacity;
        if (i11 == -3) {
            return -2;
        }
        return i11;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC41576o<T> mo90874m(@NotNull InterfaceC41709m0 scope) {
        return ProduceKt.m90685e(scope, this.context, m90952l(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, m90951k(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo90872f = mo90872f();
        if (strMo90872f != null) {
            arrayList.add(strMo90872f);
        }
        if (this.context != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return C41717o0.m91174a(this) + '[' + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public ChannelFlow(@NotNull CoroutineContext coroutineContext, int i11, @NotNull BufferOverflow bufferOverflow) {
        this.context = coroutineContext;
        this.capacity = i11;
        this.onBufferOverflow = bufferOverflow;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation) {
        return m90950g(this, interfaceC41635f, continuation);
    }
}
