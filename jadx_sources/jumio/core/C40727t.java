package jumio.core;

import com.jumio.core.cdn.CDNCache;
import com.jumio.core.cdn.CDNDownloadListener;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C40727t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CDNCache f90412b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CDNDownloadListener f90413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40727t(CDNCache cDNCache, CDNDownloadListener cDNDownloadListener, Continuation continuation) {
        super(2, continuation);
        this.f90412b = cDNCache;
        this.f90413c = cDNDownloadListener;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40727t(this.f90412b, this.f90413c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40727t(this.f90412b, this.f90413c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r5.onProgressDone2(r1, (p852kotlin.coroutines.Continuation<? super p852kotlin.Unit>) r4) == r0) goto L19;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90411a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CDNDownloadListener f13739d = this.f90412b.getF13739d();
        if (f13739d != null) {
            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
            this.f90411a = 1;
            if (f13739d.onProgressDone2(boolBoxBoolean, (Continuation<? super Unit>) this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
        CDNDownloadListener cDNDownloadListener = this.f90413c;
        if (cDNDownloadListener != null) {
            Boolean boolBoxBoolean2 = Boxing.boxBoolean(true);
            this.f90411a = 2;
        } else {
            return null;
        }
    }
}
