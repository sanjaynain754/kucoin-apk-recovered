package jumio.core;

import com.jumio.core.network.DownloadTask;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.c1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40644c1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DownloadTask f90231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40644c1(DownloadTask downloadTask, Continuation continuation) {
        super(2, continuation);
        this.f90231b = downloadTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40644c1(this.f90231b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40644c1(this.f90231b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90230a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            DownloadTask downloadTask = this.f90231b;
            this.f90230a = 1;
            if (DownloadTask.access$execute(downloadTask, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
