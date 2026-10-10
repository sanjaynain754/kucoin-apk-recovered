package jumio.core;

import com.jumio.core.scanpart.JVisionScanPart;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.d2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40650d2 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JVisionScanPart f90245a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40650d2(JVisionScanPart jVisionScanPart, Continuation continuation) {
        super(1, continuation);
        this.f90245a = jVisionScanPart;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40650d2(this.f90245a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40650d2(this.f90245a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        JVisionScanPart.nextPartOrProcess$default(this.f90245a, false, 1, null);
        return Unit.INSTANCE;
    }
}
