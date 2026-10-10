package jumio.core;

import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.enums.JumioScanUpdate;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jumio.core.w3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40746w3 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ScanPart f90464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JumioScanUpdate f90465b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f90466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40746w3(ScanPart scanPart, JumioScanUpdate jumioScanUpdate, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f90464a = scanPart;
        this.f90465b = jumioScanUpdate;
        this.f90466c = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C40746w3(this.f90464a, this.f90465b, this.f90466c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C40746w3) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f90464a.getF14544d().onUpdate(this.f90465b, this.f90466c);
        return Unit.INSTANCE;
    }
}
