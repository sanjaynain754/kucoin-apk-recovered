package jumio.core;

import com.jumio.core.network.DownloadTask;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.d1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40649d1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DownloadTask f90244b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40649d1(DownloadTask downloadTask, Continuation continuation) {
        super(2, continuation);
        this.f90244b = downloadTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40649d1(this.f90244b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40649d1(this.f90244b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90243a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DownloadTask downloadTask = this.f90244b;
        this.f90243a = 1;
        Object objAccess$execute = DownloadTask.access$execute(downloadTask, this);
        if (objAccess$execute == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objAccess$execute;
    }
}
