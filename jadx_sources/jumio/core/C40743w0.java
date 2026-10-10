package jumio.core;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.w0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40743w0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f90458a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90459b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C40748x0 f90460c;

    /* JADX INFO: renamed from: d */
    public int f90461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40743w0(C40748x0 c40748x0, Continuation continuation) {
        super(continuation);
        this.f90460c = c40748x0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90459b = obj;
        this.f90461d |= Integer.MIN_VALUE;
        return this.f90460c.onProgressException(null, this);
    }
}
