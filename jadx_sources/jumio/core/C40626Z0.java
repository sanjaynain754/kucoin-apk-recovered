package jumio.core;

import com.jumio.core.network.DownloadTask;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.Z0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40626Z0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f90194a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DownloadTask f90196c;

    /* JADX INFO: renamed from: d */
    public int f90197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40626Z0(DownloadTask downloadTask, Continuation continuation) {
        super(continuation);
        this.f90196c = downloadTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90195b = obj;
        this.f90197d |= Integer.MIN_VALUE;
        return DownloadTask.access$execute(this.f90196c, this);
    }
}
