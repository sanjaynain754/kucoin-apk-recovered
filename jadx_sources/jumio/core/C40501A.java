package jumio.core;

import java.util.Iterator;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.A */
/* JADX INFO: loaded from: classes61.dex */
public final class C40501A extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public float f89904a;

    /* JADX INFO: renamed from: b */
    public Object f89905b;

    /* JADX INFO: renamed from: c */
    public Iterator f89906c;

    /* JADX INFO: renamed from: d */
    public Object f89907d;

    /* JADX INFO: renamed from: e */
    public Object f89908e;

    /* JADX INFO: renamed from: f */
    public int f89909f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f89910g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C40506B f89911h;

    /* JADX INFO: renamed from: i */
    public int f89912i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40501A(C40506B c40506b, Continuation continuation) {
        super(continuation);
        this.f89911h = c40506b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89910g = obj;
        this.f89912i |= Integer.MIN_VALUE;
        return this.f89911h.onProgressUpdate(0.0f, this);
    }
}
