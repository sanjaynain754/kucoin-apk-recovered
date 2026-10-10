package jumio.liveness;

import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.overlay.Overlay;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.liveness.F */
/* JADX INFO: loaded from: classes61.dex */
public final class C40777F extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40780I f90585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ExtractionUpdateInterface f90586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40777F(C40780I c40780i, ExtractionUpdateInterface extractionUpdateInterface, Continuation continuation) {
        super(1, continuation);
        this.f90585a = c40780i;
        this.f90586b = extractionUpdateInterface;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40777F(this.f90585a, this.f90586b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C40777F(this.f90585a, this.f90586b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Overlay f14534m = this.f90585a.getF14534m();
        if (f14534m != null) {
            f14534m.update(this.f90586b);
        }
        return Unit.INSTANCE;
    }
}
