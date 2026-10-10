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
public /* synthetic */ class BufferedChannel$bindCancellationFun$2<E> extends FunctionReferenceImpl implements Function3<Throwable, E, CoroutineContext, Unit> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
        invoke2(th2, obj, coroutineContext);
        return Unit.INSTANCE;
    }

    public BufferedChannel$bindCancellationFun$2(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2, E e11, CoroutineContext coroutineContext) {
        ((BufferedChannel) this.receiver).m90557I0(th2, e11, coroutineContext);
    }
}
