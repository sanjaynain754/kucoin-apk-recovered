package jumio.core;

import com.jumio.core.network.DownloadTask;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.Y0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40621Y0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f90178a;

    /* JADX INFO: renamed from: b */
    public Object f90179b;

    /* JADX INFO: renamed from: c */
    public Object f90180c;

    /* JADX INFO: renamed from: d */
    public int f90181d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f90182e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DownloadTask f90183f;

    /* JADX INFO: renamed from: g */
    public int f90184g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40621Y0(DownloadTask downloadTask, Continuation continuation) {
        super(continuation);
        this.f90183f = downloadTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90182e = obj;
        this.f90184g |= Integer.MIN_VALUE;
        return this.f90183f.m14576a(this);
    }
}
