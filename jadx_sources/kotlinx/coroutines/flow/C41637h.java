package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C41651e;
import kotlinx.coroutines.flow.internal.InterfaceC41655i;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.h */
/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\t\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/e;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "e", "(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;", "Lkotlin/coroutines/CoroutineContext;", "context", "f", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/e;", "c", "", "d", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C41637h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41634e<T> m90944a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, int i11, @NotNull BufferOverflow bufferOverflow) {
        if (i11 < 0 && i11 != -2 && i11 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i11).toString());
        }
        if (i11 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i11 == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i11 = 0;
        }
        int i12 = i11;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (interfaceC41634e instanceof InterfaceC41655i) {
            return InterfaceC41655i.a.m90984a((InterfaceC41655i) interfaceC41634e, null, i12, bufferOverflow2, 1, null);
        }
        return new C41651e(interfaceC41634e, null, i12, bufferOverflow2, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41634e<T> m90948e(@NotNull InterfaceC41634e<? extends T> interfaceC41634e) {
        return m90945b(interfaceC41634e, -1, null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC41634e m90945b(InterfaceC41634e interfaceC41634e, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -2;
        }
        if ((i12 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return C41636g.m90909d(interfaceC41634e, i11, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC41634e<T> m90946c(@NotNull InterfaceC41634e<? extends T> interfaceC41634e) {
        return interfaceC41634e instanceof InterfaceC41630a ? interfaceC41634e : new CancellableFlowImpl(interfaceC41634e);
    }

    /* JADX INFO: renamed from: d */
    public static final void m90947d(CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC41775x1.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC41634e<T> m90949f(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull CoroutineContext coroutineContext) {
        m90947d(coroutineContext);
        if (Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            return interfaceC41634e;
        }
        if (interfaceC41634e instanceof InterfaceC41655i) {
            return InterfaceC41655i.a.m90984a((InterfaceC41655i) interfaceC41634e, coroutineContext, 0, null, 6, null);
        }
        return new C41651e(interfaceC41634e, coroutineContext, 0, null, 12, null);
    }
}
