package jumio.core;

import com.jumio.core.network.ByteArrayDownloadTask;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C40712q extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f90357a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ByteArrayDownloadTask f90359c;

    /* JADX INFO: renamed from: d */
    public int f90360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40712q(ByteArrayDownloadTask byteArrayDownloadTask, Continuation continuation) {
        super(continuation);
        this.f90359c = byteArrayDownloadTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90358b = obj;
        this.f90360d |= Integer.MIN_VALUE;
        return this.f90359c.processInputStream(null, 0, this);
    }
}
