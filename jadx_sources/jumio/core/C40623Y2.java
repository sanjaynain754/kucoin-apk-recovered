package jumio.core;

import com.jumio.core.model.Subscriber;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.Y2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40623Y2 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Subscriber f90185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f90186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40623Y2(Subscriber subscriber, Throwable th2, Continuation continuation) {
        super(1, continuation);
        this.f90185a = subscriber;
        this.f90186b = th2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40623Y2(this.f90185a, this.f90186b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40623Y2(this.f90185a, this.f90186b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90185a.onError(this.f90186b);
        return Unit.INSTANCE;
    }
}
