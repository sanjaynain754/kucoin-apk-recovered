package jumio.core;

import com.jumio.core.model.SubscriberWithUpdate;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.d3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40651d3 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SubscriberWithUpdate f90246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f90247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40651d3(SubscriberWithUpdate subscriberWithUpdate, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f90246a = subscriberWithUpdate;
        this.f90247b = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40651d3(this.f90246a, this.f90247b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40651d3(this.f90246a, this.f90247b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90246a.onUpdate(this.f90247b);
        return Unit.INSTANCE;
    }
}
