package jumio.core;

import java.util.Iterator;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.y */
/* JADX INFO: loaded from: classes61.dex */
public final class C40752y extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Boolean f90473a;

    /* JADX INFO: renamed from: b */
    public Object f90474b;

    /* JADX INFO: renamed from: c */
    public Iterator f90475c;

    /* JADX INFO: renamed from: d */
    public Object f90476d;

    /* JADX INFO: renamed from: e */
    public Object f90477e;

    /* JADX INFO: renamed from: f */
    public int f90478f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f90479g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C40506B f90480h;

    /* JADX INFO: renamed from: i */
    public int f90481i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40752y(C40506B c40506b, Continuation continuation) {
        super(continuation);
        this.f90480h = c40506b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90479g = obj;
        this.f90481i |= Integer.MIN_VALUE;
        return this.f90480h.onProgressDone((Boolean) null, (Continuation) this);
    }
}
