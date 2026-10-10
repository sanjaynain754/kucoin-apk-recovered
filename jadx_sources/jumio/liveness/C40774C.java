package jumio.liveness;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.liveness.C */
/* JADX INFO: loaded from: classes61.dex */
public final class C40774C extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40780I f90575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40774C(C40780I c40780i, Continuation continuation) {
        super(2, continuation);
        this.f90575a = c40780i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40774C(this.f90575a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40774C(this.f90575a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        super/*com.jumio.core.scanpart.FaceScanPart*/.start();
        return Unit.INSTANCE;
    }
}
