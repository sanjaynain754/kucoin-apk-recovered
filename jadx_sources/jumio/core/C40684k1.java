package jumio.core;

import com.jumio.core.extraction.ExtractionClient;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.k1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40684k1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ExtractionClient f90311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40684k1(ExtractionClient extractionClient, Continuation continuation) {
        super(2, continuation);
        this.f90311a = extractionClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40684k1(this.f90311a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40684k1(this.f90311a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90311a.init();
        return Unit.INSTANCE;
    }
}
