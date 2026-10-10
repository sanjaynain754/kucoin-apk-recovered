package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.performance.FrameRateObserver;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import rg0.InterfaceC44088g;

/* JADX INFO: renamed from: jumio.core.i1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40674i1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ExtractionClient f90291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40674i1(ExtractionClient extractionClient, Continuation continuation) {
        super(2, continuation);
        this.f90291b = extractionClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40674i1(this.f90291b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40674i1(this.f90291b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90290a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC44088g interfaceC44088g = this.f90291b.f13846d;
                this.f90290a = 1;
                if (interfaceC44088g.m97146c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            InterfaceC44088g interfaceC44088g2 = this.f90291b.f13846d;
            ExtractionClient extractionClient = this.f90291b;
            synchronized (interfaceC44088g2) {
                extractionClient.process(extractionClient.f13849g, extractionClient.getF13860r(), extractionClient.getF13861s());
                unit = Unit.INSTANCE;
            }
            FrameRateObserver f13853k = this.f90291b.getF13853k();
            if (f13853k != null) {
                f13853k.doFrame();
                return unit;
            }
            return null;
        } catch (Throwable th2) {
            Log.printStackTrace(th2);
            this.f90291b.setResult(false);
            return Unit.INSTANCE;
        }
    }
}
