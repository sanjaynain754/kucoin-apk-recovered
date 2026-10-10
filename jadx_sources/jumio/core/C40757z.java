package jumio.core;

import java.util.Iterator;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.z */
/* JADX INFO: loaded from: classes61.dex */
public final class C40757z extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Exception f90487a;

    /* JADX INFO: renamed from: b */
    public Object f90488b;

    /* JADX INFO: renamed from: c */
    public Iterator f90489c;

    /* JADX INFO: renamed from: d */
    public Object f90490d;

    /* JADX INFO: renamed from: e */
    public Object f90491e;

    /* JADX INFO: renamed from: f */
    public int f90492f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f90493g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C40506B f90494h;

    /* JADX INFO: renamed from: i */
    public int f90495i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40757z(C40506B c40506b, Continuation continuation) {
        super(continuation);
        this.f90494h = c40506b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90493g = obj;
        this.f90495i |= Integer.MIN_VALUE;
        return this.f90494h.onProgressException(null, this);
    }
}
