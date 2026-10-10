package jumio.core;

import com.jumio.core.processor.ImageProcessorHandler;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.Q1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40583Q1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f90089a;

    /* JADX INFO: renamed from: b */
    public Object f90090b;

    /* JADX INFO: renamed from: c */
    public Object f90091c;

    /* JADX INFO: renamed from: d */
    public Object f90092d;

    /* JADX INFO: renamed from: e */
    public Object f90093e;

    /* JADX INFO: renamed from: f */
    public Object f90094f;

    /* JADX INFO: renamed from: g */
    public Object f90095g;

    /* JADX INFO: renamed from: h */
    public Object f90096h;

    /* JADX INFO: renamed from: i */
    public Object f90097i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f90098j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ImageProcessorHandler f90099k;

    /* JADX INFO: renamed from: l */
    public int f90100l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40583Q1(ImageProcessorHandler imageProcessorHandler, Continuation continuation) {
        super(continuation);
        this.f90099k = imageProcessorHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90098j = obj;
        this.f90100l |= Integer.MIN_VALUE;
        return this.f90099k.doProcess(null, null, null, null, null, null, this);
    }
}
