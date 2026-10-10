package jumio.core;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.v0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40738v0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f90449a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90450b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C40748x0 f90451c;

    /* JADX INFO: renamed from: d */
    public int f90452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40738v0(C40748x0 c40748x0, Continuation continuation) {
        super(continuation);
        this.f90451c = c40748x0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90450b = obj;
        this.f90452d |= Integer.MIN_VALUE;
        return this.f90451c.onProgressDone((Boolean) null, (Continuation) this);
    }
}
