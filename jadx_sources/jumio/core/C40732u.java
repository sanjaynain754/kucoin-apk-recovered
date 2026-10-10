package jumio.core;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.u */
/* JADX INFO: loaded from: classes61.dex */
public final class C40732u extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f90435a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90436b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C40737v f90437c;

    /* JADX INFO: renamed from: d */
    public int f90438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40732u(C40737v c40737v, Continuation continuation) {
        super(continuation);
        this.f90437c = c40737v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90436b = obj;
        this.f90438d |= Integer.MIN_VALUE;
        return this.f90437c.onProgressDone((Boolean) null, (Continuation) this);
    }
}
