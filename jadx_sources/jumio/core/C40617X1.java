package jumio.core;

import com.jumio.core.gui.DrawView;
import com.jumio.core.views.CameraScanView;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.X1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40617X1 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraScanView f90177a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40617X1(CameraScanView cameraScanView, Continuation continuation) {
        super(1, continuation);
        this.f90177a = cameraScanView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40617X1(this.f90177a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40617X1(this.f90177a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DrawView f14586c = this.f90177a.getF14586c();
        if (f14586c != null) {
            f14586c.invalidate();
        }
        return Unit.INSTANCE;
    }
}
