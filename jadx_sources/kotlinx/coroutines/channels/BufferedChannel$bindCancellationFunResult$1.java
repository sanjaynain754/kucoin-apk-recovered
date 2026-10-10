package kotlinx.coroutines.channels;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class BufferedChannel$bindCancellationFunResult$1<E> extends FunctionReferenceImpl implements Function3<Throwable, ChannelResult<? extends E>, CoroutineContext, Unit> {
    public BufferedChannel$bindCancellationFunResult$1(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
        m105328invoke5_sEAP8(th2, ((ChannelResult) obj).getHolder(), coroutineContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke-5_sEAP8, reason: not valid java name */
    public final void m105328invoke5_sEAP8(Throwable th2, Object obj, CoroutineContext coroutineContext) {
        ((BufferedChannel) this.receiver).m90556H0(th2, obj, coroutineContext);
    }
}
