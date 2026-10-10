package jumio.core;

import com.jumio.core.network.DownloadTask;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.b1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40638b1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90219a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DownloadTask f90220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40638b1(DownloadTask downloadTask, Continuation continuation) {
        super(2, continuation);
        this.f90220b = downloadTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40638b1(this.f90220b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40638b1(this.f90220b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90219a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(C41713n0.m91125a(C41782z0.m91392b()), null, null, new C40632a1(this.f90220b, null), 3, null);
        this.f90219a = 1;
        Object objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
        if (objMo91198h == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo91198h;
    }
}
