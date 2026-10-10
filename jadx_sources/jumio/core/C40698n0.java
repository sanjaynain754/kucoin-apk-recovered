package jumio.core;

import com.jumio.core.Controller;
import com.jumio.sdk.interfaces.JumioControllerInterface;
import com.jumio.sdk.result.JumioResult;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.n0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40698n0 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Controller f90334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JumioResult f90335b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40698n0(Controller controller, JumioResult jumioResult, Continuation continuation) {
        super(1, continuation);
        this.f90334a = controller;
        this.f90335b = jumioResult;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40698n0(this.f90334a, this.f90335b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40698n0(this.f90334a, this.f90335b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        JumioControllerInterface jumioControllerInterface = this.f90334a.f13608i;
        if (jumioControllerInterface != null) {
            jumioControllerInterface.onFinished(this.f90335b);
        }
        return Unit.INSTANCE;
    }
}
