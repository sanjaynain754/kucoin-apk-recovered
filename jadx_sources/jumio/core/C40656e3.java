package jumio.core;

import com.jumio.core.api.QueueProcessor;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.e3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40656e3 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ QueueProcessor f90264a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40656e3(QueueProcessor queueProcessor, Continuation continuation) {
        super(1, continuation);
        this.f90264a = queueProcessor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40656e3(this.f90264a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40656e3(this.f90264a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90264a.m14501b();
        return Unit.INSTANCE;
    }
}
