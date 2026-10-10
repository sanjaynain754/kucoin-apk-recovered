package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C33675gh;
import kotlinx.coroutines.internal.UndeliveredElementException;
import og0.C43077t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.k */
/* JADX INFO: compiled from: ConflatedBufferedChannel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lkotlinx/coroutines/channels/k;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/BufferedChannel;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "element", C33675gh.f70005k, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "isSendOp", "x1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "w1", "n", "I", "o", "Lkotlinx/coroutines/channels/BufferOverflow;", "A0", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,90:1\n1047#2,2:91\n1009#2,2:93\n1009#2,2:95\n1047#2,2:97\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n33#1:91,2\n45#1:93,2\n77#1:95,2\n80#1:97,2\n*E\n"})
public class C41572k<E> extends BufferedChannel<E> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ <E> Object m90709v1(C41572k<E> c41572k, E e11, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionM94638c;
        Object objM90711x1 = c41572k.m90711x1(e11, true);
        if (!(objM90711x1 instanceof ChannelResult.Closed)) {
            return Unit.INSTANCE;
        }
        ChannelResult.m90672e(objM90711x1);
        Function1<E, Unit> function1 = c41572k.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionM94638c = C43077t.m94638c(function1, e11, null, 2, null)) == null) {
            throw c41572k.m90606m0();
        }
        ExceptionsKt.addSuppressed(undeliveredElementExceptionM94638c, c41572k.m90606m0());
        throw undeliveredElementExceptionM94638c;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.InterfaceC41577p
    @NotNull
    /* JADX INFO: renamed from: e */
    public Object mo90594e(E element) {
        return m90711x1(element, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: A0 */
    public boolean mo90547A0() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX INFO: renamed from: x1 */
    public final Object m90711x1(E element, boolean isSendOp) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m90710w1(element, isSendOp) : m90605l1(element);
    }

    public C41572k(int i11, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        super(i11, function1);
        this.capacity = i11;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            if (i11 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i11 + " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.InterfaceC41577p
    @Nullable
    public Object send(E e11, @NotNull Continuation<? super Unit> continuation) {
        return m90709v1(this, e11, continuation);
    }

    /* JADX INFO: renamed from: w1 */
    public final Object m90710w1(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionM94638c;
        Object objMo90594e = super.mo90594e(element);
        if (!ChannelResult.m90677j(objMo90594e) && !ChannelResult.m90675h(objMo90594e)) {
            if (isSendOp && (function1 = this.onUndeliveredElement) != null && (undeliveredElementExceptionM94638c = C43077t.m94638c(function1, element, null, 2, null)) != null) {
                throw undeliveredElementExceptionM94638c;
            }
            return ChannelResult.INSTANCE.m105331successJP2dKIU(Unit.INSTANCE);
        }
        return objMo90594e;
    }
}
