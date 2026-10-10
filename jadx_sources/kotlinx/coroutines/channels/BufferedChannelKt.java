package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.primitives.Longs;
import com.kubi.payment.fast.data.entities.RecurringPlan;
import kotlinx.coroutines.InterfaceC41708m;
import og0.C43045a0;
import og0.C43051d0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.reflect.KFunction;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001ax\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002O\b\u0002\u0010\u0015\u001aI\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#\"\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010*\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010,\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)\"\u0014\u00100\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00104\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/\"\u0014\u00106\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/\"\u0014\u00108\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010/\"\u0014\u0010:\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010/\"\u0014\u0010<\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010/\"\u0014\u0010>\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010/\"\u001a\u0010B\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u0010A\"\u0014\u0010D\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010/\"\u0014\u0010F\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010/\"\u0014\u0010H\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010/\"\u0014\u0010J\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010/\"\u0014\u0010L\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010/\"\u0014\u0010N\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010/\"\u0014\u0010P\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010/¨\u0006Q"}, m90084d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlin/reflect/KFunction2;", "", "Lkotlinx/coroutines/channels/h;", "y", "()Lkotlin/reflect/KFunction;", "id", "prev", "x", "(JLkotlinx/coroutines/channels/h;)Lkotlinx/coroutines/channels/h;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m;", "value", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "onCancellation", "", "B", "(Lkotlinx/coroutines/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Z", "", "capacity", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(I)J", "counter", "closeStatus", "w", "(JI)J", "pauseEB", "v", "(JZ)J", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/coroutines/channels/h;", "NULL_SEGMENT", "b", "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Log0/a0;", "d", "Log0/a0;", "BUFFERED", "e", "IN_BUFFER", "f", "RESUMING_BY_RCV", "g", "RESUMING_BY_EB", CmcdData.Factory.STREAMING_FORMAT_HLS, "POISONED", "i", "DONE_RCV", "j", "INTERRUPTED_SEND", "k", "INTERRUPTED_RCV", CmcdData.Factory.STREAM_TYPE_LIVE, "z", "()Log0/a0;", "CHANNEL_CLOSED", "m", RecurringPlan.SUSPENDED, "n", "SUSPEND_NO_WAITER", "o", "FAILED", "p", "NO_RECEIVE_RESULT", "q", "CLOSE_HANDLER_CLOSED", "r", "CLOSE_HANDLER_INVOKED", CmcdData.Factory.STREAMING_FORMAT_SS, "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class BufferedChannelKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41569h<Object> f91489a = new C41569h<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    @JvmField
    public static final int f91490b = C43051d0.m94568e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    public static final int f91491c = C43051d0.m94568e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final C43045a0 f91492d = new C43045a0("BUFFERED");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C43045a0 f91493e = new C43045a0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C43045a0 f91494f = new C43045a0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final C43045a0 f91495g = new C43045a0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final C43045a0 f91496h = new C43045a0("POISONED");

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final C43045a0 f91497i = new C43045a0("DONE_RCV");

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final C43045a0 f91498j = new C43045a0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final C43045a0 f91499k = new C43045a0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final C43045a0 f91500l = new C43045a0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final C43045a0 f91501m = new C43045a0(RecurringPlan.SUSPENDED);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final C43045a0 f91502n = new C43045a0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final C43045a0 f91503o = new C43045a0("FAILED");

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final C43045a0 f91504p = new C43045a0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final C43045a0 f91505q = new C43045a0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final C43045a0 f91506r = new C43045a0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final C43045a0 f91507s = new C43045a0("NO_CLOSE_CAUSE");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static final <T> boolean m90640B(InterfaceC41708m<? super T> interfaceC41708m, T t11, Function3<? super Throwable, ? super T, ? super CoroutineContext, Unit> function3) {
        Object objMo91115G = interfaceC41708m.mo91115G(t11, null, function3);
        if (objMo91115G == null) {
            return false;
        }
        interfaceC41708m.mo91118s(objMo91115G);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static final long m90664w(long j11, int i11) {
        return (((long) i11) << 60) + j11;
    }

    /* JADX INFO: renamed from: A */
    public static final long m90639A(int i11) {
        if (i11 == 0) {
            return 0L;
        }
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m90641C(InterfaceC41708m interfaceC41708m, Object obj, Function3 function3, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            function3 = null;
        }
        return m90640B(interfaceC41708m, obj, function3);
    }

    /* JADX INFO: renamed from: v */
    public static final long m90663v(long j11, boolean z11) {
        return (z11 ? Longs.MAX_POWER_OF_TWO : 0L) + j11;
    }

    /* JADX INFO: renamed from: x */
    public static final <E> C41569h<E> m90665x(long j11, C41569h<E> c41569h) {
        return new C41569h<>(j11, c41569h, c41569h.m90704y(), 0);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static final <E> KFunction<C41569h<E>> m90666y() {
        return BufferedChannelKt$createSegmentFunction$1.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final C43045a0 m90667z() {
        return f91500l;
    }
}
