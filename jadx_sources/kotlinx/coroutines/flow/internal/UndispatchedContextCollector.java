package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.InterfaceC41635f;
import og0.C43059h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "downstream", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlin/coroutines/CoroutineContext;", "", "c", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "d", "Lkotlin/jvm/functions/Function2;", "emitRef", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class UndispatchedContextCollector<T> implements InterfaceC41635f<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext emitContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object countOrElement;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, Continuation<? super Unit>, Object> emitRef;

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    @Nullable
    public Object emit(T t11, @NotNull Continuation<? super Unit> continuation) {
        Object objM90980c = C41650d.m90980c(this.emitContext, t11, this.countOrElement, this.emitRef, continuation);
        return objM90980c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90980c : Unit.INSTANCE;
    }

    public UndispatchedContextCollector(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull CoroutineContext coroutineContext) {
        this.emitContext = coroutineContext;
        this.countOrElement = C43059h0.m94588g(coroutineContext);
        this.emitRef = new UndispatchedContextCollector$emitRef$1(interfaceC41635f, null);
    }
}
