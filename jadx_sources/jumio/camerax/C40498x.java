package jumio.camerax;

import androidx.lifecycle.Lifecycle;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.camerax.x */
/* JADX INFO: loaded from: classes61.dex */
public final class C40498x extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40499y f89899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lifecycle.State f89900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40498x(C40499y c40499y, Lifecycle.State state, Continuation continuation) {
        super(2, continuation);
        this.f89899a = c40499y;
        this.f89900b = state;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40498x(this.f89899a, this.f89900b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40498x(this.f89899a, this.f89900b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f89899a.f89902b.setCurrentState(this.f89900b);
        return Unit.INSTANCE;
    }
}
