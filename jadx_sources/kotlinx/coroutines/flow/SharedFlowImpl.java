package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41724q;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.InterfaceC41550b1;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC41647a;
import kotlinx.coroutines.flow.internal.AbstractC41649c;
import kotlinx.coroutines.flow.internal.C41648b;
import kotlinx.coroutines.flow.internal.InterfaceC41655i;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010 \n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001gB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010$\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J-\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b/\u0010\u0016J\u0017\u00100\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u0010\u0016J\u000f\u00101\u001a\u00020\u0017H\u0002¢\u0006\u0004\b1\u0010(J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u001aH\u0002¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J9\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e2\u0010\u00109\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010\u001e2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b>\u0010\u0019J\u0017\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ/\u0010G\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001aH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0017H\u0002¢\u0006\u0004\bI\u0010(J\u0019\u0010K\u001a\u0004\u0018\u0001052\u0006\u0010J\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010\u0001\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0001\u0010MJ\u0019\u0010O\u001a\u0004\u0018\u0001052\u0006\u0010N\u001a\u00020\u001aH\u0002¢\u0006\u0004\bO\u0010PJ\u0018\u0010Q\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bQ\u0010RJ3\u0010T\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001e2\u0014\u0010S\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001eH\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR \u0010\\\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010TR\u0016\u0010e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010TR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001a\u0010m\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bl\u0010(\u001a\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u001cR\u0014\u0010r\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010qR\u0014\u0010u\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u001cR\u0014\u0010w\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u001c¨\u0006x"}, m90084d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/t;", "Lkotlinx/coroutines/flow/m;", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/internal/i;", "", "replay", "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "d", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "X", "()J", "oldIndex", "", "Lkotlin/coroutines/Continuation;", ExifInterface.LONGITUDE_WEST, "(J)[Lkotlin/coroutines/Continuation;", "C", "()Lkotlinx/coroutines/flow/t;", "size", "D", "(I)[Lkotlinx/coroutines/flow/t;", "b", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/flow/e;", "c", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.LONGITUDE_EAST, "newHead", "B", "(J)V", "", "item", "H", "(Ljava/lang/Object;)V", "curBuffer", "curSize", "newSize", "Q", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "G", "Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "emitter", "y", "(Lkotlinx/coroutines/flow/SharedFlowImpl$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(JJJJ)V", "z", "slot", "U", "(Lkotlinx/coroutines/flow/t;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/t;)J", "index", "M", "(J)Ljava/lang/Object;", "x", "(Lkotlinx/coroutines/flow/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumesIn", "I", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "f", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lkotlinx/coroutines/channels/BufferOverflow;", "i", "[Ljava/lang/Object;", "buffer", "j", "J", "replayIndex", "k", "minCollectorIndex", CmcdData.Factory.STREAM_TYPE_LIVE, "bufferSize", "m", "queueSize", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "replayCache", "L", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "K", TtmlNode.TAG_HEAD, "O", "()I", "replaySize", "P", "totalSize", "bufferEndIndex", "N", "queueEndIndex", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n29#2:747\n29#2:750\n29#2:769\n29#2:773\n29#2:782\n29#2:793\n29#2:804\n16#3:748\n16#3:751\n16#3:770\n16#3:774\n16#3:783\n16#3:794\n16#3:805\n375#4:749\n1#5:752\n91#6,2:753\n93#6,2:756\n95#6:759\n91#6,2:775\n93#6,2:778\n95#6:781\n91#6,2:797\n93#6,2:800\n95#6:803\n13402#7:755\n13403#7:758\n13402#7:777\n13403#7:780\n13402#7:799\n13403#7:802\n426#8,9:760\n435#8,2:771\n426#8,9:784\n435#8,2:795\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n366#1:747\n406#1:750\n500#1:769\n521#1:773\n641#1:782\n676#1:793\n704#1:804\n366#1:748\n406#1:751\n500#1:770\n521#1:774\n641#1:783\n676#1:794\n704#1:805\n388#1:749\n468#1:753,2\n468#1:756,2\n468#1:759\n544#1:775,2\n544#1:778,2\n544#1:781\n691#1:797,2\n691#1:800,2\n691#1:803\n468#1:755\n468#1:758\n544#1:777\n544#1:780\n691#1:799\n691#1:802\n498#1:760,9\n498#1:771,2\n675#1:784,9\n675#1:795,2\n*E\n"})
public class SharedFlowImpl<T> extends AbstractC41647a<C41675t> implements InterfaceC41668m<T>, InterfaceC41630a<T>, InterfaceC41655i<T> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int replay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int bufferCapacity;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Object[] buffer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long replayIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public long minCollectorIndex;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int bufferSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int queueSize;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$a */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "Lkotlinx/coroutines/b1;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "flow", "", "index", "", "value", "Lkotlin/coroutines/Continuation;", "", "cont", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "()V", "b", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "c", "J", "d", "Ljava/lang/Object;", "e", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41624a implements InterfaceC41550b1 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final SharedFlowImpl<?> flow;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        public long index;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object value;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Continuation<Unit> cont;

        @Override // kotlinx.coroutines.InterfaceC41550b1
        public void dispose() {
            this.flow.m90859y(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C41624a(@NotNull SharedFlowImpl<?> sharedFlowImpl, long j11, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j11;
            this.value = obj;
            this.cont = continuation;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1 */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.SharedFlowImpl", m90122f = "SharedFlow.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m90124l = {387, 394, 397}, m90125m = "collect$suspendImpl", m90126n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C416261<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C416261(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super C416261> continuation) {
            super(continuation);
            this.this$0 = sharedFlowImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.m90819A(this.this$0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: I */
    public final Continuation<Unit>[] m90837I(Continuation<Unit>[] resumesIn) {
        AbstractC41649c[] abstractC41649cArr;
        C41675t c41675t;
        Continuation<? super Unit> continuation;
        int length = resumesIn.length;
        if (this.nCollectors != 0 && (abstractC41649cArr = this.slots) != null) {
            int length2 = abstractC41649cArr.length;
            int i11 = 0;
            while (i11 < length2) {
                AbstractC41649c abstractC41649c = abstractC41649cArr[i11];
                if (abstractC41649c == null || (continuation = (c41675t = (C41675t) abstractC41649c).cont) == null || m90848T(c41675t) < 0) {
                    resumesIn = resumesIn;
                } else {
                    if (length >= resumesIn.length) {
                        resumesIn = resumesIn;
                        resumesIn = resumesIn;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) resumesIn, Math.max(2, resumesIn.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        resumesIn = objArrCopyOf;
                    }
                    resumesIn = resumesIn;
                    resumesIn = resumesIn;
                    ((Continuation[]) resumesIn)[length] = continuation;
                    c41675t.cont = null;
                    length++;
                }
                i11++;
                resumesIn = resumesIn;
            }
            resumesIn = resumesIn;
        }
        return (Continuation[]) resumesIn;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<T> mo86421a() {
        synchronized (this) {
            int iM90843O = m90843O();
            if (iM90843O == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(iM90843O);
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            for (int i11 = 0; i11 < iM90843O; i11++) {
                arrayList.add(C41674s.m91005f(objArr, this.replayIndex + ((long) i11)));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m
    /* JADX INFO: renamed from: b */
    public void mo90853b() throws Throwable {
        synchronized (this) {
            try {
                try {
                    m90850V(m90838J(), this.minCollectorIndex, m90838J(), m90842N());
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m
    /* JADX INFO: renamed from: d */
    public boolean mo90855d(T value) {
        int i11;
        boolean z11;
        Continuation<Unit>[] continuationArrM90837I = C41648b.f91694a;
        synchronized (this) {
            if (m90846R(value)) {
                continuationArrM90837I = m90837I(continuationArrM90837I);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrM90837I) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: y */
    public final void m90859y(C41624a emitter) {
        synchronized (this) {
            if (emitter.index < m90839K()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            if (C41674s.m91005f(objArr, emitter.index) != emitter) {
                return;
            }
            C41674s.m91006g(objArr, emitter.index, C41674s.f91714a);
            m90860z();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$b */
    /* JADX INFO: compiled from: SharedFlow.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class C41625b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).m90870a(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <T> Object m90819A(SharedFlowImpl<T> sharedFlowImpl, InterfaceC41635f<? super T> interfaceC41635f, Continuation<?> continuation) throws Throwable {
        C416261 c416261;
        SharedFlowImpl<T> sharedFlowImpl2;
        Throwable th2;
        C41675t c41675t;
        InterfaceC41635f<? super T> interfaceC41635f2;
        InterfaceC41775x1 interfaceC41775x1;
        InterfaceC41635f interfaceC41635f3;
        if (continuation instanceof C416261) {
            c416261 = (C416261) continuation;
            int i11 = c416261.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c416261.label = i11 - Integer.MIN_VALUE;
            } else {
                c416261 = new C416261(sharedFlowImpl, continuation);
            }
        } else {
            c416261 = new C416261(sharedFlowImpl, continuation);
        }
        Object obj = c416261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c416261.label;
        if (i12 != 0) {
            if (i12 == 1) {
                c41675t = (C41675t) c416261.L$2;
                InterfaceC41635f<? super T> interfaceC41635f4 = (InterfaceC41635f) c416261.L$1;
                SharedFlowImpl<T> sharedFlowImpl3 = (SharedFlowImpl) c416261.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    interfaceC41635f2 = interfaceC41635f4;
                    sharedFlowImpl = sharedFlowImpl3;
                    try {
                        interfaceC41775x1 = (InterfaceC41775x1) c416261.get$context().get(InterfaceC41775x1.INSTANCE);
                        interfaceC41635f3 = interfaceC41635f2;
                    } catch (Throwable th3) {
                        sharedFlowImpl2 = sharedFlowImpl;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    sharedFlowImpl2 = sharedFlowImpl3;
                }
            } else {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC41775x1 interfaceC41775x2 = (InterfaceC41775x1) c416261.L$3;
                c41675t = (C41675t) c416261.L$2;
                InterfaceC41635f interfaceC41635f5 = (InterfaceC41635f) c416261.L$1;
                sharedFlowImpl2 = (SharedFlowImpl) c416261.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    interfaceC41635f3 = interfaceC41635f5;
                    interfaceC41775x1 = interfaceC41775x2;
                    sharedFlowImpl = sharedFlowImpl2;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            sharedFlowImpl2.m90973k(c41675t);
            throw th2;
        }
        ResultKt.throwOnFailure(obj);
        C41675t c41675tM90972h = sharedFlowImpl.m90972h();
        try {
            if (interfaceC41635f instanceof SubscribedFlowCollector) {
                c416261.L$0 = sharedFlowImpl;
                c416261.L$1 = interfaceC41635f;
                c416261.L$2 = c41675tM90972h;
                c416261.label = 1;
            }
            interfaceC41635f2 = interfaceC41635f;
            c41675t = c41675tM90972h;
            interfaceC41775x1 = (InterfaceC41775x1) c416261.get$context().get(InterfaceC41775x1.INSTANCE);
            interfaceC41635f3 = interfaceC41635f2;
        } catch (Throwable th6) {
            sharedFlowImpl2 = sharedFlowImpl;
            th2 = th6;
            c41675t = c41675tM90972h;
        }
        while (true) {
            Object objM90849U = sharedFlowImpl.m90849U(c41675t);
            if (objM90849U == C41674s.f91714a) {
                c416261.L$0 = sharedFlowImpl;
                c416261.L$1 = interfaceC41635f3;
                c416261.L$2 = c41675t;
                c416261.L$3 = interfaceC41775x1;
                c416261.label = 2;
                if (sharedFlowImpl.m90858x(c41675t, c416261) == coroutine_suspended) {
                    break;
                }
            } else {
                if (interfaceC41775x1 != null) {
                    C41783z1.m91407m(interfaceC41775x1);
                }
                c416261.L$0 = sharedFlowImpl;
                c416261.L$1 = interfaceC41635f3;
                c416261.L$2 = c41675t;
                c416261.L$3 = interfaceC41775x1;
                c416261.label = 3;
                if (interfaceC41635f3.emit(objM90849U, c416261) == coroutine_suspended) {
                    break;
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC41647a
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C41675t mo90856i() {
        return new C41675t();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC41647a
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C41675t[] mo90857j(int size) {
        return new C41675t[size];
    }

    /* JADX INFO: renamed from: E */
    public final void m90834E() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        C41674s.m91006g(objArr, m90839K(), null);
        this.bufferSize--;
        long jM90839K = m90839K() + 1;
        if (this.replayIndex < jM90839K) {
            this.replayIndex = jM90839K;
        }
        if (this.minCollectorIndex < jM90839K) {
            m90831B(jM90839K);
        }
    }

    /* JADX INFO: renamed from: G */
    public final Object m90835G(T t11, Continuation<? super Unit> continuation) throws Throwable {
        Throwable th2;
        Continuation<Unit>[] continuationArrM90837I;
        C41624a c41624a;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        Continuation<Unit>[] continuationArrM90837I2 = C41648b.f91694a;
        synchronized (this) {
            try {
                if (m90846R(t11)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
                        continuationArrM90837I = m90837I(continuationArrM90837I2);
                        c41624a = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        c41624a = new C41624a(this, m90839K() + ((long) m90844P()), t11, c41716o);
                        m90836H(c41624a);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            continuationArrM90837I2 = m90837I(continuationArrM90837I2);
                        }
                        continuationArrM90837I = continuationArrM90837I2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (c41624a != null) {
                    C41724q.m91186a(c41716o, c41624a);
                }
                for (Continuation<Unit> continuation2 : continuationArrM90837I) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
                    }
                }
                Object objM91171w = c41716o.m91171w();
                if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final long m90839K() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    /* JADX INFO: renamed from: L */
    public final T m90840L() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        return (T) C41674s.m91005f(objArr, (this.replayIndex + ((long) m90843O())) - 1);
    }

    /* JADX INFO: renamed from: M */
    public final Object m90841M(long index) {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        Object objM91005f = C41674s.m91005f(objArr, index);
        return objM91005f instanceof C41624a ? ((C41624a) objM91005f).value : objM91005f;
    }

    /* JADX INFO: renamed from: P */
    public final int m90844P() {
        return this.bufferSize + this.queueSize;
    }

    /* JADX INFO: renamed from: Q */
    public final Object[] m90845Q(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long jM90839K = m90839K();
            for (int i11 = 0; i11 < curSize; i11++) {
                long j11 = ((long) i11) + jM90839K;
                C41674s.m91006g(objArr, j11, C41674s.m91005f(curBuffer, j11));
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m90847S(T value) {
        if (this.replay == 0) {
            return true;
        }
        m90836H(value);
        int i11 = this.bufferSize + 1;
        this.bufferSize = i11;
        if (i11 > this.replay) {
            m90834E();
        }
        this.minCollectorIndex = m90839K() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: renamed from: T */
    public final long m90848T(C41675t slot) {
        long j11 = slot.index;
        if (j11 >= m90838J() && (this.bufferCapacity > 0 || j11 > m90839K() || this.queueSize == 0)) {
            return -1L;
        }
        return j11;
    }

    /* JADX INFO: renamed from: U */
    public final Object m90849U(C41675t slot) {
        Object obj;
        Continuation<Unit>[] continuationArrM90851W = C41648b.f91694a;
        synchronized (this) {
            try {
                long jM90848T = m90848T(slot);
                if (jM90848T < 0) {
                    obj = C41674s.f91714a;
                } else {
                    long j11 = slot.index;
                    Object objM90841M = m90841M(jM90848T);
                    slot.index = jM90848T + 1;
                    continuationArrM90851W = m90851W(j11);
                    obj = objM90841M;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation<Unit> continuation : continuationArrM90851W) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final Continuation<Unit>[] m90851W(long oldIndex) {
        long j11;
        long j12;
        long j13;
        AbstractC41649c[] abstractC41649cArr;
        if (oldIndex > this.minCollectorIndex) {
            return C41648b.f91694a;
        }
        long jM90839K = m90839K();
        long j14 = ((long) this.bufferSize) + jM90839K;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j14++;
        }
        if (this.nCollectors != 0 && (abstractC41649cArr = this.slots) != null) {
            for (AbstractC41649c abstractC41649c : abstractC41649cArr) {
                if (abstractC41649c != null) {
                    long j15 = ((C41675t) abstractC41649c).index;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.minCollectorIndex) {
            return C41648b.f91694a;
        }
        long jM90838J = m90838J();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (jM90838J - j14))) : this.queueSize;
        Continuation<Unit>[] continuationArr = C41648b.f91694a;
        long j16 = ((long) this.queueSize) + jM90838J;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            j13 = 1;
            long j17 = jM90838J;
            int i11 = 0;
            while (true) {
                if (jM90838J >= j16) {
                    j11 = jM90839K;
                    j12 = j14;
                    jM90838J = j17;
                    break;
                }
                Object objM91005f = C41674s.m91005f(objArr, jM90838J);
                j11 = jM90839K;
                C43045a0 c43045a0 = C41674s.f91714a;
                if (objM91005f != c43045a0) {
                    Intrinsics.checkNotNull(objM91005f, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C41624a c41624a = (C41624a) objM91005f;
                    int i12 = i11 + 1;
                    j12 = j14;
                    continuationArr[i11] = c41624a.cont;
                    C41674s.m91006g(objArr, jM90838J, c43045a0);
                    C41674s.m91006g(objArr, j17, c41624a.value);
                    long j18 = j17 + 1;
                    if (i12 >= iMin) {
                        jM90838J = j18;
                        break;
                    }
                    i11 = i12;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                jM90838J++;
                jM90839K = j11;
                j14 = j12;
            }
        } else {
            j11 = jM90839K;
            j12 = j14;
            j13 = 1;
        }
        Continuation<Unit>[] continuationArr2 = continuationArr;
        int i13 = (int) (jM90838J - j11);
        long j19 = getNCollectors() == 0 ? jM90838J : j12;
        long jMax = Math.max(this.replayIndex, jM90838J - ((long) Math.min(this.replay, i13)));
        if (this.bufferCapacity == 0 && jMax < j16) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(C41674s.m91005f(objArr2, jMax), C41674s.f91714a)) {
                jM90838J += j13;
                jMax += j13;
            }
        }
        m90850V(jMax, j19, jM90838J, j16);
        m90860z();
        return !(continuationArr2.length == 0) ? m90837I(continuationArr2) : continuationArr2;
    }

    /* JADX INFO: renamed from: X */
    public final long m90852X() {
        long j11 = this.replayIndex;
        if (j11 < this.minCollectorIndex) {
            this.minCollectorIndex = j11;
        }
        return j11;
    }

    /* JADX INFO: renamed from: x */
    public final Object m90858x(C41675t c41675t, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        synchronized (this) {
            try {
                if (m90848T(c41675t) < 0) {
                    c41675t.cont = c41716o;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public final void m90860z() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && C41674s.m91005f(objArr, (m90839K() + ((long) m90844P())) - 1) == C41674s.f91714a) {
                this.queueSize--;
                C41674s.m91006g(objArr, m90839K() + ((long) m90844P()), null);
            }
        }
    }

    public SharedFlowImpl(int i11, int i12, @NotNull BufferOverflow bufferOverflow) {
        this.replay = i11;
        this.bufferCapacity = i12;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ <T> Object m90820F(SharedFlowImpl<T> sharedFlowImpl, T t11, Continuation<? super Unit> continuation) throws Throwable {
        if (sharedFlowImpl.mo90855d(t11)) {
            return Unit.INSTANCE;
        }
        Object objM90835G = sharedFlowImpl.m90835G(t11, continuation);
        if (objM90835G == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM90835G;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m90831B(long newHead) {
        AbstractC41649c[] abstractC41649cArr;
        if (this.nCollectors != 0 && (abstractC41649cArr = this.slots) != null) {
            for (AbstractC41649c abstractC41649c : abstractC41649cArr) {
                if (abstractC41649c != null) {
                    C41675t c41675t = (C41675t) abstractC41649c;
                    long j11 = c41675t.index;
                    if (j11 >= 0 && j11 < newHead) {
                        c41675t.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    /* JADX INFO: renamed from: H */
    public final void m90836H(Object item) {
        int iM90844P = m90844P();
        Object[] objArrM90845Q = this.buffer;
        if (objArrM90845Q == null) {
            objArrM90845Q = m90845Q(null, 0, 2);
        } else if (iM90844P >= objArrM90845Q.length) {
            objArrM90845Q = m90845Q(objArrM90845Q, iM90844P, objArrM90845Q.length * 2);
        }
        C41674s.m91006g(objArrM90845Q, m90839K() + ((long) iM90844P), item);
    }

    /* JADX INFO: renamed from: J */
    public final long m90838J() {
        return m90839K() + ((long) this.bufferSize);
    }

    /* JADX INFO: renamed from: N */
    public final long m90842N() {
        return m90839K() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    /* JADX INFO: renamed from: O */
    public final int m90843O() {
        return (int) ((m90839K() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m90846R(T value) {
        if (getNCollectors() == 0) {
            return m90847S(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i11 = C41625b.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return true;
                }
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return false;
            }
        }
        m90836H(value);
        int i12 = this.bufferSize + 1;
        this.bufferSize = i12;
        if (i12 > this.bufferCapacity) {
            m90834E();
        }
        if (m90843O() > this.replay) {
            m90850V(this.replayIndex + 1, this.minCollectorIndex, m90838J(), m90842N());
        }
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final void m90850V(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long jM90839K = m90839K(); jM90839K < jMin; jM90839K++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            C41674s.m91006g(objArr, jM90839K, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC41655i
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC41634e<T> mo90854c(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return C41674s.m91004e(this, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r, kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<?> continuation) {
        return m90819A(this, interfaceC41635f, continuation);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41668m, kotlinx.coroutines.flow.InterfaceC41635f
    @Nullable
    public Object emit(T t11, @NotNull Continuation<? super Unit> continuation) {
        return m90820F(this, t11, continuation);
    }
}
