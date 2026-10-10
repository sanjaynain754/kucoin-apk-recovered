package jumio.liveness;

import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C40790g extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40797n f90615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LivenessDataModel f90616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40790g(C40797n c40797n, LivenessDataModel livenessDataModel, Continuation continuation) {
        super(2, continuation);
        this.f90615a = c40797n;
        this.f90616b = livenessDataModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40790g(this.f90615a, this.f90616b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40790g(this.f90615a, this.f90616b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90615a.m89294d();
        C40808y c40808y = this.f90615a.f90630d;
        if (c40808y == null) {
            Intrinsics.throwUninitializedPropertyAccessException("livenessProcessorCallback");
            c40808y = null;
        }
        c40808y.getClass();
        new C40806w(c40808y.f90651a).invoke(this.f90616b);
        return Unit.INSTANCE;
    }
}
