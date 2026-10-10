package jumio.p381df;

import android.graphics.Bitmap;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.df.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C40765d extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90531a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90532b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DocFinderClient f90533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40765d(DocFinderClient docFinderClient, Continuation continuation) {
        super(2, continuation);
        this.f90533c = docFinderClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40765d c40765d = new C40765d(this.f90533c, continuation);
        c40765d.f90532b = obj;
        return c40765d;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40765d c40765d = new C40765d(this.f90533c, (Continuation) obj2);
        c40765d.f90532b = (Bitmap) obj;
        return c40765d.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap = (Bitmap) this.f90532b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90531a;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            DocFinderClient docFinderClient = this.f90533c;
            this.f90532b = SpillingKt.nullOutSpilledVariable(bitmap);
            this.f90531a = 1;
            if (DocFinderClient.access$runDocumentClassification(docFinderClient, bitmap, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
