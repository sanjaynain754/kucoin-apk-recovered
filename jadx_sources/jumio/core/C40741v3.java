package jumio.core;

import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.enums.JumioScanStep;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.v3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40741v3 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ScanPart f90455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JumioScanStep f90456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f90457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40741v3(ScanPart scanPart, JumioScanStep jumioScanStep, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f90455a = scanPart;
        this.f90456b = jumioScanStep;
        this.f90457c = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40741v3(this.f90455a, this.f90456b, this.f90457c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C40741v3) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90455a.getF14544d().onScanStep(this.f90456b, this.f90457c);
        return Unit.INSTANCE;
    }
}
