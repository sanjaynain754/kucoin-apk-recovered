package jumio.core;

import com.jumio.core.model.SubscriberWithUpdate;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.b3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40640b3 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SubscriberWithUpdate f90222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f90223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40640b3(SubscriberWithUpdate subscriberWithUpdate, Throwable th2, Continuation continuation) {
        super(1, continuation);
        this.f90222a = subscriberWithUpdate;
        this.f90223b = th2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40640b3(this.f90222a, this.f90223b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40640b3(this.f90222a, this.f90223b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90222a.onError(this.f90223b);
        return Unit.INSTANCE;
    }
}
