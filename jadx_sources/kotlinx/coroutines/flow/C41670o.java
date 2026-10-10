package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.InterfaceC41655i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.o */
/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lkotlinx/coroutines/flow/o;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/r;", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/internal/i;", "flow", "Lkotlinx/coroutines/x1;", "job", "<init>", "(Lkotlinx/coroutines/flow/r;Lkotlinx/coroutines/x1;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e;", "c", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/x1;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41670o<T> implements InterfaceC41673r<T>, InterfaceC41630a<T>, InterfaceC41655i<T> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41673r<T> f91709b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC41775x1 job;

    @Override // kotlinx.coroutines.flow.InterfaceC41673r
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<T> mo86421a() {
        return this.f91709b.mo86421a();
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r, kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<?> continuation) {
        return this.f91709b.collect(interfaceC41635f, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41670o(@NotNull InterfaceC41673r<? extends T> interfaceC41673r, @Nullable InterfaceC41775x1 interfaceC41775x1) {
        this.f91709b = interfaceC41673r;
        this.job = interfaceC41775x1;
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC41655i
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC41634e<T> mo90854c(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return C41674s.m91004e(this, context, capacity, onBufferOverflow);
    }
}
