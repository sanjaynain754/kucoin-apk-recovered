package kotlinx.coroutines.channels;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.common.util.concurrent.C8585f0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.InterfaceC41784z2;
import og0.AbstractC43081x;
import og0.C43077t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.h */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0012J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J!\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0001\u0010\u0010R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016038\u0002X\u0082\u0004¨\u00065"}, m90084d2 = {"Lkotlinx/coroutines/channels/h;", ExifInterface.LONGITUDE_EAST, "Log0/x;", "", "id", "prev", "Lkotlinx/coroutines/channels/BufferedChannel;", AppsFlyerProperties.CHANNEL, "", "pointers", "<init>", "(JLkotlinx/coroutines/channels/h;Lkotlinx/coroutines/channels/BufferedChannel;I)V", "index", "element", "", "G", "(ILjava/lang/Object;)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(I)Ljava/lang/Object;", "D", "w", "(I)V", "", "B", "value", "F", "from", TypedValues.TransitionType.S_TO, "", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "x", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", CmcdData.Factory.STREAMING_FORMAT_SS, "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "receiver", "C", "(IZ)V", "f", "Lkotlinx/coroutines/channels/BufferedChannel;", "_channel", "y", "()Lkotlinx/coroutines/channels/BufferedChannel;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n1#2:3117\n*E\n"})
public final class C41569h<E> extends AbstractC43081x<C41569h<E>> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final BufferedChannel<E> _channel;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AtomicReferenceArray f91524g;

    /* JADX INFO: renamed from: w */
    public final void m90702w(int index) {
        m90696E(index, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m90694C(int index, boolean receiver) {
        if (receiver) {
            m90704y().m90622u1((this.id * ((long) BufferedChannelKt.f91490b)) + ((long) index));
        }
        m94644t();
    }

    @Override // og0.AbstractC43081x
    /* JADX INFO: renamed from: r */
    public int mo90699r() {
        return BufferedChannelKt.f91490b;
    }

    @Override // og0.AbstractC43081x
    /* JADX INFO: renamed from: s */
    public void mo90700s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        Function1<E, Unit> function1;
        Function1<E, Unit> function2;
        int i11 = BufferedChannelKt.f91490b;
        boolean z11 = index >= i11;
        if (z11) {
            index -= i11;
        }
        E eM90692A = m90692A(index);
        while (true) {
            Object objM90693B = m90693B(index);
            if ((objM90693B instanceof InterfaceC41784z2) || (objM90693B instanceof WaiterEB)) {
                if (m90701v(index, objM90693B, z11 ? BufferedChannelKt.f91498j : BufferedChannelKt.f91499k)) {
                    m90702w(index);
                    m90694C(index, !z11);
                    if (!z11 || (function1 = m90704y().onUndeliveredElement) == null) {
                        return;
                    }
                    C43077t.m94636a(function1, eM90692A, context);
                    return;
                }
            } else {
                if (objM90693B == BufferedChannelKt.f91498j || objM90693B == BufferedChannelKt.f91499k) {
                    break;
                }
                if (objM90693B != BufferedChannelKt.f91495g && objM90693B != BufferedChannelKt.f91494f) {
                    if (objM90693B == BufferedChannelKt.f91497i || objM90693B == BufferedChannelKt.f91492d || objM90693B == BufferedChannelKt.m90667z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM90693B).toString());
                }
            }
        }
        m90702w(index);
        if (!z11 || (function2 = m90704y().onUndeliveredElement) == null) {
            return;
        }
        C43077t.m94636a(function2, eM90692A, context);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final BufferedChannel<E> m90704y() {
        BufferedChannel<E> bufferedChannel = this._channel;
        Intrinsics.checkNotNull(bufferedChannel);
        return bufferedChannel;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF91524g() {
        return this.f91524g;
    }

    public C41569h(long j11, @Nullable C41569h<E> c41569h, @Nullable BufferedChannel<E> bufferedChannel, int i11) {
        super(j11, c41569h, i11);
        this._channel = bufferedChannel;
        this.f91524g = new AtomicReferenceArray(BufferedChannelKt.f91490b * 2);
    }

    /* JADX INFO: renamed from: A */
    public final E m90692A(int index) {
        return (E) getF91524g().get(index * 2);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m90693B(int index) {
        return getF91524g().get((index * 2) + 1);
    }

    /* JADX INFO: renamed from: D */
    public final E m90695D(int index) {
        E eM90692A = m90692A(index);
        m90702w(index);
        return eM90692A;
    }

    /* JADX INFO: renamed from: E */
    public final void m90696E(int index, Object value) {
        getF91524g().set(index * 2, value);
    }

    /* JADX INFO: renamed from: F */
    public final void m90697F(int index, @Nullable Object value) {
        getF91524g().set((index * 2) + 1, value);
    }

    /* JADX INFO: renamed from: G */
    public final void m90698G(int index, E element) {
        m90696E(index, element);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m90701v(int index, @Nullable Object from, @Nullable Object to2) {
        return C8585f0.m13695a(getF91524g(), (index * 2) + 1, from, to2);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final Object m90703x(int index, @Nullable Object update) {
        return getF91524g().getAndSet((index * 2) + 1, update);
    }
}
