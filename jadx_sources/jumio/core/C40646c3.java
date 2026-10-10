package jumio.core;

import com.jumio.core.model.SubscriberWithUpdate;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.c3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40646c3 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SubscriberWithUpdate f90237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f90238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40646c3(SubscriberWithUpdate subscriberWithUpdate, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f90237a = subscriberWithUpdate;
        this.f90238b = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40646c3(this.f90237a, this.f90238b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40646c3(this.f90237a, this.f90238b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90237a.onResult(this.f90238b);
        return Unit.INSTANCE;
    }
}
