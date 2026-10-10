package jumio.core;

import com.jumio.core.Controller;
import com.jumio.sdk.error.JumioError;
import com.jumio.sdk.interfaces.JumioControllerInterface;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.p0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40708p0 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Controller f90345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JumioError f90346b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40708p0(Controller controller, JumioError jumioError, Continuation continuation) {
        super(1, continuation);
        this.f90345a = controller;
        this.f90346b = jumioError;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40708p0(this.f90345a, this.f90346b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40708p0(this.f90345a, this.f90346b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        JumioControllerInterface jumioControllerInterface = this.f90345a.f13608i;
        if (jumioControllerInterface != null) {
            jumioControllerInterface.onError(this.f90346b);
        }
        return Unit.INSTANCE;
    }
}
