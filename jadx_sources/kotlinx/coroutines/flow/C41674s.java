package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C41651e;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.s */
/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\r\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/m;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/m;", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "", "g", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/r;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/flow/e;", "e", "(Lkotlinx/coroutines/flow/r;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "Log0/a0;", "Log0/a0;", "NO_VALUE", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class C41674s {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final C43045a0 f91714a = new C43045a0("NO_VALUE");

    /* JADX INFO: renamed from: f */
    public static final Object m91005f(Object[] objArr, long j11) {
        return objArr[((int) j11) & (objArr.length - 1)];
    }

    /* JADX INFO: renamed from: g */
    public static final void m91006g(Object[] objArr, long j11, Object obj) {
        objArr[((int) j11) & (objArr.length - 1)] = obj;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41668m<T> m91000a(int i11, int i12, @NotNull BufferOverflow bufferOverflow) {
        if (i11 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i11).toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i12).toString());
        }
        if (i11 > 0 || i12 > 0 || bufferOverflow == BufferOverflow.SUSPEND) {
            int i13 = i12 + i11;
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            return new SharedFlowImpl(i11, i13, bufferOverflow);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC41668m m91001b(int i11, int i12, BufferOverflow bufferOverflow, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return m91000a(i11, i12, bufferOverflow);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41634e<T> m91004e(@NotNull InterfaceC41673r<? extends T> interfaceC41673r, @NotNull CoroutineContext coroutineContext, int i11, @NotNull BufferOverflow bufferOverflow) {
        return ((i11 == 0 || i11 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? interfaceC41673r : new C41651e(interfaceC41673r, coroutineContext, i11, bufferOverflow);
    }
}
